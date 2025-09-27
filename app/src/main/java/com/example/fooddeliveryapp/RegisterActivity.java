package com.example.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etFullName, etBirthdate, etEmail, etUsername, etPassword;
    Button btnRegisterAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFullName = findViewById(R.id.etFullName);
        etBirthdate = findViewById(R.id.etBirthdate);
        etEmail = findViewById(R.id.etEmail);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnRegisterAccount = findViewById(R.id.btnRegisterAccount);

        btnRegisterAccount.setOnClickListener(v -> {
            // Lấy dữ liệu nhập
            String name = etFullName.getText().toString();
            String birth = etBirthdate.getText().toString();
            String email = etEmail.getText().toString();
            String user = etUsername.getText().toString();
            String pass = etPassword.getText().toString();

            // Sau khi đăng ký thành công -> quay lại Login
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
