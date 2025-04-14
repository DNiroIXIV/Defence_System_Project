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
public class Observer implements ObserverInterface {

    private static Observer observer = null;

    private final ArrayList<Observable> defenceUnitsList;
    private final ArrayList<Observable> helicopterList;
    private final ArrayList<Observable> submarineList;
    private final ArrayList<Observable> tankList;

    private Observer() {
        defenceUnitsList = new ArrayList<>();
        helicopterList = new ArrayList<>();
        submarineList = new ArrayList<>();
        tankList = new ArrayList<>();
    }

    public static Observer getObserverInstance() {
        return observer == null ? observer = new Observer() : observer;
    }

    public void addDefenceUnit(Observable observable) {
        DefenceType unitType = observable.getUnitType();
        switch (unitType) {
            case HELICOPTER: {
                helicopterList.add(observable);
            }
            break;

            case SUBMARINE: {
                submarineList.add(observable);
            }
            break;

            case TANK: {
                tankList.add(observable);
            }
            break;
            default:
        }
        defenceUnitsList.add(observable);
        observable.sendComboBoxDefenceItem();
        observable.setVisible(true);
    }

    public String generateUnitId(DefenceType unitType) {
        String unitId;
        int unitIdNumber;
        Observable observable;
        switch (unitType) {
            case HELICOPTER: {
                if (helicopterList.isEmpty()) {
                    return "H001";
                }
                observable = helicopterList.getLast();
                unitId = observable.getUnitId();
                unitIdNumber = Integer.parseInt(unitId.substring(1));
                return String.format("H%03d", unitIdNumber + 1);
            }

            case SUBMARINE: {
                if (submarineList.isEmpty()) {
                    return "S001";
                }
                observable = submarineList.getLast();
                unitId = observable.getUnitId();
                unitIdNumber = Integer.parseInt(unitId.substring(1));
                return String.format("S%03d", unitIdNumber + 1);
            }

            case TANK: {
                if (tankList.isEmpty()) {
                    return "T001";
                }
                observable = tankList.getLast();
                unitId = observable.getUnitId();
                unitIdNumber = Integer.parseInt(unitId.substring(1));
                return String.format("T%03d", unitIdNumber + 1);
            }
            default:
                return "";
        }
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

            if (stateChange == ItemEvent.SELECTED) {
                observable.enableWeaponOperation(strength);
            }
        }
    }

    public void notifyInitialStrength(Strength strength) {
        for (Observable observable : defenceUnitsList) {
            observable.enableWeaponOperation(strength);
        }
    }

    @Override
    public void notifyMessageToEachUnit(String message) {
        for (Observable observable : defenceUnitsList) {
            observable.updateDefenceUnitMessageBox(message);
        }
    }

    @Override
    public void notifyMessageToSelectedUnit(String message, DefenceType itemType, String itemId) {
        ArrayList<Observable> unitList;

        switch (itemType) {
            case HELICOPTER: {
                unitList = helicopterList;
            }
            break;

            case SUBMARINE: {
                unitList = submarineList;
            }
            break;

            case TANK: {
                unitList = tankList;
            }
            break;
            default:
                unitList = defenceUnitsList;
        }

        for (Observable observable : unitList) {
            if (itemId.equals(observable.getUnitId())) {
                observable.updateDefenceUnitMessageBox(message);
                break;
            }
        }
    }

    @Override
    public void notifyUnitToSendInformation(DefenceType itemType, String itemId) {
        ArrayList<Observable> unitList;

        switch (itemType) {
            case HELICOPTER: {
                unitList = helicopterList;
            }
            break;

            case SUBMARINE: {
                unitList = submarineList;
            }
            break;

            case TANK: {
                unitList = tankList;
            }
            break;
            default:
                unitList = defenceUnitsList;
        }

        for (Observable observable : unitList) {
            if (itemId.equals(observable.getUnitId())) {
                observable.sendInformation();
                break;
            }
        }
    }
}
