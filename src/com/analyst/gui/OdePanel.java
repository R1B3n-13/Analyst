package com.analyst.gui;

import com.analyst.ode.Eulers;
import com.analyst.ode.Heuns;
import com.analyst.ode.Midpoint;
import com.analyst.ode.Ralstons;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

/**
 *
 * @author R1B3n
 */
public class OdePanel extends javax.swing.JPanel {

    /**
     * Creates new form OdePanel
     */
    public OdePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odeNorthPanel = new javax.swing.JPanel();
        eqnLabel = new javax.swing.JLabel();
        eqnField = new javax.swing.JTextField();
        x0Label = new javax.swing.JLabel();
        x0Field = new javax.swing.JTextField();
        y0Label = new javax.swing.JLabel();
        y0Field = new javax.swing.JTextField();
        xnLabel = new javax.swing.JLabel();
        xnField = new javax.swing.JTextField();
        stepLabel = new javax.swing.JLabel();
        stepField = new javax.swing.JTextField();
        odeCenterPanel = new javax.swing.JPanel();
        resPanel = new javax.swing.JPanel();
        resScrollPane = new javax.swing.JScrollPane();
        resTable = new javax.swing.JTable();
        odeSouthPanel = new javax.swing.JPanel();
        runButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        odeComboBox = new javax.swing.JComboBox<>();
        odeSolnField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 23, 39));
        setLayout(new java.awt.BorderLayout());

        odeNorthPanel.setMinimumSize(new java.awt.Dimension(100, 31));
        odeNorthPanel.setPreferredSize(new java.awt.Dimension(400, 31));
        odeNorthPanel.setLayout(new javax.swing.BoxLayout(odeNorthPanel, javax.swing.BoxLayout.LINE_AXIS));

        eqnLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        eqnLabel.setForeground(new java.awt.Color(161, 131, 199));
        eqnLabel.setText("dy/dx=");
        odeNorthPanel.add(eqnLabel);

        eqnField.setPreferredSize(new java.awt.Dimension(2000, 26));
        odeNorthPanel.add(eqnField);

        x0Label.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        x0Label.setForeground(new java.awt.Color(161, 131, 199));
        x0Label.setText("x₀:");
        odeNorthPanel.add(x0Label);
        odeNorthPanel.add(x0Field);

        y0Label.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        y0Label.setForeground(new java.awt.Color(161, 131, 199));
        y0Label.setText("y₀:");
        odeNorthPanel.add(y0Label);
        odeNorthPanel.add(y0Field);

        xnLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        xnLabel.setForeground(new java.awt.Color(161, 131, 199));
        xnLabel.setText("xₙ:");
        odeNorthPanel.add(xnLabel);
        odeNorthPanel.add(xnField);

        stepLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        stepLabel.setForeground(new java.awt.Color(161, 131, 199));
        stepLabel.setText("Step size : ");
        odeNorthPanel.add(stepLabel);
        odeNorthPanel.add(stepField);

        add(odeNorthPanel, java.awt.BorderLayout.PAGE_START);

        odeCenterPanel.setLayout(new java.awt.BorderLayout());

        resPanel.setVisible(false);
        resPanel.setLayout(new javax.swing.BoxLayout(resPanel, javax.swing.BoxLayout.LINE_AXIS));

        resTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resTable.setFillsViewportHeight(true);
        resTable.setGridColor(new java.awt.Color(177, 191, 222));
        resTable.setRowSelectionAllowed(false);
        resTable.setShowGrid(true);
        resScrollPane.setViewportView(resTable);

        resPanel.add(resScrollPane);

        odeCenterPanel.add(resPanel, java.awt.BorderLayout.CENTER);

        add(odeCenterPanel, java.awt.BorderLayout.CENTER);

        odeSouthPanel.setMinimumSize(new java.awt.Dimension(100, 31));
        odeSouthPanel.setPreferredSize(new java.awt.Dimension(947, 71));

        runButton.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        runButton.setForeground(new java.awt.Color(177, 191, 222));
        runButton.setText("Run");
        runButton.setMaximumSize(new java.awt.Dimension(93, 31));
        runButton.setMinimumSize(new java.awt.Dimension(93, 31));
        runButton.setPreferredSize(new java.awt.Dimension(93, 31));
        runButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                runButtonMouseClicked(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(177, 191, 222));
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        odeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euler's method", "Heun’s method", "Midpoint method", "Ralston’s method" }));

        odeSolnField.setForeground(new java.awt.Color(108, 180, 64));
        odeSolnField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        odeSolnField.setBorder(null);
        odeSolnField.setEditable(false);

        javax.swing.GroupLayout odeSouthPanelLayout = new javax.swing.GroupLayout(odeSouthPanel);
        odeSouthPanel.setLayout(odeSouthPanelLayout);
        odeSouthPanelLayout.setHorizontalGroup(
            odeSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odeSouthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton)
                .addGap(18, 18, 18)
                .addComponent(odeSolnField, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(odeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        odeSouthPanelLayout.setVerticalGroup(
            odeSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odeSouthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(odeSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(odeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odeSolnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(odeSouthPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            switch (odeComboBox.getSelectedIndex()) {
                case 0 -> {
                    Eulers.run();
                    if (Eulers.flg && Eulers.valid) {
                        resPanel.setVisible(true);
                    }
                }
                case 1 -> {
                    Heuns.run();
                    if (Heuns.flg && Heuns.valid) {
                        resPanel.setVisible(true);
                    }
                }
                case 2 -> {
                    Midpoint.run();
                    if (Midpoint.flg && Midpoint.valid) {
                        resPanel.setVisible(true);
                    }
                }
                case 3 -> {
                    Ralstons.run();
                    if (Ralstons.flg && Ralstons.valid) {
                        resPanel.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_runButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            eqnField.setText("");
            x0Field.setText("");
            y0Field.setText("");
            xnField.setText("");
            stepField.setText("");
            odeSolnField.setText("");
            resPanel.setVisible(false);
        }
    }//GEN-LAST:event_clearButtonMouseClicked

    public static JTextField getsolnField() {
        return odeSolnField;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    public static javax.swing.JTextField eqnField;
    private javax.swing.JLabel eqnLabel;
    private javax.swing.JPanel odeCenterPanel;
    private javax.swing.JComboBox<String> odeComboBox;
    private javax.swing.JPanel odeNorthPanel;
    public static javax.swing.JTextField odeSolnField;
    private javax.swing.JPanel odeSouthPanel;
    private javax.swing.JPanel resPanel;
    private javax.swing.JScrollPane resScrollPane;
    public static javax.swing.JTable resTable;
    private javax.swing.JButton runButton;
    public static javax.swing.JTextField stepField;
    private javax.swing.JLabel stepLabel;
    public static javax.swing.JTextField x0Field;
    private javax.swing.JLabel x0Label;
    public static javax.swing.JTextField xnField;
    private javax.swing.JLabel xnLabel;
    public static javax.swing.JTextField y0Field;
    private javax.swing.JLabel y0Label;
    // End of variables declaration//GEN-END:variables
}
