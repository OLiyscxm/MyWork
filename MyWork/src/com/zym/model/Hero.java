package com.zym.model;

/**
 * @function
 */

public abstract class Hero {
    private int health;
    private int attack;
    private int defense;

    public Hero(int health, int attack, int defense) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public abstract void attack();

    public abstract void useSkill();
}
