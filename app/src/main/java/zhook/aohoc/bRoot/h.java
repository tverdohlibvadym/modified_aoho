package zhook.aohoc.bRoot;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class h extends InputStream {
    protected k a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected byte[] e;
    protected boolean f;
    protected InputStream g;
    private boolean h;

    public h(InputStream inputStream) {
        this(inputStream, false);
    }

    public h(InputStream inputStream, boolean z) {
        this.a = new k();
        this.b = 512;
        this.c = 0;
        this.d = new byte[this.b];
        this.e = new byte[1];
        this.g = null;
        this.h = false;
        this.g = inputStream;
        this.a.a(z);
        this.f = false;
        this.a.a = this.d;
        this.a.b = 0;
        this.a.c = 0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.g.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.g.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.g.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.e, 0, 1) == -1) {
            return -1;
        }
        return this.e[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int b;
        if (i2 == 0) {
            return 0;
        }
        this.a.e = bArr;
        this.a.f = i;
        this.a.g = i2;
        do {
            if (this.a.c == 0 && !this.h) {
                this.a.b = 0;
                this.a.c = this.g.read(this.d, 0, this.b);
                if (this.a.c == -1) {
                    this.a.c = 0;
                    this.h = true;
                }
            }
            b = this.f ? this.a.b(this.c) : this.a.a(this.c);
            if (this.h && b == -5) {
                return -1;
            }
            if (b != 0 && b != 1) {
                throw new IOException((this.f ? "de" : "in") + "flating: " + this.a.i);
            } else if ((!this.h && b != 1) || this.a.g != i2) {
                if (this.a.g != i2) {
                    break;
                }
            } else {
                return -1;
            }
        } while (b == 0);
        return i2 - this.a.g;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.g.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read(new byte[j < ((long) 512) ? (int) j : 512]);
    }
}
