package ru.greekbrains.Distance;

import ru.greekbrains.Participant.Participant;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean doIt(Participant participant) {
        return participant.run(length);
    }
}
