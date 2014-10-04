package com.example.comicim_20.contactlist;

import com.example.comicim_20.Conversation;
import com.example.comicim_20.R;
import com.example.comicim_20.R.id;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class ContactViewHolder {
	public ImageView photo;
	public TextView name;
	public TextView lastTime;
	public ImageView statusIndicator;
	public TextView messageCount;
	
	public ContactViewHolder(View v) {
		photo = (ImageView) v.findViewById(R.id.contact_row_photo);
		name = (TextView) v.findViewById(R.id.contact_row_name);
		lastTime = (TextView) v.findViewById(R.id.contact_row_last_date);
		statusIndicator = (ImageView) v.findViewById(R.id.contact_row_status_indicator);
		messageCount = (TextView) v.findViewById(R.id.contact_row_message_count);
	}
	
	public void populate(Conversation c) {
		photo.setImageResource(R.drawable.ic_action_person);
		name.setText(c.phoneNumber);
	}
}
