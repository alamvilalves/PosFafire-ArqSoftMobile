package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityTelaChatRespostaBinding;

public class TelaChatRespostaActivity extends AppCompatActivity {

    ActivityTelaChatRespostaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaChatRespostaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btEnviar.setOnClickListener(view -> {
            Intent mensageiro = new Intent(getApplicationContext(), ChatTela1Activity.class);
            mensageiro.putExtra("key", binding.edMensagem.getText().toString());
            startActivity(mensageiro);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String valor = getIntent().getStringExtra("key");
        binding.tvResposta.setText(valor);
    }
}