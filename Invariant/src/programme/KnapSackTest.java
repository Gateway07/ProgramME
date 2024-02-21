package programme;

import org.junit.Test;
import org.pme.Spec;

public class KnapSackTest {
    @Spec("SELECT MAX(dot(?v, N.vector)) FROM ZeroOrOne AS N WHERE N.length = ?n AND dot(?w, N.vector) <= ?W")
    public int knapsackZeroOne(int[] w, int[] v, int n, int W) {
        int[] m = new int[W + 1];

        for (int ni = 0; ni < n; ni++) {
            for (int wi = W; wi >= 0; wi--) {
                if (w[ni] <= wi) {
                    var prevMax = m[wi - w[ni]];
                    if (m[wi] < prevMax + v[ni]) {
                        m[wi] = prevMax + v[ni];
                    }
                }
            }
        }
        return m[W];
    }

    public int knapsackZeroOneLang(int[] w, int[] v, int W) {
        return 0;
    }

    @Test
    public void test() {
        assert knapsackZeroOneLang(new int[]{3, 4, 5}, new int[]{30, 50, 60}, 8) == 90;
    }
}
