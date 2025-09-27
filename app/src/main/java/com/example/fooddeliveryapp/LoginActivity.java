package com.example.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Khởi tạo các thành phần giao diện (Views) từ file XML
        etUsername = findViewById(R.id.etLoginUsername);
        etPassword = findViewById(R.id.etLoginPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvRegisterLink = findViewById(R.id.tvRegisterLink);

        // Chuyển sang Register
        tvRegisterLink.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {
            String user = etUsername.getText().toString().trim();
            String pass = etPassword.getText().toString().trim();

            boolean isValid = true; // Cờ báo hiệu có lỗi hay không

            if(user.isEmpty()){
                etUsername.setError("Vui lòng nhập tên đăng nhập");
                isValid = false;
            }
            if(pass.isEmpty()){
                etPassword.setError("Vui lòng nhập mật khẩu");
                isValid = false;
            }

            if (isValid) {
                // Thêm một dòng comment để đánh dấu sự thay đổi này
                // Bắt đầu tích hợp API đăng nhập tại đây
                // Xử lý đăng nhập thật sự ở đây
            }
        });
    }
}