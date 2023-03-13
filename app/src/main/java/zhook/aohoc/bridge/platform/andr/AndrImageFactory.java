package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import zhook.aohoc.bridge.fBridgeA;
import zhook.aohoc.bridge.gBridgeA;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class AndrImageFactory implements gBridgeA {
    @Override // zhook.aohoc.bridge.g
    public fBridgeA a(int i, int i2) {
        return new eAndr(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
    }

    public fBridgeA a(InputStream inputStream) throws IOException {
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        if (decodeStream == null) {
            throw new IOException();
        }
        return new eAndr(decodeStream);
    }

    @Override // zhook.aohoc.bridge.g
    public fBridgeA a(String str) throws IOException {
        if (str.startsWith("/")) {
            str = str.substring(1, str.length());
        }
        return a(MainActivity.a.getAssets().open(str));
    }

    @Override // zhook.aohoc.bridge.g
    public fBridgeA a(byte[] bArr, int i, int i2) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2);
        if (decodeByteArray == null) {
            throw new IllegalArgumentException("Could not decode image data");
        }
        return new eAndr(decodeByteArray);
    }

    @Override // zhook.aohoc.bridge.g
    public fBridgeA a(int[] iArr, int i, int i2, boolean z) {
        return new eAndr(Bitmap.createBitmap(iArr, i, i2, z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565));
    }

    @Override // zhook.aohoc.bridge.g
    public fBridgeA[] a(int i) {
        return new eAndr[i];
    }
}
