package com.analyst.findroot;

import com.analyst.gui.FrPanel;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.Function;

/**
 *
 * @author R1B3n
 */
public class Secant {

    static Function f;
    static double x1, x2, tErr;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
    public static boolean flg;

    public static void run() {
        try {
            flg = true;
            f = new Function("f", FrPanel.funcField.getText(), "x");
            x1 = Double.parseDouble(FrPanel.lowField.getText());
            x2 = Double.parseDouble(FrPanel.highField.getText());
            tErr = Double.parseDouble(FrPanel.errorField.getText());
            list = new ArrayList<ArrayList<String>>();

            secant();

            Object[] title = {"Iteration", "Xᵢ₋₁", "Xᵢ", "Xᵢ₊₁", "|εₐ| %"};
            data = new Object[list.size()][6];

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    data[i][j] = list.get(i).get(j);
                }
            }
            DefaultTableModel model = new DefaultTableModel(data, title);
            FrPanel.resTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void secant() {
        int itr = 0;
        boolean running = true;
        double old = -1, appErr = 0;

        while (running) {

            double fx1 = f.calculate(x1), fx2 = f.calculate(x2);
            double xi = x2 - ((fx2 * (x2 - x1)) / (fx2 - fx1));
            appErr = Math.abs((xi - x2) / xi) * 100;

            list.add(new ArrayList<>());
            list.get(itr).add(String.valueOf(itr + 1));
            Formatter formatter = new Formatter();
            formatter.format("%.5f", x1);
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter.format("%.5f", xi);
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter = new Formatter();
            formatter.format("%.5f", x2);
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();
            formatter.format("%.5f", Math.abs(appErr));
            list.get(itr).add(formatter.toString());
            formatter = new Formatter();

            running = Math.abs(appErr) > tErr;

            x1 = x2;
            x2 = xi;
            itr++;
        }
    }
}
