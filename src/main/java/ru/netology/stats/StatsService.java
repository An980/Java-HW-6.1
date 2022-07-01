package ru.netology.stats;
import java.util.Arrays;

public class StatsService {

    // Сумма всех продаж
    public int salesAmountCalc(int[] sales) {
        int salesAmount = Arrays.stream(sales).sum();
        return salesAmount;
    }

    // Средняя сумма продаж в месяц
    public int averageSalesAmountCalc(int[] sales) {
        int salesAmount = salesAmountCalc(sales);
        int averageSalesAmount = salesAmount / sales.length;
        return averageSalesAmount;
    }

    //Номер месяца, в котором был пик продаж
    public int maxSalesMonthCalc(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int minSalesMonthCalc(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monthSalesBelowAverage(int[] sales) {
        int monthSalesBelowAverage = 0;
        int averageSalesAmount = averageSalesAmountCalc(sales);//15
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount) monthSalesBelowAverage++;
        }
        return monthSalesBelowAverage;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int monthSalesAboveAverage(int[] sales) {
        int monthSalesAboveAverage = 0;
        int averageSalesAmount = averageSalesAmountCalc(sales);//15
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount) monthSalesAboveAverage++;
        }
        return monthSalesAboveAverage;
    }

}








