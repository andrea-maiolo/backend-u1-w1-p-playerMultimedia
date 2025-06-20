package entities;

import interfaces.Brightness;

public class Immages extends ElementoMultimediale implements Brightness {
    private int brightness;

    public Immages(String title) {
        super(title);
        brightness = 5;
    }

    @Override
    public void increaseBright(int value) {
        if (brightness + value < 10) {
            brightness += value;
        } else {
            brightness = 10;
        }
    }

    @Override
    public void decreaseBright(int value) {
        if (brightness - value > 1) {
            brightness -= value;
        } else {
            brightness = 1;
        }
    }

    public void show() {
        StringBuilder currentBright = new StringBuilder();
        currentBright.repeat("*", this.brightness);
        System.out.println(this.title + " " + currentBright);
    }

    public void execute() {
        show();
    }

}
