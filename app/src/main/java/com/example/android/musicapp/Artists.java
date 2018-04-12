package com.example.android.musicapp;

/**
 * Created by Polina on 12/04/2018.
 * Class of Artists, with the preparation for image adding
 */

public class Artists {
    private String mName;
   private int mImageResourceId;

   public Artists(String Name){
       mName = Name;
//       mImageResourceId =ImageResourceId;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mName;
    }

    /**
     * Get item id
     */
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

}
