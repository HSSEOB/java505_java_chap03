import java.util.Scanner;

public class Continue_Break {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //break : 반복문 내에서 break를 만나면 해당 반복문 즉시 중단
        System.out.println("\n-----------break-----------\n");
        for(int i =0; i<10; i+=1){
            if (i==5){
                break;
            }
            System.out.println("현재 i의 값 : "+i);
        }


        //continue : 반복문 내에서 continue를 만나면 해당 루프만 중단하고 다음 루프로 넘어 감
        System.out.println("\n-----------continue-----------\n");
        for(int i = 0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println("while문 사용 시 현재 i의 값 : "+i);
        }

        System.out.println("\n문제4. 구구단 전체를 출력하는 프로그램을 작성하라\n ");
        System.out.println("\n조건1- 사용자 입력으로 2~9단 까지의 숫자 하나를 입력 받기\n ");
        System.out.println("\n조건2- 사용자 입력으로 입력 받은 단수에 break와 continue를 사용하는 구구단 작성\n ");

        System.out.println("숫자를 입력해 주세요 : ");

        int num = scanner.nextInt();

        for (int i = 2; i<=9; i+=1){
            if (i == num) continue;
            System.out.println("\n----------"+i+"단------------ \n");
            for(int j = 1; j<=9; j++){
                System.out.println(i +" * "+ j+" = "+(i*j));
            }
        }

        System.out.println("숫자를 입력해 주세요 : ");



        for (int i = 2; i<=9; i+=1){
            if (i == num) break;
            System.out.println("\n----------"+i+"단------------ \n");
            for(int j = 1; j<=9; j++){
                System.out.println(i +" * "+ j+" = "+(i*j));
            }
        }

    }
}
