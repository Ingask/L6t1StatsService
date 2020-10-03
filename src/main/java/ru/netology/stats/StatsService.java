package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int AverageSale(int[] sales) {
        int result = calculateSum(sales);
        int average = result / sales.length;
        return average;
    }

        public int MaxSumPerMonth(int[] sales) {
            int max = sales[0];
            for (int number : sales) {
                if (max < number) {
                    max = number;
                }
            }
            int month =  1;
        int monthWithMax  = 0;
        for (int number : sales) {
            if (number == max) {
                monthWithMax = month;
            }
            month ++; }
        return monthWithMax;
    }

    public int MinSumPerMonth(int[] sales) {
        int min = sales[0];
        for (int number : sales) {
            if (min > number) {
                min = number;
            }
        }
        int month = 1;
        int monthWithMin = 0;
        for (int number : sales) {
            if (number == min) {
                monthWithMin = month;
            }
            month++;
        }
        return monthWithMin;
    }

    public int MonthWithMoreThenAverage(int[] sales) {
        int average = AverageSale(sales);
        int count = 0;
        for (int number :  sales) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

    public int MonthWithLessThenAverage(int[] sales) {
        int average = AverageSale(sales);
        int count = 0;

        for (int number : sales) {
            if (number < average) {
                count++;
            }
        }
        return count;
    }


}