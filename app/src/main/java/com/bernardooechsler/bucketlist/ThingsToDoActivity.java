package com.bernardooechsler.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Climb Mount Kilimanjaro", "Do it the difficult way!", R.drawable.kilimanjaro, 2.2f),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle, probably Norway.", R.drawable.northern_lights, 5),
                new BucketListEntry("Road Trip across the USA", "Hire a car from the west coast, and travel to the east coast", R.drawable.road_trip, 3.6f),
                new BucketListEntry("Scuba Dive", "In Koh Tao, Thailand", R.drawable.scubadive, 4.4f),
                new BucketListEntry("Skydive", "Do it the difficult way!", R.drawable.skydive, 5)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}