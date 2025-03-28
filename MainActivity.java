package com.example.savaedpreference;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private EditText name;
private EditText age;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edit1);
        age=findViewById(R.id.edit2);
    }
    @Override
    protected void onResume(){
        super.onResume();
        SharedPreferences sp=getSharedPreferences("Userpreferences",MODE_PRIVATE);
        String savedname=sp.getString("user_name","");
        int savedage=sp.getInt("user_age",0);
        name.setText(savedname);
        age.setText(savedage>0?String.valueOf(savedage):"");
        }
        @Override
    protected void onPause(){
        super.onPause();
        //storing in sharedpreference
        SharedPreferences sp=getSharedPreferences("Userpreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        //Retriving user input and saving
            editor.putString("user_name",name.getText().toString());
            String ageInput=age.getText().toString();
            int userage=ageInput.isEmpty()?0:Integer.parseInt(ageInput);
            editor.putInt("user_age",userage);
            editor.apply();
        }
}
