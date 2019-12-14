package com.example.appbarcherepanov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent noteActivityIntent = new Intent(MainActivity.this, NoteActivity.class);
        Intent settingsActivityIntent = new Intent(MainActivity.this, AddressSettingsActivity.class);
        Intent calendarActivityIntent = new Intent(MainActivity.this, CalendarActivity.class);

        int id = item.getItemId();

        switch (id) {
            case (R.id.action_open_notes) :
                startActivity(noteActivityIntent);
                break;

            case (R.id.action_settings) :
                startActivity(settingsActivityIntent);
                break;

            case (R.id.action_open_calendar) :
                startActivity(calendarActivityIntent);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
