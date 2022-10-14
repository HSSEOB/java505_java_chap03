public class Calculator {
    public void sum(String  a, String  b){
        try {
            int result = 0;
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = num1 + num2;
            System.out.println("두 수의 합은 " +result+ "입니다.");
        }
        catch (Exception e){
            System.out.println("sum 함수에서 연산 오류가 발생했습니다.");
        }
    }

//    throws : 해당 매서드를 사용하는 곳에서 예외를 처리하도록 예외 처리 부분을 던짐.
    public void sub(String a, String b) throws Exception{
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int result = num1 - num2;
        System.out.println("두 수의 차는 " + result + "입니다.");
    }
}
