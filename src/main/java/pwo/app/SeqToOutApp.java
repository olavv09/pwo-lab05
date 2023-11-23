package pwo.app;
import pwo.utils.SequenceTools;

/**
 * Aplikacja do wyświetlania ciągów w terminalu.
 * Rozszerza funkcjonalność klasy SeqToFileApp.
 * 
 * @author aleks
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Pobiera i waliduje argumenty z wiersza poleceń dla aplikacji.
     *
     * @param args Argumenty z wiersza poleceń
     * @return True, jeśli argumenty są poprawne, w przeciwnym razie false
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }
        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Wypisuje wygenerowany ciąg do terminala.
     *
     * @return True, jeśli wypisywanie jest udane, w przeciwnym razie false
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Uruchamia aplikację do wyświetlania ciągów w terminalu.
     *
     * @param args Argumenty z wiersza poleceń
     */
    @Override
    public void run(String[] args) {
        System.out.println("Aplikacja do wyświetlania ciągów w terminalu");

        if (!getArgs(args)) {
            System.out.println("!Nieprawidłowe argumenty\n"
                    + "Poprawne użycie: seqName from to");
            return;
        }

        wirteSeq();
    }
}
