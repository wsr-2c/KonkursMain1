package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.ui.login.LoginActivity;
import com.example.myapplication.ui.login.Splash;

public class MainA extends AppCompatActivity {

    /// 12.03.2025 Мясников, класс каталога
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /// переход на экран детали
        Button button = findViewById(R.id.btnsneak);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainA.this, Details.class);
                startActivity(intent);
            }
        });
        /// переход на экран избранное
        Button fav = findViewById(R.id.btnfav);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainA.this, Favorites.class);
                startActivity(intent);
            }
        });
        /// переход на экран корзина
        Button cart = findViewById(R.id.btncart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainA.this, MyCart.class);
                startActivity(intent);
            }
        });
    }
}