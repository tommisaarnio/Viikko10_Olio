package com.tommisaarnio.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private String fieldOfStudy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.txtFirstName);
        lastName = findViewById(R.id.txtLastName);
        email = findViewById(R.id.txtEmail);
    }

    public void addUser(View view){
        UserStorage us = UserStorage.getInstance();
        String studentFirstName = (firstName.getText().toString());
        String studentLastName = (lastName.getText().toString());
        String studentEmail = (email.getText().toString());
        RadioGroup rgStudent = findViewById(R.id.radioGroup);

        switch (rgStudent.getCheckedRadioButtonId()) {
            case R.id.rdbtnTite:
                fieldOfStudy = "Tietotekniikka";
                break;
            case R.id.rdbtnTuta:
                fieldOfStudy = "Tuotantotalous";
                break;
            case R.id.rdbtnLate:
                fieldOfStudy = "Laskennallinen tekniikka";
                break;
            case R.id.rdbtnSate:
                fieldOfStudy = "Sähkötekniikka";
                break;
        }
        User user = new User (studentFirstName, studentLastName, studentEmail, fieldOfStudy);
        us.addUser(user);
    }

    public void switchToStudentList(View view) {
        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);
    }


}