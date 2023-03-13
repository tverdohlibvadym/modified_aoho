package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class v {
    static Hashtable a = new Hashtable();
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private byte[] g;

    public v(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = 0;
        this.g = i4 > 0 ? new byte[i4] : null;
    }

    public v(int i, int i2, int i3, byte[] bArr) {
        if (a.size() == 0) {
            a.put(new b(0), "_CT_NONE");
            a.put(new b(1), "_CT_CHUNK_SEQUENCE");
            a.put(new b(2), "_CT_START_SEND_CHUNK_SEQUENCE");
            a.put(new b(3), "_CT_END_SEND_CHUNK_SEQUENCE");
            a.put(new b(4), "_CT_SEND_CHUNK");
            a.put(new b(5), "_CT_SEND_CHUNK_INT");
            a.put(new b(10), "CT_READY");
            a.put(new b(11), "CT_LOAD_FILE");
            a.put(new b(12), "_CT_CHUNK_SEQUENCE");
            a.put(new b(1), "CT_LOAD_SCRIPT");
            a.put(new b(14), "CT_QUERY_SCRIPT");
            a.put(new b(20), "CT_INFO_SCREEN");
            a.put(new b(21), "CT_INFO_HEAP");
            a.put(new b(22), "CT_INFO_RS");
            a.put(new b(23), "CT_INFO_MEDIA");
            a.put(new b(24), "CT_INFO_SYSTEM_PROPS");
            a.put(new b(25), "CT_INFO_MIDLET_PROPS");
            a.put(new b(26), "CT_HAS_RS");
            a.put(new b(40), "CT_SELECTED_CELL");
            a.put(new b(41), "CT_DIALOG_RESULT");
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = 0;
        this.g = bArr == null ? null : new byte[bArr.length];
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.g, 0, bArr.length);
        }
    }

    public static String b(int i) {
        return "" + a.get(new b(i));
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.d = i;
    }

    public boolean a(byte[] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        if (length > j()) {
            return false;
        }
        if (length > 0) {
            System.arraycopy(bArr, 0, this.g, i(), length);
            this.f = length + this.f;
        }
        return true;
    }

    public int b() {
        return this.d & (-129);
    }

    public void b(byte[] bArr) {
        this.g = bArr;
    }

    public int c() {
        return this.d & 128;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        if (this.g == null) {
            return 0;
        }
        return this.g.length;
    }

    public int f() {
        return Math.min(1000, j());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] g() {
        byte[] bArr = new byte[f()];
        System.arraycopy(this.g, i(), bArr, 0, bArr.length);
        return bArr;
    }

    public void h() {
        this.f += f();
    }

    public int i() {
        return this.f;
    }

    public int j() {
        if (this.g == null) {
            return 0;
        }
        return e() - i();
    }

    public boolean k() {
        return this.e;
    }

    public int l() {
        return this.b;
    }

    public byte[] m() {
        return this.g;
    }

    public DataInputStream n() {
        if (this.g == null) {
            return null;
        }
        return new DataInputStream(new ByteArrayInputStream(this.g));
    }

    public String toString() {
        return "type=" + b() + " mods=" + Integer.toHexString(c()) + " steps_remained=" + e() + " [ " + b(b()) + " ]";
    }
}
