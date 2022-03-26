package com.baeldung.springsoap;

public class CalculatorService {
    public float calculate(float number1, float number2, String operator) {
        if(operator.equals("+")) {
            return number1 + number2;
        } else if(operator.equals("-")) {
            return number1 - number2;
        } else if(operator.equals("*")) {
            return number1 * number2;
        } else if(operator.equals("/")) {
            if(number2 == 0) {
                throw new IllegalArgumentException("Không thể chia cho 0");
            } else {
                return number1 / number2;
            }
        }
        return 0;
    }

    public int exp(float number) {
        if(number < 0) {
            throw new IllegalArgumentException("Đầu vào phải lớn hơn hoặc bằng 0");
        }
        int gt = 1;
        for (int i = 1; i <= number; i++)
            gt *= i;
        return gt;
    }
}
