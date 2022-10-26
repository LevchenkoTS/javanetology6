package ru.netology.stats;

public class StatsService {

    public int amountSales(long[] sales) {
        int sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int)i];
        }
        return sum;
    }

    public int averageAmount(long[] sales) {
        int sum = 0;
        for (long i = 0; i < sales.length; i++) {
          sum += sales[(int)i];
        }
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }


    public int monthBelowAverage(long[] sales) {
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
    public int montAboveAverage(long[] sales) {
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }


    }





