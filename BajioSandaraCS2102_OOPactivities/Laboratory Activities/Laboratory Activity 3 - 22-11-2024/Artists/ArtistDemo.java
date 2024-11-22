public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Leiko Ikemura", "Japanese-Swiss", 73, "Painting", Medium.ACRYLIC);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("J.K. Rowling", "British", 59, "Literature", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Felip Jhon Suson", "Filipino", 27, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}
