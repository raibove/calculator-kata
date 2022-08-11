package raibove;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;
        int result = 0;
        try{
            result = Integer.parseInt(numbers);
        }catch (NumberFormatException e){
            int[] numberArray = separateStringNumbers(numbers);
            for(int index = 0; index< numberArray.length; index++){
                result += numberArray[index];
            }
            //result = numberArray[0] + numberArray[1];
        }
        return result;
    }

    private int[] separateStringNumbers(String numbers) {
        int[] numberArray = new int[numbers.length()/2+1];
        for(int index = 0; index<numberArray.length; index++){
            numberArray[index] = numbers.charAt(index*2) - '0';
        }

        return numberArray;
    }
}
