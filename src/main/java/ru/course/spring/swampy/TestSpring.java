package ru.course.spring.swampy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContet.xml");

        //MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        //player.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        context.close();
    }
}
