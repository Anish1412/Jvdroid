import java.util.Scanner;
class ATM_Transaction {
public static void main(Stringargs[]) {
int pin = 5678;
int balance = 5000;
Scanner sc = newScanner(System.in);
int a;
do {
System.out.println("ATMMachine");
System.out.println(" ");
System.out.println("1.Withdraw Money");
System.out.println("2.Deposit Money");
System.out.println("3. CheckBalance");
System.out.println("4. Exit");
System.out.println(" ");
System.out.println("Choosethe function = ");
a = sc.nextInt();
switch (a) {
case 1 :
System.out.println("EnterPin : ");
pin = sc.nextInt();
if (pin == 5678) {
System.out.println("Balance : " +balance);
System.out.println("Enter amount tobe withdrawn : ");
int withdraw =sc.nextInt();
if (withdraw <= 5000) {
balance = balance -withdraw;
System.out.println("");
System.out.println("*****You have withdrawn Rs." + withdraw + "successfully!!*****");
System.out.println("");
} 
else
 {
System.out.println("InsufficientBalance");
System.out.println("");
}
} 
else
 {
System.out.println(" ");
System.out.println("***** Incorrectpin!!*****");
System.out.println(" ");
}
break;
case 2 :
System.out.println("EnterPin : ");
pin = sc.nextInt();
if (pin == 5678) {
System.out.println("Balance : " +balance);
System.out.println("Enter amount tobe deposited : ");
int deposit =sc.nextInt();
balance = balance +deposit;
System.out.println(" ");
System.out.println("*****You havedeposited Rs." + deposit + "successfully!!*****");
System.out.println(" ");
} else {
System.out.println(" ");
System.out.println("***** Incorrectpin!!*****");
System.out.println(" ");
}
break;
case 3 :
System.out.println("EnterPin : ");
pin = sc.nextInt();
if (pin == 5678) {
System.out.println(" ");
System.out.println("***************");
System.out.println("Balance : " +balance);
System.out.println("***************");
System.out.println(" ");
} else {
System.out.println(" ");
System.out.println("***** Incorrectpin!!*****");
System.out.println(" ");
}
break;
case 4 :
System.exit(0);
break;
default :
System.out.println(" ");
System.out.println("*****InvalidChoice*****");
System.out.println(" ");
break;
}
} while (a != 4);
}
}