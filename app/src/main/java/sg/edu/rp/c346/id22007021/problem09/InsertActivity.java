package sg.edu.rp.c346.id22007021.problem09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class InsertActivity extends AppCompatActivity {

    TextView tvSong, tvSingers, tvYear, tvStars;
    EditText etSong, etSingers, etYear;
    Button btnInsert, btnShow;
    RadioButton rb1, rb2, rb3, rb4, rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
    }

}