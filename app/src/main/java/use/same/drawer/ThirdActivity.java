package use.same.drawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by mig on 25/09/2018.
 */

public class ThirdActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = LayoutInflater.from(this).inflate(R.layout.third_activity, null, false);
        drawer.addView(view, 0);
    }
}
