package review;

public class Q5 {

        public static void main(String[] args) {
            boolean password= false;
            boolean userName= true;

            if(userName ){
                System.out.println("Correct Username");
                if(password){
                    System.out.println("Correct Password");
                    System.out.println("Welcome");}
                    else
                {
                    System.out.println("Wrong Password");}

            }
            else
                System.out.println("Invalid entry");
        }

}
