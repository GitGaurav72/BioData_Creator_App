/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  e.p.a.c.b.a
 *  e.p.a.c.f.f.vc
 *  java.lang.Object
 *  java.lang.String
 */
package e.p.a.c.f.f;

import android.os.Parcel;
import android.os.Parcelable;
import e.p.a.c.b.a;
import e.p.a.c.f.f.vc;

public final class wc
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n2 = a.x0((Parcel)parcel);
        String string = null;
        while (parcel.dataPosition() < n2) {
            int n3 = parcel.readInt();
            if ((char)n3 != '\u0001') {
                a.v0((Parcel)parcel, (int)n3);
                continue;
            }
            string = a.K((Parcel)parcel, (int)n3);
        }
        a.R((Parcel)parcel, (int)n2);
        return new vc(string);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new vc[n2];
    }
}

