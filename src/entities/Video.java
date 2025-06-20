package entities;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Brightness, Volume {
    private final int duration;
    private int brightness;
    private int volume;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 5;
        this.brightness = 5;
    }

    @Override
    public void increaseVolume(int value) {
        if (value <= 0) {
            System.out.println("value must be positive");
        }
        ;
        if (this.volume + value >= 10) {
            System.out.println("max volume");
            this.volume = 10;
        } else {
            this.volume += value;
        }
    }

    @Override
    public void decreaseVolume(int value) {
        if (value <= 0) {
            System.out.println("value must be positive");
        }
        ;
        if (this.volume - value <= 0) {
            System.out.println("min volume");
            this.volume = 0;
        } else {
            this.volume -= value;
        }
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

    public void play() {
        StringBuilder currentVolume = new StringBuilder();
        currentVolume.repeat("!", this.volume);
        StringBuilder currentBright = new StringBuilder();
        currentBright.repeat("*", this.brightness);
        for (int i = 0; i < this.duration; i++) {
            System.out.println(this.title + " " + currentBright + " " + currentVolume);
        }
    }

    public void execute() {
        play();
    }
}
