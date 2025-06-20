import entities.Audio;
import entities.Immages;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Immages img1 = new Immages("paperino");
        img1.show();


        Audio audio1 = new Audio("my song", 4);
        audio1.increaseVolume(3);
        audio1.play();

        Video video1 = new Video("topolino", 6);
        video1.decreaseVolume(3);
        video1.increaseBright();
        video1.play();


    }
}