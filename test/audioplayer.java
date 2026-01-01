import java.util.Scanner;
import java.lang.*;

class CarMusicSystem {
    String[] songs = {
        "Song A",
        "Song B",
        "Song C",
        "Song D"
    };

    int currentSong = 0;
    int volume = 5; // Volume range: 0 - 10
    boolean isPlaying = false;

    void play() {
        isPlaying = true;
        System.out.println("Playing: " + songs[currentSong]);
    }

    void pause() {
        isPlaying = false;
        System.out.println("Music paused");
    }

    void nextSong() {
        currentSong = (currentSong + 1) % songs.length;
        play();
    }

    void previousSong() {
        currentSong = (currentSong - 1 + songs.length) % songs.length;
        play();
    }

    void volumeUp() {
        if (volume < 10) volume++;
        System.out.println("Volume: " + volume);
    }

    void volumeDown() {
        if (volume > 0) volume--;
        System.out.println("Volume: " + volume);
    }
}

public class audioplayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarMusicSystem cms = new CarMusicSystem();
        int choice;

        do {
            System.out.println("\n--- Car Music System ---");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Next Song");
            System.out.println("4. Previous Song");
            System.out.println("5. Volume Up");
            System.out.println("6. Volume Down");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> cms.play();
                case 2 -> cms.pause();
                case 3 -> cms.nextSong();
                case 4 -> cms.previousSong();
                case 5 -> cms.volumeUp();
                case 6 -> cms.volumeDown();
                case 0 -> System.out.println("Exiting Music System...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}
