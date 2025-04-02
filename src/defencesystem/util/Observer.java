/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.util;

import java.util.ArrayList;

/**
 *
 * @author Nirodha
 */
public class Observer {
    private static Observer observer = null;
    
    private final ArrayList<Observable> defenceUnitsList = new ArrayList<>();
    
    private Observer(){}
    
    public static Observer getObserverInstance(){
        if(observer == null){
            observer = new Observer();
        }
        return observer;
    }
    
    public ArrayList<Observable> getDefenceUnitsList(){
        return defenceUnitsList;
    }
    
    public void addDefenceUnit(Observable observable){        
        defenceUnitsList.add(observable);
    }
}
