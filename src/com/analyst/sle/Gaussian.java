package com.analyst.sle;

import com.analyst.gui.SlePanel;
import java.awt.Font;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class Gaussian {

    static int n;
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

            gaussElim();

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    SlePanel.setValue(matA[i][j], i, j);
                }
            }

            for (int i = 0; i <= n; i++) {
                SlePanel.setValue(matB[i], i, n + 1);
            }

            SlePanel.getResPanel().setVisible(true);

            for (i = 0; i <= n; i++) {
                Formatter formatter = new Formatter();
                formatter.format("%.4f", matx[i]);
                soln += "x" + String.valueOf(i + 1) + " : " + formatter.toString() + "    ";
            }
            SlePanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(15,
                    (2 * SlePanel.getsolnField().getSize().width + 700) / soln.length()
            )));

            SlePanel.getsolnField().setText(soln);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static void gaussElim() {
        for (k = 0; k <= n; k++) {
            int maxR = k;
            double maxN = matA[k][k];
            for (int i = k + 1; i <= n; i++) {
                if (Math.abs(matA[i][k]) > maxN) {
                    maxN = matA[i][k];
                    maxR = i;
                }
            }

            if (maxR != k) {
                for (int i = 0; i <= n; i++) {
                    double temp = matA[k][i];
                    matA[k][i] = matA[maxR][i];
                    matA[maxR][i] = temp;
                }
                double temp = matB[k];
                matB[k] = matB[maxR];
                matB[maxR] = temp;
            }

            for (i = k + 1; i <= n; i++) {
                mult = matA[i][k] / matA[k][k];
                matA[i][k] = mult;
                for (j = k + 1; j <= n; j++) {
                    matA[i][j] -= mult * matA[k][j];
                }
                matB[i] -= mult * matB[k];
                matA[i][k] = 0;
            }
        }

        matx[n] = matB[n] / matA[n][n];
        for (i = n - 1; i >= 0; i--) {
            sum = matB[i];
            for (j = i + 1; j <= n; j++) {
                sum -= matA[i][j] * matx[j];
            }
            matx[i] = sum / matA[i][i];
        }
    }

    public static double[] getSolnMat(int N, double mata[][], double matb[]) {
        n = N;
        matA = mata;
        matB = matb;
        matx = new double[n + 1];
        gaussElim();
        return matx;
    }
}
