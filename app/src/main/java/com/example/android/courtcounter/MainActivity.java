package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables for storing the total score for both teams
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Increments the score by one for Team A
    public void addOneForTeamA(View v) {
        if (wicketsTeamA != 10 || wicketsTeamA < 10) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the score by two for Team A
    public void addTwoForTeamA(View v) {
        if (wicketsTeamA != 10 || wicketsTeamA < 10) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the score by three for Team A
    public void addThreeForTeamA(View v) {
        if (wicketsTeamA != 10 || wicketsTeamA < 10) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the score by four for Team A
    public void addFourForTeamA(View v) {
        if (wicketsTeamA != 10 || wicketsTeamA < 10) {
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the score by six for Team A
    public void addSixForTeamA(View v) {
        if (wicketsTeamA != 10 || wicketsTeamA < 10) {
            scoreTeamA = scoreTeamA + 6;
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the value of wickets down
    public void wicketTeamA(View v) {
        wicketsTeamA = wicketsTeamA + 1;
        if (wicketsTeamA == 10 || wicketsTeamA > 10) {
            gameOverA(true);
        }
        else {
            displayForTeamA(scoreTeamA);
        }
    }

    // Increments the score by one for Team B
    public void addOneForTeamB(View v) {
        if (wicketsTeamB != 10 || wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
    }

    // Increments the score by two for Team B
    public void addTwoForTeamB(View v) {
        if (wicketsTeamB != 10 || wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }

    // Increments the score by three for Team B
    public void addThreeForTeamB(View v) {
        if (wicketsTeamB != 10 || wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
    }

    // Increments the score by two for Team B
    public void addFourForTeamB(View v) {
        if (wicketsTeamB != 10 || wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB);
        }
    }

    // Increments the score by three for Team B
    public void addSixForTeamB(View v) {
        if (wicketsTeamB != 10 || wicketsTeamB < 10) {
            scoreTeamB = scoreTeamB + 6;
            displayForTeamB(scoreTeamB);
        }
    }

    // Increments the value of wickets down
    public void wicketTeamB(View v) {
        wicketsTeamB = wicketsTeamB + 1;
        if (wicketsTeamB == 10 || wicketsTeamB > 10) {
            gameOverB(true);
        }
        else {
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score)+"/"+wicketsTeamA);
    }

    /**
     * Ends the Game for Team A - Shows All Out and Target
     */
    public void gameOverA(boolean integrity) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        TextView runsView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText("All Out!");
        // It increments the score by one as the target in cricket is 1 runs more than the actual score
        runsView.setText("Target: " + (scoreTeamA+1));
    }

    /**
     * Ends the Game for Team B - Shows All Out and Target
     */
    public void gameOverB(boolean integrity) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        TextView runsView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText("All Out!");
        // It increments the score by one as the target in cricket is 1 runs more than the actual score
        runsView.setText("Target: " + (scoreTeamB+1));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score)+"/"+wicketsTeamB);
    }

    /**
     * The reset method (assigns the value 0 to both score storing variables)
     */
    public void reset(View v) {
        // All variables are assigned the value 0
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;

        // The updated scores are displayed
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        // The scoreViews and runsViews of both teams are selected
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        TextView runsViewA = (TextView) findViewById(R.id.team_a_runs);
        TextView runsViewB = (TextView) findViewById(R.id.team_b_runs);

        // The score and wickets are updated on the screen
        scoreViewA.setText(scoreTeamA+"/"+wicketsTeamA);
        scoreViewB.setText(scoreTeamB+"/"+wicketsTeamB);
        runsViewA.setText("Runs");
        runsViewB.setText("Runs");
    }
}