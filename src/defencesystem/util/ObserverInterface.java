/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem.util;

/**
 *
 * @author Nirodha
 */
public interface ObserverInterface {

    public void notifyCheckBoxAreaClearStatus(int stateChange);

    public void notifyStrength(Strength strength);

    public void notifyMessageToEachUnit(String message);

    public void notifyMessageToSelectedUnit(String message, DefenceType itemType, String itemId);

}
