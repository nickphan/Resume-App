package com.example.thefr.dsmp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by thefr on 6/5/2017.
 */

public class ProjectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
    }

    public void tritonTagClick(View view){
        Intent intent = new Intent(this, ProjectInformationActivity.class);
        intent.putExtra("projectName", "Triton Tag");
        startActivity(intent);
    }

    public void pidgeyCalcClick(View view){
        Intent intent = new Intent(this, ProjectInformationActivity.class);
        intent.putExtra("projectName", "PidgeyCalc");
        startActivity(intent);
    }
}
