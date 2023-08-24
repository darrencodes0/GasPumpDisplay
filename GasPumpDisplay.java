import java.util.ArrayList;
import java.util.List;

public class GasPumpDisplay{

    public GasPumpDisplay(int numOfPosition) {

        number = numOfPosition;

        for (int i = 0; i < numOfPosition; i++) {
            currentNumber += "0";
        }

        System.out.println("Display starts from: " + currentNumber);

        while (hasMoreElements()) {
            display.add(Integer.parseInt(nextElement()));
        }
    }

    public String nextElement(){

        int numChange;
        String firstNum = "";

        for(int j = number - 1; j >= 0 ; j--){
            if(Integer.parseInt(currentNumber.charAt(j) + "") < MaxDigit){
                numChange = Integer.parseInt(currentNumber.charAt(j) + "") + 1;
                currentNumber = currentNumber.substring(0,j) + numChange + firstNum;
                return currentNumber;
            }
            firstNum += "0";
        }
        return currentNumber;
    }

    public Boolean hasMoreElements(){
        for(int k = number - 1; k >= 0; k--){
            if(Integer.parseInt(currentNumber.charAt(k) + "") < MaxDigit){
                return true;
            }
        }
        return false ;
    }

    public List<Integer> getDisplay(){
        return display;
    }

    private final List<Integer> display = new ArrayList<>();
    private final int MaxDigit = 4;
    private final int number;
    private String currentNumber = "";

}
