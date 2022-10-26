package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test

    public void amountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.amountSales(sales);

        assertEquals(expectedSum, actualSum);

    }

    @Test

    public void averageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageAmount(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test

    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void monthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void monthBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.monthBelowAverage(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void montAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.montAboveAverage(sales);

        assertEquals(expectedMonth, actualMonth);
    }
}


