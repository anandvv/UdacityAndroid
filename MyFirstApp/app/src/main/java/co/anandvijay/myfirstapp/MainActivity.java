package co.anandvijay.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

    //This method is called when the First Button is clicked
    public void FirstAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches the Spotify Streamer App", Toast.LENGTH_SHORT).show();
    }

    //This method is called when the Second Button is clicked
    public void SecondAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches the Scores App", Toast.LENGTH_SHORT).show();
    }

    //This method is called when the Third Button is clicked
    public void ThirdAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches the Library App", Toast.LENGTH_SHORT).show();
    }

    //This method is called when the Fourth Button is clicked
    public void FourthAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches the Build It Bigger App", Toast.LENGTH_SHORT).show();
    }

    //This method is called when the Fifth Button is clicked
    public void FifthAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches the Bacon Reader App", Toast.LENGTH_SHORT).show();
    }

    //This method is called when the Custom Button is clicked
    public void CustomAppLauncher(View v) {
        // Toast the name to display temporarily on screen
        Toast.makeText(this, "This button launches My Custom App", Toast.LENGTH_SHORT).show();
    }
}
