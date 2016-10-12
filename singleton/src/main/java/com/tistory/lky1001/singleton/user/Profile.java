package com.tistory.lky1001.singleton.user;

/**
 * Created by lee on 2016. 10. 12..
 */
public class Profile {

    private static Profile instance;

    private String name;
    private int age;

    private Profile() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Profile getInstance() {
        if (instance == null) {
            instance = new Profile();
        }

        return instance;
    }
}
