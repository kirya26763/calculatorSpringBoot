package Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int resul = num1 + num2;
        return "Результат = " + num1 + "+" + num2 + "=" + resul;
    }

    public String minus(int num1, int num2) {
        int resul = num1 - num2;
        return "Результат = " + num1 + "-" + num2 + "=" + resul;
    }

    public String multiply(int num1, int num2) {
        int resul = num1 * num2;
        return "Результат = " + num1 + "*" + num2 + "=" + resul;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль не делится";
        }
        double resul = num1 / num2;
        return "Результат = " + num1 + "/" + num2 + "=" + resul;
    }
}
