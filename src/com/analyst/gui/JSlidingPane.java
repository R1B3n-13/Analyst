package com.analyst.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.awt.Frame.NORMAL;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author R1B3n
 */
public class JSlidingPane extends javax.swing.JPanel {

    public enum Direction {
        Left,
        Right,
        Up,
        Down
    };

    private final JPanel glassPane;

    /**
     * Creates new form JSlidingPanel
     */
    public JSlidingPane() {
        initComponents();
        glassPane = new JPanel();
        glassPane.setOpaque(false);
        glassPane.addMouseListener(new MouseAdapter() {
        });
        glassPane.addMouseMotionListener(new MouseMotionAdapter() {
        });
        glassPane.addKeyListener(new KeyAdapter() {
        });
    }

    void nextSlidingPanel(int panelSpeed, Component hiddenPanel, Direction direction) {
        Component currentComp = getCurrentComponent(this);
        switch (direction) {
            case Right ->
                hiddenPanel.setLocation(-hiddenPanel.getWidth(), 0);
            case Left ->
                hiddenPanel.setLocation(getWidth(), 0);
            case Up ->
                hiddenPanel.setLocation(-hiddenPanel.getHeight(), 0);
            default ->
                hiddenPanel.setLocation(getHeight(), 0);
        }
        disableUserInput();
        JSlidingPanelListener listener = new JSlidingPanelListener(panelSpeed, currentComp, hiddenPanel, direction);
        Timer t = new Timer(10, listener);
        listener.timer = t;
        t.start();
        repaint();
        revalidate();
    }

    private Component getCurrentComponent(Container parent) {
        Component comp = null;
        int n = parent.getComponentCount();
        for (int i = 0; i < n; i++) {
            comp = parent.getComponent(i);
            if (comp.isVisible()) {
                return comp;
            }
        }
        return comp;
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

    private class JSlidingPanelListener implements ActionListener {

        Component visiblePanel;
        Component hiddenPanel;
        int steps;
        int step;
        Timer timer;
        Direction direction;

        private JSlidingPanelListener(int steps, Component visiblePanel, Component hiddenPanel, Direction direction) {
            this.steps = steps;
            this.visiblePanel = visiblePanel;
            this.hiddenPanel = hiddenPanel;
            this.direction = direction;
            step = 0;

            add(hiddenPanel);
            hiddenPanel.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Rectangle bounds = visiblePanel.getBounds();
            int shift = bounds.width / steps;
            int shiftUp = bounds.height / steps;
            switch (direction) {
                case Left -> {
                    visiblePanel.setLocation(bounds.x - shift, bounds.y);
                    hiddenPanel.setLocation(bounds.x - shift + bounds.width, bounds.y);
                }
                case Right -> {
                    visiblePanel.setLocation(bounds.x + shift, bounds.y);
                    hiddenPanel.setLocation(bounds.x + shift - bounds.width, bounds.y);
                }

                case Up -> {
                    visiblePanel.setLocation(bounds.x, bounds.y - shiftUp);
                    hiddenPanel.setLocation(bounds.x, bounds.y - shiftUp + bounds.height);
                }
                case Down -> {
                    visiblePanel.setLocation(bounds.x, bounds.y + shiftUp);
                    hiddenPanel.setLocation(bounds.x, bounds.y + shiftUp - bounds.height);
                }
            }
            repaint();
            step++;

            if (step == steps) {
                hiddenPanel.setLocation(0, 0);
                timer.stop();
                visiblePanel.setVisible(false);
                remove(visiblePanel);
                if (getCurrentComponentName(MainFrame.getMainPanel()).equals("calcSlePanel")) {
                    MainFrame.getMainFrame().setExtendedState(MAXIMIZED_BOTH);
                } else if (getCurrentComponentName(MainFrame.getMainPanel()).equals("frPanel")) {
                    MainFrame.getMainFrame().setExtendedState(MAXIMIZED_BOTH);
                } else if (getCurrentComponentName(MainFrame.getMainPanel()).equals("odePanel")) {
                    MainFrame.getMainFrame().setExtendedState(MAXIMIZED_BOTH);
                } else if (getCurrentComponentName(MainFrame.getMainPanel()).equals("integrationPanel")) {
                    MainFrame.getMainFrame().setExtendedState(MAXIMIZED_BOTH);
                } else if (getCurrentComponentName(MainFrame.getMainPanel()).equals("interpolationPanel")) {
                    MainFrame.getMainFrame().setExtendedState(MAXIMIZED_BOTH);
                } else {
                    MainFrame.getMainFrame().setExtendedState(NORMAL);
                }
                enableUserInput();
            }
        }
    }

    private void enableUserInput() {
        MainFrame.getMainFrame().getGlassPane().setVisible(false);
        MainFrame.getMainFrame().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void disableUserInput() {
        MainFrame.getMainFrame().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        MainFrame.getMainFrame().setGlassPane(glassPane);
        glassPane.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
