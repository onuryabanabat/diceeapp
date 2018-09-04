package com.example.onur.com.diceeapp;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;




public  class LoginActivity extends AppCompatActivity {




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.login_activity);


        EditText username =  findViewById(R.id.userName);
        EditText password =  findViewById(R.id.password);
        Button login =  findViewById(R.id.login_button);

        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {









            }
        });




        }






    }

