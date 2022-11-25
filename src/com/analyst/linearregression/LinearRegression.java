package com.analyst.linearregression;

import com.analyst.gui.RegressionPanel;
import java.awt.Font;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author R1B3n
 */
public class LinearRegression {

    static int n;
    static double icp, slope, sum_y, sum_x_square, sum_y_square, sum_x, sum_xy;
    static String soln;

    static double matA[];
    static double matB[];

    public static void run() {
        try {
            n = RegressionPanel.getNoOfUns() - 1;
            soln = "";
            matA = new double[n + 1];
            matB = new double[n + 1];
            for (int i = 0; i <= n; i++) {
                matA[i] = Double.parseDouble((String) RegressionPanel.getMat().getModel().getValueAt(i, 0));;
            }

            for (int i = 0; i <= n; i++) {
                matB[i] = Double.parseDouble((String) RegressionPanel.getMat().getModel().getValueAt(i, 1));
            }

            regression();

            RegressionPanel.getResPanel().setVisible(true);

            Formatter formatter = new Formatter();
            formatter.format("%.5f", slope);
            soln = "The slope and y-intercept is : " + formatter.toString();
            formatter = new Formatter();
            formatter.format("%.5f", icp);
            soln += " and " + formatter.toString();

            RegressionPanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(20,
                    (2 * RegressionPanel.getsolnField().getSize().width + 700) / soln.length()
            )));
            RegressionPanel.getsolnField().setText(soln);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static void regression() {

        slope = icp = sum_y = sum_y_square = sum_x_square = sum_x = sum_xy = 0;
        for (int i = 0; i <= n; i++) {
            sum_x += matA[i];
            sum_y += matB[i];
            sum_x_square += matA[i] * matA[i];
            sum_y_square += matB[i] * matB[i];
            sum_xy += matA[i] * matB[i];
        }

        double N = matA.length;
        double numerator = (N * sum_xy - sum_x * sum_y);
        double denominator = (N * sum_x_square - sum_x * sum_x);
        slope = numerator / denominator;

        numerator = (sum_y * sum_x_square - sum_x * sum_xy);
        denominator = (N * sum_x_square - sum_x * sum_x);
        icp = numerator / denominator;

        RegressionPanel.plotModel(matA, matB, slope, icp, n);
    }
}
