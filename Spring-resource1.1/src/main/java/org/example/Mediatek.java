package org.example;

import org.springframework.stereotype.Component;

@Component

public class Mediatek implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("second best processor");
    }
}
