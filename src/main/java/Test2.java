import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入的字符串:");
//        String a = scanner.next();
//        if (a.length() < 5000) {
//            for (int i = a.length() - 1; i >= 0; i--) {
//                char str = a.charAt(i);
//                System.out.print(str);
//            }
//        } else {
//            System.out.println("输入的长度小于不能小于5000");
//        }


//        System.out.println("100到200之间的素数有：");
//        int i = 0;
//        int j = 0;//被整除的次数
//        for (i = 100; i <= 200; i++) {
//            for (j = 2; j < i; j++) {
//                if (i % j == 0)
//                    break;
//            }
//            if (i == j)
//                System.out.println("" + i + "是素数");
//        }


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("输入的字符串：");
//        String num=scanner.nextLine();
//        if (num.length()<5000){
//            for (int i=num.length()-1;i>=0;i--){
//                String zifu=num.charAt(i)+"";
//                if (zifu.equals(" ")){
//                    System.out.println("字符串前面的长度"+i);
//                    System.out.println("字符串空格后面的长度"+(num.length()-1-i));
//                }
//            }
//        }else {
//            System.out.println("输入的长度小于不能小于5000");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("第一行输入一个由字母和数字以及空格组成的字符串:");
        String str1 = scanner.nextLine();
        System.out.print("第二行输入一个字母:");
        int j = 0;
        int count=0;
        char str2 = scanner.next().charAt(j);
        for (int i = 0; i < str1.length() - 1; i++) {
            char num1 = str1.charAt(i);
            if (num1==str2){
                count++;
            }
        }   System.out.println(count);
    }
}

