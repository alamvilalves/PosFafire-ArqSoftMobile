package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btToastCount, btTelaChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btToastCount = findViewById(R.id.btToastCount);
        btToastCount.setOnClickListener(view -> {
            Intent telaToastCount = new Intent(getApplicationContext(), CountToast.class);
            startActivity(telaToastCount);
        });
        btTelaChat = findViewById(R.id.btTelaChat);
        btTelaChat.setOnClickListener(view -> {
            Intent telaChatTela1 = new Intent(getApplicationContext(), ChatTela1Activity.class);
            startActivity(telaChatTela1);
        });
    }
}