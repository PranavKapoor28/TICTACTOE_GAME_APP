package pk.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameHomePage extends AppCompatActivity {
Button Play;
Button Contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_home_page);

        Play=findViewById(R.id.PlayBtn);
        Contact=findViewById(R.id.ContactBtn);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play=new Intent(getApplicationContext(),PlayerDetails.class);
                startActivity(play);
            }
        });

        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact=new Intent(getApplicationContext(),ContactActivity.class);
                startActivity(contact);
            }
        });
    }
}