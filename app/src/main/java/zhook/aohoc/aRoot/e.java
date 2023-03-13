package zhook.aohoc.aRoot;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import zhook.aohoc.bridge.jBridgeA;

/* loaded from: classes.dex */
public final class e {
    public static String a = "Revival";
    public static String b = "Revival;194.67.198.77;8096;0;1;777;0;Revival;";
    private String c;
    private String d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private long i;
    private String j;
    private String k;

    private e() {
    }

    private e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.c = str;
        this.d = str2;
        this.e = Integer.parseInt(str3);
        this.f = Integer.parseInt(str4);
        this.g = "1".equals(str5);
        this.h = Integer.parseInt(str6);
        this.i = Long.parseLong(str7);
        this.j = str8;
        this.k = str + ";" + str2 + ";" + str3 + ";" + str4 + ";" + str5 + ";" + str6 + ";" + str7 + ";" + str8 + ";";
    }

    public static e[] a(String str) {
        int length;
        e[] eVarArr = new e[0];
        if (str == null || str.length() == 0) {
            return eVarArr;
        }
        String[] a2 = ag.a(str, ';');
        if (a2 != null && (length = a2.length / 8) > 0) {
            e[] eVarArr2 = new e[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 8;
                String str2 = a2[i2 + 0];
                String str3 = a2[i2 + 1];
                String str4 = a2[i2 + 2];
                String str5 = a2[i2 + 3];
                String str6 = a2[i2 + 4];
                String str7 = a2[i2 + 5];
                String str8 = a2[i2 + 6];
                String str9 = a2[i2 + 7];
                if (str3 != null && str3.indexOf("192.168") == -1 && str3.indexOf("67.198") == -1) {
                    return eVarArr;
                }
                eVarArr2[i] = new e(str2, str3, str4, str5, str6, str7, str8, str9);
            }
            return eVarArr2;
        }
        return eVarArr;
    }

    public void a(jBridgeA jBridgeAVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF(this.c);
            dataOutputStream.writeUTF(i());
            jBridgeAVar.a("aohosn", byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean a() {
        return b() && c();
    }

    public boolean b() {
        return this.g;
    }

    public boolean c() {
        return this.i >= 0 && this.i < 300;
    }

    public String d() {
        return "socket://" + this.d + ":" + this.e;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.j;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.h;
    }

    public String i() {
        return this.k;
    }
}
