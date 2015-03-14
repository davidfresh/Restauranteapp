package com.example.davidfresh.restaurante2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    public TextView entrada;


    CheckBox check_beb;
    CheckBox check_ent;
    CheckBox check_pla;
    RadioGroup group_beb;
    RadioGroup group_ent;
    RadioGroup group_pla;
    RadioButton circle_ent1;
    RadioButton circle_ent2;
    RadioButton circle_beb1;
    RadioButton circle_beb2;
    RadioButton circle_pla1;
    RadioButton circle_pla2;
    Button button;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        check_ent = (CheckBox) findViewById(R.id.check_entrada);
        check_beb = (CheckBox) findViewById(R.id.check_bebidas);
        check_pla = (CheckBox) findViewById(R.id.check_plato);
        group_beb = (RadioGroup) findViewById(R.id.rgroup_bebidas);
        group_ent = (RadioGroup) findViewById(R.id.rgroup_entrada);
        group_pla = (RadioGroup) findViewById(R.id.rgroup_plato);
        button = (Button) findViewById(R.id.btn_ordenar);
        texto = (TextView) findViewById(R.id.text);

        check_ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_ent.isChecked()){
                    group_ent.setVisibility(View.VISIBLE);
                }
                else{
                    group_ent.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_pla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_pla.isChecked()){
                    group_pla.setVisibility(View.VISIBLE);
                }
                else{
                    group_pla.setVisibility(View.INVISIBLE);
                }

            }

        });

        check_beb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_beb.isChecked()){
                    group_beb.setVisibility(View.VISIBLE);
                }
                else{
                    group_beb.setVisibility(View.INVISIBLE);
                }
            }


        });

        group_ent.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.entrada1:

                        break;
                    case R.id.entrada2:



                        break;


                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sopa",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }







}
