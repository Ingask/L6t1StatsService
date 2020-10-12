package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAverageSale() {
        int expected = 15;
        int actual = service.averageSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxSumPerMonth() {
        int expected = 8;
        int actual = service.maxSumPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinSumPerMonth() {
        int expected = 9;
        int actual = service.minSumPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMoreThenAverage() {
        int expected = 5;
        int actual = service.monthWithMoreThenAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithLessThenAverage() {
        int expected = 5;
        int actual = service.monthWithLessThenAverage(sales);
        assertEquals(expected, actual);
    }
}