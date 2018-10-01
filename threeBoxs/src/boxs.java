/*
        Mingchao Huo
        AP CS A
        Period 1
        September 27, 2018
        Practice Project - 3Boxs
        */
public class boxs {
    public static void Box1() {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Box2() {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Box3() {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Box1();
        Box2();
        Box3();
        }
    }
