package com.freddy.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.freddy.event.CEventCenter;
/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       SecondActivity.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     类描述</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 18:30</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void dispatchEvent(View view) {
        CEventCenter.dispatchEvent("test", 0, 0, "来自SecondActivity的事件");
    }
}
