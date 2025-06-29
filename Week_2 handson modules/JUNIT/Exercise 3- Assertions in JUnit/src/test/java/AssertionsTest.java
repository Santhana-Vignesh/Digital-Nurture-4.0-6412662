import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // ✅ Assert that 2 + 3 = 5
        assertEquals(5, 2 + 3);

        // ✅ Assert that the condition is true
        assertTrue(5 > 3);

        // ✅ Assert that the condition is false
        assertFalse(5 < 3);

        // ✅ Assert that a value is null
        Object obj1 = null;
        assertNull(obj1);

        // ✅ Assert that a value is NOT null
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}
