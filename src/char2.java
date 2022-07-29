import java.util.Scanner;
public class char2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ya zagadal chislo, poprobuy ugaday");
        int x = s.nextInt();
        while(x!=5){
            System.out.println("HET, poprobuy ewe: ");
            if (x<5) {
                System.out.println("Bolshe!");
            } else {
                System.out.println("Menshe!");
            }
            x = s.nextInt();
        }
        System.out.println("Molodec!");
    }
}
