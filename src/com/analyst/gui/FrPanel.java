package com.analyst.gui;

import com.analyst.findroot.Bisection;
import com.analyst.findroot.FalsePosition;
import com.analyst.findroot.NewtonRaphson;
import com.analyst.findroot.Secant;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

/**
 *
 * @author R1B3n
 */
public class FrPanel extends javax.swing.JPanel {

    /**
     * Creates new form FrPanel
     */
    public FrPanel() {
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

        frNorthPanel = new javax.swing.JPanel();
        functionLabel = new javax.swing.JLabel();
        funcField = new javax.swing.JTextField();
        lowLabel = new javax.swing.JLabel();
        lowField = new javax.swing.JTextField();
        highLabel = new javax.swing.JLabel();
        highField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        errorField = new javax.swing.JTextField();
        frSouthPanel = new javax.swing.JPanel();
        runButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        frComboBox = new javax.swing.JComboBox<>();
        rootSolnField = new javax.swing.JTextField();
        frCenterPanel = new javax.swing.JPanel();
        resPanel = new javax.swing.JPanel();
        resScrollPane = new javax.swing.JScrollPane();
        resTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        frNorthPanel.setLayout(new javax.swing.BoxLayout(frNorthPanel, javax.swing.BoxLayout.LINE_AXIS));

        functionLabel.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        functionLabel.setForeground(new java.awt.Color(161, 131, 199));
        functionLabel.setText("Function:");
        frNorthPanel.add(functionLabel);

        funcField.setPreferredSize(new java.awt.Dimension(2000, 26));
        frNorthPanel.add(funcField);

        lowLabel.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        lowLabel.setForeground(new java.awt.Color(161, 131, 199));
        lowLabel.setText("Low:");
        frNorthPanel.add(lowLabel);
        frNorthPanel.add(lowField);

        highLabel.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        highLabel.setForeground(new java.awt.Color(161, 131, 199));
        highLabel.setText("High:");
        frNorthPanel.add(highLabel);
        frNorthPanel.add(highField);

        errorLabel.setFont(new java.awt.Font("Courier", 1, 24)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(161, 131, 199));
        errorLabel.setText("Tolerable Error(%):");
        frNorthPanel.add(errorLabel);
        frNorthPanel.add(errorField);

        add(frNorthPanel, java.awt.BorderLayout.PAGE_START);

        runButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
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

        clearButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(177, 191, 222));
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        frComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bisection", "False Position", "Newton Raphson", "Secant" }));
        frComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frComboBoxActionPerformed(evt);
            }
        });

        rootSolnField.setForeground(new java.awt.Color(108, 180, 64));
        rootSolnField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rootSolnField.setBorder(null);
        rootSolnField.setEditable(false);

        javax.swing.GroupLayout frSouthPanelLayout = new javax.swing.GroupLayout(frSouthPanel);
        frSouthPanel.setLayout(frSouthPanelLayout);
        frSouthPanelLayout.setHorizontalGroup(
            frSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frSouthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton)
                .addGap(18, 18, 18)
                .addComponent(rootSolnField, javax.swing.GroupLayout.DEFAULT_SIZE, 2045, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(frComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        frSouthPanelLayout.setVerticalGroup(
            frSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frSouthPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(frSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(frComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rootSolnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        add(frSouthPanel, java.awt.BorderLayout.PAGE_END);

        frCenterPanel.setLayout(new java.awt.BorderLayout());

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
        resTable.getTableHeader().setReorderingAllowed(false);
        resScrollPane.setViewportView(resTable);

        resPanel.add(resScrollPane);

        frCenterPanel.add(resPanel, java.awt.BorderLayout.CENTER);

        add(frCenterPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void frComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frComboBoxActionPerformed
        if (frComboBox.getSelectedIndex() == 0 || frComboBox.getSelectedIndex() == 1) {
            highLabel.setVisible(true);
            highField.setVisible(true);
            lowLabel.setText("Low:");
            highLabel.setText("High:");
        } else if (frComboBox.getSelectedIndex() == 2) {
            highLabel.setVisible(false);
            highField.setVisible(false);
            lowLabel.setText("Assumed Root:");
        } else {
            highLabel.setVisible(true);
            highField.setVisible(true);
            lowLabel.setText("First Guess:");
            highLabel.setText("Second Guess:");
        }
    }//GEN-LAST:event_frComboBoxActionPerformed

    private void runButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            switch (frComboBox.getSelectedIndex()) {
                case 0 -> {
                    Bisection.run();
                    if (Bisection.flg && Bisection.valid) {
                        resPanel.setVisible(true);
                    }
                }
                case 1 -> {
                    FalsePosition.run();
                    if (FalsePosition.flg && FalsePosition.valid) {
                        resPanel.setVisible(true);
                    }
                }
                case 2 -> {
                    NewtonRaphson.run();
                    if (NewtonRaphson.flg) {
                        resPanel.setVisible(true);
                    }
                }
                default -> {
                    Secant.run();
                    if (Secant.flg) {
                        resPanel.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_runButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            funcField.setText("");
            lowField.setText("");
            highField.setText("");
            errorField.setText("");
            rootSolnField.setText("");
            resPanel.setVisible(false);
        }
    }//GEN-LAST:event_clearButtonMouseClicked
    
    public static JTextField getsolnField() {
        return rootSolnField;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    public static javax.swing.JTextField errorField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel frCenterPanel;
    private javax.swing.JComboBox<String> frComboBox;
    private javax.swing.JPanel frNorthPanel;
    private javax.swing.JPanel frSouthPanel;
    public static javax.swing.JTextField funcField;
    private javax.swing.JLabel functionLabel;
    public static javax.swing.JTextField highField;
    private javax.swing.JLabel highLabel;
    public static javax.swing.JTextField lowField;
    private javax.swing.JLabel lowLabel;
    private javax.swing.JPanel resPanel;
    private javax.swing.JScrollPane resScrollPane;
    public static javax.swing.JTable resTable;
    private static javax.swing.JTextField rootSolnField;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
}
