package id.ac.polinema.beliphone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import id.ac.polinema.beliphone.R;

public class DetailActivity extends AppCompatActivity {
    TextView title,desc;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.title);
        desc = findViewById(R.id.desc);
        imageView2 = findViewById(R.id.imageView2);
        title.setText(getIntent().getExtras().getString("title"));
        desc.setText(getIntent().getExtras().getString("desc"));

        if(getIntent().getExtras().getString("code_image").equals("1")){
            Glide
                    .with(this)
                    .load(R.drawable.satu1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("2")){
            Glide
                    .with(this)
                    .load(R.drawable.dua1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("3")){
            Glide
                    .with(this)
                    .load(R.drawable.tiga1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("4")){
            Glide
                    .with(this)
                    .load(R.drawable.empat1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("5")){
            Glide
                    .with(this)
                    .load(R.drawable.lima1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("6")){
            Glide
                    .with(this)
                    .load(R.drawable.enam1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("7")){
            Glide
                    .with(this)
                    .load(R.drawable.tujuh1)
                    .into(imageView2);
        }else if (getIntent().getExtras().getString("code_image").equals("8")){
            Glide
                    .with(this)
                    .load(R.drawable.delapan1)
                    .into(imageView2);
        }
    }
}
