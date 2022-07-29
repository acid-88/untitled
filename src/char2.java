import java.util.Scanner;
public class char2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Vvedi age");
        String age = x.nextLine();
        switch(age){
            case "DA" :
                System.out.println("Ti mladenec");
                break;
            case "NET" :
                System.out.println("Ti poshel v shkolu");
                break;
            case "HZ" :
                System.out.println("Ti poshel v univer");
                break;
            default:
                System.out.println("Obichniy vozrast");
        }
    }
}
