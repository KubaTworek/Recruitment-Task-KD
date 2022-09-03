import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        int step = 1;
        while(perfectNumbers.size() < n){
            if(isPerfectNumber(step)) perfectNumbers.add(step);
            step++;
        }
        return perfectNumbers;
    }

    private static boolean isPerfectNumber(int number) {
        List<Integer> dividers = new ArrayList<>();
        for(int i = 1; i<number; i++){
            if(number % i == 0) dividers.add(i);
        }
        return sumAllDividers(dividers) == number;
    }

    private static int sumAllDividers(List<Integer> dividers){
        int sum = 0;
        for(Integer divider: dividers){
            sum += divider;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }
}
