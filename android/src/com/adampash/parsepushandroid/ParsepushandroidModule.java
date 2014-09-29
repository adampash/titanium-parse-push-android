/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.adampash.parsepushandroid;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

@Kroll.module(name="Parsepushandroid", id="com.adampash.parsepushandroid")
public class ParsepushandroidModule extends KrollModule
{

  // Standard Debugging variables
  private static final String LCAT = "ParsepushandroidModule";
  private static final boolean DBG = TiConfig.LOGD;

  // You can define constants with @Kroll.constant, for example:
  // @Kroll.constant public static final String EXTERNAL_NAME = value;

  public ParsepushandroidModule()
  {
    super();
  }

  public TiApplication appContext = TiApplication.getInstance();
  public Activity activity = appContext.getCurrentActivity();

  @Kroll.onAppCreate
  public static void onAppCreate(TiApplication app)
  {
    Log.d(LCAT, "inside onAppCreate");
    // put module init code that needs to run when the application is created
    /* Toast.makeText(activity, "app create", Toast.LENGTH_LONG) */
    /*   .show(); */
  }

  public void onResume(Activity thisActivity) {
    Log.d(LCAT, "inside onResume");
      /* Toast.makeText(activity, "Resume", Toast.LENGTH_LONG) */
      /*   .show(); */
  }

  public void onStart(Activity thisActivity) {
    Log.d(LCAT, "inside onStart");
      /* Toast.makeText(activity, "Start", Toast.LENGTH_LONG) */
      /*   .show(); */
  }


  // Methods
  @Kroll.method
  public void initialize(String appId, String clientId)
  {
    Log.d(LCAT, "example called");
    Parse.initialize(appContext, appId, clientId);
    PushService.setDefaultPushCallback(appContext, activity.getClass());
    /* PushService.setDefaultPushCallback(appContext, ReceiveActivity.class); */
  }

  @Kroll.method
  public void subscribe(String channel) {
    /* PushService.subscribe(appContext, channel, ReceiveActivity.class); */
    PushService.subscribe(appContext, channel, activity.getClass());
  }

  public class ReceiveActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);

      // Track app opens.
      /* ParseAnalytics.trackAppOpened(getIntent()); */

      Intent intent = new Intent();
      intent.setAction(Intent.ACTION_VIEW);
      /* intent.setData(uri); */
      Activity activity = TiApplication.getAppRootOrCurrentActivity();
      activity.startActivity(intent);
    }

  }
}
