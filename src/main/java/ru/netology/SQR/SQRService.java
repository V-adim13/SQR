package ru.netology.SQR;

public class SQRService {
    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int isqr = i * i;

            if (isqr >= min) {
                if (isqr <= max) {
                    count++;

                }
            }
        }
        return count;
    }
}