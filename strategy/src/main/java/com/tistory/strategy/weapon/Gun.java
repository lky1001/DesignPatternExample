package com.tistory.strategy.weapon;

/**
 * Created by lee on 2016. 8. 9..
 */
public class Gun implements IWeapon {

    @Override
    public void attack() {
        System.out.println("탕탕탕 아이엠 총");
    }
}
