package zhook.aohoc.aRoot;

import java.io.IOException;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* loaded from: classes.dex */
public class u {
    public static String a = "aoho_c";
    private byte[] c;
    private short[] d;
    private int[] e;
    private int[] f;
    private short[] g;
    private aAClassPackage k;
    private int b = 0;
    private int h = -1;
    private long i = -1;
    private long j = Long.MIN_VALUE;

    public u(aAClassPackage aAClassPackageVar) {
        this.k = aAClassPackageVar;
    }

    public static String c(int i, int i2) {
        return "c_" + Integer.toHexString(i) + "_" + Integer.toHexString(i2);
    }

    public int a(int i) {
        return this.e[i];
    }

    public int a(int i, int i2) {
        for (int i3 = 0; i3 < this.b; i3++) {
            if (this.c[i3] == i && this.d[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (a(r0) == r8) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(int r6, int r7, int r8, byte[] r9, boolean r10) {
        /*
            r5 = this;
            r4 = 32
            r0 = 3
            if (r6 != r0) goto L5
        L5:
            java.lang.String r1 = c(r6, r7)
            int r0 = r5.a(r6, r7)
            r2 = -1
            if (r0 == r2) goto L17
            int r2 = r5.a(r0)
            if (r2 != r8) goto L54
        L16:
            return r0
        L17:
            int r0 = zhook.aohoc.a.ag.b(r9)
            byte[] r2 = r5.c
            int r3 = r5.b
            byte[] r2 = zhook.aohoc.a.ag.a(r6, r2, r3, r4)
            r5.c = r2
            short[] r2 = r5.d
            int r3 = r5.b
            short[] r2 = zhook.aohoc.a.ag.a(r7, r2, r3, r4)
            r5.d = r2
            int[] r2 = r5.e
            int r3 = r5.b
            int[] r2 = zhook.aohoc.a.ag.a(r8, r2, r3, r4)
            r5.e = r2
            int[] r2 = r5.f
            int r3 = r5.b
            int[] r0 = zhook.aohoc.a.ag.a(r0, r2, r3, r4)
            r5.f = r0
            r0 = 0
            short[] r2 = r5.g
            int r3 = r5.b
            short[] r0 = zhook.aohoc.a.ag.a(r0, r2, r3, r4)
            r5.g = r0
            int r0 = r5.b
            int r2 = r0 + 1
            r5.b = r2
        L54:
            if (r10 != 0) goto L6a
            zhook.aohoc.a.a.a r2 = r5.k
            zhook.aohoc.bridge.j r2 = r2.S
            int r1 = r2.a(r1, r9, r8)
            long r2 = (long) r1
            r5.i = r2
            int[] r1 = r5.e
            r1[r0] = r8
            int[] r1 = r5.f
            int r2 = r9.length
            r1[r0] = r2
        L6a:
            long r2 = java.lang.System.currentTimeMillis()
            r5.j = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.u.a(int, int, int, byte[], boolean):int");
    }

    public void b(int i) {
        c(i);
        this.b--;
        this.k.S.c(c(this.c[i], this.d[i]));
        this.j = System.currentTimeMillis();
    }

    public byte[] b(int i, int i2) throws IOException {
        byte[][] a2 = this.k.S.a(c(this.c[i], this.d[i]), i2);
        byte[] bArr = a2[0];
        this.i = ag.c(a2[1], 0);
        return bArr;
    }

    public void c(int i) {
        if (this.g[i] < 32766) {
            short[] sArr = this.g;
            sArr[i] = (short) (sArr[i] + 1);
        }
        int i2 = this.b - 1;
        ag.a(this.c, i, i2);
        ag.a(this.d, i, i2);
        ag.a(this.e, i, i2);
        ag.a(this.f, i, i2);
        ag.a(this.g, i, i2);
    }
}
