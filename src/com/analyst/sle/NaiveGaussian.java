package com.analyst.sle;

import com.analyst.gui.SlePanel;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class NaiveGaussian {

    static int n = SlePanel.getNoOfUns() - 1;
    static int i, j, k;
    static double sum, mult;
    static String soln;

    static double matA[][];
    static double matB[];
    static double matx[];

    public static void run() {
        try {
            n = SlePanel.getNoOfUns() - 1;
            soln = "";
            matA = new double[n + 1][n + 1];
            matB = new double[n + 1];
            matx = new double[n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    matA[i][j] = Double.parseDouble((String) SlePanel.getMat().getModel().getValueAt(i, j));
                }
            }

            for (int i = 0; i <= n; i++) {
                matB[i] = Double.parseDouble((String) SlePanel.getMat().getModel().getValueAt(i, n + 1));
            }

            NaiveGaussElim(n, matA, matB, matx);

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (j < i) {
                        SlePanel.setValue(0, i, j);
                    } else {
                        SlePanel.setValue(matA[i][j], i, j);
                    }
                }
            }

            for (int i = 0; i <= n; i++) {
                SlePanel.setValue(matB[i], i, n + 1);
            }

            SlePanel.getResPanel().setVisible(true);

            for (i = 0; i <= n; i++) {
                soln += "x" + String.valueOf(i + 1) + " : " + String.valueOf(matx[i]) + "    ";
                System.out.println("The value of x" + i + " is: " + matx[i]);
            }

            SlePanel.getsolnField().setText(soln);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void NaiveGaussElim(int n, double matA[][], double matB[], double matx[]) {
        for (k = 0; k <= n; k++) {
            for (i = k + 1; i <= n; i += k + 1) {
                mult = matA[i][k] / matA[k][k];
                matA[i][k] = mult;
                for (j = k + 1; j <= n; j += k + 1) {
                    matA[i][j] = matA[i][j] - (mult) * matA[k][j];
                }
                matB[i] = matB[i] - (mult) * matB[k];
            }
        }
        matx[n] = matB[n] / matA[n][n];
        for (i = n - 1; i >= 0; i--) {
            sum = matB[i];
            for (j = i + 1; j <= n; j += i + 1) {
                sum -= matA[i][j] * matx[j];
            }
            matx[i] = sum / matA[i][i];
        }
    }
}
