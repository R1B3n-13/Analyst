package com.analyst.interpolation;

import com.analyst.gui.InterpolationPanel;
import java.awt.Font;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class NewtonsDividedDifference {

    static int n;
    static double res, ip;
    static String soln;

    static double matA[];
    static double matB[];
    static double matX[];
    static double matP[];

    public static void run() {
        try {
            n = InterpolationPanel.getNoOfUns() - 1;
            ip = Double.parseDouble(InterpolationPanel.ipField.getText());
            soln = "";
            matA = new double[n + 1];
            matB = new double[n + 1];
            matX = new double[n + 1];
            matP = new double[n + 1];

            for (int i = 0; i <= n; i++) {
                matA[i] = Double.parseDouble((String) InterpolationPanel.getMat().getModel().getValueAt(i, 0));;
            }

            for (int i = 0; i <= n; i++) {
                matB[i] = Double.parseDouble((String) InterpolationPanel.getMat().getModel().getValueAt(i, 1));
            }

            ndd();

            for (int i = 0; i <= n; i++) {
                InterpolationPanel.setValue(i, i, 0);
            }

            for (int i = 0; i <= n; i++) {
                InterpolationPanel.setValue(matX[i], i, 1);
            }

            InterpolationPanel.getResPanel().setVisible(true);

            Formatter formatter = new Formatter();
            formatter.format("%.5f", res);
            soln = "The approximate result is : " + formatter.toString();

            InterpolationPanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(20,
                    (2 * InterpolationPanel.getsolnField().getSize().width + 700) / soln.length()
            )));
            InterpolationPanel.getsolnField().setText(soln);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input" + e,
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static void ndd() {
        res = matX[0] = matB[0];
        int j = 1, m = n, k = 1;
        double f2 = 0;

        do {
            for (int i = 0; i <= m - 1; i++) {
                matP[i] = ((matB[i + 1] - matB[i]) / (matA[i + j] - matA[i]));
                matB[i] = matP[i];
            }
            double f1 = 1;
            for (int i = 0; i < j; i++) {
                f1 *= (ip - matA[i]);
            }
            matX[k++] = matB[0];
            f2 += matB[0] * f1;
            m--;
            j++;
        } while (m != 0);
        res += f2;
    }
}
