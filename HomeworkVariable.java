public class HomeworkVariable {
    public static void main(String[] args) {
        System.out.println("---Перестановка переменных с помощью третьей переменной---");
        int a = 10;//20
        int b = 20;//10
        int c = a;//10

        a = b;//20
        b = c;//10

        System.out.println("Новое значение переменной а = " + a);
        System.out.println("Новое значение переменной b = " + b);

        System.out.println("---Перестановка переменных БЕЗ новой переменной (с помощью арифметических действий)---");
        int d = 10;//20
        int e = 20;//10

        e = e - d;//10
        d = e + d;//20
        System.out.println("Новое значение переменной d = " + d);
        System.out.println("Новое значение переменной e = " + e);

        System.out.println("---Перестановка переменных БЕЗ новой переменной (с помощью арифметических действий и других значений)---");
        int cloneE = 2;//7
        int cloneD = 7;//2
        cloneE = cloneD + cloneE;//9
        cloneD = cloneE - cloneD;//2
        cloneE = cloneE - cloneD;
        System.out.println("Новое значение переменной cloneE = " + cloneE);
        System.out.println("Новое значение переменной cloneD = " + cloneD);

    }



}
