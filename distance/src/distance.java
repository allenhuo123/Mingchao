public class distance {
    public static double distanceTwoCity(double x1, int y1, int x2, int y2) {
        double answer = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return answer;
    }

    public static double distanceThirdCity(double x1, int y1, int x2, int y2) {
        double answer = Math.sqrt(Math.pow(x1- x2, 2) + Math.pow(y1 - y2, 2));
        return answer;
    }
    public static double distanceThreeCity(double x1, int y1, int x2, int y2) {
        double answer = Math.sqrt(Math.pow(x1- x2, 2) + Math.pow(y1 - y2, 2));
        return answer;
    }

    /*Tacoma (16,10)
    Gig Harbor (4,28)
    Steilacoom (2,8)
    Spanaway (10,3)
    Bonney Lake (23,10)
    Auburn (21,21)
    */

    public static void main(String[]args){
            double distance = distanceTwoCity(16, 10, 4, 28);
            double distance2 = distanceThirdCity(4,28,2,8);
            double distance3 = distanceThreeCity(16,10,2,8);
            System.out.println("The distance between three city is " + (distance + distance2 + distance3));
        }
}
