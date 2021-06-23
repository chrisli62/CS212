import javax.swing.*;

public class Project0 {

    public static void main(String[] args){
        String sentence;

        /* while loop to repeat program until the input "stop" is entered */
        while (true){
            int count_e = 0, count_E = 0;
            sentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");

            /* Checks if "stop" is an input. If yes, program exits */
            if(sentence == null || sentence.equalsIgnoreCase("stop")){
                System.exit(0);
            }

            /* Reads sentence and counts chars */
            for(int i = 0; i < sentence.length(); i++){

                /* If 'e' increase counter for lowercase 'e' by 1 */
                if(sentence.charAt(i) == 'e'){
                    count_e++;
                }

                /* If 'E' increase counter for uppercase 'E' by 1 */
                else if(sentence.charAt(i) == 'E'){
                    count_E++;
                }
            }

            /* Shows result on screen */
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + count_e + "\n" +
                "Number of upper case E's: " + count_E);
        }
    }
}