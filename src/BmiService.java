public class BmiService {

    public int massa(double metr, double kg) {

        double result = kg / (metr * metr);

        return (int) result;
    }
}