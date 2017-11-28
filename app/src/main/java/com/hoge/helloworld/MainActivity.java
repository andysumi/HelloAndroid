package com.hoge.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設定
        Button button = findViewById(R.id.button);

        // TextViewの設定
        textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // flagがtrueの場合
                if (flag) {
                    textView.setText(R.string.hello);
                    flag = false;
                }
                // flagがfalseの場合
                else {
                    textView.setText(R.string.world);
                    flag = true;
                }
            }
        });
    }
}
