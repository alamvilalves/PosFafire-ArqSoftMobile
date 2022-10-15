package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CountToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_toast);

        Button btnToast = findViewById(R.id.btnToast);
        Button btnCount = findViewById(R.id.btnCount);
        TextView tvHello = findViewById(R.id.tvHello);
        //Integer count = 0;

        btnToast.setOnClickListener(view -> {
            Toast.makeText(this, "hello toast",Toast.LENGTH_LONG).show();
        });

        btnCount.setOnClickListener(view -> {
            Integer count = Integer.parseInt(tvHello.getText().toString()) + 1;
            tvHello.setText(count.toString());
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "All Ready",Toast.LENGTH_LONG).show();
    }
}