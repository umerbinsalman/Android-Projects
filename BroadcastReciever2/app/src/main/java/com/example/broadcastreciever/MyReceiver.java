package com.example.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("mytag","Broadcast Received");
        String xxx=intent.getStringExtra("message");
        Toast.makeText(context,xxx,Toast.LENGTH_LONG).show();
//        throw new UnsupportedOperationException("Not yet implemented");

    }
}
