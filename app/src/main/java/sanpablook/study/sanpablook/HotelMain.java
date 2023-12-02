package sanpablook.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.study.sanpablook.R;

public class HotelMain extends AppCompatActivity {


    private CardView casaCard;
    private CardView medingCard;

    @SuppressLint("MissingInflatedId")
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
        CardView medingCard = (CardView)findViewById(R.id.medingCard);
        medingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHotelMeding();
            }
        });
    }

    public void openHotelCasa() {
        Intent intent = new Intent(this, HotelCasa.class);
        startActivity(intent);
    }

    public void openHotelMeding() {
        Intent intent = new Intent(this, HotelMeding.class);
        startActivity(intent);
    }
}