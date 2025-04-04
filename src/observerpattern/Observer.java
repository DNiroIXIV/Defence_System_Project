/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import defencesystem.util.DefenceType;
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
    
    private final ArrayList<Observable> defenceUnitsList;
    private ArrayList<Observable> helicopterList;
    private ArrayList<Observable> submarineList;
    private ArrayList<Observable> tankList;
    
    private Observer(){
        defenceUnitsList = new ArrayList<>();
        helicopterList = new ArrayList<>();
        submarineList = new ArrayList<>();
        tankList = new ArrayList<>();
    }
    
    public static Observer getObserverInstance(){
        if(observer == null){
            observer = new Observer();
        }
        return observer;
    }
    
    public void addDefenceUnit(Observable observable){        
        DefenceType unitType = observable.getUnitType();
        switch (unitType) {
            case HELICOPTER: {
                helicopterList.add(observable);
            }break;
            
            case SUBMARINE: {
                submarineList.add(observable);
            }break;
            
            case TANK: {
                tankList.add(observable);
            }break;
            default:                
        }
        defenceUnitsList.add(observable);
    }

    @Override
    public void notifyCheckBoxAreaClearStatus(int stateChange) {
        for (Observable observable : defenceUnitsList) {
            observable.setLabelAreaClearanceState(stateChange);
        }
    }

    @Override
    public void notifyStrength(Strength strength) {
        for (Observable observable : defenceUnitsList) {
            int stateChange = observable.getCheckBoxPositionStatus();
            
            if(stateChange == ItemEvent.SELECTED){
                observable.enableWeaponOperation(strength);
            }
        }
    }
    
    public void notifyInitialStrength(Strength strength){
        for (Observable observable : defenceUnitsList) {
            observable.enableWeaponOperation(strength);
        }        
    }
}
