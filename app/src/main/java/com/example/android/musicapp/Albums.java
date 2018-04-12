package com.example.android.musicapp;

/**
 * Created by Polina on 12/04/2018.
 */

public class Albums {

    private String mTitle;
    private String mAuthor;

    public Albums (String title, String authr)
    {
        mTitle = title;
        mAuthor = authr;
    }

    /**
     * Get the title of the album.
     */
    public String getAlbumTitle() {
        return mTitle;
    }

    /**
     * Get the author of the album.
     */
    public String getAlbumAuthor() {
        return mAuthor;
    }

}
