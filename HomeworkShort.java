public class HomeworkShort {
    public static void main(String[] args) {
        short operand1 = 1;
        short operand2 = 2;

        short sum = sum(operand1, operand2);
        System.out.println(" -- Суммирование short с использованием метода sum () --" + sum);

    }

    private static short sum(short operand1, short operand2) {
        short result = operand1 + operand2;
        return result;
    }

}
