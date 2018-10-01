public class SixDays {
    public static void firstPresent(){
        System.out.println("a partridge in a pear tree.");
        System.out.println();
    }
    public static void secondPresent(){
        System.out.println("two turtle doves, and");
        firstPresent();
    }
    public static void thirdPresent(){
        System.out.println("three French hens,");
        secondPresent();
    }
    public static void fourthPresent(){
        System.out.println("four calling birds,");
        thirdPresent();
    }
    public static void fifthPresent(){
        System.out.println("five golden rings,");
        fourthPresent();
    }
    public static void sixthPresent(){
        System.out.println("six geese a-laying,");
        fifthPresent();
    }
    public static void firstDay(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        firstPresent();
    }
    public static void secondDay(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        secondPresent();
    }
    public static void thirdDay(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        thirdPresent();
    }
    public static void fourthDay(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        fourthPresent();
    }
    public static void fifthDay(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        fifthPresent();
    }
    public static void sixthDay(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        sixthPresent();
    }
    public static void main(String[] args) {
            firstDay();
            secondDay();
            thirdDay();
            fourthDay();
            fifthDay();
            sixthDay();
    }

}

