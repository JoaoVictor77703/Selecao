package br.com.etecia.myapp;

import static br.com.etecia.myapp.R.id.mNome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    TextView  mNome ,mPosiçao, mTime;
    ImageView mImagem;
    Button btnVoltar;

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mNome=findViewById(R.id.mNome);


        idToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        Intent intent = getIntent();

        String Nome,Posiçao,Time;
        int Imagem;

        Nome = intent.getExtras().getString("Nome");
        Posiçao = intent.getExtras().getString("Posiçao");
        Time = intent.getExtras().getString("Time");
        Imagem = intent.getExtras().getInt("Imagem");

        mNome.setText(Nome);
        mTime.setText(Time);
        mPosiçao.setText(Posiçao);
        mImagem.setImageResource(Imagem);





    }
}