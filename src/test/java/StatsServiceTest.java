import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    public StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test    // Сумма всех продаж
    public void salesAmountCalcTest() {

        int expected = 180;
        int actual = service.salesAmountCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    // Средняя сумма продаж в месяц
    public void averageSalesAmountCalcTest() {

        int expected = 15;
        int actual = service.averageSalesAmountCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    //Номер месяца, в котором был пик продаж
    public void maxSalesMonthCalcTest() {

        int expected = 8;
        int actual = service.maxSalesMonthCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    //Номер месяца, в котором был минимум продаж
    public void minSalesMonthCalcTest() {

        int expected = 9;
        int actual = service.minSalesMonthCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    //Кол-во месяцев, в которых продажи были ниже среднего
    public void monthSalesBelowAverageTest() {

        int expected = 5;
        int actual = service.monthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    //Кол-во месяцев, в которых продажи были выше среднего
    public void monthSalesAboveAverageTest() {

        int expected = 5;
        int actual = service.monthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
