package com.freddy.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.freddy.event.CEventCenter;
import com.freddy.event.I_CEventListener;

public class MainActivity extends AppCompatActivity implements I_CEventListener {

    private TextView mTestTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTestTextView = findViewById(R.id.tv_test);

        CEventCenter.registerEventListener(this, "test");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CEventCenter.unregisterEventListener(this, "test");
    }

    @Override
    public void onCEvent(String topic, int msgCode, int resultCode, Object obj) {
        // 事件回调
        switch (topic) {
            case "test": {
                mTestTextView.setText((String) obj);
                break;
            }

            default:
                break;
        }
    }

    public void gotoSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
