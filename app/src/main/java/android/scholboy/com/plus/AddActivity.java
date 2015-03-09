package android.scholboy.com.plus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class AddActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        TextView ok = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();//создаем намерение,  чтобы изымать данные

        String first = intent.getStringExtra("first");//изымаем данные по ключу first
        String second = intent.getStringExtra("two");//изымаем данные по ключу two
        int one = Integer.parseInt(first.toString());//преобразуем из стринги в инту
        int two = Integer.parseInt(second.toString());//преобразуем из стринги в инту
        int three = one+two;// складываем
        //String s = String.valueOf(three);
        ok.setText(""+three);//выводим

    }


}
