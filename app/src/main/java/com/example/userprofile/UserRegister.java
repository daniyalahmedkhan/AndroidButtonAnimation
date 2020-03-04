package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegister extends AppCompatActivity {

    EditText fullName , emailAddres , password;
    Button btnRegister;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
        fullName = (EditText) findViewById(R.id.fullName);
        emailAddres = (EditText) findViewById(R.id.emailAddress);
        password = (EditText) findViewById(R.id.password);
        btnRegister = (Button) findViewById(R.id.btnRegister);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fullName.getText().toString().isEmpty() || emailAddres.getText().toString().isEmpty() || password.getText().toString().isEmpty() ){

                    Toast.makeText(UserRegister.this , "Please fill all details" , Toast.LENGTH_SHORT).show();
                }else{

                    if (emailAddres.getText().toString().matches(emailPattern)){

                        if (password.getText().toString().length() >= 6){

                            Toast.makeText(UserRegister.this , "All good, User created..." , Toast.LENGTH_SHORT).show();
                            storeUserInfo();


                        }else{
                            Toast.makeText(UserRegister.this , "Password length must be greater than 6 digit" , Toast.LENGTH_SHORT).show();

                        }

                    }else{
                        Toast.makeText(UserRegister.this , "Input valid email address" , Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

    private void storeUserInfo(){

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("UserReg" , MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        editor.putString("fullName" , fullName.getText().toString());
        editor.putString("emailAdress" , emailAddres.getText().toString());
        editor.putString("password" , password.getText().toString());
        editor.apply();
        editor.commit();
    }
}
