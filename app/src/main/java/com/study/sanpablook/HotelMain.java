package com.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class HotelMain extends AppCompatActivity {


    private CardView casaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        CardView casaCard = (CardView)findViewById(R.id.casaCard);
        casaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHotelCasa();
            }
        });
    }

    public void openHotelCasa() {
        Intent intent = new Intent(this, HotelCasa.class);
        startActivity(intent);
    }
}