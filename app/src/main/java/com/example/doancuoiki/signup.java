package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class signup extends AppCompatActivity {

    TextInputEditText textInputEditTextFullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail,textInputEditTextPhone;
    Button buttonSignup;
    Button signup, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textInputEditTextFullname = findViewById(R.id.signame1);
        textInputEditTextUsername = findViewById(R.id.sigusername1);
        textInputEditTextPassword = findViewById(R.id.sigpassword1);
        textInputEditTextEmail = findViewById(R.id.sigemail1);
        textInputEditTextPhone = findViewById(R.id.sigphone1);

        signup = (Button) findViewById(R.id.callcreate);
        login = (Button) findViewById(R.id.CallLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start ProgressBar first (Set visibility VISIBLE)
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        String fullname, username, password, email, phone;
                        fullname = String.valueOf(textInputEditTextFullname.getText());
                        username = String.valueOf(textInputEditTextUsername.getText());
                        password = String.valueOf(textInputEditTextPassword.getText());
                        email = String.valueOf(textInputEditTextEmail.getText());
                        phone = String.valueOf(textInputEditTextPhone.getText());

                        if (!email.equals("") && !fullname.equals("") && !phone.equals("") && !username.equals("") && !password.equals("")) {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[5];
                            field[0] = "email";
                            field[1] = "fullname";
                            field[2] = "phone";
                            field[3] = "username";
                            field[4] = "password";
                            //Creating array for data
                            String[] data = new String[5];
                            data[0] = email;
                            data[1] = fullname;
                            data[2] = phone;
                            data[3] = username;
                            data[4] = password;
                            PutData putData = new PutData("https://18.141.80.207/doan/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Sign Up Success")) {
                                        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), login.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                    else {
                                        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                            //End Write and Read data with URL
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "All fields required", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });
    }
}