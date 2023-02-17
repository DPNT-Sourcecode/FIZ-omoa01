package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;
import com.sun.org.apache.xpath.internal.objects.XNull;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
        if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            answer += "fizz ";
        }
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            answer += "buzz ";
        }
        if(number % 3 == 0 && String.valueOf(number).contains("3")||number % 5 == 0 || String.valueOf(number).contains("5")){
            if(number%2==1)
                answer+="fake ";
            answer+="deluxe ";
        }
        if (answer.equals(""))
            return String.valueOf(number);
        else
            return answer.trim();
    }

}



