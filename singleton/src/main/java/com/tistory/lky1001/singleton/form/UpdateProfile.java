package com.tistory.lky1001.singleton.form;

import com.tistory.lky1001.singleton.user.Profile;

/**
 * Created by lee on 2016. 10. 12..
 */
public class UpdateProfile {

    public void updateName(String name) {
        Profile profile = Profile.getInstance();

        profile.setName(name);
    }
}
