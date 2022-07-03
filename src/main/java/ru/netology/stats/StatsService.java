package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {      // сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum);

    }

    public long averageSale(long[] sales) {          //средняя сумма продаж в месяц
        return (sumSales(sales) / sales.length);
    }

    public long maxSaleMonth(long[] sales) {       //номер месяца, в котором был пик продаж
        int max = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > sales[max]) {
                max = (int) i;
            }

        }
        return max + 1;
    }

    public long minSaleMonth(long[] sales) {        // номер месяца, в котором был минимум продаж
        int min = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < sales[min]) {
                min = (int) i;
            }

        }
        return min + 1;
    }

    public int salesBelowAverage(long[] sales) {      //количество месяцев, в которых продажи были ниже среднего
        long avg = averageSale(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < avg) {
                count++;
            }

        }
        return count;
    }

    public int salesUpperAverage(long[] sales) {           //количество месяцев, в которых продажи были выше среднего
        long avg = averageSale(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > avg) {
                count++;
            }

        }
        return count;
    }
}