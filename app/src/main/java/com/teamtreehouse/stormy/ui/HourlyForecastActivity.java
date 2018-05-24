package com.teamtreehouse.stormy.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.teamtreehouse.stormy.R;
import com.teamtreehouse.stormy.Weather.Hour;
import com.teamtreehouse.stormy.adapters.HourlyAdapter;
import com.teamtreehouse.stormy.databinding.ActivityHourlyForecastBinding;

import java.util.ArrayList;
import java.util.List;

public class HourlyForecastActivity extends AppCompatActivity {

  private HourlyAdapter adapter;
  private ActivityHourlyForecastBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    binding = DataBindingUtil.setContentView(this,
        R.layout.activity_hourly_forecast);

    adapter = new HourlyAdapter(getHourData(), this);

    binding.hourlyListItems.setAdapter(adapter);
    binding.hourlyListItems.setLayoutManager(new LinearLayoutManager(this));

  }

  private List<Hour> getHourData() {
    List<Hour> hours = new ArrayList<>();

    Hour hour = new Hour(1526508000, "Mostly Cloudy", 57.29, "partly-cloudy-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526511600, "Clear", 57.29, "clear-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526515200, "Clear", 57.29, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526518800, "Windy", 57.29, "wind", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526522400, "Snowy", 57.29, "snow", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526526000, "Raining", 57.29, "rain", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526529600, "Foggy", 57.29, "fog", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526533200, "Mostly Cloudy", 57.29, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526536800, "Sleet", 57.29, "sleet", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526540400, "Cloudy", 57.29, "cloudy", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(152654400, "Mostly Cloudy", 57.29, "partly-cloudy-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526547600, "Partly Cloudy", 57.29, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526551200, "Partly Cloudy", 57.29, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1526554800, "Partly Cloudy", 57.29, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);


    return hours;
  }

}
