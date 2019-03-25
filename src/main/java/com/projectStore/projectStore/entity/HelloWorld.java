package com.projectStore.projectStore.entity;

import org.joda.time.LocalTime;

/**
 * Created by 111 on 19.03.2019.
 */

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println(currentTime);
        Home home = new Home();
        System.out.println(home.sayHello());
    }
}

