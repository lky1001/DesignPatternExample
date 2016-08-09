package com.tistory.strategy;

import com.tistory.strategy.character.KnightCharacter;
import com.tistory.strategy.character.WizardCharacter;
import com.tistory.strategy.weapon.Gun;
import com.tistory.strategy.weapon.Sword;

/**
 * Created by lee on 2016. 8. 9..
 */
public class Application {

    public static void main(String[] args) {
        KnightCharacter knight = new KnightCharacter();
        knight.setWeapon(new Sword());
        knight.performAttack();

        WizardCharacter wizard = new WizardCharacter();
        wizard.setWeapon(new Gun());
        wizard.performAttack();
    }
}
