package com.example.ikhsanramadhan.myaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        String[]daftarkelas= {"D3IF-40-01","D3IF-40-02","D3IF-40-03","D3IF-40-04"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1,daftarkelas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent= new Intent(MainActivity.this, kelas01Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent= new Intent(MainActivity.this, kelas02Activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent= new Intent(MainActivity.this, kelas03Activity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent= new Intent(MainActivity.this, kelas04Activity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

