import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Topics obj1 = new Topics();

        System.out.println("CHOOSE YOUR TOPIC : ");
        System.out.println("1) GK");
        System.out.println("2) COSMIC");
        System.out.println("3) LITERATURE");
        System.out.println("4) INDIAN CONSTITUTION");
        System.out.println("5) HISTORY");
        boolean run=false;
        do{
        System.out.print("Enter the topic number : ");

        int choose = scan.nextInt();
        scan.nextLine();

        switch(choose){
            case 1:
                obj1.GK();
                break;
            case 2:
                obj1.COSMIC();
                break;
            case 3:
                obj1.LITERATURE();
                break;
            case 4:
                obj1.INDIAN_CONSTITUTION();
                break;
            case 5:
                obj1.HISTORY();
                break;
            default:
                System.out.println(" < Please select a number between 1 to 5 > ");
                run=true;
                break;
        }
    }while(run);

        scan.close();
    }
}