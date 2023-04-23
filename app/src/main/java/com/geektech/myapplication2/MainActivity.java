package com.geektech.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = findViewById(R.id.loginEditText);
        EditText password = findViewById(R.id.passwordEditText);
        Button button = findViewById(R.id.bt_button);
        TextView welcome = findViewById(R.id.tv_welcome);
        TextView register = findViewById(R.id.tv_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = login.getText().toString();
                String text2 = password.getText().toString();

                if (text.equals("admin") && text2.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистировались", Toast.LENGTH_SHORT).show();
                    welcome.setVisibility(View.VISIBLE);
                    login.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    login.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);

                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }

            }
        });

        login.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)) {
                    button.setBackgroundResource(R.drawable.bg_button_gray);
                } else {
                    button.setBackgroundResource(R.drawable.bg_button_orange);
                }
            }
        });

    }
}