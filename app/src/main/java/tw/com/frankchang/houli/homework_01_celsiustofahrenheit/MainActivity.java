package tw.com.frankchang.houli.homework_01_celsiustofahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    TextView tvShow;
    Button btnTransform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviewer();
        btnTransform.setOnClickListener(btnClicker);
    }

    void findviewer(){
        etInput = (EditText) findViewById(R.id.editText);
        tvShow = (TextView) findViewById(R.id.textView);
        btnTransform = (Button) findViewById(R.id.button);
    }

    View.OnClickListener btnClicker = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strF, strC;
            Double d_F, d_C;

            try{
                strC = etInput.getText().toString();
                d_C = Double.parseDouble(strC);
                //華氏 = 攝氏*(9.0/5.0)+32.0
                d_F = d_C * (9.0 / 5.0) + 32.0;
                strF = String.valueOf(d_F);
                tvShow.setText(strF);
            }
            catch (Exception ex){
                etInput.setText("");
                tvShow.setText("");
                etInput.setHint(R.string.Error_Text);
            }

        }
    };
}
