package com.niit.jap;

public class PizzaOrderTest {
    public void displayCustomerDetails(String name, String email, long phoneNo, String address) {
        System.out.println("Customer Details ");
        System.out.println("-----------------");
        System.out.println("Name of the Customer is       : " + name);
        System.out.println("Email of the Customer is      : " + email);
        System.out.println("Contact No of the Customer is : " + phoneNo);
        System.out.println("Address of the Customer is    : " + address);
        System.out.println("---------------------------------------------");
    }

    public void displayOrderDetails(int noOfPizza, int noOfGarlicBread, int noOfBeverages, int size, float totalPrice, float totalPrizeAfterDiscount) {
        System.out.println("Order Details");
        System.out.println("--------------");
        System.out.println("The number of pizzas ordered       : " + noOfPizza);
        System.out.println("The number of garlic bread ordered : " + noOfGarlicBread);
        System.out.println("The number of beverages ordered    : " + noOfBeverages);
        System.out.println("-------------------------------------------------");
        if (totalPrice == totalPrizeAfterDiscount) {
            System.out.println("The Total Bill Amount is : $" + totalPrice);
            System.out.println("No Discount on Bill");
        } else {
            System.out.println("The Total Bill Amount is      : $" + totalPrice);
            System.out.println("The Discounted Bill Amount is : $" + totalPrizeAfterDiscount);
        }

    }

    public void displayMenu() {
        System.out.println("Sl No   Item Category");
        System.out.println("-----------------------");
        System.out.println("1) Pizza");
        System.out.println("    Price of One Regular Pizza : $" + getPriceOfPizzaBasedOnSize(1));
        System.out.println("    Price of One Medium Pizza  : $" + getPriceOfPizzaBasedOnSize(2));
        System.out.println("    Price of One Large Pizza   : $" + getPriceOfPizzaBasedOnSize(3));
        System.out.println("2) Garlic Bread");
        System.out.println("    Price of One Garlic Bread  : $" + getPriceOfGarlicBread());
        System.out.println("3) Beverages");
        System.out.println("    Price of One Beverage      : $" + getPriceOfBeverage());
        System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages ");
    }

    public float calculatePriceOfPizza(int noOfPizza, float priceOfPizza) {
        if (priceOfPizza <= 0 || noOfPizza <= 0) {
            return -1;
        } else {
            return noOfPizza * priceOfPizza;
        }
    }

    public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBread) {
        if (priceOfGarlicBread <= 0 || noOfGarlicBread <= 0) {
            return -1;
        } else {
            return noOfGarlicBread * priceOfGarlicBread;
        }

    }

    public float calculatePriceOfBeverage(int noOfBeverages, float priceOfBeverages) {
        if (priceOfBeverages <= 0 || noOfBeverages <= 0) {
            return -1;
        } else {
            return noOfBeverages * priceOfBeverages;
        }

    }

    public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBreadPrice, float totalBeveragePrice) {
        return totalPizzaPrice + totalGarlicBreadPrice + totalBeveragePrice;
    }

    public float calculateDiscountAndReturnBillAmount(float totalBillAmount) {
        if (totalBillAmount >= 50) {
            return totalBillAmount - (totalBillAmount * 10 / 100);
        } else {
            return totalBillAmount;
        }
    }

    public float getPriceOfPizzaBasedOnSize(int size) {
        float priceOfPizza = 0;
        if (size == 1) {
            priceOfPizza = 9.99f;
        } else if (size == 2) {
            priceOfPizza = 11.99f;
        } else if (size == 3) {
            priceOfPizza = 13.99f;
        } else {
            System.out.println("Invalid size, Enter 1,2 or 3");
            priceOfPizza = 0;
        }
        return priceOfPizza;
    }

    public float getPriceOfGarlicBread() {
        return 5.99f;
    }

    public float getPriceOfBeverage() {
        return 1.99f;
    }
}
