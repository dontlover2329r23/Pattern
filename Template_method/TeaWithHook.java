package Template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class TeaWithHook extends CaffeineBeverageWithHook {
        public void brew() {
            System.out.println("Dripping Tea through filter");
        }
        public void addCondiments() {
            System.out.println("Adding Sugar");
        }
        public boolean customerWantsCondiments() {
            String answer = getUserInput();
            if (answer.toLowerCase().startsWith("y")) {
                return true;
            } else {
                return false;
            }
        }
        private String getUserInput() {
            String answer = null;
            System.out.print("Would you like   sugar with your tea (y/n)? ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                answer = in.readLine();
            } catch (IOException ioe) {
                System.err.println("IO error trying to read your answer");
            }
            if (answer == null) {
                return "no";
            }
            return answer;
        }
    }

