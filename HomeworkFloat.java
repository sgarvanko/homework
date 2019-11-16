public class HomeworkFloat {
    public static void main(String[] args) {
        float operand1 = 12.12f;
        float operand2 = 20.18f;
        float sumResult = operand1 + operand2;
        //System.out.println("-- Суммирование двух float -- " + sumResult);

        System.out.println(" -- Суммирование float с использованием метода --");
        float sum = sum(operand1, operand2);
        System.out.println(" -- Суммирование float с использованием метода sum () --" + sum);

        float min = min(operand1, operand2);
        System.out.println(" -- Отнимание float с использованием метода min () --" + min);
        float devide = devide(operand1, operand2);
        System.out.println(" -- Деление float с использованием метода dev () --" + devide);
        float mult = mult(operand1, operand2);
        System.out.println(" -- Умножение floatt с использованием метода mult () --" + mult);

    }

    public static float mult(float operand1, float operand2) {
        float result = operand1 * operand2;
        return result;
    }

    private static float devide(float operand1, float operand2) {
        float result = operand1 / operand2;
        return result;
    }

    public static float sum(float operand1, float operand2) {
        float result = operand1 + operand2;
        return result;
    }

    public static float min(float operand1, float operand2) {
        float result = operand1 - operand2;
        return result;
    }
}
