package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Artists> artistsList = new ArrayList<Artists>();
        artistsList.add(new Artists("The Beatles"));
        artistsList.add(new Artists("Justin Timberlake"));
        artistsList.add(new Artists("Adele"));

        ArtistsAdapter adapter = new ArtistsAdapter(this, artistsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
