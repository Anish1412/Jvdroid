import java.util.Scanner;
class ATM_Transaction {
public static void main(String
int pin = 5678;
int balance = 5000;
Scanner sc = new
int a;
do {
System.out.println("ATM
System.out.println(" ");
System.out.println("1.
System.out.println("2.
System.out.println("3. Check
System.out.println("4. Exit");
System.out.println(" ");
System.out.println("Choose
a = sc.nextInt();
switch (a) {
case 1 :
System.out.println("Enter
pin = sc.nextInt();
if (pin == 5678) {
System.out.println("Balance : " +
System.out.println("Enter amount to
int withdraw =
if (withdraw <= 5000) {
balance = balance -
System.out.println("
System.out.println("*****You have withdrawn Rs." + withdraw + "
System.out.println("
} 
else
 {
System.out.println("Insufficient
System.out.println("
}
} 
else
 {
System.out.println(" ");
System.out.println("***** Incorrect
System.out.println(" ");
}
break;
case 2 :
System.out.println("Enter
pin = sc.nextInt();
if (pin == 5678) {
System.out.println("Balance : " +
System.out.println("Enter amount to
int deposit =
balance = balance +
System.out.println(" ");
System.out.println("*****You have
System.out.println(" ");
} else {
System.out.println(" ");
System.out.println("***** Incorrect
System.out.println(" ");
}
break;
case 3 :
System.out.println("Enter
pin = sc.nextInt();
if (pin == 5678) {
System.out.println(" ");
System.out.println("***************");
System.out.println("Balance : " +
System.out.println("***************");
System.out.println(" ");
} else {
System.out.println(" ");
System.out.println("***** Incorrect
System.out.println(" ");
}
break;
case 4 :
System.exit(0);
break;
default :
System.out.println(" ");
System.out.println("*****Invalid
System.out.println(" ");
break;
}
} while (a != 4);
}
}