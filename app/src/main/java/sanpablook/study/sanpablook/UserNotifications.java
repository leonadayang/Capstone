package sanpablook.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.study.sanpablook.R;

public class UserNotifications extends AppCompatActivity {

    ImageButton btnBackNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_notifications);

        btnBackNotification = findViewById(R.id.buttonBackNotification);

        btnBackNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}