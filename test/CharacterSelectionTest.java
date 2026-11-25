import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CharacterSelectionTest {
    CharacterSelection characterSelection = new CharacterSelection();

    @Test
    void chooseComputerCharacter() {
        Boxers character = characterSelection.chooseComputerCharacter();
        assertNotNull(character.getName());
    }
}