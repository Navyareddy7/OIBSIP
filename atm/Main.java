import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

class User{
    HashMap<Integer,Integer>userdata=new HashMap<>();
    //**UserData**
    public User(){
        userdata.put(9347,9696);
        userdata.put(7416,9390);
        userdata.put(9440,1234);
        userdata.put(9502,2354);
        userdata.put(9381,9849);

    }
    // Function to check whether the entered id is present or not
    public boolean check1(int id){
        return userdata.containsKey(id);
    }
    public boolean check2(int id,int pin){
        return Objects.equals(userdata.get(id),pin);
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>dp=new ArrayList<Integer>();
        ArrayList<Integer>w=new ArrayList<Integer>();
        ArrayList<Integer>t=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        User obj=new User();
        Deposit obj1=new Deposit();
        Withdraw obj2=new Withdraw();
        TransactionHistory obj3=new TransactionHistory();
        Exit obj4=new Exit();
        Transfer obj5=new Transfer();
        int userid,userpin=0 ;
        int withdrawl=0;
        int count=0;
        int choice;
        System.out.println("^^^WELCOME TO XYZ ATM^^^");
        System.out.println();
        System.out.println("enter Your Id: ");
        userid=sc.nextInt();
        if(obj.check1(userid)==true){
            System.out.println("Enter Your PIN: ");
            userpin=sc.nextInt();

        }
        else{
            System.out.println("No user is present with the entered id... ");
            System.exit(0);
        }
        if(obj.check2(userid,userpin)==true){
            while(true){
                System.out.println();
                System.out.println("1.Deposit\n2.Withdraw\n3.Transfer\n4.TransactionHistory\n5.Exit");
                System.out.println();
                System.out.println("enter your choice: ");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                        obj1.intro();
                        obj1.deposit();
                        dp.add(obj1.deposit);
                        System.out.println();
                        break;
                    case 2:
                        count++;
                        System.out.println("Enter Amount to withdraw $: ");
                        withdrawl=sc.nextInt();
                        if(withdrawl<=(obj1.amount)){
                            obj2.withdraw(withdrawl);
                            obj1.amount-=withdrawl;
                            System.out.println("Available balance is $: "+(obj1.amount));
                            w.add(withdrawl);
                        }
                        else{
                            System.out.println("Insufficient balance :(");
                            System.out.println("Availabe balance is $:"+obj1.amount);
                        }
                        break;


                    case 4:
                        obj3.display();
                        for(int i:dp){
                            System.out.println("your account has been deposited with $: "+i);
                        }
                        if(count!=0) {
                            for (int i : w) {
                                System.out.println("An amount of $: " + withdrawl + " has been withdrawn");

                            }
                        }
                        for(int i:t){
                            System.out.println("An amount of $:"+i+" has been transferred");
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Enter bank id: ");
                        obj5.id=sc.nextInt();
                        System.out.println("Enter amount to transfer $:");
                        obj5.amount=sc.nextInt();

                        if(obj5.amount<=obj1.amount){
                            obj5.transfer();
                            obj1.amount-=obj5.amount;
                            t.add(obj5.amount);
                        }
                        else{
                            System.out.println("You don't have enough money");
                        }
                        break;
                    case 5:
                        obj4.exit();
                }

            }

        }
        else{
            System.out.println("Invalid login credentials");
        }
    }
}
