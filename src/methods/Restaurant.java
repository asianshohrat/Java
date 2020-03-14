package methods;

public class Restaurant {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        System.out.println("\t\tMenu\n ______________________");
        System.out.println("\tSOUPS\n --------------------");
        System.out.println("Lentil \t\t$3.99");
        System.out.println("Tomato \t\t$4.99");
        System.out.println("Fish \t\t$8.99");
        System.out.println("\tMEALS\n -----------------");
        System.out.println("Rice \t\t$3.99");
        System.out.println("Chicken \t$5.99");
        System.out.println("Beef \t\t$7.99");
        System.out.println("\tSALADS\n-----------");
        System.out.println("Ceaser \t\t$2.99");
        System.out.println("Waldorf \t$3.99");

    }

    public static void printReceipt(int soup,int meal,int salad){
        double total=0;
        System.out.println("\t\t---RECEIPT---");
        if(soup==1){
            System.out.println("Lentil : \t\t$3.99");
            total+=3.99;
        }
        else if(soup==2){
            System.out.println("Tomato : \t\t$4.99");
            total+=4.99;
        }
        else {
            System.out.println("Fish : \t\t$8.99");
            total+=8.99;
        }

        if(meal==1){
            System.out.println("Rice : \t\t$3.99");
            total+=3.99;
        }
        else if(meal==2){
            System.out.println("Chicken : \t\t$5.99");
            total+=5.99;
        }
        else{
            System.out.println("Beef : \t\t\t$7.99");
            total+=7.99;
        }
        if(salad==1){
            System.out.println("Ceaser : \t\t$2.99");
            total+=2.99;
        }
        else{
            System.out.println("Waldorf : \t\t$3.99");
            total+=3.99;
        }
        System.out.println("_________________\n"+"\t\t\t\t$"+total);
    }
}

