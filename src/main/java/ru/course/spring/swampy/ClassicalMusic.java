package ru.course.spring.swampy;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void init()
    {
        System.out.println("Initialization...");
    }

    public void dest()
    {
        System.out.println("Destroying...");
    }
}
