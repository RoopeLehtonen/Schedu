package com.example.roope.schedu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {

            case R.id.action_load:

                loadTimetable();

                return true;

            default: return
                    super.onOptionsItemSelected(item);

        }

    }



    public void loadTimetable() {

        // Asetetaan muuttujaan savedTimetable ladattava lukujärjestys.
        final int PREFERENCE_MODE_PRIVATE = 0;
        SharedPreferences savedTimetable = getPreferences(PREFERENCE_MODE_PRIVATE);

        /*
         * Alustetaan TextView-muuttujat jokaisen päivän tunnille.
         */
        // Maanantai
        TextView monday7 = (TextView) findViewById(R.id.mondaySeven);
        TextView monday8 = (TextView) findViewById(R.id.mondayEight);
        TextView monday9 = (TextView) findViewById(R.id.mondayNine);
        TextView monday10 = (TextView) findViewById(R.id.mondayTen);
        TextView monday11 = (TextView) findViewById(R.id.mondayEleven);
        TextView monday12 = (TextView) findViewById(R.id.mondayTwelve);
        TextView monday13 = (TextView) findViewById(R.id.mondayThirteen);
        TextView monday14 = (TextView) findViewById(R.id.mondayFourteen);
        TextView monday15 = (TextView) findViewById(R.id.mondayFifteen);
        TextView monday16 = (TextView) findViewById(R.id.mondaySixteen);
        TextView monday17 = (TextView) findViewById(R.id.mondaySeventeen);

        // Tiistai
        TextView tuesday7 = (TextView) findViewById(R.id.tuesdaySeven);
        TextView tuesday8 = (TextView) findViewById(R.id.tuesdayEight);
        TextView tuesday9 = (TextView) findViewById(R.id.tuesdayNine);
        TextView tuesday10 = (TextView) findViewById(R.id.tuesdayTen);
        TextView tuesday11 = (TextView) findViewById(R.id.tuesdayEleven);
        TextView tuesday12 = (TextView) findViewById(R.id.tuesdayTwelve);
        TextView tuesday13 = (TextView) findViewById(R.id.tuesdayThirteen);
        TextView tuesday14 = (TextView) findViewById(R.id.tuesdayFourteen);
        TextView tuesday15 = (TextView) findViewById(R.id.tuesdayFifteen);
        TextView tuesday16 = (TextView) findViewById(R.id.tuesdaySixteen);
        TextView tuesday17 = (TextView) findViewById(R.id.tuesdaySeventeen);

        // Keskiviikko
        TextView wednesday7 = (TextView) findViewById(R.id.wednesdaySeven);
        TextView wednesday8 = (TextView) findViewById(R.id.wednesdayEight);
        TextView wednesday9 = (TextView) findViewById(R.id.wednesdayNine);
        TextView wednesday10 = (TextView) findViewById(R.id.wednesdayTen);
        TextView wednesday11 = (TextView) findViewById(R.id.wednesdayEleven);
        TextView wednesday12 = (TextView) findViewById(R.id.wednesdayTwelve);
        TextView wednesday13 = (TextView) findViewById(R.id.wednesdayThirteen);
        TextView wednesday14 = (TextView) findViewById(R.id.wednesdayFourteen);
        TextView wednesday15 = (TextView) findViewById(R.id.wednesdayFifteen);
        TextView wednesday16 = (TextView) findViewById(R.id.wednesdaySixteen);
        TextView wednesday17 = (TextView) findViewById(R.id.wednesdaySeventeen);

        // Torstai
        TextView thursday7 = (TextView) findViewById(R.id.thursdaySeven);
        TextView thursday8 = (TextView) findViewById(R.id.thursdayEight);
        TextView thursday9 = (TextView) findViewById(R.id.thursdayNine);
        TextView thursday10 = (TextView) findViewById(R.id.thursdayTen);
        TextView thursday11 = (TextView) findViewById(R.id.thursdayEleven);
        TextView thursday12 = (TextView) findViewById(R.id.thursdayTwelve);
        TextView thursday13 = (TextView) findViewById(R.id.thursdayThirteen);
        TextView thursday14 = (TextView) findViewById(R.id.thursdayFourteen);
        TextView thursday15 = (TextView) findViewById(R.id.thursdayFifteen);
        TextView thursday16 = (TextView) findViewById(R.id.thursdaySixteen);
        TextView thursday17 = (TextView) findViewById(R.id.thursdaySeventeen);

        // Perjantai
        TextView friday7 = (TextView) findViewById(R.id.fridaySeven);
        TextView friday8 = (TextView) findViewById(R.id.fridayEight);
        TextView friday9 = (TextView) findViewById(R.id.fridayNine);
        TextView friday10 = (TextView) findViewById(R.id.fridayTen);
        TextView friday11 = (TextView) findViewById(R.id.fridayEleven);
        TextView friday12 = (TextView) findViewById(R.id.fridayTwelve);
        TextView friday13 = (TextView) findViewById(R.id.fridayThirteen);
        TextView friday14 = (TextView) findViewById(R.id.fridayFourteen);
        TextView friday15 = (TextView) findViewById(R.id.fridayFifteen);
        TextView friday16 = (TextView) findViewById(R.id.fridaySixteen);
        TextView friday17 = (TextView) findViewById(R.id.fridaySeventeen);

        /*
         * Ladataan tallennetut merkkijonot tunnisteen mukaan ja
         * asetetaan vastaavan TextView-muuttujan sisällöksi.
         */
        // Maanantai
        monday7.setText(savedTimetable.getString("mondaySeven", ""));
        monday8.setText(savedTimetable.getString("mondayEight", ""));
        monday9.setText(savedTimetable.getString("mondayNine", ""));
        monday10.setText(savedTimetable.getString("mondayTen", ""));
        monday11.setText(savedTimetable.getString("mondayEleven", ""));
        monday12.setText(savedTimetable.getString("mondayTwelve", ""));
        monday13.setText(savedTimetable.getString("mondayThirteen", ""));
        monday14.setText(savedTimetable.getString("mondayFourteen", ""));
        monday15.setText(savedTimetable.getString("mondayFifteen", ""));
        monday16.setText(savedTimetable.getString("mondaySixteen", ""));
        monday17.setText(savedTimetable.getString("mondaySeventeen", ""));

        // Tiistai
        tuesday7.setText(savedTimetable.getString("tuesdaySeven", ""));
        tuesday8.setText(savedTimetable.getString("tuesdayEight", ""));
        tuesday9.setText(savedTimetable.getString("tuesdayNine", ""));
        tuesday10.setText(savedTimetable.getString("tuesdayTen", ""));
        tuesday11.setText(savedTimetable.getString("tuesdayEleven", ""));
        tuesday12.setText(savedTimetable.getString("tuesdayTwelve", ""));
        tuesday13.setText(savedTimetable.getString("tuesdayThirteen", ""));
        tuesday14.setText(savedTimetable.getString("tuesdayFourteen", ""));
        tuesday15.setText(savedTimetable.getString("tuesdayFifteen", ""));
        tuesday16.setText(savedTimetable.getString("tuesdaySixteen", ""));
        tuesday17.setText(savedTimetable.getString("tuesdaySeventeen", ""));

        // Keskiviikko
        wednesday7.setText(savedTimetable.getString("wednesdaySeven", ""));
        wednesday8.setText(savedTimetable.getString("wednesdayEight", ""));
        wednesday9.setText(savedTimetable.getString("wednesdayNine", ""));
        wednesday10.setText(savedTimetable.getString("wednesdayTen", ""));
        wednesday11.setText(savedTimetable.getString("wednesdayEleven", ""));
        wednesday12.setText(savedTimetable.getString("wednesdayTwelve", ""));
        wednesday13.setText(savedTimetable.getString("wednesdayThirteen", ""));
        wednesday14.setText(savedTimetable.getString("wednesdayFourteen", ""));
        wednesday15.setText(savedTimetable.getString("wednesdayFifteen", ""));
        wednesday16.setText(savedTimetable.getString("wednesdaySixteen", ""));
        wednesday17.setText(savedTimetable.getString("wednesdaySeventeen", ""));

        // Torstai
        thursday7.setText(savedTimetable.getString("thursdaySeven", ""));
        thursday8.setText(savedTimetable.getString("thursdayEight", ""));
        thursday9.setText(savedTimetable.getString("thursdayNine", ""));
        thursday10.setText(savedTimetable.getString("thursdayTen", ""));
        thursday11.setText(savedTimetable.getString("thursdayEleven", ""));
        thursday12.setText(savedTimetable.getString("thursdayTwelve", ""));
        thursday13.setText(savedTimetable.getString("thursdayThirteen", ""));
        thursday14.setText(savedTimetable.getString("thursdayFourteen", ""));
        thursday15.setText(savedTimetable.getString("thursdayFifteen", ""));
        thursday16.setText(savedTimetable.getString("thursdaySixteen", ""));
        thursday17.setText(savedTimetable.getString("thursdaySeventeen", ""));

        // Perjantai
        friday7.setText(savedTimetable.getString("fridaySeven", ""));
        friday8.setText(savedTimetable.getString("fridayEight", ""));
        friday9.setText(savedTimetable.getString("fridayNine", ""));
        friday10.setText(savedTimetable.getString("fridayTen", ""));
        friday11.setText(savedTimetable.getString("fridayEleven", ""));
        friday12.setText(savedTimetable.getString("fridayTwelve", ""));
        friday13.setText(savedTimetable.getString("fridayThirteen", ""));
        friday14.setText(savedTimetable.getString("fridayFourteen", ""));
        friday15.setText(savedTimetable.getString("fridayFifteen", ""));
        friday16.setText(savedTimetable.getString("fridaySixteen", ""));
        friday17.setText(savedTimetable.getString("fridaySeventeen", ""));
    }

    public void modifyTimeTable(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, ModifyActivity.class);
        startActivity(intent);


    }
}
