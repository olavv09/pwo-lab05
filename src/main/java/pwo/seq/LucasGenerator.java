package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Lucasa, dziedziczy po klasie FibonacciGenerator.
 * 
 * @author aleksandra
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor inicjujący wartości początkowe dla ciągu Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Resetuje generator do stanu początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Generuje kolejny wyraz ciągu Lucasa.
     *
     * @return Kolejny wyraz ciągu Lucasa
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
