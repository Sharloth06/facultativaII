package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView myList;
    List<String> MATERIAS = new ArrayList<String>(Arrays.asList("Metodologia de investigacion","Estructura de datos","Programacion orientado Objeto"));
    EditText editText_MATERIAS;
    MyAdapterList Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_MATERIAS= (EditText)findViewById(R.id.editText_MATERIAS);
        myList = (ListView) findViewById(R.id.list1);
        fillList();
    }
    void fillList() {
        Adapter = new MyAdapterList(this, R.layout.item_list, MATERIAS);
        myList.setAdapter(Adapter);
    }


    void add(String materia1) {
        if (!materia1.isEmpty()) {
            MATERIAS.add(materia1);
            editText_MATERIAS.setText("");
            fillList();
            Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Agregar la MATERIAS", Toast.LENGTH_SHORT).show();
        }
    }



    public void GUARDAR(View v)
    {
        String asignatura1 = editText_MATERIAS.getText().toString();
        add(asignatura1);
    }
}
