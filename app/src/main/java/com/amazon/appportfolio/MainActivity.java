package com.amazon.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens the Popular Movies project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchPopularMovies(View view) {
        final String temporaryText = "This button will launch my Popular Movies project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }

    /**
     * Opens the Stock Hawk project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchStockHawk(View view) {
        final String temporaryText = "This button will launch my Stock Hawk project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }

    /**
     * Opens the Build It Bigger project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchBuildItBigger(View view) {
        final String temporaryText = "This button will launch my Build It Bigger project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }

    /**
     * Opens the Make Your App Material project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchMakeYourAppMaterial(View view) {
        final String temporaryText = "This button will launch my Make Your App Material project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }

    /**
     * Opens the Go Ubiquitous project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchGoUbiquitous(View view) {
        final String temporaryText = "This button will launch my Go Ubiquitous project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }

    /**
     * Opens the Capstone project when the user touches the button.
     * @param view the {@link View} that was clicked.
     */
    public void launchCapstone(View view) {
        final String temporaryText = "This button will launch my Capstone project";
        Toast.makeText(view.getContext(), temporaryText, Toast.LENGTH_SHORT).show();
    }
}
