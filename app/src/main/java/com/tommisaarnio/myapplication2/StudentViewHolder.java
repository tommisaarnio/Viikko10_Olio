package com.tommisaarnio.myapplication2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView studentFirstName, studentEmail, studentDegreeProgram;


    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        studentFirstName = itemView.findViewById(R.id.txtUserName);
        studentEmail = itemView.findViewById(R.id.txtUserEmail);
        studentDegreeProgram= itemView.findViewById(R.id.txtUserDegreeProgram);
    }
}