# Grocery Store Billing System
A Java program that pretends to be a grocery store checkout. Made this to practice Java.

## What It Does
Basically simulates buying groceries. You tell it how much you spent and how many items you bought, it calculates discounts and freebies, you pick how to pay, and prints a bill.

## Features
- Premium vs Regular customers - Premium people get a lunch box, regular people get a water bottle. Both get a Bluetooth speaker if they spend enough (because why not)
- Discounts based on item count - The more stuff you buy, the more discount you get (1-5%)
- Free carry bag if you spend over ₹1000 (very generous tbh)
- Different payment options - Cash is free, cards and UPI have small charges because that's how it works irl
- Actual bill at the end so you can see where your money went

## How to Run
```bash
javac GroceryStore.java
java GroceryStore
```

Then just follow the prompts. It's pretty straightforward.

## What I Actually Learned
- if-else statements (lots of them)
- switch-case for the payment menu
- do-while loops for input validation
- Basic math in Java
- Interconnecting variables 

## Things That Could Be Better (honestly a lot of things, but it works)
- could add actual items instead of just a total
- GUI
- customer database 
- the freebies are a bit random