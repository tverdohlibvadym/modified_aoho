package zhook.aohoc.bRoot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {
    private static final int[] o = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    int a;
    int b;
    int[] c;
    int d = 0;
    int e;
    int f;
    int g;
    int h;
    byte i;
    byte j;
    int[] k;
    int l;
    int[] m;
    int n;

    int a(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, d dVar, k kVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = kVar.b;
        int i20 = kVar.c;
        int i21 = dVar.l;
        int i22 = dVar.k;
        int i23 = dVar.q;
        int i24 = i23 < dVar.p ? (dVar.p - i23) - 1 : dVar.o - i23;
        int i25 = o[i];
        int i26 = o[i2];
        int i27 = i24;
        while (true) {
            if (i22 < 20) {
                i20--;
                i21 |= (kVar.a[i19] & 255) << i22;
                i22 += 8;
                i19++;
            } else {
                int i28 = i21 & i25;
                int i29 = (i3 + i28) * 3;
                int i30 = iArr[i29];
                if (i30 == 0) {
                    int i31 = i21 >> iArr[i29 + 1];
                    int i32 = i22 - iArr[i29 + 1];
                    i9 = i23 + 1;
                    dVar.n[i23] = (byte) iArr[i29 + 2];
                    i10 = i27 - 1;
                    i13 = i32;
                    i14 = i31;
                    i11 = i20;
                    i12 = i19;
                } else {
                    while (true) {
                        i21 >>= iArr[i29 + 1];
                        i22 -= iArr[i29 + 1];
                        if ((i30 & 16) != 0) {
                            int i33 = i30 & 15;
                            int i34 = iArr[i29 + 2] + (o[i33] & i21);
                            int i35 = i21 >> i33;
                            int i36 = i22 - i33;
                            int i37 = i19;
                            int i38 = i20;
                            while (i36 < 15) {
                                i38--;
                                i35 |= (kVar.a[i37] & 255) << i36;
                                i36 += 8;
                                i37++;
                            }
                            int i39 = i35 & i26;
                            int i40 = (i4 + i39) * 3;
                            int i41 = iArr2[i40];
                            while (true) {
                                i35 >>= iArr2[i40 + 1];
                                i36 -= iArr2[i40 + 1];
                                if ((i41 & 16) != 0) {
                                    int i42 = i41 & 15;
                                    int i43 = i35;
                                    int i44 = i36;
                                    while (i44 < i42) {
                                        i38--;
                                        i43 |= (kVar.a[i37] & 255) << i44;
                                        i44 += 8;
                                        i37++;
                                    }
                                    int i45 = iArr2[i40 + 2] + (o[i42] & i43);
                                    int i46 = i43 >> i42;
                                    int i47 = i44 - i42;
                                    int i48 = i27 - i34;
                                    if (i23 >= i45) {
                                        int i49 = i23 - i45;
                                        if (i23 - i49 <= 0 || 2 <= i23 - i49) {
                                            System.arraycopy(dVar.n, i49, dVar.n, i23, 2);
                                            i7 = i23 + 2;
                                            i5 = i49 + 2;
                                            i6 = i34 - 2;
                                        } else {
                                            int i50 = i23 + 1;
                                            int i51 = i49 + 1;
                                            dVar.n[i23] = dVar.n[i49];
                                            i7 = i50 + 1;
                                            i5 = i51 + 1;
                                            dVar.n[i50] = dVar.n[i51];
                                            i6 = i34 - 2;
                                        }
                                    } else {
                                        i5 = i23 - i45;
                                        do {
                                            i5 += dVar.o;
                                        } while (i5 < 0);
                                        int i52 = dVar.o - i5;
                                        if (i34 > i52) {
                                            int i53 = i34 - i52;
                                            if (i23 - i5 <= 0 || i52 <= i23 - i5) {
                                                System.arraycopy(dVar.n, i5, dVar.n, i23, i52);
                                                i8 = i23 + i52;
                                                int i54 = i5 + i52;
                                            } else {
                                                int i55 = i23;
                                                int i56 = i52;
                                                while (true) {
                                                    i8 = i55 + 1;
                                                    int i57 = i5 + 1;
                                                    dVar.n[i55] = dVar.n[i5];
                                                    int i58 = i56 - 1;
                                                    if (i58 == 0) {
                                                        break;
                                                    }
                                                    i55 = i8;
                                                    i56 = i58;
                                                    i5 = i57;
                                                }
                                            }
                                            i5 = 0;
                                            i6 = i53;
                                            i7 = i8;
                                        } else {
                                            i6 = i34;
                                            i7 = i23;
                                        }
                                    }
                                    if (i7 - i5 <= 0 || i6 <= i7 - i5) {
                                        System.arraycopy(dVar.n, i5, dVar.n, i7, i6);
                                        i9 = i7 + i6;
                                        int i59 = i5 + i6;
                                        i10 = i48;
                                        i11 = i38;
                                        i12 = i37;
                                        i13 = i47;
                                        i14 = i46;
                                    } else {
                                        int i60 = i7;
                                        int i61 = i6;
                                        while (true) {
                                            i9 = i60 + 1;
                                            int i62 = i5 + 1;
                                            dVar.n[i60] = dVar.n[i5];
                                            int i63 = i61 - 1;
                                            if (i63 == 0) {
                                                break;
                                            }
                                            i61 = i63;
                                            i60 = i9;
                                            i5 = i62;
                                        }
                                        i10 = i48;
                                        i11 = i38;
                                        i12 = i37;
                                        i13 = i47;
                                        i14 = i46;
                                    }
                                } else if ((i41 & 64) != 0) {
                                    kVar.i = "invalid distance code";
                                    int i64 = kVar.c - i38;
                                    if ((i36 >> 3) < i64) {
                                        i64 = i36 >> 3;
                                    }
                                    dVar.l = i35;
                                    dVar.k = i36 - (i64 << 3);
                                    kVar.c = i38 + i64;
                                    kVar.d += i15 - kVar.b;
                                    kVar.b = i37 - i64;
                                    dVar.q = i23;
                                    return -3;
                                } else {
                                    i39 = iArr2[i40 + 2] + i39 + (o[i41] & i35);
                                    i40 = (i4 + i39) * 3;
                                    i41 = iArr2[i40];
                                }
                            }
                        } else if ((i30 & 64) != 0) {
                            if ((i30 & 32) != 0) {
                                int i65 = kVar.c - i20;
                                if ((i22 >> 3) < i65) {
                                    i65 = i22 >> 3;
                                }
                                dVar.l = i21;
                                dVar.k = i22 - (i65 << 3);
                                kVar.c = i20 + i65;
                                kVar.d += i17 - kVar.b;
                                kVar.b = i19 - i65;
                                dVar.q = i23;
                                return 1;
                            }
                            kVar.i = "invalid literal/steps_remained code";
                            int i66 = kVar.c - i20;
                            if ((i22 >> 3) < i66) {
                                i66 = i22 >> 3;
                            }
                            dVar.l = i21;
                            dVar.k = i22 - (i66 << 3);
                            kVar.c = i20 + i66;
                            kVar.d += i16 - kVar.b;
                            kVar.b = i19 - i66;
                            dVar.q = i23;
                            return -3;
                        } else {
                            i28 = iArr[i29 + 2] + i28 + (o[i30] & i21);
                            i29 = (i3 + i28) * 3;
                            i30 = iArr[i29];
                            if (i30 == 0) {
                                int i67 = i21 >> iArr[i29 + 1];
                                int i68 = i22 - iArr[i29 + 1];
                                i9 = i23 + 1;
                                dVar.n[i23] = (byte) iArr[i29 + 2];
                                i10 = i27 - 1;
                                i13 = i68;
                                i14 = i67;
                                i11 = i20;
                                i12 = i19;
                                break;
                            }
                        }
                    }
                }
                if (i10 < 258 || i11 < 10) {
                    break;
                }
                i27 = i10;
                i20 = i11;
                i19 = i12;
                i22 = i13;
                i21 = i14;
                i23 = i9;
            }
        }
        int i69 = kVar.c - i11;
        if ((i13 >> 3) < i69) {
            i69 = i13 >> 3;
        }
        dVar.l = i14;
        dVar.k = i13 - (i69 << 3);
        kVar.c = i11 + i69;
        kVar.d += i18 - kVar.b;
        kVar.b = i12 - i69;
        dVar.q = i9;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03bc, code lost:
        r12.l = r5;
        r12.k = r4;
        r13.c = r2;
        r13.d += r3 - r13.b;
        r13.b = r3;
        r12.q = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:?, code lost:
        return r12.b(r13, 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027d A[LOOP:5: B:68:0x027b->B:69:0x027d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(zhook.aohoc.bRoot.d r12, zhook.aohoc.bRoot.k r13, int r14) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.b.e.a(zhook.aohoc.b.d, zhook.aohoc.b.k, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, k kVar) {
        this.a = 0;
        this.i = (byte) i;
        this.j = (byte) i2;
        this.k = iArr;
        this.l = i3;
        this.m = iArr2;
        this.n = i4;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar) {
    }
}
