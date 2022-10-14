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
public class FalsePosition {

    static Function f;
    static double lo, hi, tErr;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
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

            fPosition();

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
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void fPosition() {
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
                double mid = ((hi * f.calculate(lo)
                        - (lo * f.calculate(hi)))) / (f.calculate(lo) - f.calculate(hi));
                appErr = ((mid - old) / mid) * 100;

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

                running = Math.abs(appErr) > tErr;

                if (f.calculate(mid) == 0) {
                    hi = mid;
                } else if (f.calculate(lo) * f.calculate(mid) < 0) {
                    hi = mid;
                } else {
                    lo = mid;
                }
                old = mid;
                itr++;
            }
        }
    }
}
