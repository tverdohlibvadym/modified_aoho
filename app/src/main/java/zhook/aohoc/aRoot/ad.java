package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class ad {
    public static int a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[0] & 255;
    }

    public static int a(byte[] bArr, int i) {
        if (bArr[8] == 2) {
            return (bArr[(i >> 2) + 9] >>> ((i & 3) << 1)) & 3;
        }
        if (bArr[8] == 4) {
            return (bArr[(i >> 1) + 9] >>> ((i & 1) << 2)) & 15;
        }
        if (bArr[8] == 8) {
            return bArr[i + 9];
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[5] & 255;
    }

    public static int c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[6] & 255;
    }

    public static int d(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[7] & 255;
    }

    public static boolean e(byte[] bArr) {
        int b;
        if (bArr != null && (b = b(bArr)) < a(bArr)) {
            int a = a(bArr, b);
            int c = c(bArr);
            int d = d(bArr);
            bArr[6] = (byte) (c + zhook.aohoc.aRoot.bPackage.aBClassCPackage.c[a]);
            bArr[7] = (byte) (zhook.aohoc.aRoot.bPackage.aBClassCPackage.d[a] + d);
            bArr[5] = (byte) (bArr[5] + 1);
            return true;
        }
        return false;
    }

    public static int f(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[3] & 255;
    }

    public static int g(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr[4] & 255;
    }
}
