package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;
import com.sun.org.apache.xpath.internal.objects.XNull;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
       if(number%3==0)
       {
           answer+="fizz";
           if(String.valueOf(number).contains("3"))
           {
               if()
           }
       }

        if (answer.equals(""))
            return String.valueOf(number);
        else
            return answer.trim();
    }

}


