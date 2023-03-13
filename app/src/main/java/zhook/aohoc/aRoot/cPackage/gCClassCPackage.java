package zhook.aohoc.aRoot.cPackage;

import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;

/* loaded from: classes.dex */
public class gCClassCPackage {
    public int[] a;
    public int[] b;
    bCClassCPackage c;
    private aCClassCPackage d;
    private cCClassCPackage e;

    public gCClassCPackage(aCClassCPackage aCClassCPackageVar) {
        this.d = aCClassCPackageVar;
        this.e = this.d.j;
    }

    public static fBridgeA a(String str) {
        try {
            return aBridgeA.d.a(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void a(fBridgeA fBridgeAVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if ( fBridgeAVar == null) {
            return;
        }
        if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.c) {
            eBridgeA eBridgeAVar = this.d.g;
            aCClassCPackage aCClassCPackageVar = this.d;
            eBridgeAVar.a(fBridgeAVar, i, i2, i3, i4, 0, i5, i6, 20);
        } else if (this.e.c(i5, i6, i3, i4)) {
            aCClassCPackage aCClassCPackageVar2 = this.d;
            this.d.g.a(fBridgeAVar, i5 - i, i6 - i2, 20);
        }
    }

    public void a(fBridgeA fBridgeAVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if ( fBridgeAVar == null) {
            return;
        }
        if (!(this.d.g == this.c.b && !(this.c.e == 0 && this.c.f == 0))) {
            if (this.e.c(i5, i6, i3, i4)) {
                if (!zhook.aohoc.aRoot.bPackage.dBClassCPackage.c) {
                    aCClassCPackage aCClassCPackageVar = this.d;
                    this.d.g.a(fBridgeAVar, i5 - i, i6 - i2, 20);
                    return;
                }
                eBridgeA eBridgeAVar = this.d.g;
                aCClassCPackage aCClassCPackageVar2 = this.d;
                eBridgeAVar.a(fBridgeAVar, i, i2, i3, i4, i7, i5, i6, 20);
            }
        } else if (this.e.b(i5, i6, i3, i4)) {
            this.e.a();
            int a = this.c.a.a();
            int b = this.c.a.b();
            int i10 = this.c.e;
            int i11 = this.c.f;
            int i12 = a - i10;
            int i13 = b - i11;
            boolean z = i12 > i5 && i12 < i5 + i3;
            boolean z2 = i13 > i6 && i13 < i6 + i4;
            int i14 = i5 + i10;
            int i15 = i6 + i11;
            if (z || z2) {
                if (this.e.a(i10, i11)) {
                    eBridgeA eBridgeAVar2 = this.d.g;
                    aCClassCPackage aCClassCPackageVar3 = this.d;
                    eBridgeAVar2.a(fBridgeAVar, i, i2, i3, i4, i7, i14, i15, 20);
                }
                this.e.b();
                if (this.e.a(i10 - a, i11)) {
                    aCClassCPackage aCClassCPackageVar4 = this.d;
                    this.d.g.a(fBridgeAVar, i, i2, i3, i4, i7, i14 - a, i15, 20);
                }
                this.e.b();
                if (this.e.a(i10, i11 - b)) {
                    aCClassCPackage aCClassCPackageVar5 = this.d;
                    this.d.g.a(fBridgeAVar, i, i2, i3, i4, i7, i14, i15 - b, 20);
                }
                this.e.b();
                if (this.e.a(i10 - a, i11 - b)) {
                    aCClassCPackage aCClassCPackageVar6 = this.d;
                    this.d.g.a(fBridgeAVar, i, i2, i3, i4, i7, i14 - a, i15 - b, 20);
                }
            } else {
                if (i14 >= a) {
                    i14 -= a;
                    i8 = i10 - a;
                } else {
                    i8 = i10;
                }
                if (i15 >= b) {
                    i15 -= b;
                    i9 = i11 - b;
                } else {
                    i9 = i11;
                }
                this.e.a(i8, i9);
                if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.c) {
                    eBridgeA eBridgeAVar3 = this.d.g;
                    aCClassCPackage aCClassCPackageVar7 = this.d;
                    eBridgeAVar3.a(fBridgeAVar, i, i2, i3, i4, i7, i14, i15, 20);
                } else {
                    aCClassCPackage aCClassCPackageVar8 = this.d;
                    this.d.g.a(fBridgeAVar, i14 - i, i15 - i2, 20);
                }
            }
            this.e.b();
        }
    }
}
