package com.example.android.quiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public RadioButton e1_1921, e1_1934, e1_1925, e1_1900, e2_yes, e2_no, e3_2004, e3_2005, e3_2006, e4_bayer, e4_benfica;
    public CheckBox e5_retsos, e5_siovas, e5_chori, e5_pardo;
    public RadioGroup er1, er2, er3, er4, er5;
    public Button submit;
    public EditText name;
    public int results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1_1921 = (RadioButton) findViewById(R.id.ap1921);
        e1_1934 = (RadioButton) findViewById(R.id.ap1934);
        e1_1925 = (RadioButton) findViewById(R.id.ap1925);
        e1_1900 = (RadioButton) findViewById(R.id.ap1900);
        e2_yes = (RadioButton) findViewById(R.id.yes);
        e2_no = (RadioButton) findViewById(R.id.no);
        e3_2004 = (RadioButton) findViewById(R.id.ap2004);
        e3_2005 = (RadioButton) findViewById(R.id.ap2005);
        e3_2006 = (RadioButton) findViewById(R.id.ap2006);
        e4_bayer = (RadioButton) findViewById(R.id.apLev);
        e4_benfica = (RadioButton) findViewById(R.id.apBen);
        e5_retsos = (CheckBox) findViewById(R.id.apRetsos);
        e5_siovas = (CheckBox) findViewById(R.id.apSiovas);
        e5_chori = (CheckBox) findViewById(R.id.apChori);
        e5_pardo = (CheckBox) findViewById(R.id.apPardo);
        submit = (Button) findViewById(R.id.submit);
        submit.isClickable();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText) findViewById(R.id.WriteYourName);
                String yourName = name.getText().toString(); /*apothikeuw to ONOMA se mia METAVLITI*/
                int result = 0;
                if (e1_1925.isChecked()) {
                    result += 20;
                }
                if (e2_yes.isChecked()) {
                    result += 20;
                }
                if (e3_2004.isChecked()) {
                    result += 20;
                }
                    if (e4_bayer.isChecked()) {
                        result += 20;
                    }
                    if (e5_siovas.isChecked() && e5_pardo.isChecked()) {
                        result += 20;
                    }
                    String message = "Dear " + yourName + " You are " + result + " % Olympiakos Fan !";
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }
            });
        }
}
