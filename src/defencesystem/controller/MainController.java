/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.controller;

import defencesystem.util.ComboBoxDefenceItem;
import defencesystem.util.DefenceType;
import defencesystem.util.ObserverInterface;
import defencesystem.util.Strength;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Nirodha
 */
public class MainController extends javax.swing.JFrame {

    private static MainController mainController = null;

    private ObserverInterface observerInterface;
    
    private final Strength[] strengthList = Strength.values();
    
    private final Vector<ComboBoxDefenceItem> helicopterCBList = new Vector<>();
    private final Vector<ComboBoxDefenceItem> submarineCBList = new Vector<>();
    private final Vector<ComboBoxDefenceItem> tankCBList = new Vector<>();
    
    private final Vector<ComboBoxDefenceItem> comboBoxDefenceItemList = new Vector<>();

    private final ComboBoxDefenceModel comboBoxDefenceModel;
    /**
     * Creates new form MainController
     */
            
    private MainController(ObserverInterface observerInterface){
        super("Main Controller");         
        this.observerInterface = observerInterface;
        ComboBoxDefenceItem defaultItem = new ComboBoxDefenceItem("", "");
        defaultItem.setComboBoxItemName("None");
        comboBoxDefenceItemList.add(defaultItem);
        comboBoxDefenceModel = new ComboBoxDefenceModel(comboBoxDefenceItemList);
        initComponents();        
        setLocationRelativeTo(null);        
        setVisible(true);
    }
    
    public static MainController getMainControllerInstance() {
        return getMainControllerInstance(null);
    }
    
    public static MainController getMainControllerInstance(ObserverInterface observerInterface) {
        return mainController == null ? mainController = new MainController(observerInterface) : mainController;
    }

    public void addObserverInstance(ObserverInterface observerInterface){
        this.observerInterface = observerInterface;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSendPrivacy = new javax.swing.ButtonGroup();
        labelPosition = new javax.swing.JLabel();
        sliderPosition = new javax.swing.JSlider();
        checkBoxAreaClear = new javax.swing.JCheckBox();
        comboBoxSelectDefence = new javax.swing.JComboBox<>();
        buttonCollectInfo = new javax.swing.JButton();
        labelSelectDefenceUnitError = new javax.swing.JLabel();
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
        scrollPanePrivateMessageBox = new javax.swing.JScrollPane();
        textPanePrivateMessageBox = comboBoxDefenceItemList.get(0).getTextPaneItem();
        scrollPaneGlobalMessageBox = new javax.swing.JScrollPane();
        textPaneGlobalMessageBox = new javax.swing.JTextPane();
        labelSelectSendPrivacy = new javax.swing.JLabel();
        radioButtonSendPrivate = new javax.swing.JRadioButton();
        radioButtonSendAll = new javax.swing.JRadioButton();
        labelSendPrivacyError = new javax.swing.JLabel();
        scrollPaneInputBox = new javax.swing.JScrollPane();
        textAreaInputBox = new javax.swing.JTextArea();
        buttonSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPosition.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelPosition.setText("Position");

        sliderPosition.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sliderPosition.setMajorTickSpacing(20);
        sliderPosition.setMinorTickSpacing(10);
        sliderPosition.setPaintLabels(true);
        sliderPosition.setPaintTicks(true);
        sliderPosition.setToolTipText("");
        sliderPosition.setValue(0);
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
        checkBoxAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAreaClearActionPerformed(evt);
            }
        });

        comboBoxSelectDefence.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        comboBoxSelectDefence.setModel(comboBoxDefenceModel);
        comboBoxSelectDefence.setEditable(true);
        comboBoxSelectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSelectDefenceActionPerformed(evt);
            }
        });

        buttonCollectInfo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonCollectInfo.setText("Collect Informations");

        labelSelectDefenceUnitError.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelSelectDefenceUnitError.setForeground(new java.awt.Color(255, 0, 51));
        labelSelectDefenceUnitError.setText("Please select defence unit!");
        labelSelectDefenceUnitError.setVisible(false);

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

        scrollPanePrivateMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanePrivateMessageBox.setViewportView(textPanePrivateMessageBox);

        textPanePrivateMessageBox.setEditable(false);
        textPanePrivateMessageBox.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        textPanePrivateMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPanePrivateMessageBox.setViewportView(textPanePrivateMessageBox);

        scrollPaneGlobalMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneGlobalMessageBox.setViewportView(textPaneGlobalMessageBox);

        textPaneGlobalMessageBox.setEditable(false);
        textPaneGlobalMessageBox.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        textPaneGlobalMessageBox.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneGlobalMessageBox.setViewportView(textPaneGlobalMessageBox);

        labelSelectSendPrivacy.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSelectSendPrivacy.setText("Select Privacy");

        buttonGroupSendPrivacy.add(radioButtonSendPrivate);
        radioButtonSendPrivate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        radioButtonSendPrivate.setText("Send Private");

        buttonGroupSendPrivacy.add(radioButtonSendAll);
        radioButtonSendAll.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        radioButtonSendAll.setText("Send All");

        labelSendPrivacyError.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelSendPrivacyError.setForeground(new java.awt.Color(255, 0, 51));
        labelSendPrivacyError.setText("Please select send privacy before sending the message!");
        labelSendPrivacyError.setVisible(false);

        scrollPaneInputBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneInputBox.setViewportView(textAreaInputBox);

        textAreaInputBox.setColumns(20);
        textAreaInputBox.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        textAreaInputBox.setForeground(new java.awt.Color(0, 0, 0));
        textAreaInputBox.setLineWrap(true);
        textAreaInputBox.setRows(5);
        textAreaInputBox.setWrapStyleWord(true);
        textAreaInputBox.setBorder(new EmptyBorder(0, 5, 0, 5));
        textAreaInputBox.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent evt){
                setButtonSendEnabledStatus();
            }

            @Override
            public void changedUpdate(DocumentEvent evt){
                setButtonSendEnabledStatus();
            }

            @Override
            public void removeUpdate(DocumentEvent evt){
                setButtonSendEnabledStatus();
            }
        });
        scrollPaneInputBox.setViewportView(textAreaInputBox);

        buttonSend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonSend.setText("Send");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });
        buttonSend.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(buttonCollectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelSelectDefenceUnitError, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(scrollPanePrivateMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(scrollPaneGlobalMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(checkBoxAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelSelectSendPrivacy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(radioButtonSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(radioButtonSendAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(labelSendPrivacyError, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(scrollPaneInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkBoxAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnergyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCollectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOxygenAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSelectDefenceUnitError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanePrivateMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneGlobalMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonSendPrivate)
                    .addComponent(radioButtonSendAll)
                    .addComponent(labelSelectSendPrivacy)
                    .addComponent(labelSendPrivacyError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(scrollPaneInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setButtonSendEnabledStatus() {
        buttonSend.setEnabled(!textAreaInputBox.getText().trim().isEmpty());
    }
    
    private void checkBoxAreaClearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxAreaClearItemStateChanged
        observerInterface.notifyCheckBoxAreaClearStatus(evt.getStateChange());
    }//GEN-LAST:event_checkBoxAreaClearItemStateChanged

    private void sliderPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPositionStateChanged
        int sliderPositionValue = sliderPosition.getValue();
        
        for (Strength strength : strengthList) {
            if(strength.inRange(sliderPositionValue)){
                observerInterface.notifyStrength(strength);
                break;
            }
        }
        buttonGroupSendPrivacy.add(buttonSend);
        
    }//GEN-LAST:event_sliderPositionStateChanged

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        
    }//GEN-LAST:event_buttonSendActionPerformed

    private void checkBoxAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAreaClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAreaClearActionPerformed

    private void comboBoxSelectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSelectDefenceActionPerformed
        ComboBoxDefenceItem comboBoxDefenceItem = (ComboBoxDefenceItem)comboBoxSelectDefence.getSelectedItem();
        textPanePrivateMessageBox = comboBoxDefenceItem.getTextPaneItem();
        scrollPanePrivateMessageBox.setViewportView(textPanePrivateMessageBox);        
    }//GEN-LAST:event_comboBoxSelectDefenceActionPerformed

    private class ComboBoxDefenceModel extends DefaultComboBoxModel{

        private ComboBoxDefenceModel(Vector<ComboBoxDefenceItem> comboBoxDefenceItemList) {
            super(comboBoxDefenceItemList);
        }

        @Override
        public void addElement(Object object) {
            if(object instanceof ComboBoxDefenceItem){                             
                insertElementAt((ComboBoxDefenceItem)object, 1);
            }
        }

        @Override
        public void insertElementAt(Object object, int index) {
            ComboBoxDefenceItem comboBoxDefenceAdd = (ComboBoxDefenceItem)object;
            for (index = 1; index < getSize(); index++) {
                ComboBoxDefenceItem comboBoxDefenceExist = (ComboBoxDefenceItem)getElementAt(index);
                int caseInsensitiveValue = comboBoxDefenceExist.compareToIgnoreCase(comboBoxDefenceAdd);
                if(caseInsensitiveValue > 0){
                    break;
                }else if(caseInsensitiveValue == 0){
                    int caseSensitiveValue = comboBoxDefenceExist.compareTo(comboBoxDefenceAdd);
                    if(caseSensitiveValue < 0){
                        break;
                    }
                }
            }
            super.insertElementAt(comboBoxDefenceAdd, index); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    }
    
    public void addComboBoxDefenceItem(ComboBoxDefenceItem comboBoxDefenceItem, DefenceType unitType) {
        switch (unitType) {
            case HELICOPTER: {
                helicopterCBList.add(comboBoxDefenceItem);
            }break;
            case SUBMARINE: {
                submarineCBList.add(comboBoxDefenceItem);
            }break;
            case TANK: {
                tankCBList.add(comboBoxDefenceItem);
            }break;
            default: {}
        }
        comboBoxDefenceModel.addElement(comboBoxDefenceItem);
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
            getMainControllerInstance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCollectInfo;
    private javax.swing.ButtonGroup buttonGroupSendPrivacy;
    private javax.swing.JButton buttonSend;
    private javax.swing.JCheckBox checkBoxAreaClear;
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
    private javax.swing.JLabel labelSelectDefenceUnitError;
    private javax.swing.JLabel labelSelectSendPrivacy;
    private javax.swing.JLabel labelSendPrivacyError;
    private javax.swing.JLabel labelSoldier;
    private javax.swing.JLabel labelSoldierCount;
    private javax.swing.JRadioButton radioButtonSendAll;
    private javax.swing.JRadioButton radioButtonSendPrivate;
    private javax.swing.JScrollPane scrollPaneGlobalMessageBox;
    private javax.swing.JScrollPane scrollPaneInputBox;
    private javax.swing.JScrollPane scrollPanePrivateMessageBox;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextArea textAreaInputBox;
    private javax.swing.JTextPane textPaneGlobalMessageBox;
    private javax.swing.JTextPane textPanePrivateMessageBox;
    // End of variables declaration//GEN-END:variables
   
}
