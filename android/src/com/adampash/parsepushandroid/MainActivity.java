package com.adampash.parsepushandroid;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
/* import android.content.DialogInterface; */
import android.os.Bundle;
import android.view.View;
/* import android.view.inputmethod.InputMethodManager; */
/* import android.widget.EditText; */
/* import android.widget.RadioButton; */
/* import android.widget.RadioGroup; */
/* import android.widget.Toast; */

import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.RefreshCallback;
import com.parse.SaveCallback;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Track app opens.
    ParseAnalytics.trackAppOpened(getIntent());

    Intent intent = new Intent();
    intent.setAction(Intent.ACTION_VIEW);
    /* intent.setData(uri); */
    Activity activity = TiApplication.getAppRootOrCurrentActivity();
    activity.startActivity(intent);

  }
}

