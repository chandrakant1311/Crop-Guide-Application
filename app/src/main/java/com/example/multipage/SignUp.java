//package com.example.multipage;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class SignUp extends AppCompatActivity {
//
//    EditText signupName, signupUsername, signupEmail, signupPassword;
//    TextView loginRedirectText;
//    Button signupButton;
//    FirebaseDatabase   database;
//    DatabaseReference reference;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sign_up);
//
//
//
//        signupName = findViewById(R.id.signup_name);
//        signupEmail = findViewById(R.id.signup_email);
//        signupUsername = findViewById(R.id.signup_username);
//        signupPassword = findViewById(R.id.signup_password);
//        loginRedirectText = findViewById(R.id.loginRedirectText);
//        signupButton = findViewById(R.id.signup_button);
//        signupButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                database = FirebaseDatabase.getInstance();
//                reference = database.getReference("users");
//                String name = signupName.getText().toString();
//                String email = signupEmail.getText().toString();
//                String username = signupUsername.getText().toString();
//                String password = signupPassword.getText().toString();
//                HelperClass helperClass = new com.example.loginsignuprealtime.HelperClass(name, email, username, password);
//                reference.child(username).setValue(helperClass);
//                Toast.makeText(SignUp.this, "You have signup successfully!", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(SignUp.this, Login.class);
//                startActivity(intent);
//            }
//        });
//        loginRedirectText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SignUp.this, Login.class);
//                startActivity(intent);
//            }
//        });
//    }
//}

package com.example.multipage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginsignuprealtime.HelperClass;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    EditText signupName, signupUsername, signupEmail, signupPassword;
    TextView loginRedirectText;
    Button signupButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupName = findViewById(R.id.signup_name);
        signupEmail = findViewById(R.id.signup_email);
        signupUsername = findViewById(R.id.signup_username);
        signupPassword = findViewById(R.id.signup_password);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        signupButton = findViewById(R.id.signup_button);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String name = signupName.getText().toString();
                String email = signupEmail.getText().toString();
                String username = signupUsername.getText().toString();
                String password = signupPassword.getText().toString();

                if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUp.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                HelperClass helperClass = new HelperClass(name, email, username, password);
                reference.child(username).setValue(helperClass); // ✅ This is the fix

                Toast.makeText(SignUp.this, "You have signed up successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp.this, Login.class);
//               // startActivity(intent);
                finish();
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Login.class);
               // startActivity(intent);
                finish();
            }
        });
    }
}
