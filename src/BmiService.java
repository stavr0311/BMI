public class BmiService {

    public int bmi(int roost, int ves) {


        int result = ves / (roost * roost);

        return result;
    }
}