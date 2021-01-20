import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
//        计算字符串最后一个单词的长度，单词以空格隔开。
//        输入描述:
//        输入一行，代表要计算的字符串，非空，长度小于5000。
//
//        输出描述:
//        输出一个整数，表示输入字符串最后一个单词的长度。
//
//        示例1
//                输入
//        复制hello nowcoder
//        输出if else if
//        复制8
        Scanner input = new Scanner(System.in);
        String str = null;
        String str1 = null;
        int num = 0;  //标记字符串中最后一个空格的位置
        boolean is =false;  //标记是否找到字符串中含有空格的标识符
        do {
            System.out.print("请输入一个字符串:");
            str = input.next();
            System.out.println(str);
            if (str.length()<5000){  //判断输入的字符串是否长度小于5000
                for (int i =0;i<str.length();i++){
                    str1 =str.charAt(i)+"";
                    if (" ".equals(str1)){  //将输入的字符串从第一个位置一次一个一个取出判断是否为空
                        System.out.println(i);  //输出此字符为空时在数组中的位置
                        num = i;   //不跳出循环一直找到结束将最后一个找到的空格位置赋值
                        is=true;   //表示此字符串中含有空格并且已找到
                    }
                }
                if (is==false){  //判断输入的字符串中是否含有空格
                    System.out.println("您输入的字符串无空格");
                }
            }else {
                System.out.println("您输入的字符串长度必须小于5000");
            }
        }while (!is);
        System.out.println("该字符串中最后一个单词的长度为:"+(str.length()-1-num));


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("输入的字符串：");
//        String b = scanner.next();
//        String[] a ={b};
//        String B;
//        for (int i=a.length-1;i>=0;i--){
//            B =a[i].charAt(i)+"";
//            if (" ".equals(B)){
//                System.out.println(a.length-1-i);
//            }
//        }
//        int times = 0;
//        InputStream in = System.in;
//        char c = (char) in.read();
//        while (c != '\n') {
//            if (c == ' ') {
//
//                times = 0;
//            } else {
//                times += 1;
//            }
//            c = (char) in.read();
//        }
//        System.out.println(times);
    }
}
