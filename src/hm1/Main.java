package hm1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSamSign();
    }


    public static void checkSamSign(){
        int a = -100;
        int b = 19;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        }
        if (c < 0){
            System.out.println("Сумма отрицательная");
        }

        printColor();
    }

    public static void printColor(){
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value >0 && value<=100){
            System.out.println("Желтый");
        }else if (value > 100){
            System.out.println("Зеленый");
        }
        compareNambers();
    }
    public static void compareNambers(){
        int a = 122;
        int b = 133;
        if (a>=b){
            System.out.println(a + ">=" + b);
        }else {
            System.out.println(a + "<" + b);
        }




   }

}
