import java.util.Scanner;
public class char2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Vvedi age");
        int age = x.nextInt();
        switch(age){
            case 0 :
                System.out.println("Ti mladenec");
                break;
            case 6 :
                System.out.println("Ti poshel v shkolu");
                break;
            case 18 :
                System.out.println("Ti poshel v univer");
                break;
            default:
                System.out.println("Obichniy vozrast");
        }
    }
}
