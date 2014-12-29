package panchalstudios.com.menuexamples;

        import android.app.DialogFragment;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.Menu;
        import android.view.MenuItem;

        import com.newthinktank.menuexamples2.app.R;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // This method creates the menu on the app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Called when a options menu item is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // We check what menu item was clicked and show a Toast
        if (id == R.id.action_settings) {

            // A DialogFragment is a Fragment you can place over top
            // the current Activity. A Fragment is like an interface
            // block that you can place into an Activity.
            // The FrgamentManager allows you to interact with the
            // Fragment
            DialogFragment myFragment = new MyDialogFragment();

            myFragment.show(getFragmentManager(), "theDialog");

            return true;

            // If exit was clicked close the app
        } else if (id ==  R.id.exit_the_app) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}