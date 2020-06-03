package com.example.recicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> Models = new ArrayList<>();
    RecyclerView mRecycleView;
    Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mRecycleView=findViewById(R.id.recycler_view);
            mRecycleView.setLayoutManager(new LinearLayoutManager(this));
            myAdapter= new Adapter(this, getList());
            mRecycleView.setAdapter(myAdapter);
        }
        catch(Exception e) {
            Toast.makeText(this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private ArrayList<Model> getList(){
        Model m=new Model();
        m.setTitle("Facultativa II");
        m.setDescripcion ("Descripción de Facultativa II");
        m.setImage(R.drawable.app);
        m.setProfesor("Saira Cienfuego");
        m.setDia("28 de mayo del 2020");
        m.setHora("11:59 P.M.");
        m.setFechaent("30 de mayo del 2020");
        Models.add(m);
        m=new Model();
        m.setTitle("Investigación aplic.");
        m.setDescripcion ("Descripción de Investigacion");
        m.setImage(R.drawable.file);
        m.setProfesor("Jazcar Bravo");
        m.setDia("28 de mayo del 2020");
        m.setHora("11:589 P.M.");
        m.setFechaent("30 de mayo del 2020");
        Models.add(m);
        m=new Model();
        m.setTitle("Planificación tic");
        m.setDescripcion ("Descripción de Planificación");
        m.setProfesor("Miriam Cienfuego");
        m.setDia("28 de mayo del 2020");
        m.setHora("12:59 P.M.");
        m.setFechaent("30 de mayo del 2020");
        m.setImage(R.drawable.pc);
        Models.add(m);
        return Models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.close:
                this.finish();
            case R.id.add:
                final Dialog dlg = new Dialog(this);
                dlg.setContentView(R.layout.guardar_activity);
                dlg.setTitle("guardar");
                dlg.setCancelable(false);
                Button btagregar = (Button) dlg.findViewById(R.id.botonagregar);
                Button btcancelar = (Button) dlg.findViewById(R.id.botoncancelar);

                btagregar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText asig=(EditText) dlg.findViewById(R.id.editText_asig);
                        EditText desc=(EditText)dlg.findViewById(R.id.editText_des);
                        EditText nom_profesor=(EditText)dlg.findViewById(R.id.editText_prof);
                        EditText dia=(EditText)dlg.findViewById(R.id.editText_dia);
                        EditText hora=(EditText)dlg.findViewById(R.id.editText_hora);
                        EditText fecha=(EditText)dlg.findViewById(R.id.editText_fecha);

                        Model m = new Model();
                        m.setTitle(asig.getText().toString());
                        m.setDescripcion(desc.getText().toString());
                        m.setProfesor(nom_profesor.getText().toString());
                        m.setImage(R.drawable.pc);
                        m.setDia(dia.getText().toString());
                        m.setHora(hora.getText().toString());
                        m.setFechaent(fecha.getText().toString());
                        Models.add(m);
                        myAdapter= new Adapter(v.getContext(), Models);
                        mRecycleView.setAdapter(myAdapter);
                        dlg.cancel();
                    }
                });
                btcancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dlg.cancel();
                    }
                });
                dlg.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

