/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aatools;

import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;", "", "<init>", "(Ljava/lang/String;I)V", "ToTop", "ToBottom", "ToLeft", "ToRight", "ToTopLeft", "ToTopRight", "ToBottomLeft", "ToBottomRight", "charts_release"}, k=1, mv={1, 4, 0})
public final class AALinearGradientDirection
extends Enum<AALinearGradientDirection> {
    private static final /* synthetic */ AALinearGradientDirection[] $VALUES;
    public static final /* enum */ AALinearGradientDirection ToBottom;
    public static final /* enum */ AALinearGradientDirection ToBottomLeft;
    public static final /* enum */ AALinearGradientDirection ToBottomRight;
    public static final /* enum */ AALinearGradientDirection ToLeft;
    public static final /* enum */ AALinearGradientDirection ToRight;
    public static final /* enum */ AALinearGradientDirection ToTop;
    public static final /* enum */ AALinearGradientDirection ToTopLeft;
    public static final /* enum */ AALinearGradientDirection ToTopRight;

    public static {
        AALinearGradientDirection aALinearGradientDirection;
        AALinearGradientDirection aALinearGradientDirection2;
        AALinearGradientDirection aALinearGradientDirection3;
        AALinearGradientDirection aALinearGradientDirection4;
        AALinearGradientDirection aALinearGradientDirection5;
        AALinearGradientDirection aALinearGradientDirection6;
        AALinearGradientDirection aALinearGradientDirection7;
        AALinearGradientDirection aALinearGradientDirection8;
        AALinearGradientDirection[] arraALinearGradientDirection = new AALinearGradientDirection[8];
        ToTop = aALinearGradientDirection4 = new AALinearGradientDirection();
        arraALinearGradientDirection[0] = aALinearGradientDirection4;
        ToBottom = aALinearGradientDirection2 = new AALinearGradientDirection();
        arraALinearGradientDirection[1] = aALinearGradientDirection2;
        ToLeft = aALinearGradientDirection = new AALinearGradientDirection();
        arraALinearGradientDirection[2] = aALinearGradientDirection;
        ToRight = aALinearGradientDirection7 = new AALinearGradientDirection();
        arraALinearGradientDirection[3] = aALinearGradientDirection7;
        ToTopLeft = aALinearGradientDirection5 = new AALinearGradientDirection();
        arraALinearGradientDirection[4] = aALinearGradientDirection5;
        ToTopRight = aALinearGradientDirection8 = new AALinearGradientDirection();
        arraALinearGradientDirection[5] = aALinearGradientDirection8;
        ToBottomLeft = aALinearGradientDirection3 = new AALinearGradientDirection();
        arraALinearGradientDirection[6] = aALinearGradientDirection3;
        ToBottomRight = aALinearGradientDirection6 = new AALinearGradientDirection();
        arraALinearGradientDirection[7] = aALinearGradientDirection6;
        $VALUES = arraALinearGradientDirection;
    }

    public static AALinearGradientDirection valueOf(String string2) {
        return (AALinearGradientDirection)Enum.valueOf(AALinearGradientDirection.class, (String)string2);
    }

    public static AALinearGradientDirection[] values() {
        return (AALinearGradientDirection[])$VALUES.clone();
    }
}

