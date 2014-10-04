package com.example.comicim_20;

import java.util.ArrayList;
import java.util.List;

public final class Contact {
	public Contact(long id, String phoneNumber) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.messages = new ArrayList<Message>();
	}

	public long id;
	public String phoneNumber;

	public List<Message> messages;
}
