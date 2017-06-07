package com.example.thefr.dsmp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by thefr on 6/6/2017.
 */

public class ProjectInformationActivity extends Activity{

    String projectTitle;
    String projectInformation;
    String githubLink;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_information);

        Intent intent = getIntent();
        String projectName = intent.getStringExtra("projectName");

        if(projectName.equals("Triton Tag")){
            projectTitle = getString(R.string.project_title_tritontag);
            projectInformation = getString(R.string.tritontag_information);
            githubLink = "https://github.com/nickphan/TritonTag";
        }else if(projectName.equals("PidgeyCalc")){
            projectTitle = getString(R.string.project_title_pidgeycalc);
            projectInformation = getString(R.string.pidgeycalc_information);
            githubLink = "https://github.com/nickphan/PidgeyCalc";
        }else{

        }

        TextView title = (TextView)findViewById(R.id.project_name);
        title.setText(projectTitle);
        TextView information = (TextView)findViewById(R.id.project_information);
        information.setText(projectInformation);
    }

    public void githubClicked(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubLink));
        startActivity(browserIntent);
    }
}
