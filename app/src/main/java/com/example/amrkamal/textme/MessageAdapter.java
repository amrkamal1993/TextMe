package com.example.amrkamal.textme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Amr Kamal on 02/07/18.
 */


public class MessageAdapter extends ArrayAdapter<MessageModel> {

    public MessageAdapter(Context context, int resource, List<MessageModel> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent,
                    false);
        }

        TextView messageTextView = convertView.findViewById(R.id.messageBody);
        TextView authorTextView = convertView.findViewById(R.id.message_creator);

        MessageModel message = getItem(position);

        boolean isPhoto = message.getPhotoUrl() != null;
        if (isPhoto) {
            messageTextView.setVisibility(View.GONE);
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            messageTextView.setText(message.getText());
        }
        authorTextView.setText(message.getName());

        return convertView;
    }
}
