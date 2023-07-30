package homework.task_5_characters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    // Спробував якось так, але не працює - не розумію як в такому випадку писати тести
    @Test
    public void testCorrectGuess() {
        String randomWord = "banana";
        String output = Task5.quessWord(randomWord);

        assertEquals("Enter your word: "+ randomWord + "\nCongratulation! You guessed the word " + randomWord, output);
    }
}