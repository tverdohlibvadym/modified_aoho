package zhook.aohoc.aRoot;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ah {
    ByteArrayOutputStream a = new ByteArrayOutputStream();
    zhook.aohoc.bRoot.i b = new zhook.aohoc.bRoot.i(this.a, 9);
    DataOutputStream c = new DataOutputStream(this.b);

    public static DataInputStream a(InputStream inputStream) {
        return new DataInputStream(new zhook.aohoc.bRoot.h(inputStream));
    }

    public static final byte[] a(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length = bArr2.length ^ i;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr2[i2] = (byte) ((bArr2[i2] ^ ((i2 + 1) * (i2 + 2))) ^ length);
        }
        return bArr2;
    }

    public static final byte[] b(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length = bArr2.length ^ i;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr2[i2] = (byte) ((bArr2[i2] ^ ((i2 + 1) * (i2 + 2))) ^ length);
        }
        return bArr2;
    }

    public DataOutputStream a() {
        return this.c;
    }

    public byte[] b() {
        try {
            this.c.flush();
            this.c = null;
            this.b.close();
            this.b = null;
            this.c = null;
            byte[] byteArray = this.a.toByteArray();
            this.a = null;
            return byteArray;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
