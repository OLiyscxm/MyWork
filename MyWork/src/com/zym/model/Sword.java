package com.zym.model;

/**
 * @function
 */

public class Sword extends Weapon {
    public Sword(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public void attack() {
        System.out.println("攻击");
    }
}
