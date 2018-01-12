package com.dylan_stahl.dailylegend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button toDoSetupBtn = findViewById(R.id.ToDoSetupBtn);
        Button gameSetupBtn = findViewById(R.id.GameSetupBtn);
        Button characterBtn = findViewById(R.id.PlayerSetup);
        Button settingsBtn = findViewById(R.id.SettingsBtn);

    }

    public void goToToDoList(View view){
        Intent intent = new Intent(this, ToDoListEntry.class);
        startActivity(intent);
    }
}
