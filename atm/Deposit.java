import java.util.Scanner;
class Deposit{
    Scanner sc=new Scanner(System.in);
    int amount=0;
    int deposit;
    public void intro(){
        System.out.println("this is deposit section");
    }
    public void deposit(){
        System.out.println("enter amount to deposit $: ");
        deposit=sc.nextInt();
        System.out.println("you have successfully deposited $: "+deposit);
        amount=amount+deposit;
        System.out.println("Available Amount is $: "+amount);

    }

}



   /* Scanner sc=new Scanner(System.in);
    int amount=0;
    int deposit;
    public void intro(){
        System.out.println("this is deposit section");
    }
    public void deposit(){
        System.out.println("enter amount to deposit: ");
        deposit=sc.nextInt();
        System.out.println("you have successfully deposited: "+deposit);
        amount=amount+deposit;
        System.out.println("Available Amount is: "+amount);

    }*/


