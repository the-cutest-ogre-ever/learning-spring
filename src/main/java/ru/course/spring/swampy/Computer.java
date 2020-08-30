package ru.course.spring.swampy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.player = player;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer {" + ' ' +
                "id = " + id +
                ", player = " + player.playMusic() + " & " +
                '}';
    }
}
