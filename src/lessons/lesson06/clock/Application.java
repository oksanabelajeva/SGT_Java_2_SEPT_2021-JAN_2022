package lessons.lesson06.clock;

import lessons.lesson06.clock.clockfeatures.domain.Hour;

public class Application {

    public static void main(String[] args) {

        DigitalClock digitalClock = new DigitalClock();

        String currentTime = digitalClock.showTime();
        System.out.println(currentTime);

        Hour hour = digitalClock.getTimeClock().getHour();

        Object object = new Object();
        System.out.println(object.toString());
    }
}
