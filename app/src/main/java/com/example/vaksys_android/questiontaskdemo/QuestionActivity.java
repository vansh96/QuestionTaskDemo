package com.example.vaksys_android.questiontaskdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

/**
 * Created by vaksys-android on 11/14/17.
 */

public class QuestionActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        initialize();
    }

    public void initialize()
    {
        frameLayout = (FrameLayout)findViewById(R.id.main_frame);

        Fragment1 fragment = new Fragment1();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_frame,fragment);
        fragmentTransaction.commit();

    }
}
