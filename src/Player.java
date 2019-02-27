public class Player {

    int count;

    public Player(){
        count = 4;
    }

    public void guess(String[][] oBoard, String [][] gBoard, int guessOne, int guessTwo){

        if(oBoard[guessOne][guessTwo].equals("🛥")){
            gBoard[guessOne][guessTwo] = "🔥";
            System.out.println("Hit");
            count--;
        }else if(oBoard[guessOne][guessTwo].equals("🌊")){
            gBoard[guessOne][guessTwo] = "❌";
            System.out.println("Miss");
        }else{
            System.out.println("You have already guessed this spot");
        }
    }
}
