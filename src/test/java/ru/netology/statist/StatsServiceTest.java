package ru.netology.statist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSumAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateSumAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void сalculateMaxMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateMaxMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void сalculateMinMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateMinMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateMinAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;
        long actual = service.calculateMaxAverage(sales);
        assertEquals(expected, actual);
    }
}