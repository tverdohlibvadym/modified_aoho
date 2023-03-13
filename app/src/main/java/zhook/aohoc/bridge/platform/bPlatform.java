package zhook.aohoc.bridge.platform;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class bPlatform {
    public static int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final String[] f;
    protected String g = "unknown";
    protected int h = -1;

    static {
        a = 0;
        int i = a;
        a = i + 1;
        b = i;
        int i2 = a;
        a = i2 + 1;
        c = i2;
        int i3 = a;
        a = i3 + 1;
        d = i3;
        e = a;
        f = new String[]{"andr", "j2me", "j2se"};
        if (f.length != e) {
            throw new IllegalStateException("[PROGRAMMER'S ERROR] too many or not all platforms was declared in code: PLATFORM_NAMES.length(" + f.length + ") != PLATFORM_COUNT(" + e + ")");
        }
    }

    public static String a(int i) {
        return f[i];
    }

    public static String b(int i) {
        return "zhook.aohoc.bridge.platform." + a(i);
    }

    public abstract String a();

    public abstract void a(String str);

    public abstract boolean a(String str, String str2);

    public int b() {
        return this.h;
    }

    public abstract String b(String str);

    public abstract InputStream c(String str);
}
