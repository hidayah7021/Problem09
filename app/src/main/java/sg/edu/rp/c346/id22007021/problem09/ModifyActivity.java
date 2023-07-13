package sg.edu.rp.c346.id22007021.problem09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ModifyActivity extends AppCompatActivity {

    TextView tvSongID, tvSongTl, tvSinger, tvYearM, tvStar;
    EditText etSongID, etSongTl, etSinger, etYearM;
    Button btnUpdt, btnDelet, btnCancel;
    RadioButton rdb1, rdb2, rdb3, rdb4, rdb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);
    }
}