package com.jackson.aperture;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> lensNameArray = new ArrayList<>();
    int selectedLens;
    List<Lens> lensList = new ArrayList<>();
    //Create some lens objects, store in a read/write from file later
    Lens lens1 = new Lens("35mm",35,35, true, new double[]{2.8, 4});
    Lens lens2 = new Lens("24-70mm", 24, 70, false, new double[]{4, 5.6});

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lensList.add(lens1);
        lensList.add(lens2);
        for(int i = 0; i < lensList.size(); i++){

            lensList.get(i);

            lensNameArray.add();
        };
        Spinner lensSpinner = (Spinner) findViewById(R.id.lensSelection);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lensNameArray);
        lensSpinner.setAdapter(adapter);
        lensSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                if(position > 0){
                    int selectedLens = arg0.getSelectedItemPosition();
                    Toast.makeText(getBaseContext(),"You have selected lens: " + lensNameArray[selectedLens], Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
