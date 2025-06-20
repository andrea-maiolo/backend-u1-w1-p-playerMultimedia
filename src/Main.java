import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immages;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Immages img1 = new Immages("paperino");
        //img1.decreaseBright(1);

        Audio audio1 = new Audio("my song", 4);
        audio1.increaseVolume(3);

        Video video1 = new Video("topolino", 6);
//        video1.decreaseVolume(3);
//        video1.increaseBright(2);

        Video video2 = new Video("pluto", 3);
//        video2.decreaseBright(4);
//        video2.decreaseBright(1);
//        video2.increaseVolume(7);

        Immages img2 = new Immages("pippo");
//        img2.increaseBright(3);

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

        //impostazioni lettore
        for (int i = 0; i < nuovoLettore.length; i++) {
            String userAswerVolumeUp;
            String userAswerBrightUp;
            String userAswerVolumeDown;
            String userAnswerBrightDown;

            System.out.println("controllo impostazioni lettore");

            if (nuovoLettore[i] instanceof Immages) {
                System.out.println("questa e un immagine");
                System.out.println("vuoi aumentare la luminosita? y per si n per no");
                userAswerBrightUp = scanner.nextLine();
                if (userAswerBrightUp.equals("n")) {
                    System.out.println("la luminosita rimarra uguale");
                } else if (userAswerBrightUp.equals("y")) {
                    System.out.println("di quanto vuoi aumentare la luminosita, massimo 10");
                    int userBValue = Integer.parseInt(scanner.nextLine());
                    ((Immages) nuovoLettore[i]).increaseBright(userBValue);
                } else {
                    System.out.println("input invalido la luminosita rimarra fissa");
                }
                System.out.println("vuoi abbassare la luminosita? y per si n per no");
                userAnswerBrightDown = scanner.nextLine();
                if (userAnswerBrightDown.equals("n")) {
                    System.out.println("la luminosita rimarra uguale");
                } else if (userAnswerBrightDown.equals("y")) {
                    System.out.println("di quanto vuio abbassare la luminosita? minimo 1");
                    int userBValue = Integer.parseInt(scanner.nextLine());
                    ((Immages) nuovoLettore[i]).decreaseBright(userBValue);
                }
            } else if (nuovoLettore[i] instanceof Video) {
                System.out.println("questo e un video");
                System.out.println("vuoi aumentare la luminosita? y per si n per no");
                userAswerBrightUp = scanner.nextLine();
                if (userAswerBrightUp.equals("n")) {
                    System.out.println("la luminosita rimarra uguale");
                } else if (userAswerBrightUp.equals("y")) {
                    System.out.println("di quanto vuio aumentare la luminosita? massimo 10");
                    int userBValue = Integer.parseInt(scanner.nextLine());
                    ((Video) nuovoLettore[i]).increaseBright(userBValue);
                } else {
                    System.out.println("input invalido la luminosita rimarra fissa");
                }
                System.out.println("vuoi abbassare la luminosita? y per si n per no");
                userAnswerBrightDown = scanner.nextLine();
                if (userAnswerBrightDown.equals("n")) {
                    System.out.println("la luminosita rimarra uguale");
                } else if (userAnswerBrightDown.equals("y")) {
                    System.out.println("di quanto vuio abbassare la luminosita? minimo 1");
                    int userBValue = Integer.parseInt(scanner.nextLine());
                    ((Video) nuovoLettore[i]).decreaseBright(userBValue);
                }
                System.out.println("vuoi aumentare l audio? y per si n per no");
                userAswerVolumeUp = scanner.nextLine();
                if (userAswerVolumeUp.equals("n")) {
                    System.out.println("l audio rimarra uguale");
                } else if (userAswerVolumeUp.equals("y")) {
                    System.out.println("di quanto vuoi aumentare il volume? massimo volume 10");
                    int userVolumeValue = Integer.parseInt(scanner.nextLine());
                    ((Video) nuovoLettore[i]).increaseVolume(userVolumeValue);
                } else {
                    System.out.println("input invalido il volume rimarra fisso");
                }
                System.out.println("vuoi abbasare l audio? y per si n per no");
                userAswerVolumeDown = scanner.nextLine();
                if (userAswerVolumeDown.equals("n")) {
                    System.out.println("l audio rimarra uguale");
                } else if (userAswerVolumeDown.equals("y")) {
                    System.out.println("di quanto vuoi abbassare il volume? minimo volume 0");
                    int userVolumeValue = Integer.parseInt(scanner.nextLine());
                    ((Video) nuovoLettore[i]).decreaseVolume(userVolumeValue);
                } else {
                    System.out.println("input invalido il volume rimarra fisso");
                }
            } else {
                System.out.println("questo e un audio");
                System.out.println("vuoi aumentare l audio? y per si n per no");
                userAswerVolumeUp = scanner.nextLine();
                if (userAswerVolumeUp.equals("n")) {
                    System.out.println("l audio rimarra uguale");
                } else if (userAswerVolumeUp.equals("y")) {
                    System.out.println("di quanto vuoi aumentare il volume? massimo volume 10");
                    int userVolumeValue = Integer.parseInt(scanner.nextLine());
                    ((Audio) nuovoLettore[i]).increaseVolume(userVolumeValue);
                } else {
                    System.out.println("input invalido il volume rimarra fisso");
                }
                System.out.println("vuoi abbasare l audio? y per si n per no");
                userAswerVolumeDown = scanner.nextLine();
                if (userAswerVolumeDown.equals("n")) {
                    System.out.println("l audio rimarra uguale");
                } else if (userAswerVolumeDown.equals("y")) {
                    System.out.println("di quanto vuoi abbasare il volume? minimo volume 0");
                    int userVolumeValue = Integer.parseInt(scanner.nextLine());
                    ((Audio) nuovoLettore[i]).decreaseVolume(userVolumeValue);
                } else {
                    System.out.println("input invalido il volume rimarra fisso");
                }
            }
        }


        int toExecute;

        do {
            System.out.println("che elemento vuoi eseguire? 1-5 per gli elementi oppure 0 per uscire");
            toExecute = Integer.parseInt(scanner.nextLine());
            if (toExecute < 0 || toExecute > 5) {
                System.out.println("input non valido");
            }
            nuovoLettore[toExecute - 1].execute();
        } while (toExecute != 0);


        scanner.close();

        //test
    }
}