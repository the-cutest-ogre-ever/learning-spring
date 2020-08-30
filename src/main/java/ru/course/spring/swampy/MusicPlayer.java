package ru.course.spring.swampy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic music1;
    private RockMusic music2;

    @Autowired
    public MusicPlayer(ClassicalMusic music1, RockMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic()
    {
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
    }
}
