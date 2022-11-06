import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    static Stack stack;


    public static void pushMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("You want to push in which stack ? ");
        System.out.println("1 - Push to stack 1 ");
        System.out.println("2 - Push to stack 2 ");
        int selectedStack=Integer.parseInt(s.next());
        Object EnteredData=0;
        System.out.println("Enter the data you want to add in stack");
        EnteredData = Integer.parseInt(s.next());
        if (selectedStack==1) {
            stack.push(1,EnteredData);
        }
        else if (selectedStack==2){
            stack.push(2,EnteredData);
        }
    }


    private static void popMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("You want to pop from which stack? ");
        System.out.println("1 - Stack 1 ");
        System.out.println("2 - Stack 2 ");
        int selectedStack=Integer.parseInt(s.next());
        System.out.println(stack.pop(selectedStack));
    }


    private static void topMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("You want to top from which stack? ");
        System.out.println("1 - Stack 1 ");
        System.out.println("2 - Stack 2 ");
        int selectedStack=Integer.parseInt(s.next());
        System.out.println(stack.top(selectedStack));
    }



    public static void  main(String[] args) {
        stack=new Stack(9);
        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("Enter the number of the act you want: ");
            System.out.println("1 - Push ");
            System.out.println("2 - Pop ");
            System.out.println("3 - Top");

            int selectedAct = Integer.parseInt(s.next());
            switch (selectedAct){
                case 1:pushMenu();break;
                case 2:popMenu();break;
                case 3:topMenu();break;
            }
        }


    }





}

