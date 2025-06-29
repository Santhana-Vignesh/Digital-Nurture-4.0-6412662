import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    // ✅ Setup: runs BEFORE each test method
    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("🛠️ setUp: Calculator instance created");
    }

    // ✅ Teardown: runs AFTER each test method
    @AfterEach
    void tearDown() {
        System.out.println("🧹 tearDown: Test finished\n");
    }

    // ✅ Test with AAA pattern
    @Test
    void testAddition() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    void testSubtraction() {
        // Arrange
        int a = 10, b = 4;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
