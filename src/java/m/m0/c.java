/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.PrintStream
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SafeVarargs
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Objects
 *  java.util.TimeZone
 *  java.util.concurrent.TimeUnit
 *  k.d0.g
 *  k.s.i
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  m.i0
 *  m.y
 *  m.y$b
 *  m.z
 *  n.e
 *  n.g
 *  n.h
 *  n.h$a
 *  n.p
 *  n.p$a
 *  n.z
 */
package m.m0;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k.d0.a;
import k.d0.d;
import k.s.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.b0;
import m.c0;
import m.g0;
import m.h0;
import m.i0;
import m.j0;
import m.y;
import m.z;
import n.e;
import n.g;
import n.h;
import n.p;

public final class c {
    public static final byte[] a;
    public static final y b;
    public static final j0 c;
    public static final g0 d;
    public static final p e;
    public static final TimeZone f;
    public static final d g;
    public static final String h;

    public static {
        byte[] arrby = new byte[]{};
        a = arrby;
        b = y.k.c(new String[0]);
        k.x.c.i.e(arrby, "$this$toResponseBody");
        e e2 = new e();
        e2.S(arrby);
        long l2 = 0;
        k.x.c.i.e((Object)e2, "$this$asResponseBody");
        c = new i0((g)e2, null, l2);
        d = g0.a.b(g0.a, arrby, null, 0, 0, 7);
        p.a a2 = p.k;
        h[] arrh = new h[5];
        h.a a3 = h.l;
        arrh[0] = a3.a("efbbbf");
        arrh[1] = a3.a("feff");
        arrh[2] = a3.a("fffe");
        arrh[3] = a3.a("0000ffff");
        arrh[4] = a3.a("ffff0000");
        e = a2.c(arrh);
        TimeZone timeZone = TimeZone.getTimeZone((String)"GMT");
        k.x.c.i.c((Object)timeZone);
        f = timeZone;
        g = new d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String string = c0.class.getName();
        k.x.c.i.d(string, "OkHttpClient::class.java.name");
        String string2 = k.d0.g.t((String)string, (CharSequence)"okhttp3.");
        k.x.c.i.e(string2, "<this>");
        k.x.c.i.e("Client", "suffix");
        k.x.c.i.e(string2, "<this>");
        k.x.c.i.e("Client", "suffix");
        if (k.d0.g.e((String)string2, (String)"Client", (boolean)false, (int)2)) {
            string2 = string2.substring(0, string2.length() - "Client".length());
            k.x.c.i.d(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        h = string2;
    }

    /*
     * Exception decompiling
     */
    public static final int A(String var0, int var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl22.1 : ILOAD_1 : trying to set 0 previously set to 1
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

    public static final String B(String string, int n2, int n3) {
        k.x.c.i.e(string, "$this$trimSubstring");
        int n4 = c.n(string, n2, n3);
        String string2 = string.substring(n4, c.o(string, n4, n3));
        k.x.c.i.d(string2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return string2;
    }

    public static final Throwable C(Exception exception, List<? extends Exception> list) {
        k.x.c.i.e((Object)exception, "$this$withSuppressed");
        k.x.c.i.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            e.s.a.a.o((Throwable)exception, (Throwable)((Exception)iterator.next()));
        }
        return exception;
    }

    public static final boolean a(z z2, z z3) {
        k.x.c.i.e((Object)z2, "$this$canReuseConnectionFor");
        k.x.c.i.e((Object)z3, "other");
        return k.x.c.i.a(z2.g, z3.g) && z2.h == z3.h && k.x.c.i.a(z2.d, z3.d);
    }

    public static final int b(String string, long l2, TimeUnit timeUnit) {
        k.x.c.i.e(string, "name");
        long l3 = l2 LCMP 0L;
        boolean bl = true;
        boolean bl2 = l3 >= 0 ? bl : false;
        if (bl2) {
            if (bl) {
                long l4 = timeUnit.toMillis(l2);
                boolean bl3 = l4 <= (long)Integer.MAX_VALUE ? bl : false;
                if (bl3) {
                    if (l4 == 0L && l3 > 0) {
                        bl = false;
                    }
                    if (bl) {
                        return (int)l4;
                    }
                    throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)" too small.").toString());
                }
                throw new IllegalArgumentException(e.e.a.a.a.l((String)string, (String)" too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(e.e.a.a.a.l((String)string, (String)" < 0").toString());
    }

    public static final void c(long l2, long l3, long l4) {
        if ((l3 | l4) >= 0L && l3 <= l2 && l2 - l3 >= l4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void d(Closeable closeable) {
        k.x.c.i.e((Object)closeable, "$this$closeQuietly");
        try {
            closeable.close();
            return;
        }
        catch (Exception exception) {}
        return;
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void e(Socket socket) {
        k.x.c.i.e((Object)socket, "$this$closeQuietly");
        try {
            socket.close();
            return;
        }
        catch (Exception exception) {}
        return;
        catch (RuntimeException runtimeException) {
            if (!k.x.c.i.a(runtimeException.getMessage(), "bio == null")) throw runtimeException;
            return;
        }
        catch (AssertionError assertionError) {
            throw assertionError;
        }
    }

    public static final int f(String string, char c2, int n2, int n3) {
        k.x.c.i.e(string, "$this$delimiterOffset");
        while (n2 < n3) {
            if (string.charAt(n2) == c2) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final int g(String string, String string2, int n2, int n3) {
        k.x.c.i.e(string, "$this$delimiterOffset");
        k.x.c.i.e(string2, "delimiters");
        while (n2 < n3) {
            if (k.d0.g.b((CharSequence)string2, (char)string.charAt(n2), (boolean)false, (int)2)) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final boolean h(n.z z2, int n2, TimeUnit timeUnit) {
        k.x.c.i.e((Object)z2, "$this$discard");
        k.x.c.i.e((Object)timeUnit, "timeUnit");
        try {
            boolean bl = c.w(z2, n2, timeUnit);
            return bl;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static final /* varargs */ String i(String string, Object ... arrobject) {
        k.x.c.i.e(string, "format");
        k.x.c.i.e(arrobject, "args");
        Locale locale = Locale.US;
        Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
        String string2 = String.format((Locale)locale, (String)string, (Object[])Arrays.copyOf((Object[])arrobject2, (int)arrobject2.length));
        k.x.c.i.d(string2, "java.lang.String.format(locale, format, *args)");
        return string2;
    }

    public static final boolean j(String[] arrstring, String[] arrstring2, Comparator<? super String> comparator) {
        k.x.c.i.e(arrstring, "$this$hasIntersection");
        k.x.c.i.e(comparator, "comparator");
        boolean bl = arrstring.length == 0;
        if (!bl && arrstring2 != null) {
            boolean bl2 = arrstring2.length == 0;
            if (bl2) {
                return false;
            }
            for (String string : arrstring) {
                int n2 = arrstring2.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (comparator.compare((Object)string, (Object)arrstring2[i2]) != 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static final long k(h0 var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl19.1 : LDC2_W : trying to set 0 previously set to 1
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

    @SafeVarargs
    public static final /* varargs */ <T> List<T> l(T ... arrT) {
        k.x.c.i.e(arrT, "elements");
        Object[] arrobject = (Object[])arrT.clone();
        List list = Collections.unmodifiableList((List)i.E((Object[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length)));
        k.x.c.i.d((Object)list, "Collections.unmodifiable\u2026istOf(*elements.clone()))");
        return list;
    }

    public static final int m(String string) {
        k.x.c.i.e(string, "$this$indexOfControlOrNonAscii");
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (k.x.c.i.g(c2, 31) > 0) {
                if (k.x.c.i.g(c2, 127) < 0) continue;
                return i2;
            }
            return i2;
        }
        return -1;
    }

    public static final int n(String string, int n2, int n3) {
        k.x.c.i.e(string, "$this$indexOfFirstNonAsciiWhitespace");
        while (n2 < n3) {
            char c2 = string.charAt(n2);
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static final int o(String string, int n2, int n3) {
        k.x.c.i.e(string, "$this$indexOfLastNonAsciiWhitespace");
        int n4 = n3 - 1;
        if (n4 >= n2) {
            do {
                char c2;
                if ((c2 = string.charAt(n4)) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    return n4 + 1;
                }
                if (n4 == n2) break;
                --n4;
            } while (true);
        }
        return n2;
    }

    public static final String[] p(String[] arrstring, String[] arrstring2, Comparator<? super String> comparator) {
        k.x.c.i.e(arrstring, "$this$intersect");
        k.x.c.i.e(arrstring2, "other");
        k.x.c.i.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        block0 : for (String string : arrstring) {
            int n2 = arrstring2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (comparator.compare((Object)string, (Object)arrstring2[i2]) != 0) continue;
                arrayList.add((Object)string);
                continue block0;
            }
        }
        Object[] arrobject = arrayList.toArray((Object[])new String[0]);
        Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T>");
        return (String[])arrobject;
    }

    public static final boolean q(String string) {
        k.x.c.i.e(string, "name");
        boolean bl = true;
        if (!(k.d0.g.f((String)string, (String)"Authorization", (boolean)bl) || k.d0.g.f((String)string, (String)"Cookie", (boolean)bl) || k.d0.g.f((String)string, (String)"Proxy-Authorization", (boolean)bl))) {
            if (k.d0.g.f((String)string, (String)"Set-Cookie", (boolean)bl)) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final int r(char n2) {
        if (48 <= n2 && 57 >= n2) {
            return n2 - 48;
        }
        int n3 = 97;
        if (n3 <= n2 && 102 >= n2) {
            return 10 + (n2 - n3);
        }
        n3 = 65;
        if (n3 > n2) {
            return -1;
        }
        if (70 < n2) return -1;
        return 10 + (n2 - n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Charset s(g g2, Charset charset) {
        Charset charset2;
        String string;
        k.x.c.i.e((Object)g2, "$this$readBomAsCharset");
        k.x.c.i.e((Object)charset, "default");
        int n2 = g2.i0(e);
        if (n2 == -1) return charset;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Charset charset3;
                    if (n2 != 3) {
                        if (n2 != 4) throw new AssertionError();
                        charset3 = a.c;
                        if (charset3 != null) return charset3;
                        charset3 = Charset.forName((String)"UTF-32LE");
                        k.x.c.i.d((Object)charset3, "forName(\"UTF-32LE\")");
                        a.c = charset3;
                        return charset3;
                    } else {
                        charset3 = a.d;
                        if (charset3 != null) return charset3;
                        charset3 = Charset.forName((String)"UTF-32BE");
                        k.x.c.i.d((Object)charset3, "forName(\"UTF-32BE\")");
                        a.d = charset3;
                    }
                    return charset3;
                }
                charset2 = StandardCharsets.UTF_16LE;
                string = "UTF_16LE";
            } else {
                charset2 = StandardCharsets.UTF_16BE;
                string = "UTF_16BE";
            }
        } else {
            charset2 = StandardCharsets.UTF_8;
            string = "UTF_8";
        }
        String string2 = string;
        charset = charset2;
        k.x.c.i.d((Object)charset, string2);
        return charset;
    }

    /*
     * Exception decompiling
     */
    public static final <T> T t(Object var0, Class<T> var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl13 : ICONST_1 : trying to set 1 previously set to 0
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

    public static final int u(g g2) {
        k.x.c.i.e((Object)g2, "$this$readMedium");
        return (255 & g2.readByte()) << 16 | (255 & g2.readByte()) << 8 | 255 & g2.readByte();
    }

    public static final int v(e e2, byte by) {
        k.x.c.i.e((Object)e2, "$this$skipAll");
        int n2 = 0;
        while (!e2.m() && e2.o(0L) == by) {
            ++n2;
            e2.readByte();
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    public static final boolean w(n.z var0, int var1, TimeUnit var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl87 : ALOAD_0 : trying to set 1 previously set to 0
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

    public static final y x(List<m.m0.j.c> list) {
        k.x.c.i.e(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (m.m0.j.c c2 : list) {
            h h2 = c2.h;
            h h3 = c2.i;
            String string = h2.w();
            String string2 = h3.w();
            k.x.c.i.e(string, "name");
            k.x.c.i.e(string2, "value");
            arrayList.add((Object)string);
            arrayList.add((Object)k.d0.g.O((CharSequence)string2).toString());
        }
        Object[] arrobject = arrayList.toArray((Object[])new String[0]);
        Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T>");
        return new y((String[])arrobject, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final String y(z var0, boolean var1_1) {
        block2 : {
            block4 : {
                block3 : {
                    k.x.c.i.e((Object)var0, "$this$toHostHeader");
                    var2_2 = k.d0.g.c((CharSequence)var0.g, (CharSequence)":", (boolean)false, (int)2) != false ? e.e.a.a.a.p((StringBuilder)e.e.a.a.a.s((char)'['), (String)var0.g, (char)']') : var0.g;
                    if (var1_1) break block2;
                    var7_3 = var0.h;
                    var8_4 = var0.d;
                    k.x.c.i.e(var8_4, "scheme");
                    var9_5 = var8_4.hashCode();
                    if (var9_5 == 3213448) break block3;
                    if (var9_5 != 99617003 || !var8_4.equals((Object)"https")) ** GOTO lbl-1000
                    var10_6 = 443;
                    break block4;
                }
                if (var8_4.equals((Object)"http")) {
                    var10_6 = 80;
                } else lbl-1000: // 2 sources:
                {
                    var10_6 = -1;
                }
            }
            if (var7_3 == var10_6) return var2_2;
        }
        var3_7 = new StringBuilder();
        var3_7.append(var2_2);
        var3_7.append(':');
        var3_7.append(var0.h);
        return var3_7.toString();
    }

    public static final <T> List<T> z(List<? extends T> list) {
        k.x.c.i.e(list, "$this$toImmutableList");
        List list2 = Collections.unmodifiableList((List)i.g0(list));
        k.x.c.i.d((Object)list2, "Collections.unmodifiableList(toMutableList())");
        return list2;
    }
}

