/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.constant;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "", "<init>", "(Ljava/lang/String;I)V", "GALLERY", "CAMERA", "BOTH", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class ImageProvider
extends Enum<ImageProvider> {
    private static final /* synthetic */ ImageProvider[] $VALUES;
    public static final /* enum */ ImageProvider BOTH;
    public static final /* enum */ ImageProvider CAMERA;
    public static final /* enum */ ImageProvider GALLERY;

    public static {
        ImageProvider imageProvider;
        ImageProvider imageProvider2;
        ImageProvider imageProvider3;
        ImageProvider[] arrimageProvider = new ImageProvider[3];
        GALLERY = imageProvider3 = new ImageProvider();
        arrimageProvider[0] = imageProvider3;
        CAMERA = imageProvider2 = new ImageProvider();
        arrimageProvider[1] = imageProvider2;
        BOTH = imageProvider = new ImageProvider();
        arrimageProvider[2] = imageProvider;
        $VALUES = arrimageProvider;
    }

    public static ImageProvider valueOf(String string2) {
        return (ImageProvider)Enum.valueOf(ImageProvider.class, (String)string2);
    }

    public static ImageProvider[] values() {
        return (ImageProvider[])$VALUES.clone();
    }
}

