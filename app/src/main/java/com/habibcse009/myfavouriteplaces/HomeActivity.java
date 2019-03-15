package com.habibcse009.myfavouriteplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
Button btnPlace1,btnPlace2,btnPlace3,btnPlace4,btnPlace5,btnPlace6,btnPlace7,btnPlace8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPlace1 = findViewById(R.id.btn1);
        btnPlace2 = findViewById(R.id.btn2);
        btnPlace3 = findViewById(R.id.btn3);
        btnPlace4 = findViewById(R.id.btn4);
        btnPlace5 = findViewById(R.id.btn5);
        btnPlace6 = findViewById(R.id.btn6);
        btnPlace7 = findViewById(R.id.btn7);
        btnPlace8 = findViewById(R.id.btn8);

        btnPlace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "one");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "St. Martin's Island", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "two");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Cox's Bazar", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "three");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Nilgiri", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "four");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Kaptai Lake", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "five");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Shubhalang waterfall", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "six");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Foys lake", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "seven");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Jaflong", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("Place_no", "eight");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Sundarban", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
