package com.analyst.sle;

import com.analyst.gui.SlePanel;
import static com.analyst.gui.SlePanel.sleComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class LUDecomposition {

    static int n;
    static double[][] lower;
    static double[][] upper;
    static double[][] mat;

    public static void run() {
        try {
            n = SlePanel.getNoOfUns() - 1;
            lower = new double[n + 1][n + 1];
            upper = new double[n + 1][n + 1];
            mat = new double[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    mat[i][j] = Double.parseDouble((String) SlePanel.getMat().getModel().getValueAt(i, j));
                }
            }

            luDecomposition();

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (sleComboBox.getSelectedIndex() == 2) {
                        SlePanel.setValue(upper[i][j], i, j);
                    } else {
                        SlePanel.setValue(lower[i][j], i, j);
                    }
                }
            }

            SlePanel.getResPanel().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static void luDecomposition() {
        for (int i = 0; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += (lower[i][j] * upper[j][k]);
                }
                upper[i][k] = mat[i][k] - sum;
            }

            for (int k = i; k <= n; k++) {
                if (i == k) {
                    lower[i][i] = 1;
                } else {
                    int sum = 0;
                    for (int j = 0; j < i; j++) {
                        sum += (lower[k][j] * upper[j][i]);
                    }
                    lower[k][i] = (mat[k][i] - sum) / upper[i][i];
                }
            }
        }
    }
}
