package sanpablook.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.study.sanpablook.R;

public class HotelMeding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meding);

        TextView stayPrice = (TextView) findViewById(R.id.stayPrice);
        String text = "<font color=#1A9AB7>₱ 3, 864</font> <font color=#000000>/ night</font>";
        stayPrice.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT));
    }
}