package com.example.myapplication;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SideMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_side_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /// переход в профиль
        Button button = findViewById(R.id.btnprofile1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideMenu.this, Profile.class);
                startActivity(intent);
            }
        });
        /// переход в корзину
        Button buttonc = findViewById(R.id.btncart222);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideMenu.this, MyCart.class);
                startActivity(intent);
            }
        });
        /// переход в избранное
        Button buttonf = findViewById(R.id.btnfav22);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideMenu.this, Favorites.class);
                startActivity(intent);
            }
        });
        /// переход в заказы
        Button buttono = findViewById(R.id.btnorders22);
        buttono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideMenu.this, Orders.class);
                startActivity(intent);
            }
        });
        /// переход в уведомления
        Button buttonn = findViewById(R.id.btnnote);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SideMenu.this, .class);
                startActivity(intent);
            }
        });
        /// выход из приложения
        Button btne = findViewById(R.id.btnexit);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}