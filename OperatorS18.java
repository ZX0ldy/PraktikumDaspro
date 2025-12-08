public class OperatorS18 {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("x++" + x++);
        System.out.println("after Evaluation, x = " + x);
        x = 10;

        System.out.println("++x =" + ++x);
        System.out.println("after Evaluation, x = " + x);

        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("The result of x ^ y is " + z);
        z %= 2;
        System.out.println("Final result = " + z);

    }

}
