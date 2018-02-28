package com.example.ikhsanramadhan.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class kelas01Activity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas01);
        listView =(ListView)findViewById(R.id.if01);
        ArrayList<mahasiswa> Listkelas01 = new ArrayList<>();

        Listkelas01.add(new mahasiswa("6706160001","LUTHFI HAFIYYAN NABILA"));
        Listkelas01.add(new mahasiswa("6706160007", "AULIA IKVANDA YOREN"));
        Listkelas01.add(new mahasiswa("6706160010","HERDI FIRMANUDIN"));
        Listkelas01.add(new mahasiswa("6706160025","FAHMI TAUFIQURRAHMAN"));
        Listkelas01.add(new mahasiswa("6706160031","MUHAMAD BAIHAQI ABDILLAH"));
        Listkelas01.add(new mahasiswa("6706160034","CANDANI KARTIKO PARASTURI"));
        Listkelas01.add(new mahasiswa("6706160037","ALVIANITA KUSUMA ADMAJA"));
        Listkelas01.add(new mahasiswa("6706160043","SILFI NUR AMALIA"));
        Listkelas01.add(new mahasiswa("6706160049","DANAH MIFTAFARID"));
        Listkelas01.add(new mahasiswa("6706160067","RIFALDI TAJRIAL"));
        Listkelas01.add(new mahasiswa("6706160073","SIDIK SUHENDAR"));
        Listkelas01.add(new mahasiswa("6706160085","ANDY SRY MULYAH ASTUTI"));
        Listkelas01.add(new mahasiswa("6706160097","MOCHAMAD RIDWAN ADRIANSYAH"));
        Listkelas01.add(new mahasiswa("6706160109","OKI ARYAN KARTIKO AJI"));
        Listkelas01.add(new mahasiswa("6706160133","LUCKAS INDRAWAN PRASETIA"));
        Listkelas01.add(new mahasiswa("6706161013","ZIKRULLAH ALIWAIDA"));
        Listkelas01.add(new mahasiswa("6706161055","HANIF KHOIRUL FATHANSYAH"));
        Listkelas01.add(new mahasiswa("6706161103","HIDAYATULHIDAYAH"));
        Listkelas01.add(new mahasiswa("6706162106","MUHAMAD TAUFIQ RAMADHAN"));
        Listkelas01.add(new mahasiswa("6706162118","ADAM BUDI SATRIA"));
        Listkelas01.add(new mahasiswa("6706162127","RAHMAD SATRIA KURNIAWAN"));
        Listkelas01.add(new mahasiswa("6706164019","MOCHAMMAD FAALIH RACHMAN"));
        Listkelas01.add(new mahasiswa("6706164022","YUDHISTIRA CARAKA"));
        Listkelas01.add(new mahasiswa("6706164058","YOGA WAHYU YUWONO"));
        Listkelas01.add(new mahasiswa("6706164061","REYNALDI DANIEL"));
        Listkelas01.add(new mahasiswa("6706164070","BAYU SULISTYO"));
        Listkelas01.add(new mahasiswa("6706164082","NORMALITA DEVI"));
        Listkelas01.add(new mahasiswa("6706164091","NUR ASY-SYIFA`UFISSUDUR"));
        Listkelas01.add(new mahasiswa("6706164115","DHIKA HUTAMA PUTRA"));
        Listkelas01.add(new mahasiswa("6706164130","NANDA FEBRIAN ADHINUGROHO"));

        mahasiswaadapter mhsadapter= new mahasiswaadapter(this, Listkelas01);
        listView.setAdapter(mhsadapter);


    }
}
