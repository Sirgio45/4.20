package com.ebookfrenzy.a420;

/**
 * Created by sergio on 3/29/2017.
 */

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity  extends PreferenceActivity
{
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
