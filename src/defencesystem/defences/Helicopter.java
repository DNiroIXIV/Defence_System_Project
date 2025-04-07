/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.defences;

import defencesystem.superdefence.SuperDefence;
import defencesystem.util.DefenceType;
import defencesystem.util.Observable;
import defencesystem.util.Strength;
import observerpattern.Observer;

/**
 *
 * @author Nirodha
 */
public class Helicopter extends SuperDefence implements Observable {

    /**
     * Creates new form Helicopter
     */
    public Helicopter() {
        setUnitType(DefenceType.HELICOPTER);
        setUnitId(Observer.getObserverInstance().generateUnitId(DefenceType.HELICOPTER));
        setUnitName("Helicopter");
        setTitle(getUnitName() + " | " + getUnitId());
        initComponents();
        setLocationRelativeTo(null);
    }

    public Helicopter(String unitName) {
        this();
        setUnitName(unitName);
        setTitle(getUnitName() + " | " + getUnitId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAreaClearance = getLabelAreaClearance();
        labelSoldierCount = getLabelSoldierCount();
        spinnerSoldierCount = getSpinnerSoldierCount();
        labelAmmoCount = getLabelAmmoCount();
        spinnerAmmoCount = getSpinnerAmmoCount();
        checkBoxPosition = getCheckBoxPosition();
        buttonShoot = getButtonShoot();
        buttonMissile = new javax.swing.JButton();
        buttonLaser = new javax.swing.JButton();
        scrollPaneMessageBox = getScrollPaneMessageBox();
        textPaneMeassageBox = getTextPaneMeassageBox();
        scrollPaneMessageInput = getScrollPaneMessageInput();
        textAreaMessageInput = getTextAreaMessageInput();
        buttonSend = getButtonSend();
        labelFuel = new javax.swing.JLabel();
        sliderFuel = new javax.swing.JSlider();

        buttonMissile.setText("Missile  Operation");
        setButtonCommonAppearance(buttonMissile);

        buttonLaser.setText("Laser Operation");
        setButtonCommonAppearance(buttonLaser);

        scrollPaneMessageBox.setViewportView(textPaneMeassageBox);

        scrollPaneMessageBox.setViewportView(textPaneMeassageBox);

        scrollPaneMessageInput.setViewportView(textAreaMessageInput);

        scrollPaneMessageInput.setViewportView(textAreaMessageInput);

        labelFuel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFuel.setForeground(new java.awt.Color(0, 0, 0));
        labelFuel.setText("Fuel");

        sliderFuel.setOrientation(javax.swing.JSlider.VERTICAL);
        setSliderCommonAppearance(sliderFuel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelAreaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxPosition)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scrollPaneMessageBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxPosition))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAreaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(scrollPaneMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Helicopter().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLaser;
    private javax.swing.JButton buttonMissile;
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton buttonShoot;
    private javax.swing.JCheckBox checkBoxPosition;
    private javax.swing.JLabel labelAmmoCount;
    private javax.swing.JLabel labelAreaClearance;
    private javax.swing.JLabel labelFuel;
    private javax.swing.JLabel labelSoldierCount;
    private javax.swing.JScrollPane scrollPaneMessageBox;
    private javax.swing.JScrollPane scrollPaneMessageInput;
    private javax.swing.JSlider sliderFuel;
    private javax.swing.JSpinner spinnerAmmoCount;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JTextArea textAreaMessageInput;
    private javax.swing.JTextPane textPaneMeassageBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void enableWeaponOperation(Strength strength) {
        switch (strength) {
            case CLOSED: {
                disableButton(buttonShoot, buttonMissile, buttonLaser);
            }
            break;

            case LOW: {
                enableButton(buttonShoot);
                disableButton(buttonMissile, buttonLaser);
            }
            break;

            case MEDIUM: {
                enableButton(buttonShoot, buttonMissile);
                disableButton(buttonLaser);
            }
            break;

            case HIGH: {
                enableButton(buttonShoot, buttonMissile, buttonLaser);
            }
            break;

            case STRONG: {
            }
            break;
            default:
        }
    }
}
