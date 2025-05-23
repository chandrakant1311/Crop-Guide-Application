package com.example.multipage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Find Buttons and TextView by ID
        Button btnLogin = findViewById(R.id.button);        // Login Button
        Button btnSignup = findViewById(R.id.button2);       // SignUp Button
        TextView aboutUsText = findViewById(R.id.aboutUsButton);  // Corrected About Us TextView

        // Login Button Click
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Login Activity
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        // Sign Up Button Click
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to SignUp Activity
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        // About Us TextView Click
        aboutUsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("About Us");
                builder.setMessage(getString(R.string.desc));  // Show text from strings.xml
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
