package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        int a = 15;
        int b = 6;
        int c = 4;

        first = a;
        second = b;
        third = c;

        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;



        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
