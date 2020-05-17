package eu.marcellofabbri.roadmap.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import eu.marcellofabbri.roadmap.R;
import eu.marcellofabbri.roadmap.presenter.EventPresenter;

import static eu.marcellofabbri.roadmap.presenter.EventPresenter.*;

public class MainActivity extends AppCompatActivity implements EventView {
    private Button goToAddEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mainLinearLayout = findViewById(R.id.mainLinearLayout);
        TextView newTextView = new TextView(this);
        newTextView.setText("New Text View added dinamically");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        newTextView.setLayoutParams(params);
        mainLinearLayout.addView(newTextView);

        goToAddEvent = (Button) findViewById(R.id.add);
        goToAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddEvent();
            }
        });
    }

    public void openAddEvent() {
        Intent intent = new Intent(this, AddEvent.class);
        startActivity(intent);
    }

    @Override
    public void updateInfoTextView() {

    }
}
