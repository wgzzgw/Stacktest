import java.util.Scanner;

public class StackTest {
    public  static void main(String[] args){
        String input;
        System.out.println("Enter infix:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        InfixToSuffix in = new InfixToSuffix(input);
        MyCharStack my = in.doTrans();
        my.displayStack();
    }
}
