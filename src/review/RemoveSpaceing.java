package review;

public class RemoveSpaceing {

        public static void main(String[] args) {
            removeSpacesVoid("Today we are Java warriors");
            System.out.println();
            System.out.println(removeSpaces("Today we are Java warriors"));
        }

        public static void removeSpacesVoid(String sentence) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) != ' ') {
                    System.out.print(sentence.charAt(i));
                }

            }
        }

        public static String removeSpaces(String sentence) {
            String result = "";
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) != ' ')
                    result += sentence.charAt(i);
                else {
                    result += '-';
                }
            }
            return result;
        }

    }

