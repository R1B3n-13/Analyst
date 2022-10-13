package com.analyst.gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);
//        Color color1 = new Color(0, 22, 41);
//        Color color2 = new Color(0, 23, 39);
//        GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, getWidth(), getHeight());
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
        sleCenterPanel = new javax.swing.JPanel();
        matPanel = new javax.swing.JPanel();
        matScrollPane = new javax.swing.JScrollPane();
        matTable = new javax.swing.JTable();
        resPanel = new javax.swing.JPanel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
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

        sleClearButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleClearButton.setForeground(new java.awt.Color(177, 191, 222));
        sleClearButton.setText("Clear");
        sleClearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sleResetButton.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sleResetButton.setForeground(new java.awt.Color(177, 191, 222));
        sleResetButton.setText("Reset");
        sleResetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        unknownTextField.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        unknownTextField.setForeground(new java.awt.Color(177, 191, 222));
        unknownTextField.setText("3");

        unknownLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        unknownLabel.setForeground(new java.awt.Color(177, 191, 222));
        unknownLabel.setText("No. of unknowns:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
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
                    .addComponent(unknownLabel))
                .addGap(20, 20, 20))
        );

        add(sleSouthPanel, java.awt.BorderLayout.PAGE_END);

        sleCenterPanel.setBackground(new java.awt.Color(0, 23, 39));
        sleCenterPanel.setLayout(new java.awt.GridLayout());

        matPanel.setBackground(new java.awt.Color(0, 23, 39));
        matPanel.setVisible(false);

        matTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                .addComponent(matScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );
        matPanelLayout.setVerticalGroup(
            matPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(matScrollPane)
        );

        sleCenterPanel.add(matPanel);

        resPanel.setBackground(new java.awt.Color(0, 23, 39));

        javax.swing.GroupLayout resPanelLayout = new javax.swing.GroupLayout(resPanel);
        resPanel.setLayout(resPanelLayout);
        resPanelLayout.setHorizontalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        resPanelLayout.setVerticalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        sleCenterPanel.add(resPanel);

        add(sleCenterPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void sleCreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleCreateButtonMouseClicked
        Integer row = Integer.valueOf(unknownTextField.getText());
        String[] title = new String[row + 1];
        for (int i = 0; i < row; i++) {
            title[i] = "x" + String.valueOf(i + 1);
        }
        title[row] = "const";
        DefaultTableModel model = new DefaultTableModel(title, row);
        matTable.setModel(model);
        matTable.setRowHeight(matTable.getHeight() / row);
        matPanel.setVisible(true);
        repaint();
    }//GEN-LAST:event_sleCreateButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel matPanel;
    private javax.swing.JScrollPane matScrollPane;
    private javax.swing.JTable matTable;
    private javax.swing.JPanel resPanel;
    private javax.swing.JPanel sleCenterPanel;
    private javax.swing.JButton sleClearButton;
    private javax.swing.JComboBox<String> sleComboBox;
    private javax.swing.JButton sleCreateButton;
    private javax.swing.JPanel sleNorthPanel;
    private javax.swing.JButton sleResetButton;
    private javax.swing.JButton sleRunButton;
    private javax.swing.JPanel sleSouthPanel;
    private javax.swing.JLabel unknownLabel;
    private javax.swing.JTextField unknownTextField;
    // End of variables declaration//GEN-END:variables
}
