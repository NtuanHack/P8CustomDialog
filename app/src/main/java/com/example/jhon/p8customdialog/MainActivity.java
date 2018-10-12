package com.example.jhon.p8customdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShow = (Button) findViewById(R.id.bt_show);

        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle("Hallo");

                TextView tv_desc = (TextView) dialog.findViewById(R.id.tv_desc);
                tv_desc.setText("Hai");
                ImageView iv_icon = (ImageView) dialog.findViewById(R.id.iv_icon);
                iv_icon.setImageResource(R.mipmap.ic_launcher);

                Button bt_ok = (Button) dialog.findViewById(R.id.bt_ok);
                bt_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

}
