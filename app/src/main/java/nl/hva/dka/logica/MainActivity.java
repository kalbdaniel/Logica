package nl.hva.dka.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSubmit(View view){
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);

        boolean result = editText3.getText().toString().equals("T") &&
                editText4.getText().toString().equals("F") &&
                editText5.getText().toString().equals("F") &&
                editText6.getText().toString().equals("F");

        if(result){
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, getString(R.string.wrong), Toast.LENGTH_SHORT).show();
        }
    }
}
