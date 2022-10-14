package com.analyst.gui;

import com.analyst.sle.Gaussian;
import com.analyst.sle.NaiveGaussian;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author R1B3n
 */
public class SlePanel extends javax.swing.JPanel {

    /**
     * Creates new form SlePanel
     */
    public SlePanel() {
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

        sleNorthPanel = new javax.swing.JPanel();
        sleComboBox = new javax.swing.JComboBox<>();
        sleCreateButton = new javax.swing.JButton();
        sleSouthPanel = new javax.swing.JPanel();
        sleRunButton = new javax.swing.JButton();
        sleClearButton = new javax.swing.JButton();
        sleResetButton = new javax.swing.JButton();
        unknownTextField = new javax.swing.JTextField();
        unknownLabel = new javax.swing.JLabel();
        solnTextField = new javax.swing.JTextField();
        sleCenterPanel = new javax.swing.JPanel();
        matPanel = new javax.swing.JPanel();
        matScrollPane = new javax.swing.JScrollPane();
        matTable = new javax.swing.JTable();
        resPanel = new javax.swing.JPanel();
        resScrollPane = new javax.swing.JScrollPane();
        resTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        sleNorthPanel.setBackground(new java.awt.Color(0, 23, 39));

        sleComboBox.setForeground(new java.awt.Color(177, 191, 222));
        sleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sleComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sleCreateButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleCreateButton.setForeground(new java.awt.Color(177, 191, 222));
        sleCreateButton.setText("Create");
        sleCreateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sleCreateButton.setPreferredSize(new java.awt.Dimension(110, 31));
        sleCreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sleCreateButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sleNorthPanelLayout = new javax.swing.GroupLayout(sleNorthPanel);
        sleNorthPanel.setLayout(sleNorthPanelLayout);
        sleNorthPanelLayout.setHorizontalGroup(
            sleNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sleNorthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                .addComponent(sleCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        sleNorthPanelLayout.setVerticalGroup(
            sleNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sleNorthPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(sleNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(sleNorthPanel, java.awt.BorderLayout.PAGE_START);

        sleSouthPanel.setBackground(new java.awt.Color(0, 23, 39));

        sleRunButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleRunButton.setForeground(new java.awt.Color(177, 191, 222));
        sleRunButton.setText("Run");
        sleRunButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sleRunButton.setPreferredSize(new java.awt.Dimension(93, 31));
        sleRunButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sleRunButtonMouseClicked(evt);
            }
        });

        sleClearButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleClearButton.setForeground(new java.awt.Color(177, 191, 222));
        sleClearButton.setText("Clear");
        sleClearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sleClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sleClearButtonMouseClicked(evt);
            }
        });

        sleResetButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleResetButton.setForeground(new java.awt.Color(177, 191, 222));
        sleResetButton.setText("Reset");
        sleResetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sleResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sleResetButtonMouseClicked(evt);
            }
        });

        unknownTextField.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        unknownTextField.setForeground(new java.awt.Color(177, 191, 222));
        unknownTextField.setText("3");

        unknownLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        unknownLabel.setForeground(new java.awt.Color(177, 191, 222));
        unknownLabel.setText("No. of unknowns:");

        solnTextField.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        solnTextField.setForeground(new java.awt.Color(108, 180, 64));
        solnTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        solnTextField.setBorder(null);

        javax.swing.GroupLayout sleSouthPanelLayout = new javax.swing.GroupLayout(sleSouthPanel);
        sleSouthPanel.setLayout(sleSouthPanelLayout);
        sleSouthPanelLayout.setHorizontalGroup(
            sleSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sleSouthPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sleRunButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sleClearButton)
                .addGap(18, 18, 18)
                .addComponent(sleResetButton)
                .addGap(18, 18, 18)
                .addComponent(solnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(unknownLabel)
                .addGap(18, 18, 18)
                .addComponent(unknownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        sleSouthPanelLayout.setVerticalGroup(
            sleSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sleSouthPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(sleSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleRunButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleClearButton)
                    .addComponent(sleResetButton)
                    .addComponent(unknownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unknownLabel)
                    .addComponent(solnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        add(sleSouthPanel, java.awt.BorderLayout.PAGE_END);

        sleCenterPanel.setBackground(new java.awt.Color(0, 23, 39));
        sleCenterPanel.setLayout(new java.awt.GridLayout());

        matPanel.setBackground(new java.awt.Color(0, 23, 39));
        matPanel.setVisible(false);

        matTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 191, 222), 3));
        matTable.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        matTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "x1", "x2", "x3", "const"
            }
        ));
        matTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        matTable.setFillsViewportHeight(true);
        matTable.setGridColor(new java.awt.Color(177, 191, 222));
        matTable.setRowSelectionAllowed(false);
        matTable.setShowGrid(true);
        matTable.getTableHeader().setReorderingAllowed(false);
        matScrollPane.setViewportView(matTable);
        if (matTable.getColumnModel().getColumnCount() > 0) {
            matTable.getColumnModel().getColumn(0).setResizable(false);
            matTable.getColumnModel().getColumn(1).setResizable(false);
            matTable.getColumnModel().getColumn(2).setResizable(false);
            matTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout matPanelLayout = new javax.swing.GroupLayout(matPanel);
        matPanel.setLayout(matPanelLayout);
        matPanelLayout.setHorizontalGroup(
            matPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(matScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
        matPanelLayout.setVerticalGroup(
            matPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(matScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        sleCenterPanel.add(matPanel);

        resPanel.setBackground(new java.awt.Color(0, 23, 39));
        resPanel.setVisible(false);

        resTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 191, 222), 3));
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

        javax.swing.GroupLayout resPanelLayout = new javax.swing.GroupLayout(resPanel);
        resPanel.setLayout(resPanelLayout);
        resPanelLayout.setHorizontalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        resPanelLayout.setVerticalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        sleCenterPanel.add(resPanel);

        add(sleCenterPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void sleCreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleCreateButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            try {
                resPanel.setVisible(false);
                solnTextField.setText("");
                int row = Integer.parseInt(unknownTextField.getText());
                if (row < 16 && row > 0) {
                    String[] title = new String[row + 1];
                    for (int i = 0; i < row; i++) {
                        title[i] = "x" + String.valueOf(i + 1);
                    }
                    title[row] = "const";
                    DefaultTableModel modelMat = new DefaultTableModel(title, row);
                    DefaultTableModel modelRes = new DefaultTableModel(title, row);
                    matTable.setModel(modelMat);
                    resTable.setModel(modelRes);
                    matTable.setRowHeight(matTable.getHeight() / row);
                    resTable.setRowHeight(resTable.getHeight() / row);
                    if (row == 14 || row == 15) {
                        matTable.setRowHeight(row - 1, matTable.getHeight() / row + 5);
                        resTable.setRowHeight(row - 1, resTable.getHeight() / row + 5);
                    }
                    if (row == 6 || row == 8 || row == 9 || row == 12) {
                        matTable.setRowHeight(row - 1, matTable.getHeight() / row + 3);
                        resTable.setRowHeight(row - 1, resTable.getHeight() / row + 3);
                    }
                    matScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    matPanel.setVisible(true);
                    repaint();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Valid input interval: [1, 15]",
                            "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input",
                        "Error!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_sleCreateButtonMouseClicked

    private void sleResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleResetButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            matPanel.setVisible(false);
            resPanel.setVisible(false);
            solnTextField.setText("");
        }
    }//GEN-LAST:event_sleResetButtonMouseClicked

    private void sleRunButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleRunButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Gaussian.run();
        }
    }//GEN-LAST:event_sleRunButtonMouseClicked

    private void sleClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleClearButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int n = Integer.parseInt(unknownTextField.getText());
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matTable.getModel().setValueAt(null, i, j);
                }
            }
            
            for (int i = 0; i < n; i++) {
                matTable.getModel().setValueAt(null, i, n);
            }
            
            resPanel.setVisible(false);
            solnTextField.setText("");
        }
    }//GEN-LAST:event_sleClearButtonMouseClicked
    
    public static int getNoOfUns() {
        return Integer.parseInt(unknownTextField.getText());
    }
    
    public static JTable getMat() {
        return matTable;
    }
    
    public static JTable getRes() {
        return resTable;
    }
    
    public static JPanel getResPanel() {
        return resPanel;
    }
    
    public static JTextField getsolnField() {
        return solnTextField;
    }
    
    public static void setValue(double num, int i, int j) {
        resTable.getModel().setValueAt(num, i, j);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel matPanel;
    private javax.swing.JScrollPane matScrollPane;
    private static javax.swing.JTable matTable;
    private static javax.swing.JPanel resPanel;
    private javax.swing.JScrollPane resScrollPane;
    private static javax.swing.JTable resTable;
    private javax.swing.JPanel sleCenterPanel;
    private javax.swing.JButton sleClearButton;
    private javax.swing.JComboBox<String> sleComboBox;
    private javax.swing.JButton sleCreateButton;
    private javax.swing.JPanel sleNorthPanel;
    private javax.swing.JButton sleResetButton;
    private javax.swing.JButton sleRunButton;
    private javax.swing.JPanel sleSouthPanel;
    private static javax.swing.JTextField solnTextField;
    private javax.swing.JLabel unknownLabel;
    private static javax.swing.JTextField unknownTextField;
    // End of variables declaration//GEN-END:variables
}
