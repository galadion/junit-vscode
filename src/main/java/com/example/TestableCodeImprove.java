//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestableCodeImprove {
    public static String[] knownNames = new String[]{"Zeynep", "Tess", "Marina", "Jade", "Eric", "Jamal", "Malika", "James"};
    public static String[] specialNames = new String[]{"Zach", "Martin", "Noah", "Tess"};

    public TestableCodeImprove() {
    }

    public String greetUser(String name) {
        Stream var10000;
        String greetUser = "";

        var10000 = Arrays.stream(knownNames);
        name.getClass();
        if (var10000.anyMatch(name::equals)) {
            greetUser = greetUser + "I know you, " + name + ".";
            var10000 = Arrays.stream(specialNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                greetUser = greetUser + "You're even on our VIP list!";
            }
        } else {
            var10000 = Arrays.stream(specialNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                greetUser = greetUser + "I don't know you, " + name + ". But you are on our VIP list!";
            } else {
                greetUser = greetUser + "stranger";
            }
        }
        return greetUser;
    }

    public String greetDay() {
        LocalDateTime dateTime = LocalDateTime.now();
        String greetDay = "";
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            greetDay = greetDay + "Good night, ";
        }

        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            greetDay = greetDay + "Good morning,";
        }

        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            greetDay = greetDay + "Good afternoon, ";
        }

        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            greetDay = greetDay + "Good evening, ";
        }

        return greetDay;
    }

    public String greetDay(LocalDateTime dateTime) {
        String greetDay = "";
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            greetDay = greetDay + "Good night, ";
        }

        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            greetDay = greetDay + "Good morning,";
        }

        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            greetDay = greetDay + "Good afternoon, ";
        }

        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            greetDay = greetDay + "Good evening, ";
        }
        return greetDay;
    }
}
