/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defencesystem;

import defencesystem.controller.MainController;
import defencesystem.defences.Helicopter;
import defencesystem.defences.Submarine;
import defencesystem.defences.Tank;
import defencesystem.util.Strength;
import observerpattern.Observer;

/**
 *
 * @author Nirodha
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer observer = Observer.getObserverInstance();
        MainController.getMainControllerInstance();
        observer.addDefenceUnit(new Helicopter("APPLE"));
        observer.addDefenceUnit(new Submarine("Apple"));
        observer.addDefenceUnit(new Tank("Cherry"));
        observer.addDefenceUnit(new Tank("apple"));
        observer.addDefenceUnit(new Tank("aPple"));
        observer.addDefenceUnit(new Tank("Banana"));
        observer.addDefenceUnit(new Helicopter("cherry"));
        //observer.addDefenceUnit(new Helicopter("Hawk"));
        //observer.addDefenceUnit(new Tank("Panther"));
        //observer.addDefenceUnit(new Submarine("USS Alexandria"));
        //observer.addDefenceUnit(new Helicopter("Boeing"));
        //observer.addDefenceUnit(new Tank("Crusader"));                
        //observer.addDefenceUnit(new Submarine());
        observer.notifyInitialStrength(Strength.CLOSED);
    }
}
