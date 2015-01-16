/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ulaval.glo2004.GUI;

/**
 *
 * @author jeandanielpearson
 */
public class ToolBarPanel extends javax.swing.JPanel {

    /**
     * Creates new form ToolBarPanel
     */
    public ToolBarPanel() {
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

        stationButton = new javax.swing.JButton();
        conveyorButton = new javax.swing.JButton();
        cusorButton = new javax.swing.JButton();
        handButton = new javax.swing.JButton();
        magnifyButton = new javax.swing.JButton();
        pointButton = new javax.swing.JToggleButton();
        junctionPointToggleButton = new javax.swing.JToggleButton();
        entryPointButton = new javax.swing.JToggleButton();
        exitPointButton = new javax.swing.JToggleButton();
        deleteButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        redoButton = new javax.swing.JButton();

        stationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square.png")));
        stationButton.setToolTipText("");
        stationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationButtonActionPerformed(evt);
            }
        });

        conveyorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow.png")));
        conveyorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conveyorButtonActionPerformed(evt);
            }
        });

        cusorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursor.png")));
        cusorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusorButtonActionPerformed(evt);
            }
        });

        handButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hand.png")));
        handButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handButtonActionPerformed(evt);
            }
        });

        magnifyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnify.png")));
        magnifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnifyButtonActionPerformed(evt);
            }
        });

        pointButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/point.png")));
        pointButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pointButtonStateChanged(evt);
            }
        });

        junctionPointToggleButton.setText("Junction Point");
        junctionPointToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junctionPointToggleButtonActionPerformed(evt);
            }
        });

        entryPointButton.setText("Entry Point");

        exitPointButton.setText("Exit Point");

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove.png")));
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        undoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo.png")));
        undoButton.setToolTipText("");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        redoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redo.png")));
        redoButton.setToolTipText("");
        redoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cusorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(handButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magnifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(undoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conveyorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entryPointButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitPointButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(junctionPointToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(junctionPointToggleButton)
                            .addComponent(exitPointButton)
                            .addComponent(entryPointButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(handButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magnifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(undoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conveyorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cusorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationButtonActionPerformed

    private void conveyorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conveyorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conveyorButtonActionPerformed

    private void cusorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusorButtonActionPerformed

    private void handButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_handButtonActionPerformed

    private void magnifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnifyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magnifyButtonActionPerformed

    private void pointButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pointButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pointButtonStateChanged

    private void junctionPointToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junctionPointToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_junctionPointToggleButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undoButtonActionPerformed

    private void redoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton conveyorButton;
    public javax.swing.JButton cusorButton;
    public javax.swing.JButton deleteButton;
    public javax.swing.JToggleButton entryPointButton;
    public javax.swing.JToggleButton exitPointButton;
    public javax.swing.JButton handButton;
    public javax.swing.JToggleButton junctionPointToggleButton;
    public javax.swing.JButton magnifyButton;
    public javax.swing.JToggleButton pointButton;
    public javax.swing.JButton redoButton;
    public javax.swing.JButton stationButton;
    public javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}