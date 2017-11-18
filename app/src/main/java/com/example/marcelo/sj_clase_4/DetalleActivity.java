package com.example.marcelo.sj_clase_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView nombreDetalle, descripcionDetalle;
    ImageView imagenDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        nombreDetalle = (TextView) findViewById(R.id.nombre_detalle);
        descripcionDetalle = (TextView) findViewById(R.id.descripcion_detalle);
        imagenDetalle = (ImageView) findViewById(R.id.imagen_detalle);

        getSupportActionBar().setTitle(getString(R.string.detalle));

    }
}
