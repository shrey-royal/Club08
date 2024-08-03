/*
--> Problem Statement 1: Sales Data Aggregation

Context:
You are working for a retail company that has multiple stores. Each store records its sales data, which includes the sales amount and the date of the sale. Your task is to write a Java program that aggregates the sales data to provide insights such as total sales, average sales per day, and total sales for each store.

Requirements:
1. Create a `Store` class that contains a list of `Sale` objects. Each `Sale` object should have attributes such as `date` (of type `LocalDate`) and `amount` (of type `double`).
2. Write methods in the `Store` class to:
   - Calculate the total sales for the store.
   - Calculate the average sales per day for the store.
   - Group sales data by month and calculate the total sales for each month.
3. Write a `RetailCompany` class that contains a list of `Store` objects.
4. Write methods in the `RetailCompany` class to:
   - Calculate the total sales for the company.
   - Calculate the average sales per store.
   - Find the store with the highest total sales.

Example Usage:

Store store1 = new Store();
store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

Store store2 = new Store();
store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

RetailCompany company = new RetailCompany();
company.addStore(store1);
company.addStore(store2);

System.out.println("Total sales for the company: " + company.getTotalSales());
System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
System.out.println("Store with the highest sales: " + company.getTopStore().getTotalSales());
*/

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

class Sale {
    private LocalDate date;
    private double amount;

    public Sale(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}

class Store {
    private Sale[] sales;
    private int saleCount;

    public Store(int capacity) {
        sales = new Sale[capacity];
        saleCount = 0;
    }

    public void addSale(Sale sale) {
        if(saleCount >= sales.length) {
            System.out.println("Sales array is full.");
            return;
        }
        sales[saleCount++] = sale;
    }

    public double getTotalSales() {
        double totalSales = 0;
        for (int i = 0; i < saleCount; i++) {
            totalSales += sales[i].getAmount();
        }
        return totalSales;
    }

    public double getAverageSalesPerDay() {
        if(saleCount == 0) return 0;

        LocalDate[] uniqueDays = new LocalDate[saleCount];
        int uniqueDaysCount = 0;

        for (int i = 0; i < saleCount; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueDaysCount; j++) {
                if(uniqueDays[j].equals(sales[i].getDate())) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                uniqueDays[uniqueDaysCount++] = sales[i].getDate();
            }
        }
        return getTotalSales() / uniqueDaysCount;
    }

    public double[] getMonthlySales() {
        double[] monthlySales = new double[12];

        for (int i = 0; i < saleCount; i++) {
            Month month = sales[i].getDate().getMonth();
            monthlySales[month.getValue() - 1] += sales[i].getAmount();
        }
        
        return monthlySales;
    }
}

class RetailCompany {
    //
}

public class AGG_T1 {
    public static void main(String[] args) {
        // Create stores
        Store store1 = new Store(10);
        store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
        store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

        Store store2 = new Store(10);
        store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
        store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

        // Create retail company
        RetailCompany company = new RetailCompany(10);
        company.addStore(store1);
        company.addStore(store2);

        // Output results
        System.out.println("Total sales for the company: " + company.getTotalSales());
        System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
        System.out.println("Store with the highest sales: " + company.getTopStore().getTotalSales());
    }
}
