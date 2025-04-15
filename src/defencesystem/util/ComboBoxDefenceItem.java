/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.util;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Nirodha
 */
public class ComboBoxDefenceItem {

    private String itemId;
    private String itemName;
    private DefenceType itemType;
    private String comboBoxItemName;
    private final JScrollPane scrollPaneItem;
    private final JTextPane textPaneItem;

    public ComboBoxDefenceItem(String itemId, String itemName, DefenceType itemType) {
        setItemId(itemId);
        this.itemName = itemName;
        setItemType(itemType);
        setComboBoxItemName();
        textPaneItem = new JTextPane();
        setTextPaneItemAttributes();
        scrollPaneItem = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        setScrollPaneItemAttributes();
    }

    private void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    private void setItemType(DefenceType itemType) {
        this.itemType = itemType;
    }

    public DefenceType getItemType() {
        return itemType;
    }

    private void setComboBoxItemName() {
        comboBoxItemName = itemName + " | " + itemId;
    }

    public void setComboBoxItemName(String comboBoxItemName) {
        this.comboBoxItemName = comboBoxItemName;
    }

    public String getComboBoxItemName() {
        return comboBoxItemName;
    }

    public JTextPane getTextPaneItem() {
        return textPaneItem;
    }

    public JScrollPane getScrollPaneItem() {
        return scrollPaneItem;
    }

    private void setTextPaneItemAttributes() {
        textPaneItem.setEditable(false);
        textPaneItem.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N        
        textPaneItem.setForeground(new java.awt.Color(0, 0, 0));
        textPaneItem.setCaret(new DefaultCaret() {
            @Override
            public void setVisible(boolean value) {
                super.setVisible(false); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        });
        textPaneItem.setEditorKit(new WrapEditorKit());
    }

    private void setScrollPaneItemAttributes() {
        scrollPaneItem.setPreferredSize(new Dimension(500, 200));
        scrollPaneItem.setViewportView(textPaneItem);
    }

    public void updateTextPaneItemForReceiver(String message) {
        updateTextPaneItem(message, false);
    }

    private void updateTextPaneItem(String message, boolean isUserInput) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();

        StyleConstants.setSpaceAbove(attributeSet, 5);
        StyleConstants.setSpaceBelow(attributeSet, 5);

        StyleConstants.setFontFamily(attributeSet, "sansserif");
        StyleConstants.setFontSize(attributeSet, 14);
        StyleConstants.setBold(attributeSet, true);
        StyleConstants.setForeground(attributeSet, new Color(0, 0, 0));

        StyleConstants.setRightIndent(attributeSet, isUserInput ? 5 : 80);
        StyleConstants.setLeftIndent(attributeSet, isUserInput ? 80 : 5);
        StyleConstants.setAlignment(attributeSet, isUserInput ? StyleConstants.ALIGN_RIGHT : StyleConstants.ALIGN_LEFT);

        if (isUserInput) {
            StyleConstants.setBackground(attributeSet, new Color(176, 226, 243));
        } else {
            StyleConstants.setBackground(attributeSet, new Color(251, 210, 217));
        }

        StyledDocument styledDocument = textPaneItem.getStyledDocument();
        int offSet = styledDocument.getLength();
        try {
            styledDocument.insertString(offSet, message + "\n", attributeSet);
            styledDocument.setParagraphAttributes(offSet, message.length(), attributeSet, true);
        } catch (BadLocationException ex) {
            //Logger.getLogger(SuperDefence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTextPaneItemForSender(String message) {
        updateTextPaneItem(message, true);
    }

    public int compareToIgnoreCase(ComboBoxDefenceItem comboBoxDefenceItem) {
        return itemName.compareToIgnoreCase(comboBoxDefenceItem.itemName);
    }

    public int compareTo(ComboBoxDefenceItem comboBoxDefenceItem) {
        return itemName.compareTo(comboBoxDefenceItem.itemName);
    }

    @Override
    public String toString() {
        return comboBoxItemName;
    }
}
