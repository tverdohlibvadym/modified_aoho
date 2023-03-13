package zhook.aohoc.bridge.platform.andr;

import java.io.FileInputStream;
import java.io.IOException;

import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.ah;
import zhook.aohoc.bridge.jBridgeA;

/* loaded from: classes.dex */
public class AndrRecordStore extends jBridgeA {
    @Override // zhook.aohoc.bridge.j
    public int a(String str, byte[] bArr, int i) {
        byte[] a = ah.a(bArr, i);
        ah.b(a, i);
        long j = -1;
        synchronized (this.b) {
            c(str);
            try {
                MainActivity.a.openFileOutput(a(str), 0).write(a);
                j = e("");
            } finally {
                try {
                    return (int) j;
                } finally {
                }
            }
        }
    }

    @Override // zhook.aohoc.bridge.j
    public String a() {
        String str;
        int i = 0;
        synchronized (this.b) {
            String[] fileList = MainActivity.a.fileList();
            str = e("") + ":";
            if (fileList != null) {
                while (true) {
                    int i2 = i;
                    if (i2 >= fileList.length) {
                        break;
                    }
                    String str2 = fileList[i2];
                    if (str2.endsWith("_rsid")) {
                        int lastIndexOf = str2.lastIndexOf(95);
                        if (lastIndexOf == -1) {
                            lastIndexOf = str2.length();
                        }
                        str = str + str2.substring(0, lastIndexOf);
                    }
                    i = i2 + 1;
                }
            }
        }
        return str;
    }

    @Override // zhook.aohoc.bridge.j
    public String a(String str) {
        return super.a(str) + "_rsid";
    }

    @Override // zhook.aohoc.bridge.j
    public byte[][] a(String str, int i) throws IOException {
        System.out.println("str = " + str);
        String a = a(str);
        System.out.println("a = " + a);
        byte[][] bArr = {null, new byte[8]};
        ag.a(-1L, bArr[1], 0);
        synchronized (this.b) {
            ag.a(e(""), bArr[1], 0);
            System.out.println("MainActivity.a = " + MainActivity.a);
            FileInputStream openFileInput = MainActivity.a.getApplicationContext().openFileInput(a);
            System.out.println("openFileInput.toString() = " + openFileInput.toString());
            try {
                int available = openFileInput.available();
                if (available > 0) {
                    byte[] bArr2 = new byte[available];
                    ag.a(openFileInput, bArr2, (int[]) null);
                    bArr[0] = ah.b(bArr2, i);
                }
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            } finally {
                openFileInput.close();
            }
        }
        return bArr;
    }

    @Override // zhook.aohoc.bridge.j
    public boolean b(String str) {
        String a = a(str);
        boolean z = false;
        synchronized (this.b) {
            try {
                z = true;
                MainActivity.a.openFileInput(a).close();
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return z;
    }

    @Override // zhook.aohoc.bridge.j
    public void c(String str) {
        String a = a(str);
        synchronized (this.b) {
            MainActivity.a.deleteFile(a);
        }
    }

    @Override // zhook.aohoc.bridge.j
    public void d(String str) {
        String a = a(str);
        try {
            String[] fileList = MainActivity.a.fileList();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    try {
                        if (fileList[i].lastIndexOf(a) != -1) {
                            MainActivity.a.deleteFile(fileList[i]);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int e(String str) {
        return 0;
    }
}
