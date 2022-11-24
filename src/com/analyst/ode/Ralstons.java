package com.analyst.ode;

import com.analyst.gui.OdePanel;
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
public class Ralstons {

    static Function f;
    static double x0, y0, xn, h, res;
    static ArrayList<ArrayList<String>> list;
    static Object[][] data;
    static String soln;
    public static boolean flg, valid;

    public static void run() {
        try {
            flg = true;
            f = new Function("f", OdePanel.eqnField.getText(), "x", "y");
            x0 = Double.parseDouble(OdePanel.x0Field.getText());
            y0 = Double.parseDouble(OdePanel.y0Field.getText());
            xn = Double.parseDouble(OdePanel.xnField.getText());
            h = Double.parseDouble(OdePanel.stepField.getText());
            list = new ArrayList<ArrayList<String>>();
            valid = true;

            ralstons();

            if (valid) {
                Object[] title = {"Step no.", "K₁", "K₂", "Xᵢ", "Yᵢ"};
                data = new Object[list.size()][6];

                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < list.get(i).size(); j++) {
                        data[i][j] = list.get(i).get(j);
                    }
                }
                DefaultTableModel model = new DefaultTableModel(data, title);
                OdePanel.resTable.setModel(model);

                Formatter formatter = new Formatter();
                formatter.format("%.5f", res);
                soln = "The approximate result is : " + formatter.toString();

                OdePanel.getsolnField().setFont(new Font("Roboto", Font.BOLD, Math.min(20,
                        (2 * OdePanel.getsolnField().getSize().width + 700) / soln.length()
                )));
                OdePanel.getsolnField().setText(soln);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            flg = false;
        }
    }

    public static void ralstons() {
        int itr = 0;

        if ((xn - x0) % h != 0) {
            JOptionPane.showMessageDialog(null,
                    "Invalid step size! (step size must be divisible by xₙ-x₀)",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            valid = false;
        } else {
            while (x0 < xn) {
                Formatter formatter = new Formatter();
                list.add(new ArrayList<>());
                list.get(itr).add(String.valueOf(itr + 1));
                if (itr != 0) {
                    double k1 = f.calculate(x0, y0);
                    double k2 = f.calculate(x0 + 3 * h / 4, y0 + k1 * 3 * h / 4);
                    y0 += h * (k1 + 2 * k2) / 3;
                    x0 += h;
                    formatter.format("%.5f", k1);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                    formatter.format("%.5f", k2);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                    formatter.format("%.5f", x0);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                    formatter.format("%.5f", y0);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                } else {
                    list.get(itr).add("null");
                    list.get(itr).add("null");
                    formatter.format("%.5f", x0);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                    formatter.format("%.5f", y0);
                    list.get(itr).add(formatter.toString());
                    formatter = new Formatter();
                }
                res = y0;
                itr++;
            }
        }
    }
}
