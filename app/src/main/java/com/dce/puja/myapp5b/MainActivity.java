package com.dce.puja.myapp5b;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etdata=(EditText)findViewById(R.id.etdata);
        registerForContextMenu(etdata);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Action1:
                Toast.makeText(MainActivity.this,"action 1 clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.Action2:
            Toast.makeText(MainActivity.this,"action 2 clicked",Toast.LENGTH_LONG).show();
            break;
            case R.id.Action3:
            Toast.makeText(MainActivity.this,"action 3 clicked",Toast.LENGTH_LONG).show();
            break;



        }
        return super.onContextItemSelected(item);
    }
}
