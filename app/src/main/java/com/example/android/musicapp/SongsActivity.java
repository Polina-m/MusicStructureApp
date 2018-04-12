package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Songs> songsList = new ArrayList<Songs>();
        songsList.add(new Songs("Hello", "Adele", 0455));
        songsList.add(new Songs("Send My Love (To Your New Lover)", "Adele", 0343));
        songsList.add(new Songs("I Miss You", "Adele", 0547));
        songsList.add(new Songs("When We Were Young", "Adele", 0451));
        songsList.add(new Songs("Remedy", "Adele", 0405));
        songsList.add(new Songs("Water Under the Bridge", "Adele", 0400));
        songsList.add(new Songs("River Lea", "Adele", 0345));
        songsList.add(new Songs("Love in the Dark", "Adele", 0446));
        songsList.add(new Songs("Million Years Ago", "Adele", 0347));
        songsList.add(new Songs("All I Ask", "Adele", 0432));
        songsList.add(new Songs("Sweetest Devotion", "Adele", 0412));

        songsList.add(new Songs("Two of Us", "The Beatles", 0337));
        songsList.add(new Songs("Dig a Pony", "The Beatles", 0354));
        songsList.add(new Songs("Across the Universe", "The Beatles", 0347));
        songsList.add(new Songs("I Me Mine", "The Beatles", 0226));
        songsList.add(new Songs("Dig It", "The Beatles", 0050));
        songsList.add(new Songs("Let It Be", "The Beatles", 0403));
        songsList.add(new Songs("Maggie Mae", "The Beatles", 0040));
        songsList.add(new Songs("I've Got a Feeling", "The Beatles", 0337));
        songsList.add(new Songs("One After 909", "The Beatles", 0254));
        songsList.add(new Songs("The Long and Winding Road", "The Beatles", 0337));
        songsList.add(new Songs("For You Blue", "The Beatles", 0232));
        songsList.add(new Songs("Get Back", "The Beatles", 0307));

        songsList.add(new Songs("Filthy", "Justin Timberlake", 0453));
        songsList.add(new Songs("Midnight Summer Jam", "Justin Timberlake", 0512));
        songsList.add(new Songs("Sauce", "Justin Timberlake", 0405));
        songsList.add(new Songs("Man of the Woods", "Justin Timberlake", 0403));
        songsList.add(new Songs("Higher, Higher", "Justin Timberlake", 0417));
        songsList.add(new Songs("Wave", "Justin Timberlake", 0424));
        songsList.add(new Songs("Supplies", "Justin Timberlake", 0345));
        songsList.add(new Songs("Morning Light", "Justin Timberlake", 0402));
        songsList.add(new Songs("Say Something", "Justin Timberlake", 0437));
        songsList.add(new Songs("Hers", "Justin Timberlake", 0101));
        songsList.add(new Songs("Flannel", "Justin Timberlake", 0447));
        songsList.add(new Songs("Montana", "Justin Timberlake", 0437));
        songsList.add(new Songs("Breeze Off The Pond", "Justin Timberlake", 0411));
        songsList.add(new Songs("Livin' Off the Land", "Justin Timberlake", 0453));
        songsList.add(new Songs("The Hard Stuff", "Justin Timberlake", 0315));
        songsList.add(new Songs("Young Man", "Justin Timberlake", 0345));

        SongsAdapter adapter = new SongsAdapter(this, songsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
