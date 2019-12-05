package com.namnt.roomlivedatamodelapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandler {
    private Context context;

    ClickHandler(Context context) {
        this.context = context;
    }

    public void onClickHandler(View view){
        Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
    }
}
