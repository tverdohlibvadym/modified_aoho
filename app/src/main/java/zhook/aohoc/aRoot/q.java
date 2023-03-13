package zhook.aohoc.aRoot;

import zhook.aohoc.bridge.bBridgeA;

/* loaded from: classes.dex */
public class q {
    public String a;
    public int b;
    public short[] c;
    public short[] d;

    public void a(String str, bBridgeA bBridgeAVar, int i) {
        int indexOf;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.a = str;
        this.c = new short[100];
        this.d = new short[100];
        int length = str.length();
        int indexOf2 = str.indexOf(10);
        if (indexOf2 == -1) {
            indexOf2 = length;
        }
        int i6 = 0;
        int a = bBridgeAVar.a(" ");
        this.c[this.b] = (short) 0;
        this.d[this.b] = (short) 0;
        int i7 = 0;
        while (i7 < length) {
            boolean z2 = false;
            int indexOf3 = str.indexOf(32, i7);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                z2 = true;
                indexOf = str.indexOf(10, indexOf2 + 1);
                if (indexOf == -1) {
                    indexOf3 = indexOf2;
                    indexOf = length;
                } else {
                    indexOf3 = indexOf2;
                }
            } else {
                indexOf = indexOf2;
            }
            if (indexOf3 > i7) {
                int a2 = bBridgeAVar.a(str.substring(i7, indexOf3));
                if (i6 == 0) {
                    this.d[this.b] = (short) indexOf3;
                    boolean z3 = (a2 >= i) | z2;
                    i3 = indexOf;
                    i4 = indexOf3;
                    z = z3;
                    i2 = a2;
                } else if (i6 + a + a2 < i) {
                    this.d[this.b] = (short) indexOf3;
                    i2 = a + a2 + i6;
                    int i8 = indexOf3;
                    z = z2;
                    i3 = indexOf;
                    i4 = i8;
                } else {
                    if (!z2 || indexOf3 != indexOf2) {
                        indexOf2 = indexOf;
                    }
                    z = true;
                    i4 = i7 - 1;
                    i3 = indexOf2;
                    i2 = i6;
                }
            } else {
                i2 = i6;
                boolean z4 = z2;
                i3 = indexOf;
                i4 = indexOf3;
                z = z4;
            }
            if (z) {
                this.d[this.b] = (short) i4;
                this.b++;
                i5 = i4 + 1;
                this.c[this.b] = (short) i5;
                this.d[this.b] = (short) i5;
                i2 = 0;
            } else {
                i5 = i4 + 1;
            }
            i6 = i2;
            i7 = i5;
            indexOf2 = i3;
        }
        this.c = ag.a(this.c, this.b);
        this.d = ag.a(this.d, this.b);
    }
}
