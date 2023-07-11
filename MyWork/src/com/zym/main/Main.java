package com.zym.main;

import com.zym.model.Hero;
import com.zym.model.Person;
import com.zym.model.Sword;
import com.zym.model.Weapon;

/**
 * @function
 */

public class Main {
    public static void main(String[] args) {

        Hero person = new Person(100, 10, 5);

        person.attack();
        person.useSkill();

        Weapon sword = new Sword("剑", 8);

        sword.attack();
    }
}
