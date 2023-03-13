package zhook.aohoc.bridge.platform;

/* loaded from: classes.dex */
public final class aPlatform {
    public static int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    private static final String[] l;
    int k;

    static {
        a = 0;
        int i2 = a;
        a = i2 + 1;
        b = i2;
        int i3 = a;
        a = i3 + 1;
        c = i3;
        int i4 = a;
        a = i4 + 1;
        d = i4;
        int i5 = a;
        a = i5 + 1;
        e = i5;
        int i6 = a;
        a = i6 + 1;
        f = i6;
        int i7 = a;
        a = i7 + 1;
        g = i7;
        int i8 = a;
        a = i8 + 1;
        h = i8;
        int i9 = a;
        a = i9 + 1;
        i = i9;
        j = a;
        l = new String[]{"AndrPlatform", "J2mePlatform", "J2sePlatform", "AndrAppManager", "J2meAppManager", "J2seAppManager", "AndrConnector", "J2meConnector", "J2seConnector", "AndrImageFactory", "J2meImageFactory", "J2seImageFactory", "AndrMediaPlayer", "J2meMediaPlayer", "J2seMediaPlayer", "AndrGameLoop", "J2meGameLoop", "J2seGameLoop", "AndrInputProcessor", "J2meInputProcessor", "J2seInputProcessor", "AndrRecordStore", "J2meRecordStore", "J2seRecordStore"};
    }

    private aPlatform() {
        this.k = -1;
    }

    public aPlatform(int i2) {
        this.k = -1;
        if (i2 <= -1 || i2 >= bPlatform.e) {
            throw new IllegalArgumentException("invalid a_platformType=" + i2);
        }
        this.k = i2;
    }

    private String b(int i2) {
        return bPlatform.b(this.k) + "." + c(i2);
    }

    private String c(int i2) {
        if (l.length != bPlatform.e * j) {
            throw new IllegalStateException("[PROGRAMMER ERROR] too many or not all implemented/base classes was declared in code: IMPLCLASS_SHORTNAMES.length (" + l.length + ") != AOHPlatform.platformCount() * BASECLASS_COUNT (" + (bPlatform.e * j) + ")");
        }
        return l[(bPlatform.e * i2) + this.k];
    }

    public Object a(int i2) {
        String b2 = b(i2);
        try {
            return Class.forName(b2).newInstance();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("failed on creating " + b2 + " instance.");
        }
    }
}
