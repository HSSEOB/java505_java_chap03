import java.util.Scanner;

public class Ch03_Quiz {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("문제1.");
        System.out.print("알파벳 한 문자를 입력하세요>>");

        String s= scanner.next();
        char c = s.charAt(0);

        for (int i = 'a'; i <= c; i++){
            System.out.print((char)i);
                for (int j = i+1 ; j<=c ; j++)
                    System.out.print((char)j);
            System.out.println();

        }
        System.out.println();
        System.out.println("문제2.");
        System.out.print("정수 10개 입력 >> ");

        int item[]= new int[10];

        for (int i=0; i<10; i++){
            item[i]= scanner.nextInt();
            if(item[i]%3==0){
                System.out.print(" "+item[i]+" ");
            }
        }


        System.out.println();
        System.out.println("문제6.");

        String eng[]={"student","love","java","happy","future"};
        String kor[]={"학생","사랑","자바","행복한","미래"};



        while(true){
            System.out.println("영어 단어를 입력하세요 >> ");
            String R = scanner.next();

            if(R.equals(eng[0])){
                System.out.println(kor[0]);
            } else if (R.equals(eng[1])) {
                System.out.println(kor[1]);
            }  else if (R.equals(eng[2])) {
                System.out.println(kor[2]);
            } else if (R.equals(eng[3])) {
                System.out.println(kor[3]);
            } else if (R.equals(eng[4])) {
                System.out.println(kor[4]);
            } else if (R.equals("exit")) {
                System.out.println("종료합니다....");
                break;
            } else System.out.println("그런 영어 단어가 없습니다");
        }

        System.out.println();
        System.out.println("보너스 문제1.");

        int intArray[][];
        intArray = new int[3][4];

        for (int i=0; i<3; i++)
            for(int j=0; j<4; j++)
                intArray[i][j] = (int)(Math.random()*10);

        for(int i=0; i<intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++)
                System.out.print(intArray[i][j] + ""+"  ");
            System.out.println();
        }
            int i= 0, sum=0;
            while (i<3){
                for (int j=0; j<intArray[i].length; j+=1){
                    sum += intArray[i][j];
                }
                i++;
            }
        System.out.println("합은 "+ sum);
        }
    }

