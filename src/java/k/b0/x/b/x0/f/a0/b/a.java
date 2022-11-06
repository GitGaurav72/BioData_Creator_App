/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.f.a0.b;

import k.x.c.i;

public class a {
    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl7 : LDC : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void a(int n2) {
        String string = n2 != 1 && n2 != 3 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 12 && n2 != 14 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 1 && n2 != 3 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 12 && n2 != 14 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        arrobject[0] = n2 != 1 && n2 != 3 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 12 && n2 != 14 ? "data" : "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        arrobject[1] = n2 != 1 ? (n2 != 3 ? (n2 != 6 ? (n2 != 8 ? (n2 != 10 ? (n2 != 12 ? (n2 != 14 ? "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding" : "decode7to8") : "combineStringArrayIntoBytes") : "dropMarker") : "decodeBytes") : "splitBytesToStringArray") : "encode8to7") : "encodeBytes";
        switch (n2) {
            default: {
                arrobject[2] = "encodeBytes";
                break;
            }
            case 13: {
                arrobject[2] = "decode7to8";
                break;
            }
            case 11: {
                arrobject[2] = "combineStringArrayIntoBytes";
                break;
            }
            case 9: {
                arrobject[2] = "dropMarker";
                break;
            }
            case 7: {
                arrobject[2] = "decodeBytes";
                break;
            }
            case 5: {
                arrobject[2] = "splitBytesToStringArray";
                break;
            }
            case 4: {
                arrobject[2] = "addModuloByte";
                break;
            }
            case 2: {
                arrobject[2] = "encode8to7";
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 1 && n2 != 3 && n2 != 6 && n2 != 8 && n2 != 10 && n2 != 12 && n2 != 14 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public static byte[] b(String[] arrstring) {
        if (arrstring != null) {
            if (arrstring.length > 0 && !arrstring[0].isEmpty()) {
                char c2 = arrstring[0].charAt(0);
                if (c2 == '\u0000') {
                    String[] arrstring2 = a.c(arrstring);
                    i.e(arrstring2, "strings");
                    int n2 = arrstring2.length;
                    int n3 = 0;
                    int n4 = 0;
                    while (n3 < n2) {
                        String string = arrstring2[n3];
                        ++n3;
                        n4 += string.length();
                    }
                    byte[] arrby = new byte[n4];
                    int n5 = arrstring2.length;
                    int n6 = 0;
                    int n7 = 0;
                    block1 : while (n6 < n5) {
                        String string = arrstring2[n6];
                        ++n6;
                        int n8 = -1 + string.length();
                        if (n8 < 0) continue;
                        int n9 = 0;
                        do {
                            int n10 = n9 + 1;
                            int n11 = n7 + 1;
                            arrby[n7] = (byte)string.charAt(n9);
                            if (n9 == n8) {
                                n7 = n11;
                                continue block1;
                            }
                            n9 = n10;
                            n7 = n11;
                        } while (true);
                    }
                    return arrby;
                }
                if (c2 == '\uffff') {
                    arrstring = a.c(arrstring);
                }
            }
            int n12 = arrstring.length;
            int n13 = 0;
            for (int i2 = 0; i2 < n12; ++i2) {
                n13 += arrstring[i2].length();
            }
            byte[] arrby = new byte[n13];
            int n14 = arrstring.length;
            int n15 = 0;
            for (int i3 = 0; i3 < n14; ++i3) {
                String string = arrstring[i3];
                int n16 = string.length();
                for (int i4 = 0; i4 < n16; ++i4) {
                    int n17 = n15 + 1;
                    arrby[n15] = (byte)string.charAt(i4);
                    n15 = n17;
                }
            }
            for (int i5 = 0; i5 < n13; ++i5) {
                arrby[i5] = (byte)(127 & 127 + arrby[i5]);
            }
            int n18 = n13 * 7 / 8;
            byte[] arrby2 = new byte[n18];
            int n19 = 0;
            int n20 = 0;
            for (int i6 = 0; i6 < n18; ++i6) {
                int n21 = (255 & arrby[n19]) >>> n20;
                byte by = arrby[++n19];
                int n22 = n20 + 1;
                arrby2[i6] = (byte)(n21 + ((by & (1 << n22) - 1) << 7 - n20));
                if (n20 == 6) {
                    ++n19;
                    n20 = 0;
                    continue;
                }
                n20 = n22;
            }
            return arrby2;
        }
        a.a(7);
        throw null;
    }

    public static String[] c(String[] arrstring) {
        String[] arrstring2 = (String[])arrstring.clone();
        arrstring2[0] = arrstring2[0].substring(1);
        return arrstring2;
    }
}

