package com.analyst.integration;

import com.analyst.gui.IntegrationPanel;
import static com.analyst.gui.IntegrationPanel.hField;
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
public class Trapezoidal {

    static Function f;
    static double x0, xn, n, res;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
    static String soln;
    public static boolean flg, valid;

    public static void run() {
        try {
            flg = true;
            f = new Function("f", IntegrationPanel.funcField.getText(), "x");
            x0 = Double.parseDouble(IntegrationPanel.x0Field.getText());
            xn = Double.parseDouble(IntegrationPanel.xnField.getText());
            n = Double.parseDouble(IntegrationPanel.segField.getText());
            list = new ArrayList<ArrayList<String>>();
            valid = true;

            trapezoidal();

            if (valid) {
                Object[] title = {"i", "x₀ + ih", "f(x₀ + ih)", "Result"};
                data = new Object[list.size()][5];

                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < list.get(i).size(); j++) {
                        data[i][j] = list.get(i).get(j);
                    }
                }
                DefaultTableModel model = new DefaultTableModel(data, title);
                IntegrationPanel.resTable.setModel(model);

                Formatter formatter = new Formatter();
                formatter.format("%.5f", res);
                soln = "The approximate result is : " + formatter.toString();

                IntegrationPanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(20,
                        (2 * IntegrationPanel.getsolnField().getSize().width + 700) / soln.length()
                )));
                IntegrationPanel.getsolnField().setText(soln);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void trapezoidal() {
        res = 0;

        if (n <= 0) {
            JOptionPane.showMessageDialog(null,
                    "No. of segments must be greater than zero.",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            valid = false;
        } else {
            Formatter formatter = new Formatter();
            list.add(new ArrayList<>());
            list.get(0).add(String.valueOf(0));

            formatter.format("%.5f", x0);
            list.get(0).add(formatter.toString());
            formatter = new Formatter();

            double h = (xn - x0) / n;
            formatter.format("%.5f", h);
            hField.setFont(new Font("Roboto", Font.PLAIN, 15));
            hField.setText(formatter.toString());
            double ff = f.calculate(x0);
            res += ff;

            formatter.format("%.5f", ff);
            list.get(0).add(formatter.toString());
            formatter = new Formatter();

            list.get(0).add("--");

            for (int i = 1; i < n; i++) {
                list.add(new ArrayList<>());
                list.get(i).add(String.valueOf(i));

                formatter.format("%.5f", x0 + i * h);
                list.get(i).add(formatter.toString());
                formatter = new Formatter();

                ff = f.calculate(x0 + i * h);
                res += 2 * ff;
                formatter.format("%.5f", ff);
                list.get(i).add(formatter.toString());
                formatter = new Formatter();

                list.get(i).add("--");
            }

            list.add(new ArrayList<>());
            list.get((int) n).add(String.valueOf((int) n));

            formatter.format("%.5f", xn);
            list.get((int) n).add(formatter.toString());
            formatter = new Formatter();

            ff = f.calculate(xn);
            res += ff;
            res *= h / 2;

            formatter.format("%.5f", ff);
            list.get((int) n).add(formatter.toString());
            formatter = new Formatter();

            list.get((int) n).add(String.valueOf(res));
        }
    }
}
