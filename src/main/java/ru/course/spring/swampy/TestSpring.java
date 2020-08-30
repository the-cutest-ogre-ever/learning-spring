package ru.course.spring.swampy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContet.xml");

        Music music = context.getBean("someClassicalMusic", Music.class);

        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        context.close();
    }
}
