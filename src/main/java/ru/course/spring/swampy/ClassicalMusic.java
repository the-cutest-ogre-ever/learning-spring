package ru.course.spring.swampy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {



    private ClassicalMusic() {}

    @PostConstruct
    public void init()
    {
        System.out.println("initialization...");
    }

    @PreDestroy
    public void dest()
    {
        System.out.println("destroying...");
    }

    public static ClassicalMusic getClassical() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }



}
