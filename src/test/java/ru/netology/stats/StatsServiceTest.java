package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySales() {
        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.averageMonthlySales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void monthsLessThanAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.monthsLessThanAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void monthsMoreThanAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.monthsMoreThanAverage(purchases);

        assertEquals(expected, actual);
    }


}