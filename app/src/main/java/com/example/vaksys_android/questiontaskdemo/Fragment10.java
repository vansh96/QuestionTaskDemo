package com.example.vaksys_android.questiontaskdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by vaksys-android on 11/14/17.
 */

public class Fragment10 extends android.app.Fragment implements View.OnClickListener {

    Button q1b1,q1b2,q1b3,q1b4;
    private static int time = 1000;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_10,container,false);

         q1b1 = (Button)view.findViewById(R.id.q10b1);
        q1b1.setOnClickListener(this);

        q1b2 = (Button) view.findViewById(R.id.q10b2);
        q1b2.setOnClickListener(this);

         q1b3 = (Button) view.findViewById(R.id.q10b3);
        q1b3.setOnClickListener(this);

         q1b4 = (Button) view.findViewById(R.id.q10b4);
        q1b4.setOnClickListener(this);

        return view;

    }

    public void callF10() {



    }

    @Override
    public void onClick(View view)

    {
        switch (view.getId())
        {
            case R.id.q10b1:
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b3.setEnabled(false);
                q1b4.setEnabled(false);
                callF10();
                break;



            case R.id.q10b2:
                q1b2.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b3.setEnabled(false);
                q1b4.setEnabled(false);

                break;

            case R.id.q10b3:
                q1b3.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b4.setEnabled(false);

                break;

            case R.id.q10b4:
                q1b4.setBackgroundColor(Color.RED);
                q1b1.setBackgroundColor(Color.GREEN);
                q1b2.setEnabled(false);
                q1b3.setEnabled(false);
                break;

        }

    }



    }

