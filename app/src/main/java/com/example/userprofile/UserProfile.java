package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    TextView name , email , pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        pass = (TextView) findViewById(R.id.pass);

        setUserData();
    }


    private void setUserData(){


        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("UserReg" , MODE_PRIVATE);

        name.setText(sharedPreferences.getString("fullName" , ""));
        email.setText(sharedPreferences.getString("emailAdress" , ""));
        pass.setText(sharedPreferences.getString("password" , ""));

    }
}
