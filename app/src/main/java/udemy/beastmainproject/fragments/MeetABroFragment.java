package udemy.beastmainproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import udemy.beastmainproject.R;

/**
 * Created by augustocbx on 22/05/17.
 */

public class MeetABroFragment extends Fragment {
    public static MeetABroFragment newInstance(){
        return new MeetABroFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_meet_a_bro, container, false);

        return rootView;
    }

}
