package pe.jota.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * Method that shows the requested app from the main activity.
     * TODO: change from toasts to intents when finishing each app
     * @param view view calling the method
     */
    public void showApp(View view) {
         switch(view.getId()) {
            case R.id.btnSpotify:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_spotify_streamer),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnScores:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_scores_app),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLibrary:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_library_app),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBigger:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_build_bigger),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnReader:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_xyz_reader),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(getApplicationContext(), getString(R.string.msg_own_app),
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
