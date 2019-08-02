public class Hello {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScore(200);
        displayScore("Shadi", highScorePosition);
        long speed = toMilesPerHour(10.25);
        System.out.println(speed);
        printConversion(1.25);
        printMegaBytesAndKiloBytes(-2500);
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(areEqualByThreeDecimalPlaces(2.3434,1.342));
        System.out.println(getDurationString(22, 20));
        System.out.println(getDurationString(120L));
        printYearsAndDays(0);

    }

    public static void displayScore(String name, int position) {
        System.out.println(name + " managed to get a position of " + position);
    };

    public static int calculateHighScore(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    };

    public static long toMilesPerHour(double kilometersPerHour) {

        long calculatedSpeed = Math.round((kilometersPerHour * .62137));
            if (calculatedSpeed < 0){
                 return -1;
             } else {
                return calculatedSpeed;
            }
    };
;
    public static void printConversion(double kilometersPerHour){
        long speedInMph = toMilesPerHour(kilometersPerHour);
            if (speedInMph == -1){
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + speedInMph + " mi/h");
            }
    };

    public static void printMegaBytesAndKiloBytes (int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytesDecimal = kilobytes % 1024;
            int megabytes = kilobytes / 1024;
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + megabytesDecimal + " KB");
        }
    };

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            wakeUp = false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22){
            wakeUp = true;
        }
        return wakeUp;
    };

    public static boolean isLeapYear (int year){
        boolean isLeapYear = false;
        if (year > 0 && year <= 9999){
            if (year % 4 == 0){

                if(year % 100 == 0){

                    if (year % 400 == 0){
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }


            } else {
                isLeapYear= false;
            }
        } else {
            isLeapYear = false;

        }
        return isLeapYear;
    };

    public static boolean areEqualByThreeDecimalPlaces (double dubOne, double dubTwo) {
        boolean areEqual = false;
        double dubOneD = dubOne * 1000;
        double dubTwoD = dubTwo * 1000;
        System.out.println(dubOneD);
        System.out.println(dubTwoD);
        if (dubOne == dubTwo){
            areEqual = true;
        } else {
            areEqual = false;
        }
        return areEqual;
    };

    public static boolean hasEqualSum (int one, int two, int three){
        int sum = (one + two);

        if (sum == three) {
            return true;
        } else {
            return false;
        }
    };

    public static boolean hasTeen (int one, int two, int three) {
        if ((one <= 19 && one >= 13) || (two <= 19 && two >= 13) || (three <= 19 && three >= 13)) {
            return true;
        } else {
            return false;
        }
    };

    public static boolean isTeen (int one) {
        if ((one <= 19 && one >= 13)){
            return true;
        } else {
            return false;
        }
    };

    public static String getDurationString (long minutes, long seconds) {
        if ((minutes <=0) || (seconds <0) || (seconds >= 59)){
            return "Invalid Option";
        }

        long hours = minutes/60;
        minutes = minutes % 60;
        return hours + "h" + minutes + "m" + seconds + "s";
    };
    public static String getDurationString (long seconds) {
        if (seconds <= 0){
            return "Invalid Option";
        }

        long minutes = seconds/60;
        long remainingSecs = seconds % 60;
        return getDurationString(minutes, remainingSecs);
    };

    public static double area (double radius) {
        if (radius <= 0) {
            return -1;
        }
        double cirArea = (radius * radius) * Math.PI;
        return cirArea;
    };
    public static double are (double x, double y) {
        if ((x <= 0) || (y <= 0)){
            return -1;
        }
        double reqArea = x * y;
        return reqArea;
    };
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
    public static void printEqual (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        } else if ((a == b) && (b == c) && (a == c)) {
            System.out.println("All numbers are equal");
        } else if ((a != b) && (b != c) && (a != c)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if ((temperature >= 25) && (temperature <= 35)){
            return true;
        } else if (summer && (temperature <= 45) && (temperature >= 25)){
            return true;
        } else {
            return false;
        }
    }
}

