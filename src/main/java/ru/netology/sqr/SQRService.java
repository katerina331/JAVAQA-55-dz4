package ru.netology.sqr;

public class SQRService {
    public int calcSqrtRange(long minrange, long maxrange) {
        int amountsq = 0;
        long i = 10;
        while (i * i < maxrange) {
            if (minrange < i * i) {
                amountsq++;
            }
            if (i == 99) {
                break;
            }
            i++;
        }
        return amountsq;
    }
}
