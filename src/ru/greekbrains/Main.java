package ru.greekbrains;

import ru.greekbrains.Distance.Course;
import ru.greekbrains.Distance.Treadmill;
import ru.greekbrains.Distance.Wall;
import ru.greekbrains.Participant.Cat;
import ru.greekbrains.Participant.Human;
import ru.greekbrains.Participant.Robot;
import ru.greekbrains.Participant.Team;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(
                new Treadmill(5),
                new Wall(3));
        Team team = new Team("Dream",
                new Cat("Barsik", 4, 0),
                new Human("Andrey", 9, 2),
                new Robot("Bender", 50, 10));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}