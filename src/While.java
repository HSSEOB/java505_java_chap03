// while 문 : 가장 기본적인 반복문
// while 문 실행 시 while문 밖에 초기화 변수를 선언하고, while 안에서 초기화 변수의 카운트가 필요함


import java.util.Scanner;

public class While {
    public static void  main(String [] args){


        System.out.println("\n----------while문--------\n");

        int hit = 0;

        while(hit<10) {
            System.out.println("나무를 "+hit+"번 찍었습니다.");
            hit++;

            if(hit==10){
                System.out.println("나무가 넘어 갔습니다.");
            }
        }

        //while 사용 시 주의점
        //1. 초기화 변수의 카운트 부분의 위치에 따라 결과가 달라짐
        //1-1. 프로그래밍이 익숙하지 않을 경우 변수의 카운트 부분을 고정해서 사용하는 것이 좋다
        //2. while 문을 탈출 할 수 있는 조건을 만드시 명시해야 함.(무한루프)
        //2-1.break 문을 사용하여 탈출

        System.out.println("\n----------while문 사용 시 주의점--------\n");



        //문제2) while문을 사용하여 1~10까지 화면에 출력하는 프로그램을 작성하라.
        System.out.println("\n--------while문을 사용하여 1~10까지 화면에 출력하는 프로그램을 작성하라.----------\n");

        int n = 1;

        while(n<=10) {
            System.out.println(n);
            n++;

        }




        //문제3) while문을 사용하여 1~10까지의 총합을 구하는 프로그램을 작성하라.
                System.out.println("\n--------while문을 사용하여 1~10까지의 총합을 구하는 프로그램을 작성하라.----------\n");


                int a = 1;
                int count = 0;

                while(a<=10){
                        count = a + count;
                        System.out.println("count : "+ a + "\ttotal : " + count);
                        a++;
                    }

        System.out.println("\n------------책 예제 -------------------\n");

                Scanner scanner = new Scanner(System.in);
                count = 0;

                double sum = 0.0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

        //while문의 조건시에 탈출 조건까지 함께 지정
        // 키보드 입력을 통한 데이터가 0이 아닐경우 아래의 while문 실행. 0이면 while문 종료.
        while ((n=scanner.nextInt()) !=0) {
            sum = sum + n;
            count++;
        }
        System.out.println("수의 개수는 "+count+"개이며,");
        //총합이 저장된 변수 sum은 double 형
        //입력된 데이터의 수가 저장된 변수 count는 int형
        //double형과 int형의 연산이 수행되면 자동형변환이 발생하여 double형으로 데이터가 만들어 짐.
        System.out.println("평균은 "+sum/count+"입니다.");

        System.out.println("while문을 사용하여 지정한 단수의 구구단을 출력");
        //출력형태 : 5*1=5

        int M1 = scanner.nextInt();
        int M2 = 1;


        while (M2<=9){
            int M3 = M1*M2;
            System.out.println(M1+"*"+M2+"="+M3);
            M2++;

        }

        //다중 while문 : 하나의 while 문 안에 또 다른 while 문이 있는 형태의 while 문을 뜻한다.
        System.out.println("\n------다중 while문-------\n");

        int i=0;
        int j=0;
        while (i<5) {
            while (j<5){
                System.out.println("i : "+i+"\tj : "+j);
                j++;
            }
            i++;
            j = 0;
        }

        //다중 while문 : 하나의 while 문 안에 또 다른 while 문이 있는 형태의 while 문을 뜻한다.
        System.out.println("\n------다중 while문-------\n");

        i= 0;
        while (i<5){
            j = 0;
            while (j<5) {
            System.out.println("i : "+i+"\tj : "+j);
        j++;
        }
            i++;
        }
        System.out.println("\n문제5) while문을 사용하여 2~9단 까지의 구구단을 모두 출력하는 프로그램을 작성하세요\n");
        //다중 while 문 사용
        M1 = 2;

        while (M1<=9){
            System.out.println("---------"+M1+"단---------");
            M2=1;
            while(M2<=9){
                System.out.println(M1+"*"+M2+"="+(M1*M2));
                M2++;
            }
            M1++;
        }
        scanner.close();
                }
            }




