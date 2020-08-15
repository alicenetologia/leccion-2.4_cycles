package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int amountallsum = 0;

        for (int item : purchases) {
            amountallsum = amountallsum + item;
        }
        return amountallsum;

    }

    public int calculateAverageSum(int[] purchases) {
        int amountallsum = calculateSum(purchases);
        int numberMonth = purchases.length;
        int averageSum = amountallsum / numberMonth;

        return averageSum;
    }


    public int calculateIndexMaxSales(int[] purchases) {
        int indexMaxSales = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[indexMaxSales]) {
                indexMaxSales = i;
            }
        }

        return indexMaxSales + 1;
    }

    public int calculateIndexMinSales(int[] purchases) {
        int indexMinSales = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= purchases[indexMinSales]) {
                indexMinSales = i;
            }
        }

        return indexMinSales + 1;
    }

    public int calculateSaleUnderAverageSum(int[] purchases) {
        int averageSum = calculateAverageSum(purchases);
        int amountMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < averageSum) {
                amountMonth = amountMonth + 1;
            }
        }

        return amountMonth;
    }

    public int calculateSaleOverAverageSum(int[] purchases) {
        int averageSum = calculateAverageSum(purchases);
        int amountMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > averageSum) {
                amountMonth = amountMonth + 1;
            }
        }

        return amountMonth;
    }
}

