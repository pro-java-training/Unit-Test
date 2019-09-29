import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void add() {
        assertEquals(10, new App().add(5, 5));
    }

    @Test
    public void delete() {
        assertEquals(0, new App().delete(5, 5));
    }
}