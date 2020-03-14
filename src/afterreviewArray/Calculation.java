package afterreviewArray;
public class Calculation {
    public static void main(String[] args) {
        doCalculation(5,8,"add");
    }
    public static void doCalculation(int firstNumber,int secondNumber,String operation){
        if(operation.equalsIgnoreCase("add")){
            System.out.println(firstNumber+secondNumber);
        }
        else if(operation.equalsIgnoreCase("subst")){
            System.out.println(firstNumber-secondNumber);
        }
        else if (operation.equalsIgnoreCase("multip")){
            System.out.println(firstNumber*secondNumber);
        }
        else if(operation.equalsIgnoreCase("divide")){
            System.out.println(firstNumber/secondNumber);
        }
        else {
            System.out.println("Wrong operation");
        }
    }
}
