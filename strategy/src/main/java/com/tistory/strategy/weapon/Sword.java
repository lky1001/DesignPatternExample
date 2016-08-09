package com.tistory.strategy.weapon;

/**
 * Created by lee on 2016. 8. 9..
 */
public class Sword implements IWeapon {

    @Override
    public void attack() {
        System.out.println("챙챙챙 아임 칼");
    }
}
