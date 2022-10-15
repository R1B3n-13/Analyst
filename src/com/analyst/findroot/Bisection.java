package com.analyst.findroot;

import com.analyst.gui.FrPanel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.Function;

/**
 *
 * @author R1B3n
 */
public class Bisection {

    static Function f;
    static double lo, hi, tErr, root;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
    static String soln;
    public static boolean flg, valid;

    public static void run() {
        try {
            flg = true;
            f = new Function("f", FrPanel.funcField.getText(), "x");
            lo = Double.parseDouble(FrPanel.lowField.getText());
            hi = Double.parseDouble(FrPanel.highField.getText());
            tErr = Double.parseDouble(FrPanel.errorField.getText());
            list = new ArrayList<ArrayList<String>>();
            valid = true;

            biSection();

            if (valid) {
                Object[] title = {"Iteration", "Xₗ", "Xᵤ", "Xₘ", "f(Xₘ)", "|εₐ| %"};
                data = new Object[list.size()][7];

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

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void biSection() {
        int itr = 0;
        boolean running = true;
        double old = -1, appErr = 0;

        if (f.calculate(lo) * f.calculate(hi) >= 0) {
            JOptionPane.showMessageDialog(null,
                    "Solution doesn't exist between this interval.",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            valid = false;
        } else {
            while (running) {
                double mid = (lo + hi) / 2;
                appErr = Math.abs((mid - old) / mid) * 100;

                list.add(new ArrayList<>());
                list.get(itr).add(String.valueOf(itr + 1));
                Formatter formatter = new Formatter();
                formatter.format("%.5f", lo);
                list.get(itr).add(formatter.toString());
                formatter = new Formatter();
                formatter.format("%.5f", hi);
                list.get(itr).add(formatter.toString());
                formatter = new Formatter();
                formatter.format("%.5f", mid);
                list.get(itr).add(formatter.toString());
                formatter = new Formatter();
                formatter.format("%.5f", f.calculate(mid));
                list.get(itr).add(formatter.toString());
                formatter = new Formatter();
                if (itr != 0) {
                    formatter.format("%.5f", Math.abs(appErr));
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                } else {
                    list.get(itr).add("null");
                }

                running = appErr > tErr;

                if (f.calculate(mid) == 0) {
                    hi = mid;
                } else if (f.calculate(lo) * f.calculate(mid) < 0) {
                    hi = mid;
                } else {
                    lo = mid;
                }
                root = old = mid;
                itr++;
            }
        }
    }
}
