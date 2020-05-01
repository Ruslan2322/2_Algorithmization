package Lesson_2_Decomposition;

// Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Ex_15 {

    public static boolean CheckNumber(int num) {
        // Проверка удовлетворяет число заданию или нет.
        int prevNum = 10;
        int curNum = num % 10;
        do {
            // Проверяем на "0" для того, что бы обойти числа оканчивающиеся на "0".
            if (prevNum > curNum && curNum != 0) {
                prevNum = curNum;
                num = num / 10;
                curNum = num % 10;
                // Проверяем на "0", так как если у числа в последнем разряде цифра больше 1,
                // то это число не явялется неверным (например 23, 34, 45...)
                if ((prevNum - curNum) > 1 && curNum != 0)
                    return false;  
            } else
                return false;

        } while (num > 0);
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 123456789; i++) {
            if (CheckNumber(i))
                System.out.println(i);
        }
    }
}