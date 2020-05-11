package pk.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    // 0-x
    // 1-0
    int activePlayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    boolean gameActive = true;

    //2-null
    Scanner scan = new Scanner(System.in);
    int[][] WinPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}};
    char[][] gameBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


    int cpuState = 1;
    ImageView img = (ImageView) view;
    int tappedImage = Integer.parseInt(img.getTag().toString());
    public static void printgameBoard(char[][] gameBoard)
    {

    for(char[] row:gameBoard)
    {
        for(char c:row){
            System.out.print(c);
        }
        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;
        cpuPos=tappedImage;
        printgameBoard(gameBoard);
    }


    }
    public void playerTap(View view) {



        if (!gameActive) {
            gameReset(view);
        }
        if (gameState[tappedImage] == 2) {
            gameState[tappedImage] = activePlayer;
            img.setTranslationY(-1000f);



                if (activePlayer == 0) {
                    img.setImageResource(R.drawable.x);
                    activePlayer = cpuState;
                    TextView status = findViewById(R.id.status);
                    status.setText("O's Turn-Tap to play");
                } else {

                    img.setImageResource(R.drawable.images);
                    activePlayer = 0;
                    TextView status = findViewById(R.id.status);
                    status.setText("X's Turn-Tap to play");
                }
            }


        img.animate().translationYBy(1000f).setDuration(300);


        for (int[] winPosition : WinPositions) {
            String winnerStr;
            if (gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[0]] != 2)
            {
                gameActive=false;
                if (gameState[winPosition[0]] == 0)
                {

                    winnerStr = "X has won";

                }
                else
                {
                    winnerStr = "O has won";
                }

                TextView status = findViewById(R.id.status);
                status.setText(winnerStr);
            }

        }
    }




        public void gameReset(View view)
    {

        gameActive=true;
        activePlayer=0;
        for(int i=0;i<gameState.length;i++)
        {
            gameState[i] = 2;
        }
            ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText("X's Turn to Play");

        }



        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }
    }
