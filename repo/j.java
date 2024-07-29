package com.repo;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.repo.r;
import java.util.UUID;
import org.sqlite.database.BuildConfig;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static String f709a;

    /* renamed from: b  reason: collision with root package name */
    public String f710b = UUID.randomUUID().toString();

    public j(Context context) {
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            deviceId = (deviceId == null || deviceId.length() == 0 || deviceId.startsWith("000000")) ? BuildConfig.FLAVOR : deviceId;
            if (!r.s(deviceId)) {
                f709a = deviceId;
                r.d = r.c.IMEI;
                return;
            }
        } catch (Exception e) {
            Log.e("DeviceUuidFactory", "Error : DeviceUuidFactory : " + e.getMessage());
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!(string == null || string.length() == 0 || string.startsWith("000000"))) {
                if (!string.equals("9774D56D682E549C")) {
                    f709a = string;
                    r.d = r.c.ANDROID_ID;
                    return;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("AppRep", 0);
            String string2 = sharedPreferences.getString("AppRepId", (String) null);
            if (true == r.s(string2)) {
                string2 = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("AppRepId", string2).commit();
            }
            f709a = string2;
            r.d = r.c.GENERATED_ID;
        } catch (Exception e2) {
            Log.e("DeviceUuidFactory", "Error : DeviceUuidFactory : " + e2.getMessage());
            f709a = BuildConfig.FLAVOR;
        }
    }

    public String a() {
        return f709a;
    }
}
