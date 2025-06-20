package entities;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {
    private final int duration;
    private int volume;

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 5;
    }

    public void play() {
        for (int i = 0; i < this.duration; i++) {
            StringBuilder curretnVolume = new StringBuilder();
            for (int j = 0; j < this.volume; j++) {
                curretnVolume.append("!");
            }
            System.out.println(this.title + " " + curretnVolume);
        }
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
}
