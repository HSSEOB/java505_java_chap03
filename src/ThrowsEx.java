public class ThrowsEx {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        try {
            cal.sum("10a","20");
            cal.sub("10a","20");

        }
        catch (Exception e){
            System.out.println("오류가 발생 했습니다.");
        }

        }
}
