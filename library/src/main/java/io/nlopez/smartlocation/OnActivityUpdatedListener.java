package io.nlopez.smartlocation;

import com.google.android.gms.location.DetectedActivity;

/**
 * Created by mrm on 4/1/15.
 */
public interface OnActivityUpdatedListener {
    public void onActivityUpdated(DetectedActivity detectedActivity);
}