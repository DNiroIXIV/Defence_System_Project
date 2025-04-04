/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.superdefence;

import defencesystem.util.DefenceType;
import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Nirodha
 */
public abstract class SuperDefence extends javax.swing.JFrame {
    private int checkBoxPositionValue;
    private DefenceType unitType;
    private String unitName;
    private String unitId;
    /**
     * Creates new form SuperDefence
     */    
    
    public SuperDefence() {        
        initComponents();        
        setResizable(false);
    }

    protected void setUnitType(DefenceType unitType){
        this.unitType = unitType;
    }
    
    public DefenceType getUnitType(){
        return unitType;
    }
    
     protected void setUnitName(String defaultName, String unitId){
        unitName = defaultName + " | " + unitId;
    }
    
    public String getUnitName(){
        return unitName;
    }
    
    protected void setUnitId(String unitId){
        this.unitId = unitId;
    }
    
    public String getUnitId(){
        return unitId;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAreaClearance = new javax.swing.JLabel();
        labelSoldierCount = new javax.swing.JLabel();
        spinnerSoldierCount = new javax.swing.JSpinner();
        labelAmmoCount = new javax.swing.JLabel();
        spinnerAmmoCount = new javax.swing.JSpinner();
        checkBoxPosition = new javax.swing.JCheckBox();
        buttonShoot = new javax.swing.JButton();
        scrollPaneMessageBox = new javax.swing.JScrollPane();
        textPaneMeassageBox = new javax.swing.JTextPane();
        scrollPaneMessageInput = new javax.swing.JScrollPane();
        textAreaMessageInput = new javax.swing.JTextArea();
        buttonSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Defence");

        labelAreaClearance.setBackground(new java.awt.Color(238, 137, 21));
        labelAreaClearance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAreaClearance.setForeground(new java.awt.Color(0, 0, 0));
        labelAreaClearance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAreaClearance.setText("Area Not Cleared");
        labelAreaClearance.setOpaque(true);

        labelSoldierCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSoldierCount.setForeground(new java.awt.Color(0, 0, 0));
        labelSoldierCount.setText("Soldier Count");

        spinnerSoldierCount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        labelAmmoCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAmmoCount.setForeground(new java.awt.Color(0, 0, 0));
        labelAmmoCount.setText("Ammo Count");

        spinnerAmmoCount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        checkBoxPosition.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkBoxPosition.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxPosition.setText("Position");
        checkBoxPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxPositionItemStateChanged(evt);
            }
        });

        buttonShoot.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonShoot.setForeground(new java.awt.Color(0, 0, 0));
        buttonShoot.setText("Shoot");

        scrollPaneMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textPaneMeassageBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        textPaneMeassageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneMessageBox.setViewportView(textPaneMeassageBox);

        scrollPaneMessageInput.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textAreaMessageInput.setColumns(20);
        textAreaMessageInput.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        textAreaMessageInput.setForeground(new java.awt.Color(0, 0, 0));
        textAreaMessageInput.setLineWrap(true);
        textAreaMessageInput.setRows(5);
        textAreaMessageInput.setWrapStyleWord(true);
        scrollPaneMessageInput.setViewportView(textAreaMessageInput);

        buttonSend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonSend.setForeground(new java.awt.Color(0, 0, 0));
        buttonSend.setText("Send");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelAreaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(checkBoxPosition)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAreaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxPosition))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addComponent(scrollPaneMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxPositionItemStateChanged
        checkBoxPositionValue = evt.getStateChange();
    }//GEN-LAST:event_checkBoxPositionItemStateChanged

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        String message = textAreaMessageInput.getText();
        textAreaMessageInput.setText("");
        textPaneMeassageBox.setText(message+"\n");
    }//GEN-LAST:event_buttonSendActionPerformed

    public int getCheckBoxPositionStatus(){
        return checkBoxPositionValue;
    }
    
    public JCheckBox getCheckBoxPosition() {
        return checkBoxPosition;
    }

    public JLabel getLabelAreaClearance() {
        return labelAreaClearance;
    }

    public JLabel getLabelSoldierCount() {
        return labelSoldierCount;
    }

    public JSpinner getSpinnerSoldierCount() {
        return spinnerSoldierCount;
    }

    public JLabel getLabelAmmoCount() {
        return labelAmmoCount;
    }

    public JSpinner getSpinnerAmmoCount() {
        return spinnerAmmoCount;
    }

    public JButton getButtonShoot() {
        return buttonShoot;
    }

    public JButton getButtonSend() {
        return buttonSend;
    }

    public JScrollPane getScrollPaneMessageBox() {
        return scrollPaneMessageBox;
    }

    public JTextPane getTextPaneMeassageBox() {
        return textPaneMeassageBox;
    }

    public JScrollPane getScrollPaneMessageInput() {
        return scrollPaneMessageInput;
    }

    public JTextArea getTextAreaMessageInput() {
        return textAreaMessageInput;
    }

    protected void setSliderCommonAppearance(JSlider jSlider) {
        jSlider.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(10);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
    }

    protected void setButtonCommonAppearance(JButton jButton) {
        jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 0, 0));
    }

    public void setLabelAreaClearanceState(int stateChange) {
        if (stateChange == ItemEvent.SELECTED) {
            labelAreaClearance.setText("Area Cleared");
            labelAreaClearance.setBackground(new Color(97, 179, 57));
        } else if (stateChange == ItemEvent.DESELECTED) {
            labelAreaClearance.setText("Area Not Cleared");
            labelAreaClearance.setBackground(new Color(238, 137, 21));
        }
    }
    
    protected void enableButton(JButton... jButtonArray){
        for (JButton jButton : jButtonArray) {
            if(!jButton.isEnabled()){
                jButton.setEnabled(true);
            }            
        }
    }
    
    protected void disableButton(JButton... jButtonArray){
        for (JButton jButton : jButtonArray) {
            if(jButton.isEnabled()){
                jButton.setEnabled(false);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuperDefence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperDefence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperDefence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperDefence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new SuperDefence().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton buttonShoot;
    private javax.swing.JCheckBox checkBoxPosition;
    private javax.swing.JLabel labelAmmoCount;
    private javax.swing.JLabel labelAreaClearance;
    private javax.swing.JLabel labelSoldierCount;
    private javax.swing.JScrollPane scrollPaneMessageBox;
    private javax.swing.JScrollPane scrollPaneMessageInput;
    private javax.swing.JSpinner spinnerAmmoCount;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JTextArea textAreaMessageInput;
    private javax.swing.JTextPane textPaneMeassageBox;
    // End of variables declaration//GEN-END:variables
}
