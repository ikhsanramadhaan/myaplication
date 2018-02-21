package com.example.ikhsanramadhan.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class kelas02Activity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas02);
        listView =(ListView) findViewById(R.id.listitem2);

        ArrayList<mahasiswa> list02 = new ArrayList<>();

        list02.add(new mahasiswa("6706160005","KRISNA SETIAWAN"));
        list02.add(new mahasiswa("6706160014","MUHAMMAD FAISAL AMIR"));
        list02.add(new mahasiswa("6706160017","RETNO RAHAYU"));
        list02.add(new mahasiswa(" 6706160023","RAMDHAN FRIATNA"));
        list02.add(new mahasiswa(" 6706160026","MUHAMAD FAJAR IMAM PRANATA HARAHAP"));
        list02.add(new mahasiswa("6706160029","SAIFUL APRIYANTO"));
        list02.add(new mahasiswa(" 6706160038","ALDI RAMDANI"));
        list02.add(new mahasiswa("6706160041","MUHAMMAD ABDURROZAQ RAMADHAN"));
        list02.add(new mahasiswa("6706160047","ELISABETH MEISAH SIMAMORA"));
        list02.add(new mahasiswa("6706160053","HUDIO HIZARI"));
        list02.add(new mahasiswa("6706160059","WAHYU NURHIDAYAT"));
        list02.add(new mahasiswa("6706160065","BRYAN RAFSANZANI"));
        list02.add(new mahasiswa("6706160074","PRAMANA PUTRA"));
        list02.add(new mahasiswa("6706160077","FRISNADI TRY PUTRA"));
        list02.add(new mahasiswa("6706160098","EMA NUR KUSWARI"));
        list02.add(new mahasiswa("6706160107","DIKI ISKANDAR"));
        list02.add(new mahasiswa("6706160113","RIVKAL SUKMA SANJAYA"));
        list02.add(new mahasiswa("6706160131","AHMAD DZAKY ABRORI"));
        list02.add(new mahasiswa("6706162050","BUNGA RIZKYANI"));
        list02.add(new mahasiswa("6706162062","MUHAMAD IKHSAN RAMADHAN"));
        list02.add(new mahasiswa("6706162119","RIDWAN JUNAEDI"));
        list02.add(new mahasiswa("6706162125","LINTANG PRAYOGO"));
        list02.add(new mahasiswa("6706162134","AHMAD AL GHOZI RAMADHAN"));
        list02.add(new mahasiswa("6706164002","SETO JALU PRIYONO"));
        list02.add(new mahasiswa("6706164011","REZA PRATIDINATA HAREFA"));
        list02.add(new mahasiswa("6706164035","JAMIE MEGAPUTRA"));
        list02.add(new mahasiswa("6706164071","ANDY MAULANA YUSUF"));
        list02.add(new mahasiswa("6706164086","RIZKY EKA MAULANA"));
        list02.add(new mahasiswa("6706164101","ABID HANIFUSSAFLY"));
        list02.add(new mahasiswa("6706164110","RIZKY HILMAN FATURRAHMAN"));

        mahasiswaadapter mhsadap= new mahasiswaadapter(this, R.layout.listview,list02);
        listView.setAdapter(mhsadap);



    }
}
