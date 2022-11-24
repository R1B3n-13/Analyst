package com.analyst.interpolation;

import com.analyst.gui.InterpolationPanel;
import com.analyst.sle.Gaussian;
import java.awt.Font;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class Direct {

    static int n;
    static double res, ip;
    static String soln;

    static double matA[][];
    static double matB[];
    static double matX[];

    public static void run() {
        try {
            n = InterpolationPanel.getNoOfUns() - 1;
            ip = Double.parseDouble(InterpolationPanel.ipField.getText());
            soln = "";
            matA = new double[n + 1][n + 1];
            matB = new double[n + 1];
            matX = new double[n + 1];
            for (int i = 0; i <= n; i++) {
                double p = 1;
                for (int j = 0; j <= n; j++) {
                    matA[i][j] = p;
                    p *= Double.parseDouble((String) InterpolationPanel.getMat().getModel().getValueAt(i, 0));
                }
            }

            for (int i = 0; i <= n; i++) {
                matB[i] = Double.parseDouble((String) InterpolationPanel.getMat().getModel().getValueAt(i, 1));
            }

            direct();

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
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static void direct() {
        matX = Gaussian.getSolnMat(n, matA, matB);
        res = 0;
        double p = 1;

        for (int i = 0; i <= n; i++) {
            res += p * matX[i];
            p *= ip;
        }
    }
}
