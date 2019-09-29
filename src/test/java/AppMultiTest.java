import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AppMultiTest {

    private int a;

    private int b;

    private int result;

    public AppMultiTest(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {
                {1, 2, 3},
                {5, 3, 8},
                {10, 4, 14}};
        return Arrays.asList(data);
    }

    @Test
    public void add() {
        App app = new App();
        assertEquals(result, app.add(a, b));
    }

    @Test
    public void delete() {
        App app = new App();
        int[][] data = {
                {1, 2, -1},
                {5, 3, 2},
                {10, 4, 6}};
        for (int i = 0; i < data.length; i++) {
            a = data[i][0];
            b = data[i][1];
            result = data[i][2];
            assertEquals(result, app.delete(a, b));
        }
    }
}