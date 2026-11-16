import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InputValidationTest {

    InputValidation validation = new InputValidation();

    @Test
    void isAlphaAcceptsLetters() {
        assertTrue(validation.isAlpha("Gabbe"));
    }
    @Test
    void isAlphaDeniesNumbers() {
        assertFalse(validation.isAlpha("Gabbe123"));
    }
    @Test
    void isAlphaDeniesEmptyString() {
        assertFalse(validation.isAlpha(""));
    }


}