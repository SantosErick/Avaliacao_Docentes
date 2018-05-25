package com.example.darlansimplicio.avaliacaodocente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvaliacaoActivity extends AppCompatActivity {

    private Button btn_avaliar ;
    private Button btn_voltar  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

        btn_avaliar = (Button) findViewById(R.id.btnAvaliar);

    }

    private View.OnClickListener btnAvaliar = new View.OnClickListener() {

        @Override
        public void onClick(View v){

        }
    };


}
