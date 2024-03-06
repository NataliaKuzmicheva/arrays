package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldFindSumSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.calculateSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverage = 15;
        double actualAverage = service.calculateAverageNumber(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldFindMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldFindMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldFindMonthsUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCount = 7;
        long actualCount = service.calculateCountMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test

    public void shouldFindMonthsOverAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCounts = 7;
        long actualCounts = service.calculateCountMonthsOverAverage(sales);

        Assertions.assertEquals(expectedCounts, actualCounts);
    }
}
