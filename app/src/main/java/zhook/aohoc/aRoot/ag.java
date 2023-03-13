package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.Vector;

import zhook.aohoc.bridge.aBridge.aABridge;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class ag {
    public static Random a = new Random(System.currentTimeMillis() * 2);
    public static int b = 0;

    public static int a(int i, int i2) {
        if (i < 0) {
            i = i2 - ((-i) % i2);
        }
        return i % i2;
    }

    public static int a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int a(int i, int[] iArr) {
        if (iArr == null) {
            return -1;
        }
        return a(i, iArr, iArr.length);
    }

    public static int a(int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public static int a(String str, String[] strArr) {
        if (strArr == null) {
            return -1;
        }
        return a(str, strArr, strArr.length);
    }

    public static int a(String str, String[] strArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (strArr[i2] != null && strArr[i2].equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public static int a(short s, short[] sArr) {
        if (sArr == null) {
            return -1;
        }
        return a(s, sArr, sArr.length);
    }

    public static int a(short s, short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (sArr[i2] == s) {
                return i2;
            }
        }
        return -1;
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
    }

    public static int a(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public static int a(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        return sArr.length;
    }

    public static DataInputStream a(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    public static String a(int i) {
        String str = (i & 1) != 0 ? "0" : "";
        if ((i & 2) != 0) {
            str = str + "1";
        }
        if ((i & 4) != 0) {
            str = str + "2";
        }
        if ((i & 8) != 0) {
            str = str + "3";
        }
        if ((i & 16) != 0) {
            str = str + "4";
        }
        if ((i & 32) != 0) {
            str = str + "5";
        }
        if ((i & 64) != 0) {
            str = str + "6";
        }
        if ((i & 128) != 0) {
            str = str + "7";
        }
        if ((i & 256) != 0) {
            str = str + "8";
        }
        if ((i & 512) != 0) {
            str = str + "9";
        }
        if ((i & 1024) != 0) {
            str = str + "*";
        }
        if ((i & 2048) != 0) {
            str = str + "#";
        }
        if ((i & 4096) != 0) {
            str = str + "<";
        }
        if ((i & 8192) != 0) {
            str = str + ">";
        }
        if ((i & 16384) != 0) {
            str = str + "X";
        }
        if ((32768 & i) != 0) {
            str = str + "L";
        }
        if ((65536 & i) != 0) {
            str = str + "R";
        }
        if ((131072 & i) != 0) {
            str = str + "U";
        }
        return (262144 & i) != 0 ? str + "D" : str;
    }

    public static String a(String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 1000);
        int i = 0;
        int length = str2.length();
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                stringBuffer.append(str.substring(i));
                return stringBuffer.toString();
            }
            stringBuffer.append(str.substring(i, indexOf));
            i = indexOf + length;
            stringBuffer.append(str3);
        }
    }

    public static String a(String[] strArr, char c) {
        if (strArr == null) {
            return null;
        }
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            str = str + strArr[i];
            if (i != strArr.length - 1) {
                str = str + c;
            }
        }
        return str;
    }

    public static aABridge a(String str, int i, boolean z) {
        y.a("begin open url: " + str);
        b++;
        try {
            return aBridgeA.f.a(str, i, z);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            b--;
            y.a("end open url: " + str);
        }
    }

    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void a(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    public static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null) {
            new Throwable("null argument");
        }
        if (str.length() > 255) {
            new Throwable("invalid string steps_remained");
        }
        dataOutputStream.writeByte(str.length());
        if (str.length() > 0) {
            dataOutputStream.write(str.getBytes());
        }
    }

    public static void a(DataOutputStream dataOutputStream, String[] strArr) throws IOException {
        if (strArr == null) {
            dataOutputStream.writeShort(0);
            return;
        }
        dataOutputStream.writeShort(strArr.length);
        for (String str : strArr) {
            dataOutputStream.writeUTF(str);
        }
    }

    public static void a(InputStream inputStream, byte[] bArr, int i, int i2, int[] iArr) throws Throwable {
        int i3 = i;
        while (i3 < i + i2) {
            int read = inputStream.read(bArr, i3, (i + i2) - i3);
            if (read == -1) {
                throw new Throwable("end stream reached");
            }
            i3 += read;
            if (iArr != null) {
                iArr[0] = read + iArr[0];
            }
        }
    }

    public static void a(InputStream inputStream, byte[] bArr, int[] iArr) throws Throwable {
        a(inputStream, bArr, 0, bArr.length, iArr);
    }

    public static void a(byte[] bArr, int i, int i2) {
        if (i == i2) {
            return;
        }
        byte b2 = bArr[i];
        if (i < i2) {
            System.arraycopy(bArr, i + 1, bArr, i, i2 - i);
        } else {
            System.arraycopy(bArr, i, bArr, i + 1, i - i2);
        }
        bArr[i2] = b2;
    }

    public static void a(int[] iArr, int i, int i2) {
        if (i == i2) {
            return;
        }
        int i3 = iArr[i];
        if (i < i2) {
            System.arraycopy(iArr, i + 1, iArr, i, i2 - i);
        } else {
            System.arraycopy(iArr, i, iArr, i + 1, i - i2);
        }
        iArr[i2] = i3;
    }

    public static void a(short[] sArr, int i, int i2) {
        if (i == i2) {
            return;
        }
        short s = sArr[i];
        if (i < i2) {
            System.arraycopy(sArr, i + 1, sArr, i, i2 - i);
        } else {
            System.arraycopy(sArr, i, sArr, i + 1, i - i2);
        }
        sArr[i2] = s;
    }

    public static boolean a(int i, int i2, short[] sArr, int i3) {
        return i >= sArr[i3] && i < sArr[i3 + 2] && i2 >= sArr[i3 + 1] && i2 < sArr[i3 + 3];
    }

    public static byte[] a(int i, byte[] bArr, int i2, int i3) {
        int b2 = b(bArr);
        if (i2 <= b2) {
            byte[] bArr2 = new byte[i2 + 1 + i3];
            if (b2 > 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i2);
            }
            bArr = bArr2;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i;
        return bArr;
    }

    public static byte[] a(DataInputStream dataInputStream) throws Throwable {
        return a(dataInputStream, dataInputStream.readUnsignedShort());
    }

    public static byte[] a(DataInputStream dataInputStream, int i) throws Throwable {
        byte[] bArr = new byte[i];
        a(dataInputStream, bArr, (int[]) null);
        return bArr;
    }

    public static byte[] a(String str) {
        try {
            InputStream c = aBridgeA.c.c(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
            while (true) {
                int read = c.read();
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(read);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int[] a(int i, int i2, int i3, int i4) {
        return new int[]{i, i2, i3, i4};
    }

    public static int[] a(int i, int[] iArr, int i2, int i3) {
        int a2 = a(iArr);
        if (i2 <= a2) {
            int[] iArr2 = new int[i2 + 1 + i3];
            if (a2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i2);
            }
            iArr = iArr2;
        }
        int i4 = i2 + 1;
        iArr[i2] = i;
        return iArr;
    }

    public static int[] a(int[] iArr, int i) {
        return b(iArr, i, 0);
    }

    public static String[] a(String str, char c) {
        if (str == null) {
            return null;
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int indexOf = str.indexOf(c, i);
            if (indexOf == -1) {
                vector.addElement(str.substring(i).trim());
                i = -1;
                break;
            }
            vector.addElement(str.substring(i, indexOf).trim());
            i = indexOf + 1;
        }
        if (i == str.length()) {
            vector.addElement("");
        }
        String[] strArr = new String[vector.size()];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    public static String[] a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                strArr2[i] = "" + System.getProperty(strArr[i]);
            } catch (Throwable th) {
                strArr2[i] = th.toString();
            }
        }
        return strArr2;
    }

    public static String[] a(String[] strArr, int i, String str) {
        String[] strArr2 = new String[i];
        int length = strArr == null ? 0 : strArr.length;
        int i2 = length <= i ? length : i;
        if (length > i) {
        }
        if (i2 > 0) {
            System.arraycopy(strArr, 0, strArr2, 0, i2);
        }
        while (length < i) {
            strArr2[length] = str;
            length++;
        }
        return strArr2;
    }

    public static short[] a(int i, short[] sArr, int i2, int i3) {
        int a2 = a(sArr);
        if (i2 <= a2) {
            short[] sArr2 = new short[i2 + 1 + i3];
            if (a2 > 0) {
                System.arraycopy(sArr, 0, sArr2, 0, i2);
            }
            sArr = sArr2;
        }
        int i4 = i2 + 1;
        sArr[i2] = (short) i;
        return sArr;
    }

    public static short[] a(short[] sArr, int i) {
        return b(sArr, i, 0);
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int b(String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    public static String b(String str) {
        byte[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(a2));
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if (read == 254 && read2 == 255) {
                char[] cArr = new char[(a2.length / 2) - 1];
                for (int i = 0; i < cArr.length; i++) {
                    cArr[i] = dataInputStream.readChar();
                }
                return new String(cArr);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static boolean b(int i, int i2, short[] sArr, int i3) {
        short s = sArr[i3];
        short s2 = sArr[i3 + 1];
        return i >= s && i < sArr[i3 + 2] + s && i2 >= s2 && i2 < sArr[i3 + 3] + s2;
    }

    public static byte[] b(DataInputStream dataInputStream) throws Throwable {
        return a(dataInputStream, dataInputStream.readUnsignedByte());
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i];
        int length = bArr == null ? 0 : bArr.length;
        int i3 = length <= i ? length : i;
        if (length > i) {
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i3);
        }
        byte b2 = (byte) i2;
        while (length < i) {
            bArr2[length] = b2;
            length++;
        }
        return bArr2;
    }

    public static int[] b(int[] iArr, int i, int i2) {
        int[] iArr2 = new int[i];
        int length = iArr == null ? 0 : iArr.length;
        int i3 = length <= i ? length : i;
        if (length > i) {
        }
        if (i3 > 0) {
            System.arraycopy(iArr, 0, iArr2, 0, i3);
        }
        while (length < i) {
            iArr2[length] = i2;
            length++;
        }
        return iArr2;
    }

    public static short[] b(DataInputStream dataInputStream, int i) throws IOException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            sArr[i2] = (short) dataInputStream.readUnsignedByte();
        }
        return sArr;
    }

    public static short[] b(short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i];
        int length = sArr == null ? 0 : sArr.length;
        int i3 = length <= i ? length : i;
        if (length > i) {
        }
        if (i3 > 0) {
            System.arraycopy(sArr, 0, sArr2, 0, i3);
        }
        short s = (short) i2;
        while (length < i) {
            sArr2[length] = s;
            length++;
        }
        return sArr2;
    }

    public static long c(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
    }

    public static short[] c(DataInputStream dataInputStream) throws IOException {
        return c(dataInputStream, dataInputStream.readUnsignedShort());
    }

    public static short[] c(DataInputStream dataInputStream, int i) throws IOException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            sArr[i2] = dataInputStream.readShort();
        }
        return sArr;
    }

    public static byte[] d(byte[] bArr, int i) {
        return b(bArr, i, 0);
    }

    public static int[] d(DataInputStream dataInputStream) throws IOException {
        return d(dataInputStream, dataInputStream.readUnsignedShort());
    }

    public static int[] d(DataInputStream dataInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = dataInputStream.readInt();
        }
        return iArr;
    }

    public static String e(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.readUnsignedByte()];
        dataInputStream.read(bArr);
        return new String(bArr);
    }

    public static String[] e(DataInputStream dataInputStream, int i) throws IOException {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = dataInputStream.readUTF();
        }
        return strArr;
    }

    public static String[] f(DataInputStream dataInputStream) throws IOException {
        return e(dataInputStream, dataInputStream.readUnsignedShort());
    }

    public static String[] g(DataInputStream dataInputStream) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = e(dataInputStream);
        }
        return strArr;
    }
}
