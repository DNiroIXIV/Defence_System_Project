/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.controller;

import defencesystem.util.ObserverInterface;
import defencesystem.util.Strength;

/**
 *
 * @author Nirodha
 */
public class MainController extends javax.swing.JFrame {

    private static MainController mainController = null;

    private final ObserverInterface observerInterface;
    
    private Strength strength;

    /**
     * Creates new form MainController
     */
    private MainController(ObserverInterface observerInterface) {
        super("Main Controller");
        this.observerInterface = observerInterface;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static MainController getMainControllerInstance(ObserverInterface observerInterface) {
        if (mainController == null) {
            mainController = new MainController(observerInterface);
        }
        return mainController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPosition = new javax.swing.JLabel();
        sliderPosition = new javax.swing.JSlider();
        checkBoxAreaClear = new javax.swing.JCheckBox();
        comboBoxSelectDefence = new javax.swing.JComboBox<>();
        buttonCollectInfo = new javax.swing.JButton();
        labelSoldier = new javax.swing.JLabel();
        labelSoldierCount = new javax.swing.JLabel();
        labelAmmo = new javax.swing.JLabel();
        labelAmmoCount = new javax.swing.JLabel();
        labelEnergy = new javax.swing.JLabel();
        labelEnergyAmount = new javax.swing.JLabel();
        labelFuel = new javax.swing.JLabel();
        labelFuelAmount = new javax.swing.JLabel();
        labelOxygen = new javax.swing.JLabel();
        labelOxygenAmount = new javax.swing.JLabel();
        checkBoxSendPrivate = new javax.swing.JCheckBox();
        scrollPaneInputBox = new javax.swing.JScrollPane();
        textAreaInputBox = new javax.swing.JTextArea();
        buttonSend = new javax.swing.JButton();
        scrollPanePrivateMessageBox = new javax.swing.JScrollPane();
        textPanePrivateMessageBox = new javax.swing.JTextPane();
        scrollPaneGlobalMessageBox = new javax.swing.JScrollPane();
        textPaneGlobalMessageBox = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPosition.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelPosition.setText("Position");

        sliderPosition.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sliderPosition.setMajorTickSpacing(20);
        sliderPosition.setMinorTickSpacing(10);
        sliderPosition.setPaintLabels(true);
        sliderPosition.setPaintTicks(true);
        sliderPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPositionStateChanged(evt);
            }
        });

        checkBoxAreaClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkBoxAreaClear.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxAreaClear.setText("Area Clear");
        checkBoxAreaClear.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        checkBoxAreaClear.setPreferredSize(new java.awt.Dimension(18, 18));
        checkBoxAreaClear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxAreaClearItemStateChanged(evt);
            }
        });

        comboBoxSelectDefence.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboBoxSelectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Item 2", "Item 3", "Item 4" }));

        buttonCollectInfo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonCollectInfo.setText("Collect Informations");

        labelSoldier.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSoldier.setText("Soldier Count");

        labelSoldierCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSoldierCount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelSoldierCount.setText("1000");

        labelAmmo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAmmo.setText("Ammo Count");

        labelAmmoCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAmmoCount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelAmmoCount.setText("1000");

        labelEnergy.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelEnergy.setText("Energy Amount");

        labelEnergyAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelEnergyAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEnergyAmount.setText("1000");

        labelFuel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFuel.setText("Fuel Amount");

        labelFuelAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFuelAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelFuelAmount.setText("1000");

        labelOxygen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelOxygen.setText("Oxygen Amount");

        labelOxygenAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelOxygenAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelOxygenAmount.setText("1000");

        checkBoxSendPrivate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkBoxSendPrivate.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxSendPrivate.setText("Send Private");
        checkBoxSendPrivate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        scrollPaneInputBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textAreaInputBox.setColumns(20);
        textAreaInputBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        textAreaInputBox.setForeground(new java.awt.Color(0, 0, 0));
        textAreaInputBox.setLineWrap(true);
        textAreaInputBox.setRows(5);
        scrollPaneInputBox.setViewportView(textAreaInputBox);

        buttonSend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonSend.setText("Send");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        scrollPanePrivateMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPanePrivateMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPanePrivateMessageBox.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanePrivateMessageBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        textPanePrivateMessageBox.setEditable(false);
        textPanePrivateMessageBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        textPanePrivateMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPanePrivateMessageBox.setViewportView(textPanePrivateMessageBox);

        scrollPaneGlobalMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneGlobalMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneGlobalMessageBox.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneGlobalMessageBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        textPaneGlobalMessageBox.setEditable(false);
        textPaneGlobalMessageBox.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        textPaneGlobalMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneGlobalMessageBox.setViewportView(textPaneGlobalMessageBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(checkBoxAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(checkBoxSendPrivate)
                            .addGap(40, 40, 40)
                            .addComponent(scrollPaneInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comboBoxSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(buttonCollectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelOxygenAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEnergyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(scrollPanePrivateMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(scrollPaneGlobalMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(checkBoxAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnergyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCollectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOxygenAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPanePrivateMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneGlobalMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(checkBoxSendPrivate)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxAreaClearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxAreaClearItemStateChanged
        observerInterface.getCheckBoxAreaClearStateChange(evt.getStateChange());
    }//GEN-LAST:event_checkBoxAreaClearItemStateChanged

    private void sliderPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPositionStateChanged
        
    }//GEN-LAST:event_sliderPositionStateChanged

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSendActionPerformed

    public void hgjf(){
        int sliderPositionValue = sliderPosition.getValue();
        
        Strength strength = sliderPositionValue == 0 ? Strength.CLOSED : sliderPositionValue <= 25 ? Strength.LOW : sliderPositionValue <= 50 ? Strength.MEDIUM : sliderPositionValue <= 75 ? Strength.STRONG : Strength.HIGH;
        
        if(this.strength != strength){
            this.strength = strength;
            observerInterface.getSliderPositionStateChange(strength);
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
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //getMainControllerInstance(Observer.getObserverInstance());
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCollectInfo;
    private javax.swing.JButton buttonSend;
    private javax.swing.JCheckBox checkBoxAreaClear;
    private javax.swing.JCheckBox checkBoxSendPrivate;
    private javax.swing.JComboBox<String> comboBoxSelectDefence;
    private javax.swing.JLabel labelAmmo;
    private javax.swing.JLabel labelAmmoCount;
    private javax.swing.JLabel labelEnergy;
    private javax.swing.JLabel labelEnergyAmount;
    private javax.swing.JLabel labelFuel;
    private javax.swing.JLabel labelFuelAmount;
    private javax.swing.JLabel labelOxygen;
    private javax.swing.JLabel labelOxygenAmount;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JLabel labelSoldier;
    private javax.swing.JLabel labelSoldierCount;
    private javax.swing.JScrollPane scrollPaneGlobalMessageBox;
    private javax.swing.JScrollPane scrollPaneInputBox;
    private javax.swing.JScrollPane scrollPanePrivateMessageBox;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextArea textAreaInputBox;
    private javax.swing.JTextPane textPaneGlobalMessageBox;
    private javax.swing.JTextPane textPanePrivateMessageBox;
    // End of variables declaration//GEN-END:variables
}
