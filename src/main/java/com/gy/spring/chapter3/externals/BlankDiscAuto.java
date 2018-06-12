package com.gy.spring.chapter3.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDiscAuto {

    private final String title;
    private final String artist;

    public BlankDiscAuto(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
