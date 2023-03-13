package zhook.aohoc.bridge.platform.andr;

import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Region;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class mAndr {
    private eAndr a;
    private eAndr b;
    private eAndr c;
    private eAndr d;
    private eAndr eAndr;
    private eAndr f;
    private eAndr g;
    private Paint h;
    private aCClassCPackage i;

    public mAndr() {
        c();
    }

    private void b(int i) {
        Canvas canvas = aAndr.aAndr.b;;
        if (canvas != null) {
            int width = a.a.getWidth();
            int height = a.a.getHeight();
            canvas.clipRect(width - this.g.a(), 0.0f, width, height, Region.Op.REPLACE);
            int a = width - this.g.a();
            int b = (height - this.g.b()) / 2;
            if (a < 0) {
                return;
            }
            canvas.drawBitmap(this.g.e(), a, b, (Paint) null);
            switch (i) {
                case 0:
                    canvas.drawBitmap(this.b.e(), a + 43, b + 143, (Paint) null);
                    return;
                case 1:
                    canvas.drawBitmap(this.eAndr.e(), a + 44, b + 103, (Paint) null);
                    return;
                case 2:
                    canvas.drawBitmap(this.f.e(), a + 44, b + 193, (Paint) null);
                    return;
                case 3:
                    canvas.drawBitmap(this.c.e(), a + 11, b + 143, (Paint) null);
                    return;
                case 4:
                    canvas.drawBitmap(this.d.e(), a + 85, b + 143, (Paint) null);
                    return;
                default:
                    return;
            }
        }
    }

    private void c() {
        if (this.a == null) {
            this.a = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.downpanel));
            this.b = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.bcenter));
            this.c = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.bleft));
            this.d = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.bright));
            this.eAndr = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.btop));
            this.f = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.bdown));
            this.g = new eAndr(BitmapFactory.decodeResource(MainActivity.a.getResources(), R.drawable.panellandscape));
            this.h = new Paint();
            this.h.setStyle(Paint.Style.FILL);
            this.h.setColor(-65536);
        }
    }

    private void c(int i) {
        Canvas canvas = aAndr.aAndr.b;
        if (canvas != null) {
            canvas.clipRect(0.0f, this.i.b, a.a.getWidth(), a.a.getHeight(), Region.Op.REPLACE);
            int a = (this.i.a - this.a.a()) / 2;
            int i2 = this.i.b;
            if (a < 0 || i2 < 0) {
                return;
            }
            canvas.drawBitmap(this.a.e(), a, i2, (Paint) null);
            switch (i) {
                case 0:
                    canvas.drawBitmap(this.b.e(), a + 143, i2 + 43, (Paint) null);
                    return;
                case 1:
                    canvas.drawBitmap(this.c.e(), a + 103, i2 + 44, (Paint) null);
                    return;
                case 2:
                    canvas.drawBitmap(this.d.e(), a + 193, i2 + 44, (Paint) null);
                    return;
                case 3:
                    canvas.drawBitmap(this.eAndr.e(), a + 143, i2 + 11, (Paint) null);
                    return;
                case 4:
                    canvas.drawBitmap(this.f.e(), a + 143, i2 + 85, (Paint) null);
                    return;
                default:
                    return;
            }
        }
    }

    public int a() {
        if (this.a == null || this.g == null) {
            return 0;
        }
        return MainActivity.a.a() == 2 ? this.g.a() : this.a.a();
    }

    public void a(int i) {
        if ( aBridgeA.a().i() == null || aBridgeA.a().i().n() == null) {
            return;
        }
        this.i = aBridgeA.a().i().n().T;
        if ( MainActivity.a.a() == 2) {
            b(i);
        } else if ( MainActivity.a.a() == 1) {
            c(i);
        }
    }

    public int b() {
        if (this.a == null || this.g == null) {
            return 0;
        }
        return MainActivity.a.a() == 2 ? this.g.b() : this.a.b();
    }
}
