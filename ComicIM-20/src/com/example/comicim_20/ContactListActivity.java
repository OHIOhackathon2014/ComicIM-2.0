package com.example.comicim_20;

import java.util.ArrayList;
import java.util.List;

import com.example.comicim_20.contactlist.ContactDatabaseHelper;
import com.example.comicim_20.contactlist.ContactListAdapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


public class ContactListActivity extends ActionBarActivity {
	private static String TAG = ContactListActivity.class.getName();
	
	public ContactDatabaseHelper databaseHelper;
	public List<Contact> contacts = new ArrayList<Contact>();
	public ListView contactListView;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list_activity);
        
        contacts.add(new Contact("+79037852844"));
        contacts.add(new Contact("+16147079195"));
        
        contactListView = (ListView) this.findViewById(R.id.contact_list);
        
        databaseHelper = new ContactDatabaseHelper(this);
        ContactListAdapter adapter = new ContactListAdapter(this, contacts);
        contactListView.setAdapter(adapter);
        
        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Log.i(TAG, "Clicked on " + contacts.get(position).phoneNumber);
			}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
