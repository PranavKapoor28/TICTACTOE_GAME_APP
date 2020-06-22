package pk.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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