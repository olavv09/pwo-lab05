package pwo.seq;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import pwo.utils.SequenceGenerator;

abstract class Generator implements SequenceGenerator {
    private final Map<Integer, BigDecimal> map = new HashMap();

    protected int lastIndex = 0;
    protected BigDecimal current = null,
            f_1 = null,
            f_2 = null,
            f_3 = null;

    @Override
    public void reset() {
        lastIndex = 0;
    }

    @Override
    public final BigDecimal getTerm(int i) {
        if (map.containsKey(i)) {
            return map.get(i);
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            map.put(i, nextTerm());
        }
        return current;
    }
}
