package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;
    FirebaseAuth mFirebaseAuth;
    TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAuth=FirebaseAuth.getInstance();
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        b1=(Button)findViewById((R.id.b1));
        signin=(TextView)findViewById(R.id.signin);
        b1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                 String s4 = e4.getText().toString();

                 if(s3.isEmpty()){
                     e3.setError("please enter email id");
                     e3.requestFocus();
                 }

                 else if(s2.isEmpty()){
                e2.setError("please enter a password");
                e2.requestFocus();
                 }

                 else if(s1.isEmpty()){
                     e1.setError("please enter a username");
                     e1.requestFocus();
                 }
                 else if(s4.isEmpty()){
                     e4.setError("please enter a phone number");
                     e4.requestFocus();
                 }
                 else if(s1.isEmpty() && s2.isEmpty()&& s3.isEmpty()&& s4.isEmpty()){
                     Toast.makeText(MainActivity.this, "Fields are empty!", Toast.LENGTH_SHORT).show();
                 }
            else if(!(s1.isEmpty() && s2.isEmpty()&& s3.isEmpty()&& s4.isEmpty())){

mFirebaseAuth.createUserWithEmailAndPassword(s2,s3).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (!task.isSuccessful()) {
            Toast.makeText(MainActivity.this, "Sign up unsuccessful!Please try again", Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(MainActivity.this, homeActivity.class));
        }
    }


});
                }

            else{
                     Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
                 }

            }

        });

        signin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
            startActivity(new Intent(MainActivity.this,loginActivity.class));
            }
        });



        }
}