package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lina on 12/04/2018.
 */

public class AlbumsAdapter extends ArrayAdapter<Albums>{

    public AlbumsAdapter(Activity context, ArrayList<Albums> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the data item for this position
        Albums album = getItem(position);

        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        albumNameTextView.setText(album.getAlbumTitle());

        TextView albumAuthorTextView = (TextView) listItemView.findViewById(R.id.subtitle_text_view);
        albumAuthorTextView.setText(album.getAlbumAuthor());

//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        iconView.setImageResource(word.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
