import java.util.Scanner;

public class FindMax {
    static Scanner sc = new Scanner(System.in);

    public <E extends Comparable> E findMax(E e1, E e2, E e3){
        if(e1.compareTo(e2) > 0  && e1.compareTo(e3) > 0)
            return e1;
        else if(e2.compareTo(e3) > 0)
            return e2;
        else return e3;
    }

//    public float findMaxFloat(Float num4, Float num5, Float num6){
//        if(num4.compareTo(num5) > 0  && num4.compareTo(num6) > 0)
//            return num4;
//        else if(num5.compareTo(num6) > 0)
//            return num5;
//        else return num6;
//    }

//    public String findMaxString(String str1, String str2, String str3){
//        if(str1.compareTo(str2) > 0  && str1.compareTo(str2) > 0)
//            return str1;
//        else if(str2.compareTo(str3) > 0)
//            return str2;
//        else return str3;
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Program");
        FindMax findMax = new FindMax();

        System.out.println("Enter the three numbers : ");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        System.out.println("Max Integer : " + findMax.findMax(num1, num2, num3));

        System.out.println("Enter the three numbers : ");
        Float num4 = sc.nextFloat();
        Float num5 = sc.nextFloat();
        Float num6 = sc.nextFloat();
        System.out.println("Max Float value : " + findMax.findMax(num4, num5, num6));

        System.out.println("Enter the three strings : ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        System.out.println("Max String value : " + findMax.findMax(str1, str2, str3));

    }
}
