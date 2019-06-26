package chap2;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        System.out.println("입력해라");
        String input=scanf.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("입력 내용 : "+input);
        System.out.printf("num=%d%n",num);

    }
}
