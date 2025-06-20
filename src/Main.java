import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immages;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Immages img1 = new Immages("paperino");
        img1.decreaseBright();

        Audio audio1 = new Audio("my song", 4);
        audio1.increaseVolume(3);

        Video video1 = new Video("topolino", 6);
        video1.decreaseVolume(3);
        video1.increaseBright();

        Video video2 = new Video("pluto", 3);
        video2.decreaseBright();
        video2.decreaseBright();
        video2.increaseVolume(7);

        Immages img2 = new Immages("pippo");
        img2.increaseBright();
        img2.increaseBright();

        ElementoMultimediale[] lettoreMulti = {img1, audio1, video1, video2, img2};

//

        //questo riempie l array
        ElementoMultimediale[] nuovoLettore = new ElementoMultimediale[5];

        for (int i = 0; i < nuovoLettore.length; i++) {
            System.out.println("che elemento vuoi creare: audio, video, immagine");
            String typeOfMedia = scanner.nextLine();
            switch (typeOfMedia) {
                case "immagine":
                    System.out.println("inserisci un titolo per l' immagine");
                    String imgTitle = scanner.nextLine();
                    Immages newImg = new Immages(imgTitle);
                    nuovoLettore[i] = newImg;
                    break;
                case "video":
                    System.out.println("inserisci un titolo per il video");
                    String videoTitle = scanner.nextLine();
                    System.out.println("inserisci la durate del video(deve essere un numero positivo");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    Video newVideo = new Video(videoTitle, durataVideo);
                    nuovoLettore[i] = newVideo;
                    break;
                case "audio":
                    System.out.println("inserisci un titolo per l' audio");
                    String audioTitle = scanner.nextLine();
                    System.out.println("inserisci la durate del audio(deve essere un numero positivo");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    Audio newAudio = new Audio(audioTitle, durataAudio);
                    nuovoLettore[i] = newAudio;
                    break;
                default:
                    System.out.println("per favore controlla di aver inserito un tipo valido overrai incastrato in un loop infinito");
                    i--;
            }
        }


        int toExecute;

        do {
            System.out.println("che elemento vuoi eseguire? 1-5 per gli elementi oppure 0 per uscire");
            toExecute = Integer.parseInt(scanner.nextLine());
            nuovoLettore[toExecute - 1].execute();
        } while (toExecute != 0);

      
    }
}