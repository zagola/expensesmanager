package org.example;

import java.util.Scanner;

public class ExpensesApp {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();


        while (true){
            System.out.println("1. Display all expenses");
            System.out.println("2. Display expenses from the selected month");
            System.out.println("3. Add expense");
            System.out.println("4. Exit the app");
            System.out.println("Select option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> expenseManager.displayAllExpanses();
                case 2 -> expenseManager.displayMonthlyExpenses(scanner);
                case 3 -> expenseManager.addExpanse(scanner);
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }


        }

    }
}
