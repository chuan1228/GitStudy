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
     * feature-2
     * display HelloWorld
     *
     */
    public void feature2() {

        Log.e(MainActivity.class.getSimpleName(),"HelloWorld!");
    }


    /**
     * feature-4
     * display HelloWorld
     *
     */
    public void feature4() {

        Log.e(MainActivity.class.getSimpleName(),"HelloWorld!");
    }


    /**
     * feature-5
     * display HelloWorld
     *
     */
    public void feature5() {

        Log.e(MainActivity.class.getSimpleName(),"HelloWorld!");
    }

}
