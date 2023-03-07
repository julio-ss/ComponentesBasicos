package com.tectoy.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextInputEditText campoNome, campoEmail;
    TextView textResultado;
    CheckBox checkVermelho, checkVerde, checkAzul;
    RadioButton sexoMasculino, sexoFemino;
    RadioGroup grupoSexo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);

        checkVermelho = findViewById(R.id.checkVermelho);
        checkVerde = findViewById(R.id.checkVerde);
        checkAzul = findViewById(R.id.checkAzul);

        sexoMasculino = findViewById(R.id.radioBtnMasculino);
        sexoFemino = findViewById(R.id.radioBtnFeminino);
        grupoSexo = findViewById(R.id.radioGroupSexo);

        radioGroup();
    }

    public void radioGroup(){

        grupoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                 if (checkedId == R.id.radioBtnMasculino){
                     textResultado.setText("Sexo masculino selecionado");
                 }else if(checkedId == R.id.radioBtnFeminino){
                     textResultado.setText("Sexo feminino selecionado");
                 }
            }
        });
    }

    public void radioButton(){
        String texto = "";
        if (sexoMasculino.isChecked()){
            texto = "Sexo masculino selecionado";
        }
        if(sexoFemino.isChecked()){
            texto = "Sexo feminino selecionado";
        }

        textResultado.setText(texto);
    }

    public void checkBox(){

        String texto = "";
        if(checkVermelho.isChecked() == true){
            //String corSelecionada = checkVermelho.getText().toString();
            //texto = corSelecionada;
            texto = texto + "Vermelho selecionado - ";
        }
        if (checkVerde.isChecked() == true){
            texto = texto + "Verde selecionado - ";
        }
        if(checkAzul.isChecked() == true){
            texto = texto + "Azul selecionado - ";
        }

        textResultado.setText(texto);
    }

    public void enviar(View v){

        //radioButton();
        //checkBox();

        /*String nome = campoNome.getText().toString(); //forcando retorno de texto
        String email = campoEmail.getText().toString();

        textResultado.setText("Nome: " + nome + "\nE-mail: " + email);*/
    }

    public void limpar(View v){
        campoNome.setText("");
        campoEmail.setText("");
    }
}