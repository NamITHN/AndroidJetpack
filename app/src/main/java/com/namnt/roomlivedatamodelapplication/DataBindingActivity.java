package com.namnt.roomlivedatamodelapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.namnt.roomlivedatamodelapplication.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    ActivityDataBindingBinding activityDataBindingBinding;
    ClickHandler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding);
        activityDataBindingBinding=DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
        activityDataBindingBinding.setNote(new Note("Hello","HELLOLOLO",1));
        handler=new ClickHandler(this);
        activityDataBindingBinding.setClick(handler);

    }
}
