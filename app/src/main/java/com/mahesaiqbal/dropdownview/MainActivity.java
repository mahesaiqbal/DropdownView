package com.mahesaiqbal.dropdownview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.anthonyfdev.dropdownview.DropDownView;

public class MainActivity extends AppCompatActivity {

    private DropDownView dropDownView;
    private View collapsedView, expandedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dropDownView = (DropDownView) findViewById(R.id.drop_down_view);
        collapsedView = LayoutInflater.from(this).inflate(R.layout.header, null, false);
        expandedView = LayoutInflater.from(this).inflate(R.layout.footer, null, false);

        dropDownView.setHeaderView(collapsedView);
        dropDownView.setExpandedView(expandedView);

        collapsedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dropDownView.isExpanded()) {
                    dropDownView.collapseDropDown();
                } else {
                    dropDownView.expandDropDown();
                }
            }
        });
    }
}
