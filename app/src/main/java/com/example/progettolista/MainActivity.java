package com.example.progettolista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 ListView listas;
 String aStati[] = {"Italia","Francia","Germania","Svizzera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(this,"Benvenuti", Toast.LENGTH_SHORT).show();
            }
        });
        listas=(ListView)findViewById(R.id.Listastati);
        ArrayAdapter<String> aa =new ArrayAdapter<String>(this,R.layout.activity_main,R.id.Listastati,aStati);
        listas.setAdapter(aa);
    }


}