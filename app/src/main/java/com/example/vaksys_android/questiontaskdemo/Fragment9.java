package com.example.vaksys_android.questiontaskdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by vaksys-android on 11/14/17.
 */

public class Fragment9 extends android.app.Fragment implements View.OnClickListener {

    Button q1b1,q1b2,q1b3,q1b4;
    private static int time = 1000;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_9,container,false);

         q1b1 = (Button)view.findViewById(R.id.q9b1);
        q1b1.setOnClickListener(this);

        q1b2 = (Button) view.findViewById(R.id.q9b2);
        q1b2.setOnClickListener(this);

         q1b3 = (Button) view.findViewById(R.id.q9b3);
        q1b3.setOnClickListener(this);

         q1b4 = (Button) view.findViewById(R.id.q9b4);
        q1b4.setOnClickListener(this);

        return view;

    }

    public void callF9() {


        long delayInMillis = 1000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            }
        }, delayInMillis);
        //pd.setMessage("Please Wait Calculating...");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Fragment10 fragment9 = new Fragment10();
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.main_frame,fragment9);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        }, time);
    }

    @Override
    public void onClick(View view)

    {
        switch (view.getId())
        {
            case R.id.q9b1:
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b3.setEnabled(false);
                q1b4.setEnabled(false);
                callF9();
                break;



            case R.id.q9b2:
                q1b2.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b3.setEnabled(false);
                q1b4.setEnabled(false);

                break;

            case R.id.q9b3:
                q1b3.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b4.setEnabled(false);

                break;

            case R.id.q9b4:
                q1b4.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b3.setEnabled(false);
                break;

        }

    }



    }

