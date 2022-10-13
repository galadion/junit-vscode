//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package preparingcode;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestableCodeTest {
    private static TestableCode tc = new TestableCode();

    public TestableCodeTest() {
    }

    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        Assertions.assertTrue(tc.greetUser(name).contains("VIP"));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting() {
        String name = "Tess";
        Assertions.assertTrue(tc.greetUser(name).contains("even"));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Sascha";
        Assertions.assertTrue(tc.greetUser(name).contains("stranger"));
    }

    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart() {
        String dayPart = "";
        LocalDateTime dateTime = LocalDateTime.now();
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            dayPart = dayPart + "Good night, ";
        }

        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            dayPart = dayPart + "Good morning,";
        }

        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            dayPart = dayPart + "Good afternoon, ";
        }

        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            dayPart = dayPart + "Good evening, ";
        }

        Assertions.assertTrue(tc.greetUser("anyName").contains(dayPart));
    }
}
