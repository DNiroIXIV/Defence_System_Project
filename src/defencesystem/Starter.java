/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defencesystem;

import defencesystem.controller.MainController;
import defencesystem.defences.Helicopter;
import defencesystem.defences.Submarine;
import defencesystem.defences.Tank;
import defencesystem.superdefence.SuperDefence;

/**
 *
 * @author Nirodha
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SuperDefence().setVisible(true);
        new Helicopter().setVisible(true);
        new Submarine().setVisible(true);
        new Tank().setVisible(true);
        new MainController().setVisible(true);
    }
}
