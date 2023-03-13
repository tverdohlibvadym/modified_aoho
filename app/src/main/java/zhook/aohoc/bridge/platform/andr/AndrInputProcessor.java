package zhook.aohoc.bridge.platform.andr;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Message;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import zhook.aohoc.aRoot.cPackage.jCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.hBridgeA;

/* loaded from: classes.dex */
public class AndrInputProcessor extends hBridgeA {
    jAndr n;
    boolean o = false;
    String p = null;
    String q = null;
    String r = null;
    String s = null;
    int t = 100;
    String u = null;
    int v = 0;
    String w = null;
    int x = 0;
    int y = -1;
    zhook.aohoc.aRoot.cPackage.dCClassCPackage aPackage;

    public AndrInputProcessor() {
        MainActivity.a.runOnUiThread(new fAndr(this, this));
    }

    public void a(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, int i3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.a);
        builder.setIcon(R.drawable.icon);
        builder.setCancelable(false);
        View inflate = ((LayoutInflater) MainActivity.a.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.input, (ViewGroup) MainActivity.a.findViewById(R.id.layout_root));
        ((TextView) inflate.findViewById(R.id.textCaption)).setText(str2);
        EditText editText = (EditText) inflate.findViewById(R.id.inputText);
        if (str3 != null) {
            editText.setText(str3);
        }
        if (i != 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        builder.setView(inflate);
        if (str5 != null) {
            builder.setPositiveButton(str5, new gAndr(this, editText));
        }
        if (str6 != null) {
            builder.setNegativeButton(str6, new hAndr(this));
        } else {
            builder.setNegativeButton("Cancel", new iAndr(this));
        }
        builder.show();
    }

    @Override // zhook.aohoc.bridge.h
    public void a(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4) {
        this.aAClassPackage.Q.d = i;
        this.aAClassPackage.Q.e = i2;
        b(str, str2, str3, str4, str5, i, str6, i2, i3, i4);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        if (i == 21) {
            this.aAClassPackage.e(32768);
        } else if (i == 22) {
            this.aAClassPackage.e(65536);
        } else if (i == 19) {
            this.aAClassPackage.e(131072);
        } else if (i == 20) {
            this.aAClassPackage.e(262144);
        } else if (i == 23) {
            this.aAClassPackage.e(16384);
        } else {
            a(i);
        }
        return false;
    }

    public boolean a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.b = (int) motionEvent.getX();
                this.c = (int) motionEvent.getY();
                this.d = 0L;
                break;
            case 1:
                this.f = true;
                break;
            case 2:
                b((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return true;
    }

    @Override // zhook.aohoc.bridge.h
    public void b() {
        String l = this.aAClassPackage.Q.l();
        this.aAClassPackage.h.g.a(l);
        this.aAClassPackage.g.a(this.aAClassPackage.g.d, l);
    }

    public void b(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.u = str5;
        this.v = i;
        this.w = str6;
        this.x = i2;
        this.t = i3;
        this.n.sendMessage(new Message());
    }

    public boolean b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        if (i == 21) {
            this.aAClassPackage.f(-32769);
        } else if (i == 22) {
            this.aAClassPackage.f(-65537);
        } else if (i == 19) {
            this.aAClassPackage.f(-131073);
        } else if (i == 20) {
            this.aAClassPackage.f(-262145);
        } else if (i == 23) {
            this.aAClassPackage.f(-16385);
        } else {
            b(i);
        }
        return false;
    }

    public boolean b(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 2:
                float x = motionEvent.getX() * motionEvent.getXPrecision();
                float y = motionEvent.getY() * motionEvent.getYPrecision();
                if (Math.max(Math.abs(x), Math.abs(y)) >= 1.0f) {
                    if (Math.abs(x) <= Math.abs(y)) {
                        this.h = y < 0.0f ? 2 : 3;
                        break;
                    } else {
                        this.h = x < 0.0f ? 0 : 1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public void c() {
        this.aAClassPackage.Q.d = 0;
        this.aAClassPackage.Q.e = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 100;
        this.u = null;
        this.v = 0;
        this.w = null;
        this.x = 0;
        this.aAClassPackage.Q.a("");
    }

    @SuppressLint("SwitchIntDef")
    public boolean c(int i, int i2) throws InterruptedException {
        int a;
        jCClassCPackage jCClassCPackageVar;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        if (i > this.m.a - 50 && i2 < 30 && i < this.m.a + 40) {
            z = true;
        }
        if (i < 50 && i2 < 30) {
            z2 = true;
        }
        if (z && this.aAClassPackage.c.a != null && aBridgeA.a() != null && this.aAClassPackage.A != 2 && this.aAClassPackage.A != 1) {
            aBridgeA.a().h();
            return true;
        } else if (z2 && this.aAClassPackage.c.c != null && aBridgeA.a() != null && this.aAClassPackage.A != 2 && this.aAClassPackage.A != 1) {
            switch ( MainActivity.a.getRequestedOrientation()) {
                case 0:
                    zhook.aohoc.aRoot.y.a("setRequestedOrientation = SCREEN_ORIENTATION_PORTRAIT");
                    MainActivity.a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                    aBridgeA.a().b(1);
                    break;
                case 1:
                    zhook.aohoc.aRoot.y.a("setRequestedOrientation = SCREEN_ORIENTATION_LANDSCAPE");
                    MainActivity.a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    aBridgeA.a().b(0);
                    break;
                default:
                    zhook.aohoc.aRoot.y.a("setRequestedOrientation = SCREEN_ORIENTATION_LANDSCAPE (default)");
                    MainActivity.a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    aBridgeA.a().b(0);
                    break;
            }
            return true;
        } else {
            boolean z3 = currentTimeMillis - this.j < 666;
            if ((i < (this.m.a / 2) + (-30) || i > (this.m.a / 2) + 30 || i2 > 20) ? false : false) {
                this.k++;
                if (this.k == 2) {
                    this.aAClassPackage.a(6);
                    return false;
                }
            } else {
                this.k = 0;
            }
            this.j = currentTimeMillis;
            boolean z4 = MainActivity.a.a() == 2;
            if (this.aAClassPackage.A != 3) {
                int i3 = this.aAClassPackage.c.i() > 0 ? this.aAClassPackage.c.i() : 35;
                if (i2 >= this.m.b - i3 && i <= 50) {
                    this.aAClassPackage.e(4096);
                    return true;
                } else if (i2 >= this.m.b - i3 && i >= this.m.a - 50 && i < this.m.a + 40) {
                    this.aAClassPackage.e(8192);
                    return true;
                } else if (i2 <= this.m.b - 30 && i < this.m.a && (a = this.aAClassPackage.c.a(i, i2)) != -1) {
                    this.aAClassPackage.c.n.a(a, this.aAClassPackage.A == 21);
                    this.aAClassPackage.e(16384);
                }
            } else if (this.aAClassPackage.N != null && (jCClassCPackageVar = this.aAClassPackage.h) != null) {
                jCClassCPackageVar.d(i, i2);
            }
            int i4 = this.m.b;
            int i5 = this.m.a;
            int a2 = aPackage == null ? -1 : aPackage.a();
            if (z4) {
                i4 = this.m.a;
                i5 = this.m.b;
                a2 = aPackage == null ? -1 : aPackage.b();
            } else {
                i2 = i;
                i = i2;
            }
            if (i > i4 && a2 != -1) {
                int i6 = (i2 - ((i5 - a2) / 2)) / 64;
                int i7 = (i - i4) / 40;
                if (i6 == 2 && i7 == 0) {
                    if (z4) {
                        this.aAClassPackage.e(32768);
                    } else {
                        this.aAClassPackage.e(131072);
                    }
                    this.e = 3;
                } else if (i6 == 1 && i7 == 1) {
                    if (z4) {
                        this.aAClassPackage.e(131072);
                    } else {
                        this.aAClassPackage.e(32768);
                    }
                    this.e = 1;
                } else if (i6 == 2 && i7 == 1) {
                    this.aAClassPackage.e(16384);
                    this.e = 0;
                    return true;
                } else if (i6 == 3 && i7 == 1) {
                    if (z4) {
                        this.aAClassPackage.e(262144);
                    } else {
                        this.aAClassPackage.e(65536);
                    }
                    this.e = 2;
                } else if (i6 == 2 && i7 == 2) {
                    if (z4) {
                        this.aAClassPackage.e(65536);
                    } else {
                        this.aAClassPackage.e(262144);
                    }
                    this.e = 4;
                }
                if (this.aAClassPackage.A == 3) {
                    if (i6 == 0 && i7 == 0) {
                        if (!z4) {
                            this.aAClassPackage.e(4096);
                            return true;
                        }
                    } else if (i6 == 0 && i7 == 1) {
                        if (z4) {
                            this.aAClassPackage.e(128);
                        } else {
                            this.aAClassPackage.e(1024);
                        }
                        return true;
                    } else if (i6 == 0 && i7 == 2) {
                        if (z4) {
                            this.aAClassPackage.e(512);
                        } else {
                            this.aAClassPackage.e(1);
                        }
                        return true;
                    } else if (i6 == 4 && i7 == 0) {
                        this.aAClassPackage.e(8192);
                        return true;
                    } else if (i6 == 4 && i7 == 1) {
                        if (z4) {
                            this.aAClassPackage.e(1024);
                        } else {
                            this.aAClassPackage.e(128);
                        }
                        return true;
                    } else if (i6 == 4 && i7 == 2) {
                        if (z4) {
                            this.aAClassPackage.e(1);
                        } else {
                            this.aAClassPackage.e(512);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void d() throws InterruptedException {
        if (this.b != -1 && this.c != -1 && System.currentTimeMillis() - this.d > 300) {
            this.d = (this.d == 0 ? 1200 : 0) + System.currentTimeMillis();
            if (c(this.b, this.c)) {
                this.b = -1;
                this.c = -1;
            }
        }
        this.g = false;
        if (this.h != -1) {
            switch (this.h) {
                case 0:
                    this.e = 1;
                    this.aAClassPackage.e(32768);
                    break;
                case 1:
                    this.e = 2;
                    this.aAClassPackage.e(65536);
                    break;
                case 2:
                    this.e = 3;
                    this.aAClassPackage.e(131072);
                    break;
                case 3:
                    this.e = 4;
                    this.aAClassPackage.e(262144);
                    break;
            }
            this.g = true;
        }
    }

    public void e() {
        try {
            if (this.f) {
                this.aAClassPackage.f(-1036288);
                this.f = false;
                if (this.b != -1 && this.c != -1) {
                    a(this.b, this.c);
                    this.b = -1;
                    this.c = -1;
                }
            }
            if (this.g && this.h != -1) {
                a();
                this.h = -1;
            }
        } finally {
            if (this.b == -1 && this.c == -1 && this.h == -1 && this.e != -1) {
                this.e = -1;
            }
        }
    }

    public int f() {
        return this.e;
    }
}
