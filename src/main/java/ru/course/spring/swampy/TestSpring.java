package ru.course.spring.swampy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.course.spring.swampy.configuration.AppConfig;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContet.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(" " + player.getVolume());
/*
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());*/

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
