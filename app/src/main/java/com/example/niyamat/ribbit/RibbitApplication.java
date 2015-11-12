package com.example.niyamat.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


/**
 * Created by Niyamat on 10/4/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "YtfUvbIKYKZKBjkPvYeDmMFdckckQX47DWM2rEDc", "0dkD0CWlxY9ya9gnGXsoWVgaFv89FSi0cL4sjhSQ");


    }
}
