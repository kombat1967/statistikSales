package ru.netology.statist;

public class StatsService {
    public int calculateSale(int[] sales) {
        int sum = 0;
        //int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        // sales[minMonth] - продажи в месяце minMonth
        // sale - продажи в рассматриваемом месяце
        // if (sale <= sales[minMonth]) {
        //     minMonth = month;
        for (int sale : sales) sum += sale; // следующий рассматриваемый месяц имеет номер на 1 больше
        return sum;

    }

    public int calculateSumAverage(int[] sales) {

        int sum = calculateSale(sales);
        int average;
        average = sum / sales.length;
        return average;
    }

    public long calculateMaxMonths(int[] sales) {
        int maxMonths = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxMonths] <= sales[i]) {
                maxMonths = i;
            }
        }
        maxMonths += 1;
        return maxMonths;
    }

    public long calculateMinMonths(long[] sales) {
        int minMonths = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minMonths] >= sales[i]) {
                minMonths = i;
            }
        }
        minMonths += 1;
        return minMonths;
    }

    public int calculateMinAverage(int[] sales) {
        int minAverageMonths = 0;
        int average;

        for (int i = 1; i < sales.length; i++) {
            average = calculateSumAverage(sales);
            //if (sales[minAverageMonth] > average) {
                if (sales[i] > average) {
                minAverageMonths = minAverageMonths + 1;
            }
        }
        return minAverageMonths;
    }
    public int calculateMaxAverage(int[] sales) {
        int maxAverageMonth = 0;
        int average;

        for (int i = 1; i < sales.length; i++) {
            average = calculateSumAverage(sales);

            if (sales[i] < average) {
                maxAverageMonth = maxAverageMonth + 1;
            }
        }
        return maxAverageMonth;
    }
}