package com.tistory.lky1001.decorator.cloud;

import com.tistory.lky1001.decorator.backup.IBackUp;

/**
 * Created by lee on 2016. 10. 12..
 */
public class DropBox extends AbsBackUpStorage {

    public DropBox(IBackUp backup) {
        super(backup);
    }

    @Override
    public String backup() {
        return "드랍박스 백업 : " + super.backup();
    }
}
