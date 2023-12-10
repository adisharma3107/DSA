public class FunctionalInterface {
    public static void main(String[] args) {

         Multiply m = (x,y) -> {
             return x*y;
         };

//         m.multiply(3, 2);

        System.out.println(m.multiply(3, 2));
    }
}
