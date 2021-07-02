package se.lexicon;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {

        // Calculates if certain of things complies.
        boolean calculate = true;
        while (calculate) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome! Please, choose your product");

            class products {
                        static final int FRUIT_PRICE = 7;
                        static final int FRUIT_CAPACITY = 30;

                        int getFruitPrice;
                        int balance;
                        int revenue;

                        VendingMachine() {
                            getFruitPrice = FRUIT_CAPACITY;
                            balance = 0;
                            revenue = 0;

                            class Snacksautomat {
                                static final int CANDY_PRICE = 5;
                                static final int CANDY_CAPACITY = 30;

                                int snickers;
                                int balance;
                                int revenue;

                                VendingMachine() {
                                    snickers = CANDY_CAPACITY;
                                    balance = 0;
                                    revenue = 0;
                }

                int getBalance() {
                    return balance;
                }

                int getRevenue() {
                    return revenue;
                }

                void addMoney() {
                    Balance++;
                }

                int refund() {
                    int amount = balance;
                    balance = 0;
                    return amount;
                }

                boolean vendCandyBar() {
                    if(candyBars >= 1 && balance >= CANDY_PRICE) {
                        candyBars--;
                        balance-= CANDY_PRICE;
                        revenue+= CANDY_PRICE;
                        return = true;
                    } else }
                  return false;
            }
        }

        void restock(); {
            candyBars = CANDY_CAPACITY;
        }
    }
        }
    }
}
