package pk.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerDetails extends AppCompatActivity {
Button EnterDetails;
EditText Player1;
EditText Player2;
String Player1Name;
String Player2Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

Player1=findViewById(R.id.Player1name);
Player2=findViewById(R.id.Player2name);
EnterDetails=findViewById(R.id.EnterDetailsbtn);

Player1Name= Player1.getText().toString();
Player2Name= Player2.getText().toString();

EnterDetails.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Player1Name= Player1.getText().toString();
        Player2Name= Player2.getText().toString();
        if (Player1Name.length() == 0 || Player1Name.contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)")) {
            Player1.setError("ENTER A VALID NAME");
            return;
        }
        if (Player2Name.length() == 0 || Player2Name
                .contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)")) {
            Player2.setError("ENTER A VALID NAME");
            return;
        }
        Intent enter=new Intent(getApplicationContext(),MainActivity.class);
        enter.putExtra("player1",Player1Name);
        enter.putExtra("player2",Player2Name);
        startActivity(enter);
    }
});



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), GameHomePage.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}