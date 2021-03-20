package com.example.myprogramentrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textEntrance;
    TextView textWelcome;
    TextView textExecute;
    EditText textLogin;
    EditText textPassword;
    Button Enter;
    TextView textEnter;
    TextView textForgot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEntrance = findViewById(R.id.title_text_view);
        textWelcome = findViewById(R.id.textView);
        textExecute = findViewById(R.id.textView2);
        textLogin = findViewById(R.id.album_description_view);
        textPassword = findViewById(R.id.editTextNumberPassword);
        Enter = findViewById(R.id.next_button);
        textEnter = findViewById(R.id.textView4);
        textForgot = findViewById(R.id.textView5);
        String inputName = textLogin.getText().toString();
        String inputPassword = textPassword.getText().toString();

        

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inputName.equals("")) && (inputPassword.equals(""))) {
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast toast = Toast.makeText(getApplicationContext(),"Вы успешно вошли в систему!", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });



    }

}