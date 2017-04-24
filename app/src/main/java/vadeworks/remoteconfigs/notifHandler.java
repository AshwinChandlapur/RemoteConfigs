package vadeworks.remoteconfigs;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static android.R.attr.data;

public class notifHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif_handler);
        ImageView imageView =(ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String bigText = intent.getExtras().getString("bigText");
        textView.setText(bigText);

        String imgUrl = intent.getExtras().getString("imgUrl");
        Picasso.with(this).load(imgUrl).into(imageView);

    }
}
