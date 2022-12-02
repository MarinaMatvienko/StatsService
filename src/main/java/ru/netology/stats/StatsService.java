package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) { //Сумму всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSum(int[] sales) { //Среднюю сумму продаж в месяц
        return calcSum(sales) / 12;

    }

    public int calcFindMax(int[] sales) { // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
        int findMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMax] <= sales[i]) {
                findMax = i;
            }
        }
        findMax += 1;
        return findMax;
    }

    public int calcFindMin(int[] sales) { //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
        int findMin = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMin] >= sales[i]) {
                findMin = i;
            }
        }
        findMin += 1;
        return findMin;
    }

    public int calcUnAverage(int[] sales) { //Количество месяцев, в которых продажи были ниже среднего (см. п.2)
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcUpAverage(int[] sales) { //Количество месяцев, в которых продажи были выше среднего (см. п.2)
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}