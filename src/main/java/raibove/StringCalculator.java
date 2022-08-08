package raibove;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;

        return Integer.parseInt(numbers);
    }
}
