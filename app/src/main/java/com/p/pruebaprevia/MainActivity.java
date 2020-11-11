package com.p.pruebaprevia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView jetvalorCredito, jetcantidadCreditos, jtvvalorMateriaAd, jtvTotal;
    RadioButton jrbemprendimiento, jrbinteligenciaNegocios, jrbauditoriaSistemas, jrbseguridadInformatica;
    Switch jswhIngles;
    Button jbtCalcular, jbtlimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        jetcantidadCreditos=findViewById(R.id.etcantidadCreditos);
        jetvalorCredito=findViewById(R.id.etvalorCredito);
        jrbemprendimiento=findViewById(R.id.rbemprendimiento);
        jrbinteligenciaNegocios=findViewById(R.id.rbinteligenciaNegocios);
        jrbauditoriaSistemas=findViewById(R.id.rbauditoriaSistemas);
        jrbseguridadInformatica=findViewById(R.id.rbseguridadInformatica);
        jswhIngles=findViewById(R.id.swhIngles);
        jbtCalcular=findViewById(R.id.btCalcular);
        jbtlimpiar=findViewById(R.id.btLimpiar);
        jtvvalorMateriaAd=findViewById(R.id.tvvalorMateriaAd);
        jtvTotal=findViewById(R.id.tvTotal);

    }

    public void HallarValorMateriaAd (View view)
    {
        if(jrbemprendimiento.isChecked())
            jtvvalorMateriaAd.setText("460000");
        else
            if(jrbseguridadInformatica.isChecked())
                jtvvalorMateriaAd.setText("540000");
            else
                if(jrbauditoriaSistemas.isChecked())
                    jtvvalorMateriaAd.setText("490000");
                else
                    jtvvalorMateriaAd.setText("620000");
    }



    public void Calcularcredito (View view)
    {
        double valorCredito, cantidadCreditos, materiaAdicional, ingles, total;
        valorCredito=Double.parseDouble((jetvalorCredito.getText().toString()));
        cantidadCreditos=Double.parseDouble((jetcantidadCreditos.getText().toString()));
        materiaAdicional=Double.parseDouble(jtvvalorMateriaAd.getText().toString());

        if (jswhIngles.isChecked())
            ingles = 200000;
            else
                ingles = 0;

        total=valorCredito * cantidadCreditos + materiaAdicional + ingles;
        jtvTotal.setText(String.valueOf(total));

    }

    public void Limpiar (View view)
    {
    jetvalorCredito.setText("");
    jetcantidadCreditos.setText("");
    jrbemprendimiento.isChecked();
    jtvvalorMateriaAd.setText("0");
    jswhIngles.setChecked(false);
    jtvTotal.setText("0");
    }

}
