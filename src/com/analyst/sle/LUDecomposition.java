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
    static double[][] inverse;
    static double[][] mat;
    static double[][] I;
    static double[][] Z;

    public static void run() {
        try {
            n = SlePanel.getNoOfUns() - 1;
            lower = new double[n + 1][n + 1];
            upper = new double[n + 1][n + 1];
            inverse = new double[n + 1][n + 1];
            mat = new double[n + 1][n + 1];
            I = new double[n + 1][n + 1];
            Z = new double[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    mat[i][j] = Double.parseDouble((String) SlePanel.getMat().getModel().getValueAt(i, j));
                    upper[i][j] = mat[i][j];
                }
            }

            luDecomposition();
            findInverseMat();

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    switch (sleComboBox.getSelectedIndex()) {
                        case 2 ->
                            SlePanel.setValue(lower[i][j], i, j);
                        case 3 ->
                            SlePanel.setValue(upper[i][j], i, j);
                        default ->
                            SlePanel.setValue(inverse[i][j], i, j);
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
            lower[i][i] = 1;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                lower[j][i] = upper[j][i] / upper[i][i];
            }
            for (int j = i + 1; j <= n; j++) {
                double val = upper[j][i] / upper[i][i];
                for (int k = 0; k <= n; k++) {
                    upper[j][k] -= val * upper[i][k];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                double val = upper[i][j] / upper[j][j];
                for (int k = 0; k <= n; k++) {
                    upper[i][k] -= upper[j][k] * val;
                }
            }
        }
    }

    static void findInverseMat() {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                Z[i][j] = inverse[i][j] = 0;
                if (i == j) {
                    I[i][j] = 1;
                } else {
                    I[i][j] = 0;
                }
            }
        }

        for (int col = 0; col <= n; col++) {
            for (int row = 0; row <= n; row++) {
                computeZ(col, row);
            }
        }

        for (int col = n; col >= 0; col--) {
            for (int row = n; row >= 0; row--) {
                computeInv(col, row);
            }
        }
    }

    static void computeZ(int col, int row) {
        double sum = 0;
        for (int i = 0; i < row; i++) {
            sum += lower[row][i] * Z[i][col];
        }

        Z[row][col] = I[row][col] - sum;
    }

    static void computeInv(int col, int row) {
        double sum = 0;
        for (int i = n; i > row; i--) {
            sum += upper[row][i] * inverse[i][col];
        }

        inverse[row][col] = Z[row][col] - sum;
        inverse[row][col] /= upper[row][row];
    }
}
