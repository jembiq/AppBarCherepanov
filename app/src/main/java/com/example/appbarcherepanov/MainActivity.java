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
        int id = item.getItemId();
        Intent intent = null;

        switch (id) {
            case (R.id.action_open_notes) :
                intent = new Intent(MainActivity.this, NoteActivity.class);
                break;

            case (R.id.action_settings) :
                intent = new Intent(MainActivity.this, AddressSettingsActivity.class);
                break;

            case (R.id.action_open_calendar) :
                intent = new Intent(MainActivity.this, CalendarActivity.class);
                break;

            default: break;
        }
        if (intent != null) {
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
