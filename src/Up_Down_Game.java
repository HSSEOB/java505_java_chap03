import java.util.Random;
import java.util.Scanner;

public class Up_Down_Game {
    public static void main(String[] args) {

        System.out.println("\n-----Open Challenge-----\n");

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();


        while(true){

            int count = 1;
            int k= r.nextInt(100);
            int min=0;
            int max=99;
            System.out.println("Up&Down Game입니다. 숨겨진 수를 맞추어 보세요.");

            for(count=1;;count+=1){
                System.out.println(min+" - "+max);
                System.out.print(count+" >> ");
                int num = scanner.nextInt();

                if (num>k){
                System.out.println("더 낮게");
                max=num;
                } else if (num<k) {
                System.out.println("더 높게");
                min=num;
                } else if (num==k) {
                    System.out.println("맞았습니다.");
                    System.out.println("다시 하시겠습니까? (y/n) >>");

                    if(scanner.next().equals("n")){
                        return;
                    } else if (scanner.next().equals("y")) {
                        break;
                    }else System.out.println("잘 못 입력하셨습니다.");
                }

            }
        }
    }
}




