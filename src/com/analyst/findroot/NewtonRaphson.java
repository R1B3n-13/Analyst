package com.analyst.findroot;

import com.analyst.gui.FrPanel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;

/**
 *
 * @author R1B3n
 */
public class NewtonRaphson {

    static Function f;
    static Expression df;
    static double assumedR, tErr, root;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
    static String soln;
    public static boolean flg;

    public static void run() {
        try {
            flg = true;
            f = new Function("f", FrPanel.funcField.getText(), "x");
            assumedR = Double.parseDouble(FrPanel.lowField.getText());
            tErr = Double.parseDouble(FrPanel.errorField.getText());
            list = new ArrayList<ArrayList<String>>();

            ntonRson();

            Object[] title = {"Iteration", "Xᵢ", "Xᵢ₊₁", "f(Xᵢ₊₁)", "|εₐ| %"};
            data = new Object[list.size()][6];

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    data[i][j] = list.get(i).get(j);
                }
            }
            DefaultTableModel model = new DefaultTableModel(data, title);
            FrPanel.resTable.setModel(model);

            Formatter formatter = new Formatter();
            formatter.format("%.5f", root);
            soln = "The approximate root is : " + formatter.toString();

            FrPanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(20,
                    (2 * FrPanel.getsolnField().getSize().width + 700) / soln.length()
            )));
            FrPanel.getsolnField().setText(soln);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void ntonRson() {
        int itr = 0;
        boolean running = true;
        double appErr = 0, xi = assumedR;;

        while (running) {
            df = new Expression("der(" + FrPanel.funcField.getText() + ", x, " + String.valueOf(xi) + ")");
            double xii = xi - (f.calculate(xi) / df.calculate());
            appErr = Math.abs((xii - xi) / xii) * 100;

            list.add(new ArrayList<>());
            list.get(itr).add(String.valueOf(itr + 1));
            Formatter formatter = new Formatter();
            formatter.format("%.5f", xi);
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter.format("%.5f", xii);
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter = new Formatter();
            formatter.format("%.5f", f.calculate(xii));
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter.format("%.5f", Math.abs(appErr));
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();

            running = appErr > tErr;

            root = xi = xii;
            itr++;
        }
    }
}
