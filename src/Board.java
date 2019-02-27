import java.util.Arrays;
import java.util.Random;

public class Board {

    String[][] grid;

    public Board(){
        grid = new String[5][5];
    }

    public void placeShips(){
        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            for(int a = 0; a < 5; a++){
                grid[i][a] = "🌊";
            }
        }


        int ships = 0;
        int coor1;
        int coor2;
        while(ships < 4){
            coor1 = rand.nextInt(5);
            coor2 = rand.nextInt(5);
            if(grid[coor1][coor2].equals("🌊")){
                grid[coor1][coor2] = "🛥";
                ships++;
            }
        }
    }

    public void placeWater(){
        for(int i = 0; i < 5; i++){
            for(int a = 0; a < 5; a++){
                grid[i][a] = "🌊";
            }
        }
    }

    public void display(String type){
        if(type.equals("p")){
            System.out.println("Your Board");
        }else{
            System.out.println("Guessing Board");
        }
        for(int i = 0; i < 5; i++){
            for(int a = 0; a < 5; a++){
                System.out.print(grid[i][a]);
            }
            System.out.println();
        }
    }

}
