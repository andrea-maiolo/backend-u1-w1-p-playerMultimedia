package entities;

import interfaces.Brightness;

public class Immages extends ElementoMultimediale implements Brightness {
    private int brightness;

    public Immages(String title) {
        super(title);
        brightness = 5;
    }

    @Override
    public void increaseBright() {
        if (brightness < 10) {
            brightness++;
        } else {
            System.out.println("max bright");
        }
    }

    @Override
    public void decreaseBright() {
        if (brightness > 1) {
            brightness--;
        } else {
            System.out.println("min bright");
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
