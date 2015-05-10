package iit.rnu.demoproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    TextView lol ;
    EditText input;
    Button btn;
    String value="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lol  = (TextView) findViewById(R.id.lol);

        btn= (Button) findViewById(R.id.btn);

        input = (EditText) findViewById(R.id.inputText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               value = input.getText().toString();
                Toast.makeText(MainActivity.this , "mba7ba7 say : "+value, Toast.LENGTH_LONG).show();
                lol.setText("mba7ba7 lool");
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
