package zhook.aohoc.bridge;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;

/* loaded from: classes.dex */
public abstract class hBridgeA {
    public aAClassPackage aAClassPackage;
    protected int b = -1;
    protected int c = -1;
    protected long d = -1;
    protected int e = -1;
    protected boolean f = false;
    protected boolean g = false;
    protected int h = -1;
    protected boolean i = false;
    protected long j = 0;
    protected int k = 0;
    protected boolean l = false;
    protected aCClassCPackage m;

    public void a() {
        this.aAClassPackage.f(-1036288);
    }

    public void a(int i) {
        if (ag.b == 0 && this.aAClassPackage != null && this.aAClassPackage.O) {
            try {
                if (this.aAClassPackage.r) {
                    return;
                }
                this.aAClassPackage.f.a(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(int i, int i2) {
        if (this.aAClassPackage.A != 3 || this.aAClassPackage.N == null || this.aAClassPackage.h != null) {
        }
        if (i2 > this.m.d) {
            a();
        }
    }

    public abstract void a(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4);

    public void a(aAClassPackage aAClassPackageVar) {
        this.aAClassPackage = aAClassPackageVar;
        this.m = this.aAClassPackage.T;
    }

    public abstract void b();

    public void b(int i) {
        if (ag.b == 0 && this.aAClassPackage != null && this.aAClassPackage.O) {
            try {
                if (this.aAClassPackage.r) {
                    return;
                }
                this.aAClassPackage.f.b(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b(int i, int i2) {
    }
}
