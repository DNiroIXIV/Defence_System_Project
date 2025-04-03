/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import defencesystem.util.Observable;
import defencesystem.util.ObserverInterface;
import defencesystem.util.Strength;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

/**
 *
 * @author Nirodha
 */
public class Observer implements ObserverInterface{
    private static Observer observer = null;
    
    private final ArrayList<Observable> defenceUnitsList = new ArrayList<>();
    
    private Observer(){}
    
    public static Observer getObserverInstance(){
        if(observer == null){
            observer = new Observer();
        }
        return observer;
    }
    
    public void addDefenceUnit(Observable observable){        
        defenceUnitsList.add(observable);
    }

    @Override
    public void getCheckBoxAreaClearStateChange(int stateChange) {
        for (Observable observable : defenceUnitsList) {
            observable.setLabelAreaClearanceState(stateChange);
        }
    }

    @Override
    public void getSliderPositionStateChange(Strength strength) {        
        for (Observable observable : defenceUnitsList) {
            int stateChange = observable.getCheckBoxPositionStatus();
            
            if(stateChange == ItemEvent.SELECTED){
                observable.enableWeaponOperation(strength);
            }            
        }
    }
}
