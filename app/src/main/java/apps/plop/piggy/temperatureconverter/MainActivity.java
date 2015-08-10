package apps.plop.piggy.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View view)
    {
        switch(view.getId()) {
            case R.id.button1:
                RadioButton celsiusButon = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButon = (RadioButton) findViewById(R.id.radio1);
                if(text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
        }
    }
}

