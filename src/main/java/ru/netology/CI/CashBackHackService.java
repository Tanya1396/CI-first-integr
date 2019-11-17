package ru.netology.CI;

public class CashBackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }

        boolean isNeedMore = amount % boundary != 0;
        if (!isNeedMore) {
            return 0;
        }

        return boundary - amount % boundary;
    }
}