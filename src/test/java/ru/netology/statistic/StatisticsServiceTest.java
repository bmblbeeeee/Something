package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 5, 8, 4, 150, 3, 8, 6, 11, 11, 12};
        long expected = 150;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxGiantAmount() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2147483647, 5, 8, 4, 15, 3, 8, 6, 11, 11, 12};
        long expected = 2147483647;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        long expected = 2;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


}