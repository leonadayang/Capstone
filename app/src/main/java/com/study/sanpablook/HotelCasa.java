package com.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class HotelCasa extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa);

        TextView stayPrice = (TextView) findViewById(R.id.stayPrice);
        String text = "<font color=#1A9AB7>₱ 3,900</font> <font color=#000000>/ night</font>";
        stayPrice.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT));

    }
}