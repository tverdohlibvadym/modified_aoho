package zhook.aohoc.bRoot;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class i extends OutputStream {
    protected k a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected byte[] e;
    protected boolean f;
    protected OutputStream g;

    public i(OutputStream outputStream, int i) {
        this(outputStream, i, false);
    }

    public i(OutputStream outputStream, int i, boolean z) {
        this.a = new k();
        this.b = 512;
        this.c = 0;
        this.d = new byte[this.b];
        this.e = new byte[1];
        this.g = outputStream;
        this.a.b(i, z);
        this.f = true;
    }

    public void a() throws Throwable {
        while (true) {
            this.a.e = this.d;
            this.a.f = 0;
            this.a.g = this.b;
            int b = this.f ? this.a.b(4) : this.a.a(4);
            if (b != 1 && b != 0) {
                throw new Throwable((this.f ? "de" : "in") + "flating: " + this.a.i);
            }
            if (this.b - this.a.g > 0) {
                this.g.write(this.d, 0, this.b - this.a.g);
            }
            if (this.a.c <= 0 && this.a.g != 0) {
                flush();
                return;
            }
        }
    }

    public void b() {
        if (this.a == null) {
            return;
        }
        if (this.f) {
            this.a.b();
        } else {
            this.a.a();
        }
        this.a.d();
        this.a = null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            a();
        } catch (Throwable th) {
        }
        b();
        this.g.close();
        this.g = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.g.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.e[0] = (byte) i;
        write(this.e, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        this.a.a = bArr;
        this.a.b = i;
        this.a.c = i2;
        while (true) {
            this.a.e = this.d;
            this.a.f = 0;
            this.a.g = this.b;
            if ((this.f ? this.a.b(this.c) : this.a.a(this.c)) != 0) {
                throw new IOException((this.f ? "de" : "in") + "flating: " + this.a.i);
            }
            this.g.write(this.d, 0, this.b - this.a.g);
            if (this.a.c <= 0 && this.a.g != 0) {
                return;
            }
        }
    }
}
