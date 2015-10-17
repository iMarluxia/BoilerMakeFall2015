package org.rtgj.boilermakefall2015;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Tucker on 10/17/2015.
 */
public class BoilerMakeFall2015 extends Application{
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this, getString(R.string.ApplicationID),getString(R.string.ClientKey));
    }
}
