public class drawBox {
    public static void drawHorizontal(){
        System.out.println("+---------+");
    }
    public static void drawVertical(){
        System.out.println("|         |");
    }
    public static void main(String[] args){
        drawBox();
        drawBox();
        drawBox();
    }
    public static void drawBox(){
        System.out.println();
        drawHorizontal();
        drawVertical();
        drawVertical();
        drawHorizontal();
    }
}
