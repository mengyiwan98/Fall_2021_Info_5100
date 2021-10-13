package Question2;

public class main {

    public static void main(String[] args) {
        sum sum = new sum();
        System.out.println(sum.add(2, 3));
        System.out.println(sum.add(4, 9, 12));
        System.out.println(sum.add(4, 5.0));
        System.out.println(sum.add(15.5, 5));
        System.out.println(sum.add(1.0, 6.4));
    }
}
