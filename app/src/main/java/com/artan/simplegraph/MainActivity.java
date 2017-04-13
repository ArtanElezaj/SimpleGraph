package com.artan.simplegraph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = (BarChart)findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f,0));
        barEntries.add(new BarEntry(22f,1));
        barEntries.add(new BarEntry(66f,2));
        barEntries.add(new BarEntry(85f,3));
        barEntries.add(new BarEntry(34f,4));
        barEntries.add(new BarEntry(15f,5));
        barEntries.add(new BarEntry(3f,6));
        barEntries.add(new BarEntry(76f,7));
        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");

        ArrayList<String> theDates = new ArrayList<>();;
        theDates.add("April");
        theDates.add("May");
        theDates.add("June");
        theDates.add("July");
        theDates.add("August");
        theDates.add("September");
        theDates.add("October");
        theDates.add("November");

        BarData theData = new BarData(theDates, barDataSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }
}
