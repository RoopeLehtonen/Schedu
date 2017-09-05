package com.example.roope.schedu;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class ModifyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_modify, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_save:

                saveTimetable();

                return true;

            case R.id.action_load:

                loadTimetable();

                return true;

            default:
                return super.onOptionsItemSelected(item);

            }

        }


    public void saveTimetable() {

        // Luodaan tallennuspaikka ja editori, jolla sitä muokataan.
        final int PREFERENCE_MODE_PRIVATE = 0;
        SharedPreferences savedTimetable = getPreferences(PREFERENCE_MODE_PRIVATE);
        SharedPreferences.Editor preferenceEditor = savedTimetable.edit();

        /*
         * Määritellään joka tunnille oma muuttuja, johon asetetaan EditText-muuttuja lukujärjestyksestä.
         */
        // Maanantai
        EditText monday7 = (EditText) findViewById(R.id.mondaySeven);
        EditText monday8 = (EditText) findViewById(R.id.mondayEight);
        EditText monday9 = (EditText) findViewById(R.id.mondayNine);
        EditText monday10 = (EditText) findViewById(R.id.mondayTen);
        EditText monday11 = (EditText) findViewById(R.id.mondayEleven);
        EditText monday12 = (EditText) findViewById(R.id.mondayTwelve);
        EditText monday13 = (EditText) findViewById(R.id.mondayThirteen);
        EditText monday14 = (EditText) findViewById(R.id.mondayFourteen);
        EditText monday15 = (EditText) findViewById(R.id.mondayFifteen);
        EditText monday16 = (EditText) findViewById(R.id.mondaySixteen);
        EditText monday17 = (EditText) findViewById(R.id.mondaySeventeen);

        // Tiistai
        EditText tuesday7 = (EditText) findViewById(R.id.tuesdaySeven);
        EditText tuesday8 = (EditText) findViewById(R.id.tuesdayEight);
        EditText tuesday9 = (EditText) findViewById(R.id.tuesdayNine);
        EditText tuesday10 = (EditText) findViewById(R.id.tuesdayTen);
        EditText tuesday11 = (EditText) findViewById(R.id.tuesdayEleven);
        EditText tuesday12 = (EditText) findViewById(R.id.tuesdayTwelve);
        EditText tuesday13 = (EditText) findViewById(R.id.tuesdayThirteen);
        EditText tuesday14 = (EditText) findViewById(R.id.tuesdayFourteen);
        EditText tuesday15 = (EditText) findViewById(R.id.tuesdayFifteen);
        EditText tuesday16 = (EditText) findViewById(R.id.tuesdaySixteen);
        EditText tuesday17 = (EditText) findViewById(R.id.tuesdaySeventeen);

        // Keskiviikko
        EditText wednesday7 = (EditText) findViewById(R.id.wednesdaySeven);
        EditText wednesday8 = (EditText) findViewById(R.id.wednesdayEight);
        EditText wednesday9 = (EditText) findViewById(R.id.wednesdayNine);
        EditText wednesday10 = (EditText) findViewById(R.id.wednesdayTen);
        EditText wednesday11 = (EditText) findViewById(R.id.wednesdayEleven);
        EditText wednesday12 = (EditText) findViewById(R.id.wednesdayTwelve);
        EditText wednesday13 = (EditText) findViewById(R.id.wednesdayThirteen);
        EditText wednesday14 = (EditText) findViewById(R.id.wednesdayFourteen);
        EditText wednesday15 = (EditText) findViewById(R.id.wednesdayFifteen);
        EditText wednesday16 = (EditText) findViewById(R.id.wednesdaySixteen);
        EditText wednesday17 = (EditText) findViewById(R.id.wednesdaySeventeen);

        // Torstai
        EditText thursday7 = (EditText) findViewById(R.id.thursdaySeven);
        EditText thursday8 = (EditText) findViewById(R.id.thursdayEight);
        EditText thursday9 = (EditText) findViewById(R.id.thursdayNine);
        EditText thursday10 = (EditText) findViewById(R.id.thursdayTen);
        EditText thursday11 = (EditText) findViewById(R.id.thursdayEleven);
        EditText thursday12 = (EditText) findViewById(R.id.thursdayTwelve);
        EditText thursday13 = (EditText) findViewById(R.id.thursdayThirteen);
        EditText thursday14 = (EditText) findViewById(R.id.thursdayFourteen);
        EditText thursday15 = (EditText) findViewById(R.id.thursdayFifteen);
        EditText thursday16 = (EditText) findViewById(R.id.thursdaySixteen);
        EditText thursday17 = (EditText) findViewById(R.id.thursdaySeventeen);

        // Perjantai
        EditText friday7 = (EditText) findViewById(R.id.fridaySeven);
        EditText friday8 = (EditText) findViewById(R.id.fridayEight);
        EditText friday9 = (EditText) findViewById(R.id.fridayNine);
        EditText friday10 = (EditText) findViewById(R.id.fridayTen);
        EditText friday11 = (EditText) findViewById(R.id.fridayEleven);
        EditText friday12 = (EditText) findViewById(R.id.fridayTwelve);
        EditText friday13 = (EditText) findViewById(R.id.fridayThirteen);
        EditText friday14 = (EditText) findViewById(R.id.fridayFourteen);
        EditText friday15 = (EditText) findViewById(R.id.fridayFifteen);
        EditText friday16 = (EditText) findViewById(R.id.fridaySixteen);
        EditText friday17 = (EditText) findViewById(R.id.fridaySeventeen);

        /*
         * Haetaan lukujärjestyksestä jokaisen tunnin sisältö String-muodossa yllä olevien EditText-muuttujien mukaan.
         */
        // Maanantai
        String mondaySeven = monday7.getText().toString();
        String mondayEight = monday8.getText().toString();
        String mondayNine = monday9.getText().toString();
        String mondayTen = monday10.getText().toString();
        String mondayEleven = monday11.getText().toString();
        String mondayTwelve = monday12.getText().toString();
        String mondayThirteen = monday13.getText().toString();
        String mondayFourteen = monday14.getText().toString();
        String mondayFifteen = monday15.getText().toString();
        String mondaySixteen = monday16.getText().toString();
        String mondaySeventeen = monday17.getText().toString();

        // Tiistai
        String tuesdaySeven = tuesday7.getText().toString();
        String tuesdayEight = tuesday8.getText().toString();
        String tuesdayNine = tuesday9.getText().toString();
        String tuesdayTen = tuesday10.getText().toString();
        String tuesdayEleven = tuesday11.getText().toString();
        String tuesdayTwelve = tuesday12.getText().toString();
        String tuesdayThirteen = tuesday13.getText().toString();
        String tuesdayFourteen = tuesday14.getText().toString();
        String tuesdayFifteen = tuesday15.getText().toString();
        String tuesdaySixteen = tuesday16.getText().toString();
        String tuesdaySeventeen = tuesday17.getText().toString();

        // Keskiviikko
        String wednesdaySeven = wednesday7.getText().toString();
        String wednesdayEight = wednesday8.getText().toString();
        String wednesdayNine = wednesday9.getText().toString();
        String wednesdayTen = wednesday10.getText().toString();
        String wednesdayEleven = wednesday11.getText().toString();
        String wednesdayTwelve = wednesday12.getText().toString();
        String wednesdayThirteen = wednesday13.getText().toString();
        String wednesdayFourteen = wednesday14.getText().toString();
        String wednesdayFifteen = wednesday15.getText().toString();
        String wednesdaySixteen = wednesday16.getText().toString();
        String wednesdaySeventeen = wednesday17.getText().toString();

        // Torstai
        String thursdaySeven = thursday7.getText().toString();
        String thursdayEight = thursday8.getText().toString();
        String thursdayNine = thursday9.getText().toString();
        String thursdayTen = thursday10.getText().toString();
        String thursdayEleven = thursday11.getText().toString();
        String thursdayTwelve = thursday12.getText().toString();
        String thursdayThirteen = thursday13.getText().toString();
        String thursdayFourteen = thursday14.getText().toString();
        String thursdayFifteen = thursday15.getText().toString();
        String thursdaySixteen = thursday16.getText().toString();
        String thursdaySeventeen = thursday17.getText().toString();

        // Perjantai
        String fridaySeven = friday7.getText().toString();
        String fridayEight = friday8.getText().toString();
        String fridayNine = friday9.getText().toString();
        String fridayTen = friday10.getText().toString();
        String fridayEleven = friday11.getText().toString();
        String fridayTwelve = friday12.getText().toString();
        String fridayThirteen = friday13.getText().toString();
        String fridayFourteen = friday14.getText().toString();
        String fridayFifteen = friday15.getText().toString();
        String fridaySixteen = friday16.getText().toString();
        String fridaySeventeen = friday17.getText().toString();

        /*
         * Tallennetaan jokaisen yllä olevan muuttujan sisältö vastaavan avaimen pariksi.
         */
        // Maanantai
        preferenceEditor.putString("mondaySeven", mondaySeven);
        preferenceEditor.putString("mondayEight", mondayEight);
        preferenceEditor.putString("mondayNine", mondayNine);
        preferenceEditor.putString("mondayTen", mondayTen);
        preferenceEditor.putString("mondayEleven", mondayEleven);
        preferenceEditor.putString("mondayTwelve", mondayTwelve);
        preferenceEditor.putString("mondayThirteen", mondayThirteen);
        preferenceEditor.putString("mondayFourteen", mondayFourteen);
        preferenceEditor.putString("mondayFifteen", mondayFifteen);
        preferenceEditor.putString("mondaySixteen", mondaySixteen);
        preferenceEditor.putString("mondaySeventeen", mondaySeventeen);

        // Tiistai
        preferenceEditor.putString("tuesdaySeven", tuesdaySeven);
        preferenceEditor.putString("tuesdayEight", tuesdayEight);
        preferenceEditor.putString("tuesdayNine", tuesdayNine);
        preferenceEditor.putString("tuesdayTen", tuesdayTen);
        preferenceEditor.putString("tuesdayEleven", tuesdayEleven);
        preferenceEditor.putString("tuesdayTwelve", tuesdayTwelve);
        preferenceEditor.putString("tuesdayThirteen", tuesdayThirteen);
        preferenceEditor.putString("tuesdayFourteen", tuesdayFourteen);
        preferenceEditor.putString("tuesdayFifteen", tuesdayFifteen);
        preferenceEditor.putString("tuesdaySixteen", tuesdaySixteen);
        preferenceEditor.putString("tuesdaySeventeen", tuesdaySeventeen);

        // Keskiviikko
        preferenceEditor.putString("wednesdaySeven", wednesdaySeven);
        preferenceEditor.putString("wednesdayEight", wednesdayEight);
        preferenceEditor.putString("wednesdayNine", wednesdayNine);
        preferenceEditor.putString("wednesdayTen", wednesdayTen);
        preferenceEditor.putString("wednesdayEleven", wednesdayEleven);
        preferenceEditor.putString("wednesdayTwelve", wednesdayTwelve);
        preferenceEditor.putString("wednesdayThirteen", wednesdayThirteen);
        preferenceEditor.putString("wednesdayFourteen", wednesdayFourteen);
        preferenceEditor.putString("wednesdayFifteen", wednesdayFifteen);
        preferenceEditor.putString("wednesdaySixteen", wednesdaySixteen);
        preferenceEditor.putString("wednesdaySeventeen", wednesdaySeventeen);

        // Torstai
        preferenceEditor.putString("thursdaySeven", thursdaySeven);
        preferenceEditor.putString("thursdayEight", thursdayEight);
        preferenceEditor.putString("thursdayNine", thursdayNine);
        preferenceEditor.putString("thursdayTen", thursdayTen);
        preferenceEditor.putString("thursdayEleven", thursdayEleven);
        preferenceEditor.putString("thursdayTwelve", thursdayTwelve);
        preferenceEditor.putString("thursdayThirteen", thursdayThirteen);
        preferenceEditor.putString("thursdayFourteen", thursdayFourteen);
        preferenceEditor.putString("thursdayFifteen", thursdayFifteen);
        preferenceEditor.putString("thursdaySixteen", thursdaySixteen);
        preferenceEditor.putString("thursdaySeventeen", thursdaySeventeen);

        // Perjantai
        preferenceEditor.putString("fridaySeven", fridaySeven);
        preferenceEditor.putString("fridayEight", fridayEight);
        preferenceEditor.putString("fridayNine", fridayNine);
        preferenceEditor.putString("fridayTen", fridayTen);
        preferenceEditor.putString("fridayEleven", fridayEleven);
        preferenceEditor.putString("fridayTwelve", fridayTwelve);
        preferenceEditor.putString("fridayThirteen", fridayThirteen);
        preferenceEditor.putString("fridayFourteen", fridayFourteen);
        preferenceEditor.putString("fridayFifteen", fridayFifteen);
        preferenceEditor.putString("fridaySixteen", fridaySixteen);
        preferenceEditor.putString("fridaySeventeen", fridaySeventeen);

        // Tallennetaan muutokset preferenceEditor-muuttujalle asetettuun tiedostoon.
        preferenceEditor.apply();

        // Ilmoitus käyttäjälle datan tallentumisesta.
        Toast.makeText(getApplicationContext(), getString(R.string.tableSavedMessage), Toast.LENGTH_SHORT).show();
    }

    public void loadTimetable() {

        // Asetetaan muuttujaan savedTimetable ladattava lukujärjestys.
        final int PREFERENCE_MODE_PRIVATE = 0;
        SharedPreferences savedTimetable = getPreferences(PREFERENCE_MODE_PRIVATE);

        /*
         * Alustetaan EditText-muuttujat jokaisen päivän tunnille.
         */
        // Maanantai
        EditText monday7 = (EditText) findViewById(R.id.mondaySeven);
        EditText monday8 = (EditText) findViewById(R.id.mondayEight);
        EditText monday9 = (EditText) findViewById(R.id.mondayNine);
        EditText monday10 = (EditText) findViewById(R.id.mondayTen);
        EditText monday11 = (EditText) findViewById(R.id.mondayEleven);
        EditText monday12 = (EditText) findViewById(R.id.mondayTwelve);
        EditText monday13 = (EditText) findViewById(R.id.mondayThirteen);
        EditText monday14 = (EditText) findViewById(R.id.mondayFourteen);
        EditText monday15 = (EditText) findViewById(R.id.mondayFifteen);
        EditText monday16 = (EditText) findViewById(R.id.mondaySixteen);
        EditText monday17 = (EditText) findViewById(R.id.mondaySeventeen);

        // Tiistai
        EditText tuesday7 = (EditText) findViewById(R.id.tuesdaySeven);
        EditText tuesday8 = (EditText) findViewById(R.id.tuesdayEight);
        EditText tuesday9 = (EditText) findViewById(R.id.tuesdayNine);
        EditText tuesday10 = (EditText) findViewById(R.id.tuesdayTen);
        EditText tuesday11 = (EditText) findViewById(R.id.tuesdayEleven);
        EditText tuesday12 = (EditText) findViewById(R.id.tuesdayTwelve);
        EditText tuesday13 = (EditText) findViewById(R.id.tuesdayThirteen);
        EditText tuesday14 = (EditText) findViewById(R.id.tuesdayFourteen);
        EditText tuesday15 = (EditText) findViewById(R.id.tuesdayFifteen);
        EditText tuesday16 = (EditText) findViewById(R.id.tuesdaySixteen);
        EditText tuesday17 = (EditText) findViewById(R.id.tuesdaySeventeen);

        // Keskiviikko
        EditText wednesday7 = (EditText) findViewById(R.id.wednesdaySeven);
        EditText wednesday8 = (EditText) findViewById(R.id.wednesdayEight);
        EditText wednesday9 = (EditText) findViewById(R.id.wednesdayNine);
        EditText wednesday10 = (EditText) findViewById(R.id.wednesdayTen);
        EditText wednesday11 = (EditText) findViewById(R.id.wednesdayEleven);
        EditText wednesday12 = (EditText) findViewById(R.id.wednesdayTwelve);
        EditText wednesday13 = (EditText) findViewById(R.id.wednesdayThirteen);
        EditText wednesday14 = (EditText) findViewById(R.id.wednesdayFourteen);
        EditText wednesday15 = (EditText) findViewById(R.id.wednesdayFifteen);
        EditText wednesday16 = (EditText) findViewById(R.id.wednesdaySixteen);
        EditText wednesday17 = (EditText) findViewById(R.id.wednesdaySeventeen);

        // Torstai
        EditText thursday7 = (EditText) findViewById(R.id.thursdaySeven);
        EditText thursday8 = (EditText) findViewById(R.id.thursdayEight);
        EditText thursday9 = (EditText) findViewById(R.id.thursdayNine);
        EditText thursday10 = (EditText) findViewById(R.id.thursdayTen);
        EditText thursday11 = (EditText) findViewById(R.id.thursdayEleven);
        EditText thursday12 = (EditText) findViewById(R.id.thursdayTwelve);
        EditText thursday13 = (EditText) findViewById(R.id.thursdayThirteen);
        EditText thursday14 = (EditText) findViewById(R.id.thursdayFourteen);
        EditText thursday15 = (EditText) findViewById(R.id.thursdayFifteen);
        EditText thursday16 = (EditText) findViewById(R.id.thursdaySixteen);
        EditText thursday17 = (EditText) findViewById(R.id.thursdaySeventeen);

        // Perjantai
        EditText friday7 = (EditText) findViewById(R.id.fridaySeven);
        EditText friday8 = (EditText) findViewById(R.id.fridayEight);
        EditText friday9 = (EditText) findViewById(R.id.fridayNine);
        EditText friday10 = (EditText) findViewById(R.id.fridayTen);
        EditText friday11 = (EditText) findViewById(R.id.fridayEleven);
        EditText friday12 = (EditText) findViewById(R.id.fridayTwelve);
        EditText friday13 = (EditText) findViewById(R.id.fridayThirteen);
        EditText friday14 = (EditText) findViewById(R.id.fridayFourteen);
        EditText friday15 = (EditText) findViewById(R.id.fridayFifteen);
        EditText friday16 = (EditText) findViewById(R.id.fridaySixteen);
        EditText friday17 = (EditText) findViewById(R.id.fridaySeventeen);

        /*
         * Ladataan tallennetut merkkijonot tunnisteen mukaan ja
         * asetetaan vastaavan EditText-muuttujan sisällöksi.
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



}
