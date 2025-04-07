/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Nirodha
 */
public class ComboBoxDefenceItem {

    private String itemId;
    private String itemName;
    private DefenceType itemType;
    private final JScrollPane scrollPaneItem;
    private final JTextPane textPaneItem;

    public ComboBoxDefenceItem() {
        textPaneItem = new JTextPane();
        setItemTextPaneAttributes();
        scrollPaneItem = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        setItemScrollPaneAttributes();
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

    public JTextPane getItemTextPane() {
        return textPaneItem;
    }

    public JScrollPane getItemScrollPane() {
        return scrollPaneItem;
    }

    private void setItemTextPaneAttributes() {
        textPaneItem.setEditable(false);
        textPaneItem.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N        
        textPaneItem.setForeground(new java.awt.Color(0, 0, 0));
        textPaneItem.setPreferredSize(new Dimension(497,197));
        
    }

    private void setItemScrollPaneAttributes() {
        scrollPaneItem.setPreferredSize(new Dimension(500, 200));
        scrollPaneItem.getViewport().setBackground(Color.red);
        scrollPaneItem.setViewportView(textPaneItem);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 400);        
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ComboBoxDefenceItem comboBoxDefenceItem = new ComboBoxDefenceItem();                
        frame.add(comboBoxDefenceItem.getItemScrollPane(), BorderLayout.CENTER);
        frame.setVisible(true);
        System.out.println("scroll " + comboBoxDefenceItem.getItemTextPane());
    }
}
