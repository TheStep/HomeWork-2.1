package ru.greekbrains.Participant;

public class Team {
    private String name;
    private Participant participants[];

    public Team(String name, Participant... participantsGiven) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name);
        for (Participant p : participants) {
            System.out.println(p);
        }
    }

    public void showResults() {
        for (Participant p : participants) {
            if (p.isOnDistance()) {
                System.out.println(p + " прошел дистанцию");
            } else {
                System.out.println(p + " не прошел дистанцию");
            }
        }
    }
}