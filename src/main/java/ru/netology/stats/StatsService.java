package ru.netology.stats;

public class StatsService {

//1. Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

//2. Средняя сумма продаж за месяц
    public int averageSale(int[] sales) {
        int result = calculateSum(sales);
        int average = result / sales.length;
        return average;
    }

//3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSumPerMonth(int[] sales) {
        int max = getMax(sales);
        int month = 1;
        int monthWithMax = 0;
        for (int number : sales) {
            if (number == max) {
                monthWithMax = month;
            }
            month++;
        }
        return monthWithMax;
    }

    private int getMax(int[] sales) {
        int max = sales[0];
        for (int number : sales) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

//4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSumPerMonth(int[] sales) {
        int min = getMin(sales);
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

    private int getMin(int[] sales) {
        int min = sales[0];
        for (int number : sales) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

//5. Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int monthWithMoreThenAverage(int[] sales) {
        int average = averageSale(sales);
        int count = 0;
        for (int number : sales) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

//6. Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int monthWithLessThenAverage(int[] sales) {
        int average = averageSale(sales);
        int count = 0;
        for (int number : sales) {
            if (number < average) {
                count++;
            }
        }
        return count;
    }

}