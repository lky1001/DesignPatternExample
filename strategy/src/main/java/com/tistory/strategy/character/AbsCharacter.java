package com.tistory.strategy.character;

import com.tistory.strategy.weapon.IWeapon;

/**
 * Created by lee on 2016. 8. 9..
 */
public abstract class AbsCharacter {

    protected int tall;
    protected int weight;
    protected int str;
    protected int dex;
    protected int con;
    protected int wiz;

    protected IWeapon weapon;

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getWiz() {
        return wiz;
    }

    public void setWiz(int wiz) {
        this.wiz = wiz;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void performAttack() {
        this.weapon.attack();
    }
}
