import java.util.Scanner;

public class For {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n------for 문 -------\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println("\n------for 문2 -------\n");

        System.out.println("\n------while 문 -------\n");

        int count = 0;
        while (count < 10) {
            System.out.print(count);
            count++;
        }

        // 동일한 이름의 변수를 선언 할 수 없다.
        // 기존의 변수를 재활용 하려면 저장된 값을 초기화 하여 사용하여야 함.

        /*차이점 - 1. 초기화 변수와 초기화 변수 카운트를 for 문의 설정 부분에 입력.
         *         2. 초기화 변수가 for문의 설정 부분에 입력되면서 for 문의 지역변수로 사용되어
         *           같은 이름의 변수를 계속 사용 할 수 있음.
         *         3. 초기화 변수 카운트 항상 마지막에 동작*/

        // int count = 0; --> 동일한 이름의 변수를 선언 할 수 없다.


        System.out.println("\n문제1) 아래의 while 문을 for문으로 변환하라\n");
        int hit = 0;

        while (hit <= 10) {
            System.out.println("나무를 " + hit + "번 찍었습니다.");
            hit++;

            if (hit == 10) {
                System.out.println("나무가 넘어 갔습니다.");
            }
        }

        System.out.println("\nfor문 이용\n");

            for (int hit1 = 0; hit1 <= 10; hit1++) {
                System.out.println("나무를 " + hit1 + "번 찍었습니다.");
                if (hit1 == 10) {
                    System.out.println("나무가 넘어 갔습니다.");
                }
            }

        System.out.println("\n문제2) 원하는 단수의 구구단을 출력하는 프로그램을 for 문을 사용하여 출력하세요.\n");
            int M1 = scanner.nextInt();
            for (int M2=1; M2<=9; M2++){
                System.out.println(M1+"*"+M2+"="+(M1*M2));
            }



            System.out.println("\n문제3) for문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍을 하세요\n");

        // *
        // **
        // ***
        // ****
        // ******

        for (var s = 1; s<=5; s++  ){
            if (s==1){
                System.out.println("*");}
            if (s==2){
                System.out.println("**");}
            if (s==3){
                System.out.println("***");}
            if (s==4){
                System.out.println("****");}
            if (s==5){
                System.out.println("*****");}
            }

        var star= "";
        for (int i=0; i <5; i++){
            star +="*";
            System.out.println(star
            );
        }

        System.out.println("\n------중첩 for문--------\n");
        // for문 안에 for문이 존재하는 형태의 for문
        // 2차원 배열의 내용을 출력할 때 많이 사용한다.

        for (int i = 0; i<=9; i++){
            for(int j = 0; j<=5; j++){
                System.out.println("i의 값 : "+i+"\tj의 값: " +j);
            }
        }

        System.out.println("\n------중첩 for문을 이용한 구구단 출력--------\n");

        // 변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산술 대입 연산자를 사용 시 원하는 크기만큼 카운트
        // 값을 변경 할  수 있다.
        for (int i = 2; i<=9; i+=1){
            System.out.println("\n----------"+i+"단------------ \n");
            for(int j = 1; j<=9; j++){
                System.out.println(i +" * "+ j+" = "+(i*j));
            }
        }






        }
    }



