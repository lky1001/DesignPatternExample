package com.tistory.lky1001.decorator.cloud;

import com.tistory.lky1001.decorator.backup.IBackUp;

/**
 * Created by lee on 2016. 10. 12..
 */
public class File extends AbsBackUpStorage {

    public File(IBackUp backup) {
        super(backup);
    }

    @Override
    public String backup() {
        return "파일 백업 : " + super.backup();
    }
}
