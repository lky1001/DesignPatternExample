package com.tistory.lky1001.observer.observer;

import com.tistory.lky1001.observer.common.Observer;
import com.tistory.lky1001.observer.common.Subject;

/**
 * Created by lee on 2016. 8. 17..
 */
public class PowerSupplyController implements Observer {

    private Subject cpuUsage;
    private float usage;

    public PowerSupplyController(Subject cpuUsage) {
        this.cpuUsage = cpuUsage;
        cpuUsage.registerObserver(this);
    }

    @Override
    public void update(float usage) {
        this.usage = usage;
        control();
    }

    public void control() {
        if (usage >= 30.0f) {
            System.out.println("PowerSupplyController :: cpu가 갑자기 폭주했다!! 전력을 더 공급하자!");
        } else {
            System.out.println("PowerSupplyController :: 누진세 붙기전에 전기 공급 줄이자.");
        }
    }
}
