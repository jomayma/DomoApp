package jmm.org.domoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class DomoHomeActivityFragment extends Fragment {
    private final String LOG_TAG = DomoHomeActivityFragment.class.getSimpleName();

    public DomoHomeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_domo_home, container, false);
        Log.v(LOG_TAG, "onCreateView...");

        final Button buttonUp = (Button) rootView.findViewById(R.id.action_up);
        buttonUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doUpAction(v);
            }
        });

        final Button buttonDown = (Button) rootView.findViewById(R.id.action_down);
        buttonDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doDownAction(v);
            }
        });

        return rootView;
    }


    private void doUpAction(View v) {
        Log.v(LOG_TAG, "Doing Up Action...");
        Toast toast = Toast.makeText(getActivity(), "Doing Up Action...", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void doDownAction(View v) {
        Log.v(LOG_TAG, "Doing Down Action...");
        Toast toast = Toast.makeText(getActivity(), "Doing Down Action...", Toast.LENGTH_SHORT);
        toast.show();
    }
}
