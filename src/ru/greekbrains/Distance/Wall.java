package ru.greekbrains.Distance;

import ru.greekbrains.Participant.Participant;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean doIt(Participant participant) {
        return participant.jump(height);
    }
}
