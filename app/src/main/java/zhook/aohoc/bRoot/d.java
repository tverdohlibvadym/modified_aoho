package zhook.aohoc.bRoot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {
    int c;
    int d;
    int e;
    int[] f;
    int j;
    int k;
    int l;
    byte[] n;
    int o;
    int p;
    int q;
    Object r;
    long s;
    private static final int[] u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    int[] g = new int[1];
    int[] h = new int[1];
    e i = new e();
    f t = new f();
    int[] m = new int[4320];
    int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(k kVar, Object obj, int i) {
        this.n = new byte[i];
        this.o = i;
        this.r = obj;
        a(kVar, (long[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x068d, code lost:
        r19.f = null;
        r19.b = 9;
        r20.i = "invalid bit steps_remained repeat";
        r19.l = r13;
        r19.k = r12;
        r20.c = r10;
        r20.d += r11 - r20.b;
        r20.b = r11;
        r19.q = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x079c, code lost:
        r19.q = r5;
        r4 = b(r20, r21);
        r14 = r19.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x07ac, code lost:
        if (r14 >= r19.p) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x07ae, code lost:
        r5 = (r19.p - r14) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07bd, code lost:
        if (r19.p == r19.q) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x07bf, code lost:
        r19.l = r9;
        r19.k = r8;
        r20.c = r6;
        r20.d += r7 - r20.b;
        r20.b = r7;
        r19.q = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x07ed, code lost:
        r5 = r19.o - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x07f3, code lost:
        r19.b = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x07f9, code lost:
        r19.l = r9;
        r19.k = r8;
        r20.c = r6;
        r20.d += r7 - r20.b;
        r20.b = r7;
        r19.q = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
        return b(r20, -3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:?, code lost:
        return b(r20, -3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
        return b(r20, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
        return b(r20, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0358, code lost:
        r19.b = 9;
        r20.i = "too many steps_remained or distance symbols";
        r19.l = r9;
        r19.k = r8;
        r20.c = r4;
        r20.d += r5 - r20.b;
        r20.b = r5;
        r19.q = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(zhook.aohoc.bRoot.k r20, int r21) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.b.d.a(zhook.aohoc.b.k, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar) {
        a(kVar, (long[]) null);
        this.n = null;
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar, long[] jArr) {
        if (jArr != null) {
            jArr[0] = this.s;
        }
        if (this.b == 4 || this.b == 5) {
        }
        if (this.b == 6) {
            this.i.a(kVar);
        }
        this.b = 0;
        this.k = 0;
        this.l = 0;
        this.q = 0;
        this.p = 0;
        if (this.r != null) {
            long a2 = zhook.aohoc.bRoot.a.a(0L, null, 0, 0);
            this.s = a2;
            kVar.m = a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(k kVar, int i) {
        int i2;
        int i3 = kVar.f;
        int i4 = this.p;
        int i5 = (i4 <= this.q ? this.q : this.o) - i4;
        if (i5 > kVar.g) {
            i5 = kVar.g;
        }
        if (i5 != 0 && i == -5) {
            i = 0;
        }
        kVar.g -= i5;
        kVar.h += i5;
        if (this.r != null) {
            long a2 = zhook.aohoc.bRoot.a.a(this.s, this.n, i4, i5);
            this.s = a2;
            kVar.m = a2;
        }
        System.arraycopy(this.n, i4, kVar.e, i3, i5);
        int i6 = i3 + i5;
        int i7 = i5 + i4;
        if (i7 == this.o) {
            if (this.q == this.o) {
                this.q = 0;
            }
            int i8 = this.q - 0;
            if (i8 > kVar.g) {
                i8 = kVar.g;
            }
            if (i8 != 0 && i == -5) {
                i = 0;
            }
            kVar.g -= i8;
            kVar.h += i8;
            if (this.r != null) {
                long a3 = zhook.aohoc.bRoot.a.a(this.s, this.n, 0, i8);
                this.s = a3;
                kVar.m = a3;
            }
            System.arraycopy(this.n, 0, kVar.e, i6, i8);
            int i9 = i6 + i8;
            i7 = i8 + 0;
            i2 = i9;
        } else {
            i2 = i6;
        }
        kVar.f = i2;
        this.p = i7;
        return i;
    }
}
