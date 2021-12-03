package com.example.progettolista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView Listas;
 String aStati[] = {"Italia","Francia","Germania","Svizzera"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listas=(ListView)findViewById(R.id.Listastati);
        ArrayAdapter<String> aa =new ArrayAdapter<String>(this,R.layout.activity_main,R.id.Listastati,aStati);
        Listas.setAdapter(aa);
    }


}