package com.example.chaithra.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the view that shows the number category
        TextView numbers = (TextView) findViewById(R.id.restaurant);

        //Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View v) {

                //create a new intent to open the {@link NumbersActivity}
                Intent intent = new Intent(getApplicationContext(), Restaurant.class);

                //Start the new activty
                startActivity(intent);

            }
        });

        //Find the view that shows the family category
        TextView famailyMembers = (TextView) findViewById(R.id.attractions);

        //Set a click listener on that view
        famailyMembers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View v) {

                //create a new intent to open the {@link FamilyMembersActivity}
                Intent intent = new Intent(getApplicationContext(), Attractions.class);

                //Start the new activity
                startActivity(intent);

            }
        });

        //Find the view that shows the colors category
        TextView colors = (TextView) findViewById(R.id.beaches);

        //Set a click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {

            //The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View v) {

                //create a new intent to open the {@link ColorsActivity}
                Intent intent = new Intent(getApplicationContext(), Beaches.class);

                //Start the new activity
                startActivity(intent);
            }
        });


        //Find view that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.it_companies);


        //Set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {

            //The code in this method will executed when the phrases category is clicked on.

            @Override
            public void onClick(View v) {

                //create a new intent to open the {@link PhrasesActivity
                Intent intent = new Intent(getApplicationContext(), ItCompanies.class);

                //Start the new activity
                startActivity(intent);
            }
        });

    }


}

