//Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int i = getInt();
        int n = 1;
        getInt();
        printNumber(i);
        printBinary(i);
        shortMax(i,n);
        shortMin(i,n);

    }

    static int getInt() {
        int i;
        Random random = new Random();
        i = random.nextInt(2000);
        return i;

    }

    static void printNumber(int i) {
        System.out.println("Случайное число = " + i);
    }

    //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    static void printBinary(int i) {
        int n = Integer.toBinaryString(i).length();
        System.out.println("Выпавшее число в двоичной системе = " + Integer.toBinaryString(i));
        System.out.println("Номер старшего значащего бита выпавшего числа = " + n);
    }

    //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static void shortMax(int i, int n) {
        int len = Short.MAX_VALUE - i;
        System.out.println("Длина массива равна " + len);
        int[] m1 = new int[len];
        int x = 0;
        for (i = getInt(); i < Short.MAX_VALUE; i++) {
            if (i % n == 0)  {
                m1[x] = i;
                x++;
                
                }
            }
        System.out.print(m1);
        }

    }
    //Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2


    public static void shortMin(int i, int n) {
        System.out.println("Значение Short.MIN_VALUE = " + Short.MIN_VALUE);
        int[] ints = new int[Short.MIN_VALUE ];
        int count = 0;
        for (i = getInt(); Short.MIN_VALUE < i; i--) {
            if (i % n != 0);
            count = count+1;
            {
                int[] m2 = new int[]{};
                for (int j = Short.MIN_VALUE; j < count; j++) {
                    System.out.print(m2[j] + " ");
                }
            }
        }
    }

}