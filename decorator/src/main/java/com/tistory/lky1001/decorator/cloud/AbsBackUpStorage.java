package com.tistory.lky1001.decorator.cloud;

import com.tistory.lky1001.decorator.backup.IBackUp;

/**
 * Created by lee on 2016. 10. 12..
 */
public abstract class AbsBackUpStorage implements IBackUp {

    protected IBackUp backup;

    public AbsBackUpStorage(IBackUp backup) {
        this.backup = backup;
    }

    @Override
    public String backup() {
        return this.backup.backup();
    }
}
