public class Eachfor {
    public static void main(String[] args) {
        int[] H = new int[5];   // массив целых чисел
        H[0] = 4;        //инициализация первого индекса массива
        H[1] = 8;
        System.out.println(H[0]);    // выводим на консоль 1 и 3 индексы
        System.out.println(H[2]);
        String[] stroke = new String[4];
        stroke[0] = "Hello";
        stroke[1] = " Java";
        stroke[2] = "Emmm";
        stroke[3] = "Crystal";
        for(String string:stroke){        //цикл for each
        //  ^тип    ^имя   ^ссылаемся на массив
            System.out.println(string);
        }
    }
}
