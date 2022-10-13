package com.analyst.sle;

import com.analyst.gui.SlePanel;

/**
 *
 * @author R1B3n
 */
public class NaiveGaussian {

    static int m = 10, n = SlePanel.getNoOfUns() - 1;
    static int i, j, k;
    static double sum, mult;

    static double matA[][] = new double[n + 1][n + 1];
    static double matB[] = new double[n + 1];
    static double matx[] = new double[n + 1];

    public static void run() {

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

        for (i = 0; i <= n; i++) {
            System.out.println("The value of x" + i + " is: " + matx[i]);
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
