package com.gy.spring.chapter2.autoconfig;

import org.springframework.stereotype.Component;

//@Component("lonelyHeartsClub")
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
