package com.example.appcontadorpessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalHomem = 0;
    int totalMulher = 0;
    int totalPessoas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoTexto = (TextView) findViewById(R.id.textoTotalPessoa);

        final Button botaoHomem = (Button) findViewById(R.id.botaoHomem);
        final Button botaoMulher = (Button) findViewById(R.id.botaoMulher);
        final Button botaoReset = (Button) findViewById(R.id.botaoReset);

        botaoHomem.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalHomem++;
                totalPessoas++;

                String mensagem = Integer.toString(totalPessoas);
                campoTexto.setText("Total pessoas: " + mensagem);
                botaoHomem.setText(Integer.toString(totalHomem));
            }
        });

        botaoMulher.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMulher++;
                totalPessoas++;

                String mensagem = Integer.toString(totalPessoas);
                campoTexto.setText("Total pessoas: " + mensagem);
                botaoMulher.setText(Integer.toString(totalMulher));
            }
        });

        botaoReset.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMulher = 0;
                totalHomem = 0;
                totalPessoas = 0;

                String mensagem = Integer.toString(totalPessoas);
                campoTexto.setText("Total pessoas: " + mensagem);
                botaoHomem.setText(Integer.toString(totalHomem));
                botaoMulher.setText(Integer.toString(totalMulher));
            }
        });
    }
}