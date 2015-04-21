package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class StartGame extends Activity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        /*

        Init game()
        draw_board()
        play_game()
            Keep doing till all tiles are owned

                if win then stop
                else Record human move ()
                     draw_human_move

                if win then stop
                else Record computers_move{
                    find_human_win
                    Block_win
                    find_my_win()
                        play_winner()
                    choose_move ()

                draw_computer_move()
                }

        */
    }

    /*
    * OnStart -
    *
    * OnPause -
    *
    * OnDestroy -
    *
    * */
}
