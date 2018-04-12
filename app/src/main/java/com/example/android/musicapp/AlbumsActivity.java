package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Albums> albumsList = new ArrayList<Albums>();
        albumsList.add(new Albums("Let it be", "The Beatles"));
        albumsList.add(new Albums("Man of the woods", "Justin Timberlake"));
        albumsList.add(new Albums("25", "Adele"));

        AlbumsAdapter adapter = new AlbumsAdapter(this, albumsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
