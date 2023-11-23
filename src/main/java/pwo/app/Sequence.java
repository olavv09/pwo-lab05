package pwo.app;

/**
 * Klasa główna do uruchamiania aplikacji do generowania i wyświetlania ciągów.
 * 
 * @author aleksandra
 */
public class Sequence {

    /**
     * Metoda główna aplikacji.
     *
     * @param args Argumenty z wiersza poleceń
     */
    public static void main(String[] args) {
        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Nieprawidłowe argumenty\n"
                        + "Poprawne użycie: seqName from to [nazwaPliku]");
        }
    }
}
