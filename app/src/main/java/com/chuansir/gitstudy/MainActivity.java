package com.chuansir.gitstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * feature-1
     * display HelloWorld
     *
     */
    public void feature1() {

        Log.e(MainActivity.class.getSimpleName(),"HelloWorld!");
    }

}
