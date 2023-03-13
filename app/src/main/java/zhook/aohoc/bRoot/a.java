package zhook.aohoc.bRoot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j, byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        if (bArr == null) {
            return 1L;
        }
        long j2 = j & 65535;
        long j3 = 65535 & (j >> 16);
        int i18 = i2;
        int i19 = i;
        while (i18 > 0) {
            int i20 = i18 < 5552 ? i18 : 5552;
            int i21 = i18 - i20;
            int i22 = i19;
            while (i20 >= 16) {
                long j4 = j2 + (bArr[i22] & 255);
                long j5 = j3 + j4;
                long j6 = j4 + (bArr[i3] & 255);
                long j7 = j5 + j6;
                long j8 = j6 + (bArr[i4] & 255);
                long j9 = j7 + j8;
                long j10 = j8 + (bArr[i5] & 255);
                long j11 = j9 + j10;
                long j12 = j10 + (bArr[i6] & 255);
                long j13 = j11 + j12;
                long j14 = j12 + (bArr[i7] & 255);
                long j15 = j13 + j14;
                long j16 = j14 + (bArr[i8] & 255);
                long j17 = j15 + j16;
                long j18 = j16 + (bArr[i9] & 255);
                long j19 = j17 + j18;
                long j20 = j18 + (bArr[i10] & 255);
                long j21 = j19 + j20;
                long j22 = j20 + (bArr[i11] & 255);
                long j23 = j21 + j22;
                long j24 = j22 + (bArr[i12] & 255);
                long j25 = j23 + j24;
                long j26 = j24 + (bArr[i13] & 255);
                long j27 = j25 + j26;
                long j28 = j26 + (bArr[i14] & 255);
                long j29 = j27 + j28;
                long j30 = j28 + (bArr[i15] & 255);
                long j31 = j29 + j30;
                long j32 = j30 + (bArr[i16] & 255);
                long j33 = j31 + j32;
                i22 = i22 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
                j2 = j32 + (bArr[i17] & 255);
                j3 = j33 + j2;
                i20 -= 16;
            }
            if (i20 != 0) {
                while (true) {
                    i19 = i22 + 1;
                    j2 += bArr[i22] & 255;
                    j3 += j2;
                    i20--;
                    if (i20 == 0) {
                        break;
                    }
                    i22 = i19;
                }
            } else {
                i19 = i22;
            }
            j2 %= 65521;
            j3 %= 65521;
            i18 = i21;
        }
        return (j3 << 16) | j2;
    }
}
