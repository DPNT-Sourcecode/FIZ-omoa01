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
        if (number >= 10) {
            boolean valid=true;
            for(int i=0;i< String.valueOf(number).length()&&valid==true;i++)
            {
                if(String.valueOf(number).charAt(i)!=String.valueOf(number).charAt(0))
                    valid=false;
            }
            if(valid==true)
            answer += "deluxe ";
        }
        if (answer.equals(""))
            return String.valueOf(number);
        else
            return answer.trim();
    }

}






