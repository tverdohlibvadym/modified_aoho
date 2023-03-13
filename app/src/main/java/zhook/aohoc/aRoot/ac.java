package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.cPackage.jCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class ac {
    public int[] b;
    public aAClassPackage c;
    private int f;
    private int g;
    private int h;
    private char i;
    private char j;
    private char k;
    private int l;
    private long m;
    public int a = 0;
    public int d = 333;
    public int e = 100;

    public ac(aAClassPackage aAClassPackageVar) {
        this.c = aAClassPackageVar;
    }

    private void a(int i, int i2) {
        this.g = i2;
        if ((i2 & 1023) != 0) {
            this.h = i - 48;
        }
        char c = (char) i;
        if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
            this.i = c;
        }
        if (".,:;!?+-*%/^=\\|()[]{}<>`'\"@#$&�_~".indexOf(c) != -1) {
            this.j = c;
        }
        switch (c) {
            case '\t':
            case '\n':
            case ' ':
                this.k = c;
                break;
        }
        this.c.e(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r2.toUpperCase().indexOf("OK") >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int f(int r5) {
        /*
            r4 = this;
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = 0
            r2 = 48
            if (r5 < r2) goto Lb
            r2 = 57
            if (r5 <= r2) goto L13
        Lb:
            r2 = 35
            if (r5 == r2) goto L13
            r2 = 42
            if (r5 != r2) goto L3b
        L13:
            r2 = 1
        L14:
            if (r2 != 0) goto L3a
            zhook.aohoc.a.a.a r2 = r4.c     // Catch: java.lang.Throwable -> L4a
            zhook.aohoc.bridge.c r2 = r2.Q     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.c(r5)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4c
            switch(r2) {
                case 1: goto L44;
                case 2: goto L3d;
                case 3: goto L23;
                case 4: goto L23;
                case 5: goto L41;
                case 6: goto L47;
                case 7: goto L23;
                case 8: goto L39;
                default: goto L23;
            }     // Catch: java.lang.Throwable -> L4a
        L23:
            zhook.aohoc.a.a.a r2 = r4.c     // Catch: java.lang.Throwable -> L4a
            zhook.aohoc.bridge.c r2 = r2.Q     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r2.b(r5)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4c
            java.lang.String r2 = r2.toUpperCase()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "OK"
            int r2 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 < 0) goto L4c
        L39:
            r1 = r0
        L3a:
            return r1
        L3b:
            r2 = r1
            goto L14
        L3d:
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L39
        L41:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L39
        L44:
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L39
        L47:
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L39
        L4a:
            r0 = move-exception
            goto L3a
        L4c:
            r0 = r1
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.ac.f(int):int");
    }

    private void m() {
        this.b = ag.a(this.b, this.a);
        if (this.b != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(this.b.length);
                for (int i = 0; i < this.b.length; i++) {
                    dataOutputStream.writeInt(this.b[i]);
                }
                this.c.S.a("aohokeysV1", byteArrayOutputStream.toByteArray(), 0);
                byteArrayOutputStream.reset();
            } catch (Throwable th) {
            }
        }
    }

    public int a() {
        int i = this.h;
        this.h = -1;
        return i;
    }

    public void a(int i) {
        if (this.c.C < 2) {
            return;
        }
        this.f = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.c.n = currentTimeMillis;
        this.c.m = currentTimeMillis;
        for (int i2 = 0; i2 < this.a; i2 += 2) {
            if (i == this.b[i2]) {
                a(i, this.b[i2 + 1]);
            }
        }
        int f = f(i);
        if (f != 0) {
            a(i, f);
        }
    }

    public void a(int[] iArr, int[] iArr2) {
        boolean z = false;
        for (int i = 0; i < iArr2.length; i++) {
            int d = d(iArr2[i]);
            if (d == -1) {
                int i2 = iArr[i];
                int[] iArr3 = this.b;
                int i3 = this.a;
                this.a = i3 + 1;
                this.b = ag.a(i2, iArr3, i3, 20);
                int i4 = iArr2[i];
                int[] iArr4 = this.b;
                int i5 = this.a;
                this.a = i5 + 1;
                this.b = ag.a(i4, iArr4, i5, 20);
                z = true;
            } else if (e(d) != iArr[i]) {
                this.b[d * 2] = iArr[i];
                z = true;
            }
        }
        if (z) {
            m();
        }
    }

    public char b() {
        char c = this.i;
        this.i = (char) 0;
        return c;
    }

    public void b(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c.n = currentTimeMillis;
        this.c.m = currentTimeMillis;
        for (int i2 = 0; i2 < this.a; i2 += 2) {
            if (i == this.b[i2]) {
                this.c.f(this.b[i2 + 1] ^ (-1));
            }
        }
        int f = f(i);
        if (f != 0) {
            this.c.f(f ^ (-1));
        }
    }

    public char c() {
        char c = this.j;
        this.j = (char) 0;
        return c;
    }

    public int c(int i) {
        for (int i2 = 1; i2 < this.a; i2 += 2) {
            if (this.b[i2] == i) {
                return this.b[i2 - 1];
            }
        }
        return 0;
    }

    public char d() {
        char c = this.k;
        this.k = (char) 0;
        return c;
    }

    int d(int i) {
        for (int i2 = 1; i2 < this.a; i2 += 2) {
            if (this.b[i2] == i) {
                return i2 / 2;
            }
        }
        return -1;
    }

    public int e() {
        int i = this.g;
        this.g = 0;
        return i;
    }

    int e(int i) {
        if (i == -1) {
            return 0;
        }
        return this.b[i * 2];
    }

    public int f() {
        return this.f;
    }

    public int g() {
        int i = this.f;
        this.f = 0;
        return i;
    }

    public void h() {
        this.f = 0;
        this.g = 0;
        this.h = -1;
        this.i = (char) 0;
        this.j = (char) 0;
        this.k = (char) 0;
    }

    public void i() {
        int i = 0;
        this.h = -1;
        try {
            byte[] bArr = this.c.S.a("aohokeysV1", 0)[0];
            if (bArr != null) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                int[] iArr = new int[readUnsignedByte];
                for (int i2 = 0; i2 < readUnsignedByte; i2++) {
                    iArr[i2] = dataInputStream.readInt();
                }
                this.b = iArr;
                this.a = this.b.length;
            }
        } catch (Throwable th) {
        }
        if (this.b == null) {
            this.b = new int[]{48, 1, 49, 2, 50, 4, 51, 8, 52, 16, 53, 32, 54, 64, 55, 128, 56, 256, 57, 512, 42, 1024, 35, 2048};
            this.a = this.b.length;
            String b = aBridgeA.c.b("q-key-up");
            String b2 = aBridgeA.c.b("q-key-down");
            String b3 = aBridgeA.c.b("q-key-left");
            String b4 = aBridgeA.c.b("q-key-right");
            String b5 = aBridgeA.c.b("q-key-fire");
            String b6 = aBridgeA.c.b("q-key-soft1");
            String b7 = aBridgeA.c.b("q-key-soft2");
            if (b6 != null) {
                try {
                    int parseInt = Integer.parseInt(b6);
                    int[] iArr2 = this.b;
                    int i3 = this.a;
                    this.a = i3 + 1;
                    this.b = ag.a(parseInt, iArr2, i3, 20);
                    int[] iArr3 = this.b;
                    int i4 = this.a;
                    this.a = i4 + 1;
                    this.b = ag.a(4096, iArr3, i4, 20);
                    i = 4096;
                } catch (Throwable th2) {
                }
            }
            if (b7 != null) {
                try {
                    int parseInt2 = Integer.parseInt(b7);
                    int[] iArr4 = this.b;
                    int i5 = this.a;
                    this.a = i5 + 1;
                    this.b = ag.a(parseInt2, iArr4, i5, 20);
                    int[] iArr5 = this.b;
                    int i6 = this.a;
                    this.a = i6 + 1;
                    this.b = ag.a(8192, iArr5, i6, 20);
                    i |= 8192;
                } catch (Throwable th3) {
                }
            }
            if (b5 != null) {
                try {
                    int parseInt3 = Integer.parseInt(b5);
                    int[] iArr6 = this.b;
                    int i7 = this.a;
                    this.a = i7 + 1;
                    this.b = ag.a(parseInt3, iArr6, i7, 20);
                    int[] iArr7 = this.b;
                    int i8 = this.a;
                    this.a = i8 + 1;
                    this.b = ag.a(16384, iArr7, i8, 20);
                } catch (Throwable th4) {
                }
            }
            if (b3 != null) {
                try {
                    int parseInt4 = Integer.parseInt(b3);
                    int[] iArr8 = this.b;
                    int i9 = this.a;
                    this.a = i9 + 1;
                    this.b = ag.a(parseInt4, iArr8, i9, 20);
                    int[] iArr9 = this.b;
                    int i10 = this.a;
                    this.a = i10 + 1;
                    this.b = ag.a(32768, iArr9, i10, 20);
                } catch (Throwable th5) {
                }
            }
            if (b4 != null) {
                try {
                    int parseInt5 = Integer.parseInt(b4);
                    int[] iArr10 = this.b;
                    int i11 = this.a;
                    this.a = i11 + 1;
                    this.b = ag.a(parseInt5, iArr10, i11, 20);
                    int[] iArr11 = this.b;
                    int i12 = this.a;
                    this.a = i12 + 1;
                    this.b = ag.a(65536, iArr11, i12, 20);
                } catch (Throwable th6) {
                }
            }
            if (b != null) {
                try {
                    int parseInt6 = Integer.parseInt(b);
                    int[] iArr12 = this.b;
                    int i13 = this.a;
                    this.a = i13 + 1;
                    this.b = ag.a(parseInt6, iArr12, i13, 20);
                    int[] iArr13 = this.b;
                    int i14 = this.a;
                    this.a = i14 + 1;
                    this.b = ag.a(131072, iArr13, i14, 20);
                } catch (Throwable th7) {
                }
            }
            if (b2 != null) {
                try {
                    int parseInt7 = Integer.parseInt(b2);
                    int[] iArr14 = this.b;
                    int i15 = this.a;
                    this.a = i15 + 1;
                    this.b = ag.a(parseInt7, iArr14, i15, 20);
                    int[] iArr15 = this.b;
                    int i16 = this.a;
                    this.a = i16 + 1;
                    this.b = ag.a(262144, iArr15, i16, 20);
                } catch (Throwable th8) {
                }
            }
            String b8 = aBridgeA.c.b("q-keys");
            if (b8 != null) {
                String[] a = af.a(b8, ',');
                if (a.length >= 2) {
                    this.b = new int[a.length];
                    for (int i17 = 1; i17 < a.length; i17 += 2) {
                        try {
                            int parseInt8 = Integer.parseInt(a[i17 - 1]);
                            int parseInt9 = Integer.parseInt(a[i17]);
                            int[] iArr16 = this.b;
                            int i18 = this.a;
                            this.a = i18 + 1;
                            this.b = ag.a(parseInt8, iArr16, i18, 20);
                            int[] iArr17 = this.b;
                            int i19 = this.a;
                            this.a = i19 + 1;
                            this.b = ag.a(parseInt9, iArr17, i19, 20);
                            i |= parseInt9;
                        } catch (Throwable th9) {
                        }
                    }
                }
            }
            if ((i & 12288) != 12288) {
                k kVar = new k();
                this.c.Q.a(kVar);
                if (kVar.f != 0) {
                    int i20 = kVar.f;
                    int[] iArr18 = this.b;
                    int i21 = this.a;
                    this.a = i21 + 1;
                    this.b = ag.a(i20, iArr18, i21, 20);
                    int[] iArr19 = this.b;
                    int i22 = this.a;
                    this.a = i22 + 1;
                    this.b = ag.a(4096, iArr19, i22, 20);
                }
                if (kVar.g != 0) {
                    int i23 = kVar.g;
                    int[] iArr20 = this.b;
                    int i24 = this.a;
                    this.a = i24 + 1;
                    this.b = ag.a(i23, iArr20, i24, 20);
                    int[] iArr21 = this.b;
                    int i25 = this.a;
                    this.a = i25 + 1;
                    this.b = ag.a(8192, iArr21, i25, 20);
                }
            }
            m();
        }
    }

    public void j() {
        this.l = 0;
    }

    public boolean k() {
        return this.l == 1;
    }

    public int l() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = (int) (currentTimeMillis - this.m);
        switch (this.l) {
            case 0:
                this.l++;
                this.m = currentTimeMillis;
                return 0;
            case 1:
                if (i >= this.d) {
                    this.l++;
                    this.m = currentTimeMillis;
                    return 0;
                }
                return this.d - i;
            default:
                jCClassCPackage jCClassCPackageVar = this.c.h;
                if (i >= this.e / (jCClassCPackageVar != null && jCClassCPackageVar.h() == 1 && jCClassCPackageVar.e.d() < 16 ? 2 : 1)) {
                    this.m = currentTimeMillis;
                    return 0;
                }
                return this.e - i;
        }
    }
}
