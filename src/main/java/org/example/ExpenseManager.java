package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();

    public void displayAllExpanses() {
        expenses.forEach(ExpenseManager::displayExpense);
    }

    private static void displayExpense(Expense expense) {
        System.out.println(expense.description());
        System.out.println(expense.type());
        System.out.println(expense.value());
        System.out.println(expense.month());
    }

    public void displayMonthlyExpenses(Scanner scanner) {
        System.out.println("Select a month");
        int month = Integer.parseInt(scanner.nextLine());

        expenses.stream()
                .filter(expense -> expense.month() == month)
                .forEach(ExpenseManager::displayExpense);

    }

    public void addExpanse(Scanner scanner) {
        System.out.println("Enter the name of the expense");
        String description = scanner.nextLine();
        System.out.println("Select a category");
        String type = scanner.nextLine();
        System.out.println("Enter the cost");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("Add month");
        int month = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(type, month, value, description);
        expenses.add(expense);



    }

}
