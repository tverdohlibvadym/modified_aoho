package zhook.aohoc.bridge.platform.andr;

import android.graphics.Paint;
import android.graphics.Typeface;
import zhook.aohoc.bridge.bBridgeA;

/* loaded from: classes.dex */
public class bAndr implements bBridgeA {
    private Paint a;
    private Paint.FontMetricsInt b;
    private int c;

    protected bAndr(Paint paint, int i) {
        a(paint);
        paint.setTextSize(i);
        this.c = i;
    }

    protected bAndr(Typeface typeface, int i) {
        this(a(typeface), i);
    }

    private static Paint a(Typeface typeface) {
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        return paint;
    }

    public static bAndr b() {
        int dimensionPixelSize = MainActivity.a.getResources().getDimensionPixelSize(R.dimen.text_size);
        return new bAndr(Typeface.DEFAULT, dimensionPixelSize >= 20 ? dimensionPixelSize > 50 ? 50 : dimensionPixelSize : 20);
    }

    @Override // zhook.aohoc.bridge.b
    public int a() {
        return Math.round(this.a.getTextSize() * c());
    }

    @Override // zhook.aohoc.bridge.b
    public int a(String str) {
        return Math.round(this.a.measureText(str) * c());
    }

    public void a(Paint paint) {
        this.a = paint;
        this.b = paint.getFontMetricsInt();
    }

    public float c() {
        return 1.0f;
    }

    public Paint d() {
        return this.a;
    }
}
