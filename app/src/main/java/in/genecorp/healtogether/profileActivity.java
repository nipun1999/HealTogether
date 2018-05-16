package in.genecorp.healtogether;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {

    EditText nameTxt,ageTxt,emailTxt,countryTxt,heightTxt,dobTxt,weightTxt;
    TextView nameTextView,ageTextView,countryTextView,heightTextView,weightTextView,emailTextView,dobTextView,genderTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Nunito-Bold.ttf");

//        countryTextView = (TextView) (findViewById(R.id.countryTextView));
//        heightTextView = (TextView) (findViewById(R.id.heightTextView));
//        weightTextView = (TextView) (findViewById(R.id.weightTextView));
//        emailTextView = (TextView) (findViewById(R.id.emailTextView));
//        dobTextView = (TextView) (findViewById(R.id.dobTextView));
        nameTxt = (EditText) (findViewById(R.id.nameTxt));
        ageTxt = (EditText) (findViewById(R.id.ageTxt));
          countryTxt = (EditText) (findViewById(R.id.countryTxt));
        heightTxt = (EditText) (findViewById(R.id.heightTxt));
        weightTxt = (EditText) (findViewById(R.id.weightTxt));
        emailTxt = (EditText) (findViewById(R.id.emailTxt));
        dobTxt = (EditText)(findViewById(R.id.dobTxt));
//        genderTextView = (TextView)(findViewById(R.id.genderTextView));

//        countryTextView.setTypeface(face);
//        heightTextView.setTypeface(face);
//        weightTextView.setTypeface(face);
//        emailTextView.setTypeface(face);
//        dobTextView.setTypeface(face);
//        genderTextView.setTypeface(face);
        countryTxt.setTypeface(face);
        heightTxt.setTypeface(face);
        weightTxt.setTypeface(face);
        emailTxt.setTypeface(face);
        ageTxt.setTypeface(face);
        nameTxt.setTypeface(face);
        dobTxt.setTypeface(face);
    }
}
