package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //=====================================
    // Team A Methods
    public void updateScoreby3(View View){
        teamAScore = teamAScore + 3;
        display();
    }
    public void updateScoreby2(View View){
        teamAScore = teamAScore + 2;
        display();
    }
    public void updateScoreby1(View View){
        teamAScore = teamAScore + 1;
        display();
    }
    public void display(){
        TextView scoreTextview;
        scoreTextview  = (TextView) findViewById(R.id.teamA_scoreboard);
        scoreTextview.setText(String.valueOf(teamAScore));
    }
    //============================================
    //Team B methods
    public void updateScoreby3B(View View){
        teamBScore = teamBScore + 3;
        displayB();
    }
    public void updateScoreby2B(View View){
        teamBScore = teamBScore + 2;
        displayB();
    }
    public void updateScoreby1B(View View){
        teamBScore = teamBScore + 1;
        displayB();
    }
    public void displayB(){
        TextView scoreTextview;
        scoreTextview  = (TextView) findViewById(R.id.teamB_scoreboard);
        scoreTextview.setText(String.valueOf(teamBScore));
    }
    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        display();
        displayB();
    }
}