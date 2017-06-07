package com.example.luixmartinv2.sorteo;


import android.app.Activity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;


public class Sorteo extends Activity {


    TextView texto;
    EditText nombre;
    public int x;
    public final String[] zona = new String[x];

    /* UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteo);

        //asignamos la variable texto
        texto = (TextView) findViewById(R.id.resultado);
        nombre= (EditText) findViewById(R.id.nombre);

        //esto lo utilizaremos para guardar a un nuevo jugador
        findViewById(R.id.crearBTN).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lista();
            }
        });

        //esto lo utilizaremos para mostrar el ganador
        findViewById(R.id.sortear).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(seleccion());
            }
        });


    }


    //la lista de nombres
    public  String[] lista(){
        int v =x;
        x++;
        String aux = nombre.toString();
        String[] lista = new String[x];

        //hacemos un bucle for
        for (int i=0; i<x; i++){
            //metemos el array anterior
            if(i<=v){
                lista[i] = zona[i];
             // metemos el nuevo elemento
            } else{
                lista[i]= aux;
            }

        }

        //devolemos la lista
        return lista;


    }

    //realia la seleccion del ganador
    public String seleccion(){



        int aux2 = (int) (x * Math.random()) + 1;
        String resul = zona[aux2];

        return resul;


    }





}

