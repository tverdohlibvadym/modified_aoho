package zhook.aohoc.bridge.platform.andr;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import zhook.aohoc.bridge.platform.bPlatform;

import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public class AndrPlatform extends bPlatform {
    public AndrPlatform() {
        this.h = b;
        try {
            this.g = Build.BRAND + "/" + Build.DEVICE + "/" + Build.VERSION.RELEASE + "/SDK:" + Build.VERSION.SDK_INT + "/Mem:" + ((ActivityManager) MainActivity.a.getSystemService("activity")).getMemoryClass();
            Locale locale = Locale.getDefault();
            System.setProperty("microedition.locale", locale.getLanguage() + locale.getVariant());
            System.setProperty("microedition.platform", this.g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // zhook.aohoc.bridge.platform.b
    public String a() {
        return "ANDR";
    }

    @Override // zhook.aohoc.bridge.platform.b
    public void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        MainActivity.a.startActivity(intent);
    }

    @Override // zhook.aohoc.bridge.platform.b
    public boolean a(String str, String str2) {
        return true;
    }

    @Override // zhook.aohoc.bridge.platform.b
    public String b(String str) {
        if (str == null) {
            return "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1409018623:
                if (str.equals("q-user-id")) {
                    c = 7;
                    break;
                }
                break;
            case -596496250:
                if (str.equals("q-http-url")) {
                    c = 4;
                    break;
                }
                break;
            case 615938753:
                if (str.equals("q-server-url")) {
                    c = 5;
                    break;
                }
                break;
            case 650578220:
                if (str.equals("q-device-brand")) {
                    c = 2;
                    break;
                }
                break;
            case 660650190:
                if (str.equals("q-device-model")) {
                    c = 3;
                    break;
                }
                break;
            case 1092496993:
                if (str.equals("q-support-site")) {
                    c = 1;
                    break;
                }
                break;
            case 1610847821:
                if (str.equals("MIDlet-Jar-Size")) {
                    c = 0;
                    break;
                }
                break;
            case 1914232209:
                if (str.equals("q-server-url2")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
            case 5:
            case 6:
            case 7:
                return null;
            case 2:
                return Build.VERSION.RELEASE;
            case 3:
                return Build.DEVICE;
            case 4:
                return "";
            default:
                return "";
        }
    }

    @Override // zhook.aohoc.bridge.platform.b
    public InputStream c(String str) {
        try {
            return MainActivity.a.getResources().getAssets().open(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
