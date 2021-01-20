import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int k=2;
        System.out.print("请输入一个正整数：");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print(n+"=");
        while (n!=k){
            if (n%k==0){
                n=n/k;
                System.out.print(k+"*");
            }else {
                k++;
            }
        }
        System.out.println(n);
    }
    }

