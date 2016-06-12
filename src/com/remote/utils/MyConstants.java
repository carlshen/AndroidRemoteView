package com.remote.utils;

import android.os.Environment;

public class MyConstants {
	public static final String USERCACHE_PATH = Environment.getExternalStorageDirectory().getPath() + "/carlshen/";

	public static final String CACHE_FILE_PATH = USERCACHE_PATH + "usercache";

	public static final int MSG_FROM_CLIENT = 0;
	public static final int MSG_FROM_SERVICE = 1;

	public static final String REMOTE_ACTION = "com.remote.view.action_REMOTE";
	public static final String EXTRA_REMOTE_VIEWS = "extra_remoteViews";

}
