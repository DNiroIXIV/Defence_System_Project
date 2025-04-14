/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem.util;

/**
 *
 * @author Nirodha
 */
public interface Observable {

    public void setLabelAreaClearanceState(int stateChange);

    public void enableWeaponOperation(Strength strength);

    public int getCheckBoxPositionStatus();

    public DefenceType getUnitType();

    public String getUnitName();

    public String getUnitId();

    public void setVisible(boolean value);

    public void sendComboBoxDefenceItem();

    public void updateDefenceUnitMessageBox(String message);

    public void sendInformation();

}
