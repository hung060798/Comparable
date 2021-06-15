import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"blue", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle cir : circles) {
            System.out.println(cir);
        }

//        Arrays.sort(circles);
//
//        System.out.println("after-sorted:");
//        for(ComparableCircle cir: circles){
//            System.out.println(cir);
//        }
    }
}
