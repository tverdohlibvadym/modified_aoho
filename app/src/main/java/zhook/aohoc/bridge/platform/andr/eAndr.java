package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;

/* loaded from: classes.dex */
public class eAndr implements fBridgeA {
    Bitmap a;
    private Bitmap b;
    private Bitmap c;
    private Bitmap d;

    public eAndr(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // zhook.aohoc.bridge.f
    public int a() {
        if (this.a == null) {
            return 0;
        }
        return this.a.getWidth();
    }

    @Override // zhook.aohoc.bridge.f
    public void a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.a == null) {
            return;
        }
        this.a.getPixels(iArr, i, i2, i3, i4, i5, i6);
    }

    @Override // zhook.aohoc.bridge.f
    public int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.getHeight();
    }

    @Override // zhook.aohoc.bridge.f
    public eBridgeA c() {
        return new cAndr(this.a);
    }

    @Override // zhook.aohoc.bridge.f
    public void d() {
        if (this.a == null) {
            return;
        }
        this.a.eraseColor(0);
    }

    public Bitmap e() {
        return this.a;
    }

    public Bitmap f() {
        if (this.b == null) {
            Matrix matrix = new Matrix();
            matrix.preScale(1.0f, -1.0f);
            this.b = Bitmap.createBitmap(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), matrix, false);
        }
        return this.b;
    }

    public Bitmap g() {
        if (this.c == null) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            this.c = Bitmap.createBitmap(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), matrix, false);
        }
        return this.c;
    }

    public Bitmap h() {
        if (this.d == null) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, -1.0f);
            this.d = Bitmap.createBitmap(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), matrix, false);
        }
        return this.d;
    }
}
