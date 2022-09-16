import java.util.Scanner;

public class Do_While {
    public static void  main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n----------do while 문--------\n");
        //do-while: 기본적으로 while 문과 동일한 반복문. 최소 1번은 실행 되는 while문이다.
        //          반복조건을 후순위로 확인.



        System.out.println("\n----------일반 while 문 예시--------\n");
        int c1 = 10;

        while(c1<5) {
            System.out.println(c1);
            c1++;
        }


        System.out.println("\n----------do while 문 예시--------\n");
        int c2 = 10;

        do{
            System.out.println(c2);
            c2++;
        } while (c2<5);


        }
    }

