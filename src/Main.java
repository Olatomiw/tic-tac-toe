import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char [] board = {
                '1','2','3',
                '4','5','6',
                '7','8','9'
        };

        int numberOfSquaredPlayed = 0;
        char whoseTurnIsItr = 'x';

        while(numberOfSquaredPlayed < 9){
            printTheBoard(board);
            System.out.printf("Choose a square player %s:", whoseTurnIsItr);
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            board[input-1] = whoseTurnIsItr;

            if (board[0]+board[1]+board[2] == whoseTurnIsItr*3 ||
            board[3]+board[4]+board[5] == whoseTurnIsItr*3 ||
            board[6]+board[7]+board[8] == whoseTurnIsItr*3 ||
            board[0]+board[3]+board[6] == whoseTurnIsItr*3 ||
            board[1]+board[4]+board[7] == whoseTurnIsItr*3 ||
            board[2]+board[5]+board[8] == whoseTurnIsItr*3 ||
            board[0]+board[4]+board[8] == whoseTurnIsItr*3 ||
            board[3]+board[4]+board[6] == whoseTurnIsItr*3){
                printTheBoard(board);
                System.out.println("You win!");
                break;
            }else {
                numberOfSquaredPlayed++;

                ;
            }
        }
        printTheBoard(board);
    }

    private static void printTheBoard (char[]board){
        System.out.println(board[0] + " | " +  board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " +  board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " +  board[7] + " | " + board[8]);

    }


}