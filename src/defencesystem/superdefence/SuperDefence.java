/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.superdefence;

import defencesystem.controller.MainController;
import defencesystem.util.ComboBoxDefenceItem;
import defencesystem.util.DefenceType;
import defencesystem.util.WrapEditorKit;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.DocumentFilter;
import javax.swing.text.InternationalFormatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import observerpattern.Observer;

/**
 *
 * @author Nirodha
 */
public abstract class SuperDefence extends javax.swing.JFrame {
    
    private int checkBoxPositionValue;
    private DefenceType unitType;
    private String unitName;
    private String unitId;
    private String unitTitle;
    private ComboBoxDefenceItem comboBoxDefenceItem;
    private final MainController mainController = MainController.getMainControllerInstance();

    /**
     * Creates new form SuperDefence
     */
    public SuperDefence() {
        initComponents();
    }
    
    private void setSpinnerInputVerifier(JSpinner spinner) {
        JSpinner.NumberEditor spinnerEditor = (JSpinner.NumberEditor) spinner.getEditor();
        JFormattedTextField spinnerTextField = spinnerEditor.getTextField();
        
        final DocumentFilter documentFilter = new DocumentFilter() {
            final int maxNumbers = 4;
            
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                String docString = fb.getDocument().getText(0, fb.getDocument().getLength());
                docString += string;
                if ((string.length() + fb.getDocument().getLength()) <= maxNumbers && docString.matches("^(0|[1-9][0-9]{0,3})$")) {
                    super.insertString(fb, offset, string, attr); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }                
            }
            
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String docString = fb.getDocument().getText(0, fb.getDocument().getLength());
                docString += text;
                if ((fb.getDocument().getLength() + text.length() - length) <= maxNumbers && docString.matches("^(0|[1-9][0-9]{0,3})$")) {
                    super.replace(fb, offset, length, text, attrs); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }
            }
            
            @Override
            public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
                super.remove(fb, offset, length); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        };
        
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setGroupingUsed(true);
        
        InternationalFormatter internationalFormatter = new InternationalFormatter(numberFormat) {
            @Override
            protected DocumentFilter getDocumentFilter() {
                return documentFilter; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }            
        };
        internationalFormatter.setValueClass(Integer.class);
        
        spinnerTextField.setFormatterFactory(new DefaultFormatterFactory(internationalFormatter));
    }
    
    public MainController getMainController() {
        return mainController;
    }
    
    protected void setUnitType(DefenceType unitType) {
        this.unitType = unitType;
    }
    
    public DefenceType getUnitType() {
        return unitType;
    }
    
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    
    public String getUnitName() {
        return unitName;
    }
    
    private void setUnitId(String unitId) {
        this.unitId = unitId;
    }
    
    public String getUnitId() {
        return unitId;
    }
    
    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
        setTitle(unitTitle);
    }
    
    protected void setUnitTitle() {
        unitTitle = unitName + " | " + unitId;
        setTitle(unitTitle);
    }
    
    public String getUnitTitle() {
        return unitTitle;
    }
    
    public void setComboBoxDefenceItem(ComboBoxDefenceItem comboBoxDefenceItem) {
        this.comboBoxDefenceItem = comboBoxDefenceItem;
    }
    
    public ComboBoxDefenceItem getComboBoxDefenceItem() {
        return comboBoxDefenceItem;
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
    
    public int getCheckBoxPositionStatus() {
        return checkBoxPositionValue;
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
        spinnerSoldierCount = new javax.swing.JSpinner(new SpinnerNumberModel(0, 0, 9999, 1));
        labelAmmoCount = new javax.swing.JLabel();
        spinnerAmmoCount = new javax.swing.JSpinner(new SpinnerNumberModel(0, 0, 9999, 1));
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
        setSpinnerInputVerifier(spinnerSoldierCount);

        labelAmmoCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAmmoCount.setForeground(new java.awt.Color(0, 0, 0));
        labelAmmoCount.setText("Ammo Count");

        spinnerAmmoCount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setSpinnerInputVerifier(spinnerAmmoCount);

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
        buttonShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShootActionPerformed(evt);
            }
        });

        scrollPaneMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneMessageBox.setViewportView(textPaneMeassageBox);

        textPaneMeassageBox.setEditable(false);
        textPaneMeassageBox.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        textPaneMeassageBox.setForeground(new java.awt.Color(0, 0, 0));
        textPaneMeassageBox.setCaret(new DefaultCaret(){
            @Override
            public void setVisible(boolean e){
                super.setVisible(false); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        });
        textPaneMeassageBox.setEditorKit(new WrapEditorKit());
        scrollPaneMessageBox.setViewportView(textPaneMeassageBox);

        scrollPaneMessageInput.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneMessageInput.setPreferredSize(new java.awt.Dimension(450, 30));
        scrollPaneMessageInput.setViewportView(textAreaMessageInput);

        textAreaMessageInput.setColumns(20);
        textAreaMessageInput.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        textAreaMessageInput.setForeground(new java.awt.Color(0, 0, 0));
        textAreaMessageInput.setLineWrap(true);
        textAreaMessageInput.setRows(5);
        textAreaMessageInput.setWrapStyleWord(true);
        textAreaMessageInput.setBorder(new EmptyBorder(0, 5, 0, 5));

        textAreaMessageInput.getDocument().addDocumentListener(new DocumentListener(){
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
        scrollPaneMessageInput.setViewportView(textAreaMessageInput);

        buttonSend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonSend.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneMessageBox)
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
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
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
                    .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(scrollPaneMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxPositionItemStateChanged
        checkBoxPositionValue = evt.getStateChange();
    }//GEN-LAST:event_checkBoxPositionItemStateChanged
    
    private void setButtonSendEnabledStatus() {
        buttonSend.setEnabled(!textAreaMessageInput.getText().trim().isEmpty());
    }

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        String message = textAreaMessageInput.getText().trim();
        textAreaMessageInput.setText("");
        updateTextPaneMessageBox(message, true);
        comboBoxDefenceItem.updateTextPaneItemForReceiver(message);
        mainController.updateTextPaneGlobalMessageBoxReceiving(comboBoxDefenceItem.getComboBoxItemName());
    }//GEN-LAST:event_buttonSendActionPerformed

    private void buttonShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShootActionPerformed
        try {
            int availableAmmoCount = Integer.parseInt((spinnerAmmoCount.getValue()).toString());
            if(availableAmmoCount > 0){
                spinnerAmmoCount.setValue(availableAmmoCount - 1);
            }else{
                JOptionPane.showMessageDialog(this, "Unable to shoot out of Ammo!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            
        }        
    }//GEN-LAST:event_buttonShootActionPerformed
    
    private void updateTextPaneMessageBox(String message, boolean isUserInput) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        
        StyleConstants.setSpaceAbove(attributeSet, 5);
        StyleConstants.setSpaceBelow(attributeSet, 5);
        
        StyleConstants.setFontFamily(attributeSet, "Verdana");
        StyleConstants.setFontSize(attributeSet, 14);
        StyleConstants.setBold(attributeSet, true);
        StyleConstants.setForeground(attributeSet, new Color(0, 0, 0));
        
        StyleConstants.setLeftIndent(attributeSet, isUserInput ? 80 : 5);
        StyleConstants.setRightIndent(attributeSet, isUserInput ? 5 : 80);
        StyleConstants.setAlignment(attributeSet, isUserInput ? StyleConstants.ALIGN_RIGHT : StyleConstants.ALIGN_LEFT);
        if (isUserInput) {
            StyleConstants.setBackground(attributeSet, new Color(217, 242, 231));
        } else {
            StyleConstants.setBackground(attributeSet, new Color(215, 203, 220));
        }
        
        StyledDocument styledDocument = textPaneMeassageBox.getStyledDocument();
        int offSet = styledDocument.getLength();
        try {
            styledDocument.insertString(offSet, message + "\n", attributeSet);
            styledDocument.setParagraphAttributes(offSet, message.length(), attributeSet, true);
        } catch (BadLocationException ex) {
            //Logger.getLogger(SuperDefence.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    protected void enableButton(JButton... jButtonArray) {
        for (JButton jButton : jButtonArray) {
            if (!jButton.isEnabled()) {
                jButton.setEnabled(true);
            }
        }
    }
    
    protected void disableButton(JButton... jButtonArray) {
        for (JButton jButton : jButtonArray) {
            if (jButton.isEnabled()) {
                jButton.setEnabled(false);
            }
        }
    }
    
    protected void postInit(String unitName, DefenceType unitType) {
        this.unitType = unitType;
        setUnitId(Observer.getObserverInstance().generateUnitId(unitType));
        this.unitName = unitName;
        setUnitTitle();
        comboBoxDefenceItem = new ComboBoxDefenceItem(unitId, unitName, unitType);
        setLocationRelativeTo(null);
    }
    
    protected void sendUnitInfo(int fuelAmount, int energyAmount, int oxygenAmount) {
        mainController.setUnitInfo(unitType, spinnerSoldierCount.getValue(), spinnerAmmoCount.getValue(), fuelAmount, energyAmount, oxygenAmount);
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
    
    public void sendComboBoxDefenceItem() {
        mainController.addComboBoxDefenceItem(comboBoxDefenceItem);
    }
    
    public void updateDefenceUnitMessageBox(String message) {
        updateTextPaneMessageBox(message, false);
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
