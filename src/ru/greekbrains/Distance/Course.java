package ru.greekbrains.Distance;

import ru.greekbrains.Participant.Participant;
import ru.greekbrains.Participant.Team;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Participant participant : team.getParticipants())
            for (Obstacle obstacle : obstacles) {
                if (obstacle.doIt(participant) == false) {
                    break;
                }
            }
    }
}