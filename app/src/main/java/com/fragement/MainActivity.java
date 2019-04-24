package com.fragement;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragement.FirstFragment;
import fragement.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bthFragment;

    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bthFragment = findViewById(R.id.btnFragment);
        bthFragment.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.commit();
            bthFragment.setText("Load Second Fragment");
            status = false;
        }else{
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
            fragmentTransaction.commit();
            bthFragment.setText("Load First Fragment");
            status = true;
        }

    }
}
