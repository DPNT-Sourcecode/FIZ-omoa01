package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;
import com.sun.org.apache.xpath.internal.objects.XNull;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = null;
        if (number % 3 == 0) {
            answer += "fizz ";
        }
        if (number % 5 == 0) {
            answer += "buzz ";
        }

        if (answer == null)
            return String.valueOf(number);
        else
            return answer.trim();
    }

}


