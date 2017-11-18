package com.example.marcelo.sj_clase_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    VersionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new VersionAdapter(this);

        llenarDatos();

        recyclerView.setAdapter(adapter);
    }

    private void llenarDatos() {

        List<Version> lista = new ArrayList<>();
        lista.add(new Version("Cupcake", getString(R.string.descripcion_cupcake), R.drawable.cupcake));
        lista.add(new Version("Cupcake", getString(R.string.descripcion_cupcake), R.drawable.cupcake));
        lista.add(new Version("Cupcake", getString(R.string.descripcion_cupcake), R.drawable.cupcake));
        lista.add(new Version("Cupcake", getString(R.string.descripcion_cupcake), R.drawable.cupcake));
        lista.add(new Version("Cupcake", getString(R.string.descripcion_cupcake), R.drawable.cupcake));

        adapter.setDataset(lista);

    }
}
