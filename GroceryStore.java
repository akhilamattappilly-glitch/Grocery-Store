import java.util.Scanner;

class GroceryStore
{ public static void main(String[] args)
  { Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total amount spent : ");
    double total_amount = sc.nextDouble();
    double item_discount=0;
    double payment_charges=0;
    double final_amount;
    int payment;
    double sub_total;
    
    if(total_amount>=1000)
     {  System.out.println("Customer has unlocked free carry bag!");
     }
     System.out.println(" ");
     System.out.println("Premium Customer/Regular Customer");
     System.out.println("Enter 1 for Premium Customer.");
     System.out.println("Press any other key if not. ");
     int cust_type = sc.nextInt();
     System.out.println(" ");
 
     if(cust_type==1)
     {   
        System.out.println("Premium Customers can avail 1 Lunch Box for free!");
        if(total_amount>5000)
        {
            System.out.println(" ");
            System.out.println("Premium Customers who have spend above 5000/- can also avail free Bluetooth Speaker.");
        }
     }
     else
     {  
        System.out.println("Regular Customers can avail 1 water bottle for free!");
        if(total_amount>10000)
        { 
            System.out.println(" ");
            System.out.println("Regular Customers who have spend above 10000/- can also avail free Bluetooth Speaker.");
        }
     }



     System.out.println(" ");

     System.out.println("Enter the number of grocery items : ");
     int item_no = sc.nextInt();
  
     if(item_no>50)
     {  System.out.println("Customer is eligible for 5% discount!");
        item_discount = total_amount*0.05;
     }
     else if(item_no>40)
     {  System.out.println("Customer is eligible for 4% discount!");
	item_discount = (total_amount*0.04);  
     } 
     else if(item_no>30)
     {   System.out.println("Customer is eligible for 3% discount!");
         item_discount = (total_amount*0.03);
     }
     else if(item_no>20)
     {   System.out.println("Customer is eligible for 2% discount!");
         item_discount = (total_amount*0.02);
     }
     else if(item_no>10)
     {  System.out.println("Customer is eligible for 1% discount!");
        item_discount = (total_amount*0.01);
     }    

     sub_total=total_amount-item_discount;
     boolean exit = false;
     System.out.println(" ");

    do
    {              

    System.out.println("Choose method of payment : ");
    System.out.println("1. CASH");
    System.out.println("2. DEBIT CARD");
    System.out.println("3. CREDIT CARD");
    System.out.println("4. UPI");
    System.out.println("5. Cancel Bill");
    payment = sc.nextInt();
   			 	 	 	 
    switch (payment)
    {
         case 1 : System.out.println("Payment Method : CASH");
		  exit = true;
                  break;
         case 2 : System.out.println("Payment Method : DEBIT CARD.");
		  System.out.println("Additional payment processing charge of 0.5% applied.");
		  payment_charges=sub_total*0.005;
		  exit = true;
                  break;
         case 3 : System.out.println("Payment Method : CREDIT CARD.");
		  System.out.println("Additional payment processing charge of 2% applied.");
		  payment_charges=sub_total*0.02;
		  exit = true;
		  break;
         case 4 : System.out.println("Payment Method : UPI.");
		  System.out.println("Additional payment processing charge of 1% applied.");
		  payment_charges=sub_total*0.01;
		  exit = true;
                  break;
         case 5 : System.out.println("Billing Cancelled.");
		  exit = true;
		  break;
        default : System.out.println("Invalid choice of payment method!");
		  System.out.println("Try Again.");
                  System.out.println(" ");
    }  
    }  while(!exit);

    System.out.println(" ");

    final_amount=sub_total+payment_charges;
    if(1<=payment && payment<=4)
    {
       System.out.println("Bill Details");	
       System.out.println("ITEM TOTAL : " +total_amount);
       System.out.println("Total Discount : -" +item_discount);
       System.out.println("Payment Charges : +" +payment_charges);
       System.out.println("AMOUNT PAID : " +final_amount);	
       System.out.println(" ");
       System.out.println("Thank you for shopping with us !");
    }
  }
}
       


















