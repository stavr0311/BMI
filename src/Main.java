public class Main {

    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        double bmi = calculate.massa(1.87,98);
               System.out.println(bmi);
    }
}
