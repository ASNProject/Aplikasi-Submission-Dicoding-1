package com.asnproject.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView judul1 = findViewById(R.id.judul);
        ImageView gambarImg = findViewById(R.id.gambar1);
        TextView isidetail = findViewById(R.id.detailisi);
        TextView sumber = findViewById(R.id.sumber);
        makanan data = (makanan) getIntent().getSerializableExtra("data");

        Glide.with(this).load(data.getGambar()).into(gambarImg);
        judul1.setText(data.getMakanan());
        isidetail.setText(data.getDeskripsi());
        sumber.setText(data.getSumber());



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
                Intent aboutintent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(aboutintent);
                break;
        }
    }

}
