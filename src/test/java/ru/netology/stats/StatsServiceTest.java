package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        StatsService service = new StatsService();
        int actual = service.calculateSum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {

        StatsService service = new StatsService();
        int actual = service.calculateAverageSum(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void calculateIndexMaxSales() {

        StatsService service = new StatsService();
        int actual = service.calculateIndexMaxSales(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void calculateIndexMinSales() {

        StatsService service = new StatsService();
        int actual = service.calculateIndexMinSales(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    void calculateSaleUnderAverageSum() {

        StatsService service = new StatsService();
        int actual = service.calculateSaleUnderAverageSum(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSaleOverAverageSum() {

        StatsService service = new StatsService();
        int actual = service.calculateSaleOverAverageSum(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

}
