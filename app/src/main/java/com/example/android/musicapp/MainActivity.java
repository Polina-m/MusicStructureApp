package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songs = (TextView) findViewById(R.id.songs);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView artists = (TextView) findViewById(R.id.artists);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

    }
}
