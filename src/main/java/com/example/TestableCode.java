//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestableCode {
    public static String[] knownNames = new String[]{"Zeynep", "Tess", "Marina", "Jade", "Eric", "Jamal", "Malika", "James"};
    public static String[] specialNames = new String[]{"Zach", "Martin", "Noah", "Tess"};
    public String greeting;

    public TestableCode() {
    }

    public String greetUser(String name) {
        LocalDateTime dateTime = LocalDateTime.now();
        Stream var10000;
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            this.greeting = this.greeting + "Good night, ";
            var10000 = Arrays.stream(knownNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                this.greeting = this.greeting + "I know you, " + name + ".";
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "You're even on our VIP list!";
                }
            } else {
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "I don't know you, " + name + ". But you are on our VIP list!";
                } else {
                    this.greeting = this.greeting + "stranger";
                }
            }
        }

        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            this.greeting = this.greeting + "Good morning,";
            var10000 = Arrays.stream(knownNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                this.greeting = this.greeting + "I know you, " + name + ".";
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "You're even on our VIP list!";
                }
            } else {
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "I don't know you, " + name + ". But you are on our VIP list!";
                } else {
                    this.greeting = this.greeting + "stranger";
                }
            }
        }

        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            this.greeting = this.greeting + "Good afternoon, ";
            var10000 = Arrays.stream(knownNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                this.greeting = this.greeting + "I know you, " + name + ".";
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "You're even on our VIP list!";
                }
            } else {
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "I don't know you, " + name + ". But you are on our VIP list!";
                } else {
                    this.greeting = this.greeting + "stranger";
                }
            }
        }

        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            this.greeting = this.greeting + "Good evening, ";
            var10000 = Arrays.stream(knownNames);
            name.getClass();
            if (var10000.anyMatch(name::equals)) {
                this.greeting = this.greeting + "I know you, " + name + ".";
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "You're even on our VIP list!";
                }
            } else {
                var10000 = Arrays.stream(specialNames);
                name.getClass();
                if (var10000.anyMatch(name::equals)) {
                    this.greeting = this.greeting + "I don't know you, " + name + ". But you are on our VIP list!";
                } else {
                    this.greeting = this.greeting + "stranger";
                }
            }
        }

        System.out.println(this.greeting);
        return this.greeting;
    }
}
