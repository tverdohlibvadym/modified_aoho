package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class t {
    int a = 0;
    byte[] b;

    public void a(int i) {
        this.a = i;
        this.b = new byte[(i + 7) >> 3];
    }

    public void a(byte[] bArr) {
        System.arraycopy(bArr, 0, this.b, 0, this.b.length);
    }

    public int b(int i) {
        return (this.b[i >> 3] >>> (i & 7)) & 1;
    }
}
