package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) { //подсчет суммы продаж
        long sum = 0; //переменная для суммы
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // среднее арифметическое - сумма всех чисел деленная на их количество
    public double calculateAverageNumber(long[] sales) {
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;

        }
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long calculateCountMonthsUnderAverage(long[] sales) {
        long countMonth = 0;
        long averageSales = (long) calculateAverageNumber(sales); //заводим переменную со значением средней суммы продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSales) {
                countMonth += 1;
            }
        }
        return countMonth;

    }

    public long calculateCountMonthsOverAverage(long[] sales) {
        long countMonth = 0;
        long averageSales = (long) calculateAverageNumber(sales); //заводим переменную со значением средней суммы продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSales) {
                countMonth += 1;
            }
        }
        return countMonth;

    }
}