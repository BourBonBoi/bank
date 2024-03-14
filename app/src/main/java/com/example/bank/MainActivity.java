package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout atm_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View atm_layout = findViewById(R.id.atm_layout);
        View cur_layout = findViewById(R.id.curryncy_container_layout);


        // Добавить слушатель нажатий
        atm_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создать интент для перехода на новую активность
                Intent intent = new Intent(MainActivity.this, atmActivity.class);
                // Запустить новую активность
                startActivity(intent);
            }
        });

        // Добавить слушатель нажатий
        cur_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создать интент для перехода на новую активность
                Intent intent = new Intent(MainActivity.this, currencyActivity.class);
                // Запустить новую активность
                startActivity(intent);
            }
        });
    }
    public void auth(View view)
    {
        RegistrationDialogFragment dialog = new RegistrationDialogFragment();
        dialog.show(getSupportFragmentManager(), "registration_dialog");
    }
}