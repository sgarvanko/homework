public class HomeworkArray {
    public static void main(String[] args) {
        int arrayItem = 25;
        fillArray(arrayItem); //создали метод для заполнения массива
        findMin();
        findMax();
    }

    private static void fillArray(int arrayItem) {
        int[] arrayNumb;//создали пустой массив
        arrayNumb = new int[4]; //массив из 4х чисел
        for (int index = 0; index <= arrayNumb.length - 1; index++) {//создали цикл
            arrayNumb[index] = ++arrayItem; //потому как я не особо поняла почему надо было поменять на префиксный
            System.out.println("Числа первого метода " + arrayItem);

        }

        for (int index = 0; index <= arrayNumb.length - 1; index++) {//создали цикл
            System.out.println(arrayNumb[index]);
        }


    }

    private static void findMin() {
        int[] arrayNumb = new int[]{100, 155, 40, 55, 7};//создали  массив с набором значений
        int minValue = arrayNumb[0];

        for (int index = 0; index <= arrayNumb.length - 1; index++) {
            if (minValue > arrayNumb[index]) {
                minValue = arrayNumb[index];
            }

        }
        System.out.println("Минимальное значение " + minValue);

    }

    private static void findMax() {
        int arrayNumb[] = new int[]{455, 155, 40, 55, 7};//создали
        int maxValue = arrayNumb[0];
        int sumValue = arrayNumb[0];


        for (int index = 1; index <= arrayNumb.length - 1; index++) {
            if (maxValue < arrayNumb[index]) {
                maxValue = arrayNumb[index];
            }
            sumValue = sumValue + arrayNumb[index];
        }

        System.out.println("Максимальное значение " + maxValue);
        System.out.println("Сумма значений " + sumValue);

        }

    }
