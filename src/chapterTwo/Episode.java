package chapterTwo;

public class Episode {

    int seriesNumber;
    int episodeNumber;

    void play() {
        System.out.println("Playing episode...");
    }

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
