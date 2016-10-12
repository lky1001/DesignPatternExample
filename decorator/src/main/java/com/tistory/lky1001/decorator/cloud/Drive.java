package com.tistory.lky1001.decorator.cloud;

import com.tistory.lky1001.decorator.backup.IBackUp;

/**
 * Created by lee on 2016. 10. 12..
 */
public class Drive extends AbsBackUpStorage {

    public Drive(IBackUp backup) {
        super(backup);
    }

    @Override
    public String backup() {
        return "구글 드라이브 백업 : " + super.backup();
    }
}
