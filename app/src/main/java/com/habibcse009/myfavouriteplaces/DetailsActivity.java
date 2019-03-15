package com.habibcse009.myfavouriteplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    TextView txtName, txtDescription;
    ImageView imgPlace;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txtName = findViewById(R.id.txt_place_name);
        txtDescription = findViewById(R.id.txt_description);
        imgPlace = findViewById(R.id.img_place);
        btnBack = findViewById(R.id.btn_back);


        String getName = getIntent().getExtras().getString("Place_no");

        if (getName.equals("one")) {
            imgPlace.setImageResource(R.drawable.sainmartin);
            txtName.setText("St. Martin's Island");
            txtDescription.setText(R.string.Place1);
            backaction();
        } else if (getName.equals("two")) {
            imgPlace.setImageResource(R.drawable.coxbazar);
            txtName.setText("Cox's Bazar");
            txtDescription.setText(R.string.Place2);
            backaction();
        } else if (getName.equals("three")) {
            imgPlace.setImageResource(R.drawable.nilgiri);
            txtName.setText("Nilgiri");
            txtDescription.setText(R.string.Place3);
            backaction();
        } else if (getName.equals("four")) {
            imgPlace.setImageResource(R.drawable.kaptailake);
            txtName.setText("Kaptai Lake");
            txtDescription.setText(R.string.Place4);
            backaction();
        } else if (getName.equals("five")) {
            imgPlace.setImageResource(R.drawable.rangamatizorna);
            txtName.setText("Rangamati");
            txtDescription.setText(R.string.Place5);
            backaction();
        } else if (getName.equals("six")) {
            imgPlace.setImageResource(R.drawable.foyzlake);
            txtName.setText("Foys lake");
            txtDescription.setText(R.string.Place6);
            backaction();
        } else if (getName.equals("seven")) {
            imgPlace.setImageResource(R.drawable.zaflong);
            txtName.setText("Jaflong");
            txtDescription.setText(R.string.Place7);
            backaction();
        } else if (getName.equals("eight")) {
            imgPlace.setImageResource(R.drawable.sundorbon);
            txtName.setText("Sundarban");
            txtDescription.setText(R.string.Place8);
            backaction();
        }

    }

    public void backaction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, HomeActivity.class);
                startActivity(intent);
                Toast.makeText(DetailsActivity.this, "Back to Home Page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
