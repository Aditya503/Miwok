package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anusha on 8/11/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    //color resource id
    private int mColorRescourceId;
    private int mMediaResourceId;

    //defualt constructor
    public WordAdapter(Activity context ,ArrayList<Word> words,int colorRescourceId)
    {
        super(context,0,words);
        mColorRescourceId=colorRescourceId;

    }


    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok text view from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default_text_view from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        if(currWord.hasImage()) {
            iconView.setImageResource(currWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else
        {
            iconView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(mColorRescourceId);



        return listItemView;
    }
}
