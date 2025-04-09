/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;

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
        setItemName(itemName);
        setItemType(itemType);
        setComboBoxItemName();
        textPaneItem = new JTextPane();
        setTextPaneItemAttributes();
        scrollPaneItem = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        setScrollPaneItemAttributes();
    }

    public void setItemId(String itemId) {
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

    public void setItemType(DefenceType itemType) {
        this.itemType = itemType;
    }

    public DefenceType getItemType() {
        return itemType;
    }
    
    
    public void setComboBoxItemName(){
        comboBoxItemName = itemName+" | "+itemId;
    }
    
    public void setComboBoxItemName(String comboBoxItemName){
        this.comboBoxItemName = comboBoxItemName;
    }
    
    public String getComboBoxItemName(){
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
        textPaneItem.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N        
        textPaneItem.setForeground(new java.awt.Color(0, 0, 0));
        textPaneItem.setCaret(new DefaultCaret() {
            @Override
            public void setVisible(boolean value) {
                super.setVisible(false); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        });
    }

    private void setScrollPaneItemAttributes() {
        scrollPaneItem.setPreferredSize(new Dimension(500, 200));
        scrollPaneItem.setViewportView(textPaneItem);
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setSize(800, 400);        
//        frame.setLayout(new FlowLayout());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ComboBoxDefenceItem comboBoxDefenceItem = new ComboBoxDefenceItem(null, null, null);                
//        frame.add(comboBoxDefenceItem.getScrollPaneItem(), BorderLayout.CENTER);
//        frame.setVisible(true);
//        System.out.println("scroll "+comboBoxDefenceItem.getScrollPaneItem());
//        System.out.println("scroll "+comboBoxDefenceItem.getTextPaneItem());
//    }

    @Override
    public String toString() {        
        return comboBoxItemName;
    }
}
