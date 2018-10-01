public class Rocketship {
    public static final int C = 5;
    public static void main(String[] args) {
        drawCone();
        drawLine();

    }
    //Generate the cone for the rocket
    public static void drawCone(){
        for (int row = 1; row<=C; row++){
            for (int j = 1; j<=row; j++){
                System.out.print(" ");
                for (int k = C; k>=1; k--){
                    System.out.print("//");
                }
                System.out.println();
            }
        }

    }
    //Generate the top part of the rocket
    public static void drawTop(){

    }
    //Generate the bottom part of the rocket
    public static void drawBottom(){

    }
    //Generate the line between the parts
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 5; i++) {
            System.out.print("=*");
        }
        System.out.print("+");
    }
}
