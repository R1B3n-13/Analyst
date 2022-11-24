package com.analyst.gui;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import static java.awt.Frame.NORMAL;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 *
 * @author R1B3n
 */
public class MainFrame extends javax.swing.JFrame {

    private int prevX, prevY, extendedState = NORMAL;
    private Action enterAction;
    private static MainFrame mainFrame;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        enterAction = new EnterAction();
        introPanel.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "enter");
        introPanel.getActionMap().put("enter", enterAction);
    }

    private class EnterAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getCurrentComponentName(mainPanel).equals("introPanel")) {
                mainPanel.nextSlidingPanel(10, indexPanel, JSlidingPane.Direction.Down);
                titleBar.setBackground(new Color(18, 8, 13));
                titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 8, 13)));
                backLabel.setVisible(true);
            }
        }
    }

    private String getCurrentComponentName(Container parent) {
        String compName = null;
        Component comp = null;
        int n = parent.getComponentCount();
        for (int i = 0; i < n; i++) {
            comp = parent.getComponent(i);
            if (comp.isVisible()) {
                compName = comp.getName();
            }
        }
        return compName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        mainPanel = new com.analyst.gui.JSlidingPane();
        introPanel = new keeptoo.KGradientPanel();
        introTextLabel = new javax.swing.JLabel();
        introGifLabel = new javax.swing.JLabel();
        introLogoLabel = new javax.swing.JLabel();
        introDescLabel = new javax.swing.JLabel();
        indexPanel = new keeptoo.KGradientPanel();
        indexLabel = new javax.swing.JLabel();
        frButton = new javax.swing.JButton();
        sleButton = new javax.swing.JButton();
        odeButton = new javax.swing.JButton();
        calcSlePanel = new com.analyst.gui.SlePanel();
        frPanel = new com.analyst.gui.FrPanel();
        odePanel = new com.analyst.gui.OdePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        titleBar.setBackground(new java.awt.Color(13, 8, 18));
        titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(13, 8, 18)));
        titleBar.setPreferredSize(new java.awt.Dimension(800, 25));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/analyst/gui/img/closeLabel.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });

        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/analyst/gui/img/minimizeLabel.png"))); // NOI18N
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseExited(evt);
            }
        });

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/analyst/gui/img/backLabel.png"))); // NOI18N
        backLabel.setVisible(false);
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 786, Short.MAX_VALUE)
                .addComponent(minimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(titleBar, java.awt.BorderLayout.PAGE_START);

        mainPanel.setName("mainPanel"); // NOI18N

        introPanel.setkEndColor(new java.awt.Color(18, 5, 32));
        introPanel.setkStartColor(new java.awt.Color(10, 10, 15));
        introPanel.setName("introPanel"); // NOI18N

        introTextLabel.setFont(new java.awt.Font("Classic Console", 1, 100)); // NOI18N
        introTextLabel.setForeground(new java.awt.Color(157, 162, 173));
        introTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introTextLabel.setText("ANALYST");
        introTextLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        introGifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introGifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/analyst/gui/img/introGifLabel.gif"))); // NOI18N
        introGifLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        introLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/analyst/gui/img/introLogo.png"))); // NOI18N

        introDescLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        introDescLabel.setForeground(new java.awt.Color(157, 162, 173));
        introDescLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introDescLabel.setText("(A tool for numerical analysis)");

        javax.swing.GroupLayout introPanelLayout = new javax.swing.GroupLayout(introPanel);
        introPanel.setLayout(introPanelLayout);
        introPanelLayout.setHorizontalGroup(
            introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(introGifLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addComponent(introLogoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(introDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        introPanelLayout.setVerticalGroup(
            introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(introLogoLabel)
                .addGap(18, 18, 18)
                .addComponent(introTextLabel)
                .addGap(12, 12, 12)
                .addComponent(introDescLabel)
                .addGap(18, 18, 18)
                .addComponent(introGifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        mainPanel.add(introPanel, "introPanel");
        introPanel.getAccessibleContext().setAccessibleName("introPanel");
        introPanel.getAccessibleContext().setAccessibleDescription("");

        indexPanel.setkEndColor(new java.awt.Color(32, 5, 18));
        indexPanel.setkStartColor(new java.awt.Color(15, 10, 10));
        indexPanel.setName("indexPanel"); // NOI18N

        indexLabel.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        indexLabel.setForeground(new java.awt.Color(157, 162, 173));
        indexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indexLabel.setText("INDEX");

        frButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        frButton.setForeground(new java.awt.Color(172, 179, 186));
        frButton.setText("Find Root");
        frButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        frButton.setBorderPainted(false);
        frButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frButton.setBackground(new java.awt.Color(101, 89, 94, 50));
        frButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frButtonMouseClicked(evt);
            }
        });

        sleButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        sleButton.setForeground(new java.awt.Color(172, 179, 186));
        sleButton.setText("Solve SLE");
        sleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        sleButton.setBorderPainted(false);
        sleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sleButton.setBackground(new java.awt.Color(101, 89, 94, 50));
        sleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sleButtonMouseClicked(evt);
            }
        });

        odeButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        odeButton.setForeground(new java.awt.Color(172, 179, 186));
        odeButton.setText("Solve ODE");
        odeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        odeButton.setBorderPainted(false);
        odeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odeButton.setBackground(new java.awt.Color(101, 89, 94, 50));
        odeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout indexPanelLayout = new javax.swing.GroupLayout(indexPanel);
        indexPanel.setLayout(indexPanelLayout);
        indexPanelLayout.setHorizontalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indexLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        indexPanelLayout.setVerticalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(indexLabel)
                .addGap(30, 30, 30)
                .addComponent(frButton)
                .addGap(35, 35, 35)
                .addComponent(sleButton)
                .addGap(35, 35, 35)
                .addComponent(odeButton)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        mainPanel.add(indexPanel, "indexPanel");
        indexPanel.getAccessibleContext().setAccessibleName("indexPanel");

        calcSlePanel.setName("calcSlePanel"); // NOI18N
        mainPanel.add(calcSlePanel, "card4");

        frPanel.setName("frPanel"); // NOI18N
        mainPanel.add(frPanel, "card5");

        odePanel.setName("odePanel"); // NOI18N
        mainPanel.add(odePanel, "card6");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);
        mainPanel.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            prevX = evt.getX();
            prevY = evt.getY();
        }
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int b1 = MouseEvent.BUTTON1_DOWN_MASK;
        int b2 = MouseEvent.BUTTON2_DOWN_MASK;
        if ((evt.getModifiersEx() & (b1 | b2)) == b1) { // this checks that BUTTON1 is down but BUTTON2 is not
            int curX = evt.getXOnScreen();
            int curY = evt.getYOnScreen();
            if (getExtendedState() == NORMAL) {
                this.setLocation(curX - prevX, curY - prevY);
            }
        }
    }//GEN-LAST:event_titleBarMouseDragged

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1)
            System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        closeLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/closeLabelHover.png"));
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        closeLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/closeLabel.png"));
    }//GEN-LAST:event_closeLabelMouseExited

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            extendedState = getExtendedState();
            setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void minimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseEntered
        minimizeLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/minimizeLabelHover.png"));
    }//GEN-LAST:event_minimizeLabelMouseEntered

    private void minimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseExited
        minimizeLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/minimizeLabel.png"));
    }//GEN-LAST:event_minimizeLabelMouseExited

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (getCurrentComponentName(mainPanel).equals("indexPanel")) {
                mainPanel.nextSlidingPanel(10, introPanel, JSlidingPane.Direction.Right);
                titleBar.setBackground(new Color(13, 8, 18));
                titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(13, 8, 18)));
                backLabel.setVisible(false);
            }
            if (getCurrentComponentName(mainPanel).equals("frPanel")) {
                mainPanel.nextSlidingPanel(10, indexPanel, JSlidingPane.Direction.Right);
                titleBar.setBackground(new Color(18, 8, 13));
                titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(18, 8, 13)));
            }
            if (getCurrentComponentName(mainPanel).equals("calcSlePanel")) {
                mainPanel.nextSlidingPanel(10, indexPanel, JSlidingPane.Direction.Right);
                titleBar.setBackground(new Color(18, 8, 13));
                titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(18, 8, 13)));
            }
        }
    }//GEN-LAST:event_backLabelMouseClicked

    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/backLabelHover.png"));
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backLabel.setIcon(new javax.swing.ImageIcon("src/com/analyst/gui/img/backLabel.png"));
    }//GEN-LAST:event_backLabelMouseExited

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        setExtendedState(extendedState);
    }//GEN-LAST:event_formWindowDeiconified

    private void sleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sleButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            mainPanel.nextSlidingPanel(10, calcSlePanel, JSlidingPane.Direction.Left);
            titleBar.setBackground(new Color(0, 14, 26));
            titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 14, 26)));
        }
    }//GEN-LAST:event_sleButtonMouseClicked

    private void frButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            mainPanel.nextSlidingPanel(10, frPanel, JSlidingPane.Direction.Left);
            titleBar.setBackground(new Color(0, 14, 26));
            titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 14, 26)));
        }
    }//GEN-LAST:event_frButtonMouseClicked

    private void odeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odeButtonMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            mainPanel.nextSlidingPanel(10, odePanel, JSlidingPane.Direction.Left);
            titleBar.setBackground(new Color(0, 14, 26));
            titleBar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 14, 26)));
        }
    }//GEN-LAST:event_odeButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel(new FlatNightOwlIJTheme());
            UIManager.put("Button.arc", 0);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }

    static MainFrame getMainFrame() {
        return mainFrame;
    }

    static JSlidingPane getMainPanel() {
        return mainPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private com.analyst.gui.SlePanel calcSlePanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton frButton;
    private com.analyst.gui.FrPanel frPanel;
    private javax.swing.JLabel indexLabel;
    private keeptoo.KGradientPanel indexPanel;
    private javax.swing.JLabel introDescLabel;
    private javax.swing.JLabel introGifLabel;
    private javax.swing.JLabel introLogoLabel;
    private keeptoo.KGradientPanel introPanel;
    private javax.swing.JLabel introTextLabel;
    private static com.analyst.gui.JSlidingPane mainPanel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JButton odeButton;
    private com.analyst.gui.OdePanel odePanel;
    private javax.swing.JButton sleButton;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
