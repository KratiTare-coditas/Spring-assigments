package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Samsung {


    @Qualifier("mediatek")
    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config()
    {
        System.out.println("Octa Core,4GB Ram,12 mp Camera");

        cpu.process();
    }
}
