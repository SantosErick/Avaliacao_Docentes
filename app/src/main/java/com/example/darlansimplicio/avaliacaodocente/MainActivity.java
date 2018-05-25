package com.example.darlansimplicio.avaliacaodocente;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Button btn_entrar;
    private EditText editCurso, editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_entrar = (Button) findViewById(R.id.btnEntrar);
        editCurso = (EditText) findViewById(R.id.cursoId);
        editNome = (EditText) findViewById(R.id.nomeId);

        editCurso.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getKeyCode() == event.KEYCODE_ENTER){
                    if(event.getAction() == KeyEvent.ACTION_DOWN){

                        validacao();

                    }
                    return true ;
                }


                return false;
            }
        });


        btn_entrar.setOnClickListener(botao);



    }

    private void registroDados(){

        Intent intent = new Intent(MainActivity.this,
                SelecaoActivity.class);

         startActivity(intent);

    }

    private View.OnClickListener botao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            validacao();
        }
    };


    private void validacao(){

        String nome, curso ;
        nome = editNome.getText().toString();
        curso = editCurso.getText().toString();

        if(curso.trim().equals("") || nome.trim().equals("") ){
            Toast.makeText(MainActivity.this, "Preencha todos os campos",
                    Toast.LENGTH_LONG).show();
        }else {

            registroDados();

        }
    }


}
