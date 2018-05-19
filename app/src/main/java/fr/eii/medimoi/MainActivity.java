package fr.eii.medimoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer i = 0, j = 0;
        Integer[] tabage = new Integer[300];
        Integer[] tabtaille = new Integer[300];
        Spinner age = (Spinner) findViewById(R.id.age);

        while (i < 100) {
            tabage[i] = i;
            i++;
        }


        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, tabage);
        age.setAdapter(dataAdapter);
        Spinner taille = (Spinner) findViewById(R.id.taille);

        while (j < 300) {
            tabtaille[i] = i;
            i++;
        }
        ArrayAdapter<Integer> dataAdapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, tabtaille);
        taille.setAdapter(dataAdapter2);


    }
}