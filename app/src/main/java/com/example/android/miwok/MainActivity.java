package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

//        TextView numbers = findViewById(R.id.numbers);
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numbersIntent);
//            }
//        });
//
//        TextView colors = findViewById(R.id.colors);
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorIntent);
//            }
//        });
//
//        TextView family = findViewById(R.id.family);
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        TextView phrases = findViewById(R.id.phrases);
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phraseIntent);
//            }
//        });

        // Find the view page that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Set the adapter onto the new pager
        viewPager.setAdapter(adapter);




    }

}
