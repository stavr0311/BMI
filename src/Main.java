public class Main {

    public static void main(String[] args) {
        BmiService calculate = new BmiService();
       int index = calculate.bmi (2,100);
               System.out.println(index);
    }
}
