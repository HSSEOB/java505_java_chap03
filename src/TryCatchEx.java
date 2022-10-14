import java.io.*;
import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {

//        NullPointerException 발생

        try {
            String data = null;
            System.out.println(data.toString());

        }
        catch (Exception e){
            System.out.println("\n 'null'인 데이터에서는 toString() 메서드 사용 불가");
        }

        try{
            String data1 = args[10];
            String data2 = args[20];

            System.out.println("args[10] : " + data1);
            System.out.println("args[20] : " + data2);
        }

        catch (Exception e){
            System.out.println("배열의 최대 index 범위를 넘었습니다.");
        }

//        NumberFormatException 발생
        try{
            String data1 = "100";
            String data2 = "a100";

            int value1= Integer.parseInt(data1);
            int value2= Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);

        }
//        예외처리를 하나로 모두 처리하면 Exception을 사용
//        지정한 예외 상황만 처리하고자 하면 해당 예외클래스를 사용해야 함
        catch (NumberFormatException e){
            System.out.println("정수로 변환 할 수 없습니다.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
//            e.printStackTrace();
        }
//        하나의 try 구문에서 여러개의 지정된 예외처리를 하고자 하면 catch를 여러개 사용 할 수 있다.
        catch (NullPointerException e){
            System.out.println("\n 'null'인 데이터에서는 toString() 메서드 사용 불가");
        }

//        if - else 문 처럼 순차적으로 catch를 실행. Exception은 모든 예외 클래스의 최상위 클래스 이므로 여러개의 catch문 사용시 가장 마지막에
//        사용해야 됨. 안그럼 Exception에 모든 예외 상황이 다 걸려 그 아래 독립된 예외까지 진행이 안됨.
        catch (Exception e){
            System.out.println("알 수 없는 오류 발생");
        }
//        finally : try - catch 구문에서 예외가 발생하던말던 무조건 실행 되어야 하는 소스코드를 입력하는 부분
//        주로 외부 리소스 사용 시 해당 리소스를 해제하기 위한 목적으로 많이 사용.

        System.out.println("\n--------------------\n");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("문자를 입력해 주세요");
            String  data = sc.nextLine();

            if (data.equals("")){
                data=null;
            }

            System.out.println("입력된 내용: " + data.toString());
            System.out.println("정상 실행 완료 후 실행되는 부분");
        }
        catch (NumberFormatException e){
            System.out.println("예외 발생 시 실행되는 부분");
            System.out.println("예외 이유 : " + e.getMessage());
        }
        finally{
            System.out.println("무조건 실행되는 부분");
        }
        System.out.println("try-catch가 완료 된 후 실행되는 부분");

        System.out.println("\n-----------\n");

        File file =new File("test.txt");
        String str = "qwer";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("파일 쓰기 사용 시 오류가 발생했습니다.");
        }
        System.out.println("파일 쓰기 완료");

        System.out.println("\n----- 파일 읽기 시작 -----\n");

        FileReader fr = null;
        BufferedReader reader = null;

        try {
            fr = new FileReader("c:\\test.txt");
            reader = new BufferedReader(fr);

            String tmp;

            while ((tmp = reader.readLine()) != null){
                System.out.println("파일 내용 >> " + tmp);
            }

        }
        catch (IOException e){
            System.out.println("파일 사용 시 오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }

        finally {
            try {
                if (reader != null){
                    reader.close();
                    }
                if (fr != null){
                    fr.close();
                    }
                }
                catch (Exception e){

                    }

        }
        System.out.println("\n----- 파일 읽기 완료 -----\n");
    }
}
