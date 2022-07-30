public class Eachfor {
    public static void main(String[] args) {
        int[] H = new int[5];   // массив целых чисел
        H[0] = 7;
        H[3] = 3;
        int sum=0;
        for(int x:H) {
        sum = sum + x;
        }
        System.out.println(sum);
        System.out.println();
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
