package ru.greekbrains.Participant;

public interface Participant {

    boolean isOnDistance();

    boolean run(int distance);

    boolean jump(int height);

}