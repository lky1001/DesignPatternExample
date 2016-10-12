package com.tistory.lky1001.decorator.backup;

/**
 * Created by lee on 2016. 10. 12..
 */
public class Movie implements IBackUp {

    @Override
    public String backup() {
        return "영상";
    }
}
