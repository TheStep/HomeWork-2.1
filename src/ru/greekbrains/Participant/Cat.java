package ru.greekbrains.Participant;

public class Cat implements Participant {
    private String name;
    private boolean onDistance = true;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал кросс");
            return onDistance;
        } else {
            System.out.println(name + " не справился с кроссом");
            onDistance = false;
            return onDistance;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену");
            return onDistance;
        } else {
            System.out.println(name + " не справился с прыжком");
            onDistance = false;
            return onDistance;
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
