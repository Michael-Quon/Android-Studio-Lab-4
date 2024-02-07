package michael.quon.n01565129;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class QuonActivity2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quon);

        TextView dataTextView = findViewById(R.id.dataTextView);
        // Retrieve the long data passed from the first activity
        long userData = getIntent().getLongExtra("DATA_KEY", -1000);
        dataTextView.setText(String.valueOf(userData)); // Display only the number without the prefix

        // Log the received data
        Log.d("QuonActivity2", "Received data: " + userData);
    }
}
