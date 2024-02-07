package michael.quon.n01565129;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;

public class MichaelActivity1 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSubmit = findViewById(R.id.button);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from EditText
                EditText editText = findViewById(R.id.editText);
                String userData = editText.getText().toString();
                long dataToSend;

                // Check if EditText is empty
                if (!userData.isEmpty()) {
                    dataToSend = Long.parseLong(userData);
                } else {
                    dataToSend = -1000L; // Default value when EditText is empty
                }

                // Create Snackbar with action "START"
                Snackbar snackbar = Snackbar.make(v, getString(R.string.welcome_michael_quon_n01565129), Snackbar.LENGTH_INDEFINITE)
                        .setAction(getString(R.string.start), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Navigate to SecondActivity and pass the dataToSend
                                Intent intent = new Intent(MichaelActivity1.this, QuonActivity2.class);
                                intent.putExtra("DATA_KEY", dataToSend);
                                startActivity(intent);
                            }
                        });
                snackbar.show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Log statement when app resumes
        Log.d("MichaelActivity1", "App resumed - Full Name: Michael Quon, Student ID: N01565129");
    }
}
