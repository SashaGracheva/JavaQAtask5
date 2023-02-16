package ru.netology.sq;

public class SQRService {
    public int calcNumbersSquaredInRange(int limit1, int limit2) {
        int number = 0;
        for (int a = 10; a <= 99; a++) {
            if ((a * a >= limit1) & (a * a <= limit2)) {
                number++;
            }
        }
        return number;
    }
}
