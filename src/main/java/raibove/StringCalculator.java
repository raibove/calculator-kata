package raibove;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;
        int result;
        try{
            result = Integer.parseInt(numbers);
        }catch (NumberFormatException e){
            int[] numberArray = separateStringNumbers(numbers);
            System.out.println(numberArray[0]);
            result = numberArray[0];
        }
        return result;
    }

    private int[] separateStringNumbers(String numbers) {
        int[] numberArray = new int[2];
        numberArray[0] = numbers.charAt(0) - '0';
        numberArray[1] = numbers.charAt(2) - '0';

        return numberArray;
    }
}
