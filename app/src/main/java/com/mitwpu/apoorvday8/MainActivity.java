package com.mitwpu.apoorvday8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.tv.TimelineRequest;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    TextView edName, edNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum = findViewById(R.id.edNum);
        edName = findViewById(R.id.edName);
    }

    public void timerClick(View view) {
        String hrs = edName.getText().toString();
        String min = edNum.getText().toString();
        String msg = "UTH JA NA JYADA TIME HORAY KYA";
        Intent in = new Intent(AlarmClock.ACTION_SET_TIMER);
        in.putExtra(AlarmClock.EXTRA_MESSAGE, msg);
        in.putExtra(AlarmClock.EXTRA_HOUR, hrs);
        in.putExtra(AlarmClock.EXTRA_MINUTES, min);
        startActivity(in);

    }

    public void smsClick(View view) {
        String num = edNum.getText().toString();
        String msg = edName.getText().toString();
        Intent in = new Intent(Intent.ACTION_SENDTO);
        in.setData(Uri.parse("sms:" +num));
        in.putExtra("sms_body", msg);
        startActivity(in);
    }

    public void callClick(View view) {
        String num = edNum.getText().toString();
        Intent in = new Intent(Intent.ACTION_DIAL);
        in.setData(Uri.parse("tel:" +num));
        startActivity(in);
    }

    public void alarmClick(View view) {
        String hrs = edName.getText().toString();
        String min = edNum.getText().toString();
        String msg = "UTH JA NA JYADA TIME HORAY KYA";
        Intent in = new Intent(AlarmClock.ACTION_SET_ALARM);
        in.putExtra(AlarmClock.EXTRA_MESSAGE, msg);
        in.putExtra(AlarmClock.EXTRA_HOUR, hrs);
        in.putExtra(AlarmClock.EXTRA_MINUTES, min);
        startActivity(in);
    }

    public void pageClick(View view) {
        String msg = edName.getText().toString();
        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(msg));
        startActivity(in);

    }
}