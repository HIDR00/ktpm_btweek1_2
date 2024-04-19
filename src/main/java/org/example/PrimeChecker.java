package org.example;

public class PrimeChecker {
    public static void main(String[] args) {
        int limit = 20; // Giới hạn kiểm tra số nguyên tố, có thể thay đổi theo yêu cầu
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Số chia hết cho bất kỳ số nào khác ngoài 1 và chính nó
            }
        }
        return true;
    }
}
