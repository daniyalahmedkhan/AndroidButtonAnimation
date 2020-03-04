package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class UserLogin extends AppCompatActivity {

//    TextView TV_signUp;

    Button loginbtn;
//    TextInputEditText email , pass;
    Animation scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

//        TV_signUp = (TextView) findViewById(R.id.TV_signUp);
        loginbtn = (Button) findViewById(R.id.loginbtn);
//        email = (TextInputEditText) findViewById(R.id.email);
//        pass = (TextInputEditText) findViewById(R.id.pass);


        scale = AnimationUtils.loadAnimation(this, R.anim.animation);

//        TV_signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(UserLogin.this , UserRegister.class);
//                startActivity(intent);
//            }
//        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if (getUserInfo(email.getText().toString() , pass.getText().toString())){
//
//                    Intent intent = new Intent(UserLogin.this, UserProfile.class);
//                    startActivity(intent);
//
//                }else {
//                    Toast.makeText(UserLogin.this, "Email Or Pass is incorrect", Toast.LENGTH_SHORT).show();
//                }
            loginbtn.startAnimation(scale);



            }
        });
    }

//    private boolean getUserInfo(String Uemail , String Upass){
//
//        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("UserReg" , MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//
//        String email = sharedPreferences.getString("emailAdress" , "");
//        String pass = sharedPreferences.getString("password" , "");
//
//        if (email.equals(Uemail) && pass.equals(Upass)){
//            return true;
//        }else {
//            return false;
//        }
//
//
//    }
}
