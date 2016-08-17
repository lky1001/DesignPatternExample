package com.tistory.lky1001.observer;

import com.tistory.lky1001.observer.observable.CpuUsageSubject;
import com.tistory.lky1001.observer.observer.PowerSupplyController;
import com.tistory.lky1001.observer.observer.SystemMonitorDisplay;

/**
 * Created by lee on 2016. 8. 17..
 */
public class Application {

    public static void main(String[] args) {
        CpuUsageSubject cpuUsageSubject = new CpuUsageSubject();

        PowerSupplyController controller = new PowerSupplyController(cpuUsageSubject);
        SystemMonitorDisplay display = new SystemMonitorDisplay(cpuUsageSubject);

        cpuUsageSubject.setCpuUsage(10.0f);
        cpuUsageSubject.setCpuUsage(55.0f);
        cpuUsageSubject.setCpuUsage(20.0f);
    }
}
