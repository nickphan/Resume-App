package com.example.thefr.dsmp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void projectButtonClick(View view){
        Intent intent = new Intent(this, ProjectActivity.class);
        startActivity(intent);
    }

    public void workButtonClick(View view){
        Intent intent = new Intent(this, WorkActivity.class);
        startActivity(intent);
    }
    public void educationButtonClick(View view){
        Intent intent = new Intent(this, EducationActivity.class);
        startActivity(intent);
    }
    public void aboutMeButtonClick(View view){
        Intent intent = new Intent(this, AboutMeActivity.class);
        startActivity(intent);
    }
    public void contactMeButtonClick(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String myEmail = "thefryingphan@gmail.com";

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");

        emailIntent.putExtra(Intent.EXTRA_EMAIL, myEmail);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Saw Your App");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello Mr. Phan\n I would love to talk to you about a job opportunity.\n");
        startActivity(Intent.createChooser(emailIntent, "Send mail"));

    }
}
