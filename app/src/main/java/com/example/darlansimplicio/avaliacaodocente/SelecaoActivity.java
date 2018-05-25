package com.example.darlansimplicio.avaliacaodocente;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SelecaoActivity extends AppCompatActivity {
    protected Toolbar toolbar ;
    private ImageView imagemAluno ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        imagemAluno = findViewById(R.id.imgAlunoId);

        imagemAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SelecaoActivity.this,
                        AvaliacaoActivity.class));
            }
        });

                //toolbar = (Toolbar) findViewById(R.id.barraId);
                //setSupportActionBar(toolbar);
                //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}
