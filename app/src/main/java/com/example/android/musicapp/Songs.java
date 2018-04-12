package com.example.android.musicapp;

/**
 * Created by lina on 12/04/2018.
 */

public class Songs {

        private String mName;
        private String mAuthor;
        private int mTime;
        private String mSongLength;

        public Songs (String name, String authr, int time)
        {
            mName = name;
            mAuthor = authr;
            mTime = time;
            mSongLength = String.format("%02d:%02d", mTime / 100, mTime % 100);
        }

        /**
         * Get the title of the album.
         */
        public String getSongName() {
            return mName;
        }

        /**
         * Get the author of the album.
         */
        public String getSongAuthor() {
            return mAuthor;
        }

        /**
         * Get the author of the album.
         */
        public String getSongLenght() {
            return mSongLength;
        }
}
