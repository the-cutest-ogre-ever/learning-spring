package ru.course.spring.swampy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContet.xml");

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        boolean cmp = firstMusicPlayer == secondMusicPlayer;

        System.out.println(cmp);
        System.out.println(firstMusicPlayer); //  должен выводить кэш
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
