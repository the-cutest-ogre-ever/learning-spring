package ru.course.spring.swampy;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassical() {
        return new ClassicalMusic();
    }

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
