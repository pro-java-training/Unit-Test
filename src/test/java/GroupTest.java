import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void EmptyTest() {
        Group group = new Group();
        Person person = group.max();
    }

    @Test
    public void max() {
        Person p1 = new Person(20, "Jimmy");
        Person p2 = new Person(23, "Tom");
        Group group = new Group();
        group.add(p1);
        group.add(p2);

        Person p3 = group.get(1);

        assertEquals(p3.getName(), group.max().getName());
        assertEquals(p3.getAge(), group.max().getAge());
    }

    @Test
    public void del() {
        Person p1 = new Person(20, "Jimmy");
        Group group = new Group();
        group.add(p1);

        assertTrue(group.del(p1));
    }
}