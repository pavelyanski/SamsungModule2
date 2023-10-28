import java.util.Scanner;

public class Main {
    public UtilStringFor usf = new UtilStringFor();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name1 = in.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Второй игрок будет играть? \n Введите 'да' - если да и 'нет' - если нет");
        String flag;
        flag = in.nextLine();
        if (flag == "да"){
            String name2 = in.nextLine();
            System.out.println("Введите ваше имя:");
            Player player2 = new Player(name2);

        }
    }
}