import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Board pBoard = new Board();
        pBoard.placeShips();
        pBoard.display("p");
        Board gBoard = new Board();
        gBoard.placeWater();
        gBoard.display("g");
        Board oBoard = new Board();
        oBoard.placeShips();

        Opponent x = new Opponent();
        Player person = new Player();
        Scanner sc = new Scanner(System.in);

        while(person.count > 0 && x.count > 0){
            System.out.println("Guess Row");
            int guessR = sc.nextInt();
            System.out.println("Guess Column");
            int guessC = sc.nextInt();
            person.guess(oBoard.grid, gBoard.grid, guessR - 1, guessC - 1);
            gBoard.display("g");

            x.randGuess(pBoard.grid);
            pBoard.display("p");
        }

        if(person.count == 0){
            System.out.println("You Win!");
        }else{
            System.out.println("Opponent Wins");
        }
    }
}
