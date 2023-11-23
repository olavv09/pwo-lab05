package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Tribonacciego, dziedziczy po klasie FibonacciGenerator.
 * 
 * @author aleks
 */
public class TribonacciGenerator extends FibonacciGenerator {

    /**
     * Konstruktor inicjujący wartości początkowe dla ciągu Tribonacciego.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator do stanu początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generuje kolejny wyraz ciągu Tribonacciego.
     *
     * @return Kolejny wyraz ciągu Tribonacciego
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
