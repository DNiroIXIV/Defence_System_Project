/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package defencesystem.util;

/**
 *
 * @author Nirodha
 */
public enum Strength {
    CLOSED(0, 20), LOW(20, 40), MEDIUM(40, 60), HIGH(60, 80), STRONG(80, 101);

    private final int min;

    private final int max;

    private Strength(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean inRange(int value) {
        return value >= min && value < max;
    }
}
