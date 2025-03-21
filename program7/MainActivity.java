package com.example.program7;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu ){
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    public boolean onOptionItemSelected(@NonNull MenuItem item){
        super.onOptionsItemSelected(item);
        MenuChoice(item);
        return true;
    }
    private void CreateMenu(Menu menu) {
        MenuItem mn1=menu.add(0,0,0,"search");{
            mn1.setIcon(R.drawable.ic_launcher_background);
            mn1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mn2=menu.add(0,1,1,"Alert");{
            mn2.setIcon(R.drawable.ic_launcher_background);
            mn2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mn3=menu.add(0,2,2,"About");{
            mn3.setIcon(R.drawable.ic_launcher_background);
            mn3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mn4=menu.add(0,3,3,"Add");{
            mn4.setIcon(R.drawable.ic_launcher_background);
            mn4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mn5=menu.add(0,4,4,"Delete");{
            mn5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
    }
    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Toast.makeText(this,"you clicked in search",Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this,"you clicked in Alert",Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this,"you clicked in About",Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this,"you clicked in Add",Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this,"you clicked in Delete",Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
}



