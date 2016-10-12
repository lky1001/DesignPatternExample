package com.tistory.lky1001.singleton;

import com.tistory.lky1001.singleton.form.NewProfile;
import com.tistory.lky1001.singleton.form.UpdateProfile;
import com.tistory.lky1001.singleton.user.Profile;

/**
 * Created by lee on 2016. 10. 12..
 */
public class Application {

    public static void main(String[] args) {
        NewProfile newProfile = new NewProfile();
        newProfile.saveName("kylee");

        System.out.println(Profile.getInstance().getName());

        UpdateProfile updateProfile = new UpdateProfile();
        updateProfile.updateName("leeky");

        System.out.println(Profile.getInstance().getName());
    }
}
