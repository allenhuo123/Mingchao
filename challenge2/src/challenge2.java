public class challenge2 {
    public static void first(){
        System.out.println("*");
    }
    public static void second(){
        first();
        first();
        first();
        first();
        first();
    }
    public static void third(){
        second();
        second();
        second();
        second();
        second();
    }
    public static void main(String[] args){
        third();
        third();
        third();
        third();
        third();
    }
}
