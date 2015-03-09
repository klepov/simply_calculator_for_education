package android.scholboy.com.plus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class InputActivity extends ActionBarActivity {

    public static final String FIRST = "first";
    public static final String TWO = "two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final EditText one = (EditText)findViewById(R.id.numEditText1);
        final EditText two = (EditText)findViewById(R.id.numEditText2);
        Button add = (Button)findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputActivity.this, AddActivity.class); //создаем намериние
                if (one.getText().toString().equals("") || two.getText().toString().equals("")) {
                    Toast.makeText(InputActivity.this, "empty!!!!", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    intent.putExtra(FIRST, one.getText().toString());//кладем первое поле
                    intent.putExtra(TWO, two.getText().toString());//второе поле
                    startActivity(intent);//запускаем активость

                }
            }
        });
    }

}


