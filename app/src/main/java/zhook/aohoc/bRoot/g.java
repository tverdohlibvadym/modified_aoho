package zhook.aohoc.bRoot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g {
    private static byte[] i = {0, 0, -1, -1};
    int a;
    int b;
    long[] c = new long[1];
    long d;
    int e;
    int f;
    int g;
    d h;

    int a(k kVar) {
        if (kVar == null || kVar.k == null) {
            return -2;
        }
        kVar.h = 0L;
        kVar.d = 0L;
        kVar.i = null;
        kVar.k.a = kVar.k.f != 0 ? 7 : 0;
        kVar.k.h.a(kVar, (long[]) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(k kVar, int i2) {
        kVar.i = null;
        this.h = null;
        this.f = 0;
        if (i2 < 0) {
            i2 = -i2;
            this.f = 1;
        }
        if (i2 < 8 || i2 > 15) {
            b(kVar);
            return -2;
        }
        this.g = i2;
        kVar.k.h = new d(kVar, kVar.k.f == 0 ? this : null, 1 << i2);
        a(kVar);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(k kVar) {
        if (this.h != null) {
            this.h.a(kVar);
        }
        this.h = null;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
        if (r9.c == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
        r9.c--;
        r9.d++;
        r1 = r9.k;
        r2 = r9.a;
        r9.b = r9.b + 1;
        r1.d = ((r2[r3] & 255) << 24) & 4278190080L;
        r9.k.a = 3;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
        if (r9.c == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
        r9.c--;
        r9.d++;
        r1 = r9.k;
        r2 = r1.d;
        r4 = r9.a;
        r9.b = r9.b + 1;
        r1.d = r2 + (((r4[r5] & 255) << 16) & 16711680);
        r9.k.a = 4;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        if (r9.c == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0128, code lost:
        r9.c--;
        r9.d++;
        r1 = r9.k;
        r2 = r1.d;
        r4 = r9.a;
        r9.b = r9.b + 1;
        r1.d = r2 + (((r4[r5] & 255) << 8) & 65280);
        r9.k.a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0156, code lost:
        if (r9.c != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
        r9.c--;
        r9.d++;
        r0 = r9.k;
        r2 = r0.d;
        r1 = r9.a;
        r9.b = r9.b + 1;
        r0.d = r2 + (r1[r4] & 255);
        r9.m = r9.k.d;
        r9.k.a = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02be, code lost:
        return 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(zhook.aohoc.bRoot.k r9, int r10) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.b.g.b(zhook.aohoc.b.k, int):int");
    }
}
