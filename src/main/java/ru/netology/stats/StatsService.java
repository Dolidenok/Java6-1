package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long averageMonthlySales(long[] purchases) {
        long sum = calculateSum(purchases);
        long averageSales = sum / purchases.length;
        return averageSales;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        long numberOfMonth = 0;
        long numberOfMaxMonth = 0;
        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (currentMax <= purchase) {
                currentMax = purchase;
                numberOfMaxMonth = numberOfMonth;
            }
        }
        return numberOfMaxMonth;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        long numberOfMonth = 0;
        long numberOfMinMonth = 0;
        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (currentMin >= purchase) {
                currentMin = purchase;
                numberOfMinMonth = numberOfMonth;
            }
        }
        return numberOfMinMonth;
    }

    public long monthsLessThanAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        long averageSales = sum / purchases.length;
        long currentMonthSales;
        long numberOfMonths = 0;
        for (long purchase : purchases) {
            currentMonthSales = purchase;
            if (currentMonthSales < averageSales) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }

    public long monthsMoreThanAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        long averageSales = sum / purchases.length;
        long currentMonthSales;
        long numberOfMonths = 0;
        for (long purchase : purchases) {
            currentMonthSales = purchase;
            if (currentMonthSales > averageSales) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }
}
