package com.example.strategdzr.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by user on 31/03/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
