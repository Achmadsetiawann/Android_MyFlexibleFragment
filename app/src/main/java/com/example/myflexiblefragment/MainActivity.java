package com.example.myflexiblefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*

Structure MainActivity =>  activity_main.xml => MoveWithDataActivity.java / Uri.parse("tel:"+phoneNumber)

*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
