package com.example.davidfresh.restaurante2;

import android.support.annotation.Nullable;
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
import android.widget.Toolbar;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {



    String entra1;
    String entra2;
    String plat1;
    String plat2;
    String bebi1;
    String bebi2;

    CheckBox check_beb;
    CheckBox check_ent;
    CheckBox check_pla;
    RadioGroup group_beb;
    RadioGroup group_ent;
    RadioGroup group_pla;
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
                    entra1 = getString(R.string.sopa);
                        break;
                    case R.id.entrada2:
                     entra2 = getString(R.string.arroz);
                        break;


                }

            }
        });

        group_pla.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.plato1:
                        plat1 = getString(R.string.pechuga);
                        break;
                    case R.id.plato2:
                        plat2 = getString(R.string.bisteck);
                        break;


                }

            }
        });

        group_beb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bebidas1:
                        bebi1 = getString(R.string.refresco);
                        break;
                    case R.id.bebidas2:
                        bebi1 = getString(R.string.agua);
                        break;


                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "Tu Ordenaste: ";
                if (entra1==null){
                    text = text;
                }
                else{
                    text = text.concat(entra1+", ");
                }
                if (entra2==null){
                    text =text;
                }
                else{
                    text =text.concat(entra2+", ");
                }
                if (plat1==null){
                    text = text;
                }
                else{
                    text = text.concat(plat1+" y ");
                }
                if (plat2==null){
                    text =text;
                }
                else{
                    text = text.concat(plat2+" y ");

                }
                if (bebi1==null){
                    text=text;
                }
                else{
                    text = text.concat(bebi1+" ");
                }
                if (bebi2==null){
                    text=text;
                }
                else{
                    text = text.concat(bebi2+" ");
                }


                Toast.makeText(getApplicationContext(), text,
                        Toast.LENGTH_LONG).show();
            }
        });


    }







}
