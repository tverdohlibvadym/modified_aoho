package zhook.aohoc.aRoot;

import java.util.Vector;

/* loaded from: classes.dex */
public class af {
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
}
