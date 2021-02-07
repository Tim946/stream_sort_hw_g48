package ua.mainacademy;

import junit.framework.TestCase;
import org.junit.Test;

public class AppRunnerTest extends TestCase {

    @Test
    public void sortedString() {
        String text = "Charlie Jennifer Charlie Bob Charlie Charlie Bob Jennifer Alice Alice";
        String testResult = AppRunner.sortedString(text);
        assertEquals("[Charlie=4, Alice=2, Bob=2, Jennifer=2]", testResult);
    }
}