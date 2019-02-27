import java.util.Random;

public class Opponent {

    int count;

    public Opponent(){
        count = 4;
    }

    public void randGuess(String[][] board){
        Random rand = new Random();
        int guessOne = rand.nextInt(5);
        int guessTwo = rand.nextInt(5);
        if(board[guessOne][guessTwo].equals("🛥")){
            board[guessOne][guessTwo] = "🔥";
            System.out.println("Your ship at " + (guessOne + 1) + ", " + (guessTwo + 1) + " was hit");
            count--;
        }else if(board[guessOne][guessTwo].equals("🌊")){
            board[guessOne][guessTwo] = "❌";
            System.out.println("Opponent missed");
        }else{
            this.randGuess(board);
        }
    }
}
