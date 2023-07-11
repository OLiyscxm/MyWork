package com.zym.model;

/**
 * @function
 */

public class Person extends Hero {
    public Person(int health, int attack, int defense) {
        super(health, attack, defense);
    }

    @Override
    public void attack() {
        System.out.println("攻击");
    }

    @Override
    public void useSkill() {
        System.out.println("技能");
    }
}
