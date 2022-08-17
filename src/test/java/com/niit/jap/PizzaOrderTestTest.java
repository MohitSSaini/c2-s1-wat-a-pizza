package com.niit.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaOrderTestTest {

    PizzaOrderTest pizzaOrderTest;

    @BeforeEach
    void setUp() {
        pizzaOrderTest = new PizzaOrderTest();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenNumberOfPizzaAndPriceOfPizzaCalculateTotalPriceSucess() {
        //arrange
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        //act
        float expectedOutPut = 64.95f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfPizza(noOfPizza, priceOfPizza);

        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void givenNumberOfGarlicBreadAndPriceOfGarlicCalculatorTotalPriceSuccess() {
        //arrange
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        //act
        float expectedOutPut = 17.97f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void givenNumberNoOfBeveragesAndPriceOfBeveragesCalculateTotalPriceSuccess() {
        //arrange
        int noOfBeverages = 5;
        float priceOfBeverages = 1.99f;
        //act
        float expectedOutPut = 9.95f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure() {
        //arrange
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        //act
        float expectedOutPut = 64.95f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfPizza(noOfPizza, priceOfPizza);
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure() {
        int noOfGarlicBread = 2;
        float priceOfGarlicBread = 5.99f;
        //act
        float expectedOutPut = 11.98f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void givenNoOfGarlicBreadAndPriceOfBeverageCalculateTotalPriceFailure() {
        //arrange
        int noOfBeverages = 6;
        float priceOfBeverages = 1.99f;
        //act
        float expectedOutPut = 11.94f;
        float actualOutPut = pizzaOrderTest.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
        //assert
        Assertions.assertEquals(expectedOutPut, actualOutPut, 0.01);
    }

    @Test
    void givenSizeOfPizzaReturnPrice() {
        //arrange
        float actualOutput = pizzaOrderTest.getPriceOfPizzaBasedOnSize(2);
        Assertions.assertEquals(11.99f, actualOutput, "There is some error in the logic");
    }

    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount() {
        float actualOutput = pizzaOrderTest.calculateTotalBill(25.99f, 10.99f, 5.99f);
        Assertions.assertEquals(25.99f + 10.99f + 5.99f, actualOutput, "There is some error in the logic");
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount() {
        float actualOutput = pizzaOrderTest.calculateDiscountAndReturnBillAmount(51.99f);
        Assertions.assertEquals(51.99f - 51.99f * 0.1, actualOutput, 0.001, "There is some error in the logic");
    }

    @Test
    public void givenTotalBillAmountLessThan50CalculateDiscount() {
        float actualOutput = pizzaOrderTest.calculateDiscountAndReturnBillAmount(49.99f);
        Assertions.assertEquals(49.99f, actualOutput, 0.001, "There is some error in the logic");
    }
}