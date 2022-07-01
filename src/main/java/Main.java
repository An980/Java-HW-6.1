import ru.netology.stats.StatsService;


public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] salesStatsArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж: " + service.salesAmountCalc(salesStatsArr));
        System.out.println("Средняя сумма продаж в месяц " + service.averageSalesAmountCalc(salesStatsArr));
        System.out.println("Номер месяца, в котором был пик продаж " + service.maxSalesMonthCalc(salesStatsArr));
        System.out.println("Номер месяца, в котором был минимум продаж " + service.minSalesMonthCalc(salesStatsArr));
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего " + service.monthSalesBelowAverage(salesStatsArr));
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего " + service.monthSalesAboveAverage(salesStatsArr));

    }

}
