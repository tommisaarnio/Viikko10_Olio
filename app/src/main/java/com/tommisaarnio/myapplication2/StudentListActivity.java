package com.tommisaarnio.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StudentListActivity extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);


        userStorage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvStudentList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new StudentListAdapter(getApplicationContext(), userStorage.getUsers()));
    }
}