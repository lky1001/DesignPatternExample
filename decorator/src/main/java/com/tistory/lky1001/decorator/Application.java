package com.tistory.lky1001.decorator;

import com.tistory.lky1001.decorator.backup.IBackUp;
import com.tistory.lky1001.decorator.backup.Movie;
import com.tistory.lky1001.decorator.cloud.Drive;
import com.tistory.lky1001.decorator.cloud.DropBox;
import com.tistory.lky1001.decorator.cloud.File;

/**
 * Created by lee on 2016. 10. 12..
 */
public class Application {

    public static void main(String[] args) {
        IBackUp backUp = new Movie();
        backUp = new File(backUp);
        backUp = new Drive(backUp);
        backUp = new DropBox(backUp);

        System.out.println(backUp.backup());
    }
}
