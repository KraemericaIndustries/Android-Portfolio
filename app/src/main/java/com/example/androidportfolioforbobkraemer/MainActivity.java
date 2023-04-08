package com.example.androidportfolioforbobkraemer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
            new Project("Motivational Quote", "I can code a TextView", R.drawable.quote),
            new Project("Inches2Meters", "I can code Image/Edit/Button Views", R.drawable.tape),
            new Project("BMI Calculator", "I can code various layout resource files & conditional logic", R.drawable.calculator),
            new Project("The Hungry Developer", "I can code activities, CardView, and ScrollView", R.drawable.main),
            new Project("Android Portfolio", "I can code RecyclerViews and Material Design", R.drawable.portfolio),
            new Project("Bucket List", "I can code a RatingBar view", R.drawable.bucket_list),
            new Project("Self Promotion", "I can read & write KotlinI can read & write Kotlin", R.drawable.self_promotion),
            new Project("Registration Form", "I can build forms and code Spinners & TextInputLayout viewgroups", R.drawable.registration),
            new Project("Record Keeper", "I can code Fragments, & use ConstraintLayout viewgroup & viewBinding", R.drawable.stanley)
        };
        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}