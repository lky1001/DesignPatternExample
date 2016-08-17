package com.tistory.lky1001.observer.observer;

import com.tistory.lky1001.observer.common.Observer;
import com.tistory.lky1001.observer.common.Subject;

/**
 * Created by lee on 2016. 8. 17..
 */
public class SystemMonitorDisplay implements Observer {

    private Subject cpuUsage;
    private float usage;

    public SystemMonitorDisplay(Subject cpuUsage) {
        this.cpuUsage = cpuUsage;
        cpuUsage.registerObserver(this);
    }

    @Override
    public void update(float usage) {
        this.usage = usage;
        display();
    }

    public void display() {
        if (usage >= 30.0f) {
            System.out.println("SystemMonitorDisplay :: 비상 비상");
        } else {
            System.out.println("SystemMonitorDisplay :: 정상");
        }
    }
}
