/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Locale
 *  java.util.Objects
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  k.d0.g
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package m;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.d0.g;
import k.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b0 {
    public static final Pattern a = Pattern.compile((String)"([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern b = Pattern.compile((String)";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public static final a c;
    public final String d;
    public final String[] e;

    public b0(String string, String string2, String string3, String[] arrstring, DefaultConstructorMarker defaultConstructorMarker) {
        this.d = string;
        this.e = arrstring;
    }

    /*
     * Exception decompiling
     */
    public final Charset a(Charset var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public boolean equals(Object object) {
        return object instanceof b0 && i.a(((b0)object).d, this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d;
    }

    public static final class a {
        public static final b0 a(String string) {
            i.e(string, "$this$toMediaType");
            Matcher matcher = b0.a.matcher((CharSequence)string);
            if (matcher.lookingAt()) {
                String string2 = matcher.group(1);
                i.d(string2, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                i.d((Object)locale, "Locale.US");
                String string3 = string2.toLowerCase(locale);
                i.d(string3, "(this as java.lang.String).toLowerCase(locale)");
                String string4 = matcher.group(2);
                i.d(string4, "typeSubtype.group(2)");
                i.d((Object)locale, "Locale.US");
                String string5 = string4.toLowerCase(locale);
                i.d(string5, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = b0.b.matcher((CharSequence)string);
                int n2 = matcher.end();
                while (n2 < string.length()) {
                    matcher2.region(n2, string.length());
                    if (matcher2.lookingAt()) {
                        String string6 = matcher2.group(1);
                        if (string6 != null) {
                            String string7 = matcher2.group(2);
                            if (string7 == null) {
                                string7 = matcher2.group(3);
                            } else if (g.E((String)string7, (String)"'", (boolean)false, (int)2) && g.e((String)string7, (String)"'", (boolean)false, (int)2) && string7.length() > 2) {
                                string7 = string7.substring(1, string7.length() - 1);
                                i.d(string7, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                            }
                            arrayList.add((Object)string6);
                            arrayList.add((Object)string7);
                        }
                        n2 = matcher2.end();
                        continue;
                    }
                    StringBuilder stringBuilder = e.e.a.a.a.t((String)"Parameter is not formatted correctly: \"");
                    String string8 = string.substring(n2);
                    i.d(string8, "(this as java.lang.String).substring(startIndex)");
                    stringBuilder.append(string8);
                    stringBuilder.append("\" for: \"");
                    stringBuilder.append(string);
                    stringBuilder.append('\"');
                    throw new IllegalArgumentException(stringBuilder.toString().toString());
                }
                Object[] arrobject = arrayList.toArray((Object[])new String[0]);
                Objects.requireNonNull((Object)arrobject, (String)"null cannot be cast to non-null type kotlin.Array<T>");
                b0 b02 = new b0(string, string3, string5, (String[])arrobject, null);
                return b02;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found for: \"");
            stringBuilder.append(string);
            stringBuilder.append('\"');
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public static final b0 b(String string) {
            i.e(string, "$this$toMediaTypeOrNull");
            try {
                b0 b02 = a.a(string);
                return b02;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
    }

}

