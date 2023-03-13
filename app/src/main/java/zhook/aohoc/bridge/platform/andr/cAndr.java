package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import zhook.aohoc.bridge.bBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;

/* loaded from: classes.dex */
public class cAndr implements eBridgeA {
    private Canvas a;
    private Bitmap b;
    private bAndr c;
    private Paint d;
    private int e;
    private int f;
    private Rect g;
    private Rect h;

    public cAndr(Bitmap bitmap) {
        this(new Canvas(bitmap), bitmap);
    }

    public cAndr(Canvas canvas) {
        this.g = new Rect();
        this.h = new Rect();
        a(bAndr.b());
        this.a = canvas;
        canvas.save();
    }

    public cAndr(Canvas canvas, Bitmap bitmap) {
        this.g = new Rect();
        this.h = new Rect();
        a(bAndr.b());
        this.a = canvas;
        this.b = bitmap;
        canvas.save();
    }

    @Override // zhook.aohoc.bridge.e
    public void a(int i) {
        this.d.setColor((-16777216) | i);
    }

    @Override // zhook.aohoc.bridge.e
    public void a(int i, int i2, int i3, int i4) {
        this.a.drawRect(i, i2, i + i3, i2 + i4, this.d);
    }

    @Override // zhook.aohoc.bridge.e
    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.drawRoundRect(new RectF(i, i2, i + i3, i2 + i4), i5, i6, this.d);
    }

    @Override // zhook.aohoc.bridge.e
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    @Override // zhook.aohoc.bridge.e
    public void a(String str, int i, int i2, int i3) {
        this.d.setTextAlign((i3 & 1) != 0 ? Paint.Align.CENTER : (i3 & 8) != 0 ? Paint.Align.RIGHT : Paint.Align.LEFT);
        this.a.save();
        float f = 0.0f;
        float c = this.c.c();
        this.a.scale(c, c);
        if ((i3 & 16) != 0) {
            f = this.d.getTextSize() - this.d.descent();
        } else if ((i3 & 32) != 0) {
            f = -this.d.descent();
        } else if ((i3 & 2) != 0) {
            f = (this.d.getTextSize() / 2.0f) - this.d.descent();
        }
        float f2 = 1.0f / c;
        this.a.drawText(str, i * f2, f + (f2 * i2), this.d);
        this.a.restore();
    }

    @Override // zhook.aohoc.bridge.e
    public void a(String str, int i, int i2, int i3, int i4, int i5) {
        this.d.setTextAlign((i5 & 1) != 0 ? Paint.Align.CENTER : (i5 & 8) != 0 ? Paint.Align.RIGHT : Paint.Align.LEFT);
        this.a.save();
        float c = this.c.c();
        this.a.scale(c, c);
        float f = 1.0f / c;
        this.a.drawText(str, i, i + i2, i3 * f, (f * i4) + ((i5 & 16) != 0 ? this.d.getTextSize() - this.d.descent() : (i5 & 32) != 0 ? -this.d.descent() : (i5 & 2) != 0 ? (this.d.getTextSize() / 2.0f) - this.d.descent() : 0.0f), this.d);
        this.a.restore();
    }

    public void a(bBridgeA bBridgeAVar) {
        bAndr bAndrVar2 = (bAndr) bBridgeAVar;
        Paint d = bAndrVar2.d();
        if (this.d != null) {
            this.d.setTextSize(d.getTextSize());
            this.d.setTypeface(d.getTypeface());
            this.d.setUnderlineText(d.isUnderlineText());
        } else {
            this.d = new Paint(d);
            this.d.setAntiAlias(true);
            this.d.setTextSize(d.getTextSize());
            this.d.setTypeface(d.getTypeface());
            this.d.setUnderlineText(d.isUnderlineText());
        }
        this.c = bAndrVar2;
    }

    @Override // zhook.aohoc.bridge.e
    public void a(fBridgeA fBridgeAVar, int i, int i2, int i3) {
        eAndr eAndrVar = (eAndr) fBridgeAVar;
        if ((i3 & 8) != 0) {
            i -= eAndrVar.a();
        } else if ((i3 & 1) != 0) {
            i -= eAndrVar.a() / 2;
        }
        if ((i3 & 32) != 0) {
            i2 -= eAndrVar.b();
        } else if ((i3 & 2) != 0) {
            i2 -= eAndrVar.b() / 2;
        }
        this.a.drawBitmap(eAndrVar.e(), i, i2, (Paint) null);
    }

    @Override // zhook.aohoc.bridge.e
    public void a(fBridgeA fBridgeAVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Bitmap h;
        boolean z = true;
        eAndr eAndrVar = (eAndr) fBridgeAVar;
        boolean z2 = (i5 & 2) != 0;
        boolean z3 = (i5 & 1) != 0;
        if (!z3 || !z2) {
            z = false;
        }
        if (z3 || z2) {
            h = z ? eAndrVar.h() : z3 ? eAndrVar.f() : eAndrVar.g();
            if (z2) {
                i = (eAndrVar.e().getWidth() - i) - i3;
            }
            if (z3) {
                i2 = (eAndrVar.e().getHeight() - i2) - i4;
            }
        } else {
            h = null;
        }
        this.g.left = i;
        this.g.top = i2;
        this.g.right = this.g.left + i3;
        this.g.bottom = this.g.top + i4;
        this.h.left = i6;
        this.h.top = i7;
        this.h.right = this.h.left + i3;
        this.h.bottom = this.h.top + i4;
        if (h != null) {
            this.a.drawBitmap(h, this.g, this.h, (Paint) null);
        } else {
            this.a.drawBitmap(eAndrVar.e(), this.g, this.h, (Paint) null);
        }
    }

    public Bitmap b() {
        return this.b;
    }

    @Override // zhook.aohoc.bridge.e
    public void b(int i) {
    }

    @Override // zhook.aohoc.bridge.e
    public void b(int i, int i2, int i3, int i4) {
        this.a.drawLine(i, i2, i3, i4, this.d);
    }

    @Override // zhook.aohoc.bridge.e
    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        Paint paint = new Paint(this.d);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.a.drawArc(new RectF(i, i2, i + i3, i2 + i4), i5, i6, true, paint);
    }

    @Override // zhook.aohoc.bridge.e
    /* renamed from: c */
    public bAndr a() {
        return this.c;
    }

    @Override // zhook.aohoc.bridge.e
    public void c(int i, int i2, int i3, int i4) {
        Paint paint = new Paint(this.d);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.a.drawRect(i, i2, i + i3, i2 + i4, paint);
    }

    @Override // zhook.aohoc.bridge.e
    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        Paint paint = new Paint(this.d);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.a.drawArc(new RectF(i, i2, i + i3, i2 + i4), i5, i6, true, paint);
    }

    @Override // zhook.aohoc.bridge.e
    public void d(int i, int i2, int i3, int i4) {
        try {
            this.a.restore();
        } catch (IllegalStateException e) {
        }
        this.a.save();
        this.a.translate(this.e, this.f);
        this.a.clipRect(i, i2, i + i3, i2 + i4);
    }
}
