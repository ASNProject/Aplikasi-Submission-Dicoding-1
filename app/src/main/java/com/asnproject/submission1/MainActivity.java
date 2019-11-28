package com.asnproject.submission1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rvMakanan;
private ArrayList<makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.daftar_makanan);
        rvMakanan.setHasFixedSize(true);

        list.addAll(DaftarMakanan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listMakananAdapter = new ListMakananAdapter(list);
        rvMakanan.setAdapter(listMakananAdapter);

        listMakananAdapter.setOnItemClickCallback(new ListMakananAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(makanan data) {
                showSelectedMakanan(data);
                Intent detailIntent = new Intent(MainActivity.this, Main2Activity.class);
                detailIntent.putExtra("data", data);
                startActivity(detailIntent);
            }
        });
    }

    private void showSelectedMakanan(makanan makanan){
        Toast.makeText(this, "Pilih" + makanan.getMakanan(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {

        switch (selectedMode){
            case R.id.about:
                Intent aboutintent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(aboutintent);
                break;
        }
    }
}
