package com.zym.model;

/**
 * @function
 */


public abstract class Weapon {
    private int attackPower;
    private String name;

    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public abstract void attack();
}
