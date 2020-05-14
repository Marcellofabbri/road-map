package eu.marcellofabbri.roadmap.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import eu.marcellofabbri.roadmap.R;
import eu.marcellofabbri.roadmap.presenter.EventPresenter;

import static eu.marcellofabbri.roadmap.presenter.EventPresenter.*;

public class MainActivity extends AppCompatActivity implements EventView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void updateInfoTextView() {

    }
}
