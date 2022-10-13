//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package preparingcode;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestableCodeImproveTest {
    private static TestableCodeImprove tc = new TestableCodeImprove();

    public TestableCodeImproveTest() {
    }

    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        Assertions.assertTrue(tc.greetUser(name).contains("VIP"));

        String outcome = "I don't know you, Noah. But you are on our VIP list!";
        Assertions.assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting() {
        String name = "Tess";
        Assertions.assertTrue(tc.greetUser(name).contains("even"));

        String outcome = "I know you, Tess.You're even on our VIP list!";
        Assertions.assertEquals(outcome, tc.greetUser(name));
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

        Assertions.assertTrue(tc.greetDay().contains(dayPart));
    }

    @Test
    @DisplayName("Test part of the day greeting with passed param")
    public void testDayPartWithPassedParam() {
        String dayPart = "";
        LocalDateTime dateTime = LocalDateTime.of(2021, 8, 4, 13, 15);

        String outcome = "Good afternoon, ";
        Assertions.assertEquals(outcome, tc.greetDay(dateTime));
    }
}
