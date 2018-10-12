        /*
        Mingchao Huo
        AP CS A
        Period 1
        October 9, 2018
        Project #2 - Rocketship
        */
public class Rocketship {
    /* C is the number of row of the top part of the body section */
    public static final int C = 8;
    public static void main(String[] args) {
        drawCone();
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
        drawCone();

    }
    //Generate the cone for the rocket
    public static void drawCone() {
        for (int row = 1; row <= C *2 - 1; row++) {
            for (int j = C * 2 - 1; j >= row; j--) {
                System.out.print(" ");
            }
            for (int k =1; k <= row; k++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int k = 1; k <= row; k++) {
                System.out.print("\\");
            }
            System.out.println();

        }

    }
    //Generate the top part of the rocket
    public static void drawTop(){
        for (int row = 1; row <= C; row++){
            System.out.print("|");
            for (int i = 1; i < 3; i++){
                for (int dots = C - 1; dots>= row; dots--){
                    System.out.print(".");
                }
                for (int k = 1; k<= row; k++){
                    System.out.print("/\\");
                }
                for (int dots = C - 1; dots>= row; dots--){
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }

    }
    //Generate the bottom part of the rocket
    public static void drawBottom(){
        for (int row = C; row >= 1; row--){
            System.out.print("|");
            for (int i = 1; i< 3; i++){
                for (int dots = C - 1; dots>= row; dots--){
                    System.out.print(".");
                }
                for (int k = 1; k<= row; k++){
                    System.out.print("\\/");
                }
                for (int dots = C - 1; dots>= row; dots--){
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
    //Generate the line between the parts
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= C * 2; i++) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }
}
