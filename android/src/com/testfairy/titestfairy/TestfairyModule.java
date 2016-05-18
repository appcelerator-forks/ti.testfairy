/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.testfairy.titestfairy;

import android.content.Context;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import com.testfairy.TestFairy;

@Kroll.module(name="TestFairy", id="com.testfairy.titestfairy")
public class TestfairyModule extends KrollModule
{
	// Standard Debugging variables
	private static final String LCAT = "TestFairyModule";
	private static final boolean DBG = TiConfig.LOGD;
	private static Context context;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public TestfairyModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		context = app.getApplicationContext();
	}

	// Methods
	@Kroll.method
	public void begin(String apiKey)
	{
		TestFairy.begin(context, apiKey);
	}

	@Kroll.method
	public String version()
	{
		return TestFairy.getVersion();
	}

	@Kroll.method
	public void pushFeedbackController()
	{
		// TODO: No op
	}

	@Kroll.method
	public void sendUserFeedback(String note)
	{
		TestFairy.sendUserFeedback(note);
	}

	@Kroll.method
	public void updateLocation(String location)
	{
		
	}

	@Kroll.method
	public void checkpoint(String name)
	{
		TestFairy.addCheckpoint(name);
	}

	@Kroll.method
	public void setCorrelationId(String name)
	{
		TestFairy.setCorrelationId(name);
	}

	@Kroll.method
	public void pause()
	{
		TestFairy.pause();
	}

	@Kroll.method
	public void resume()
	{
		TestFairy.resume();
	}

	@Kroll.method
	public String sessionUrl()
	{
		return TestFairy.getSessionUrl();
	}

	@Kroll.method
	public void takeScreenshot()
	{
		// TODO: No op		
	}
}

