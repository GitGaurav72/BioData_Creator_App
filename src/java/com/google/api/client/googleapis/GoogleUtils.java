/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.security.KeyStore
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.google.api.client.googleapis;

import androidx.annotation.Keep;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Keep
public final class GoogleUtils {
    public static final Integer BUGFIX_VERSION;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final String VERSION;
    public static final Pattern VERSION_PATTERN;
    public static KeyStore certTrustStore;

    public static {
        Pattern pattern;
        String string2;
        VERSION = string2 = GoogleUtils.getVersion();
        VERSION_PATTERN = pattern = Pattern.compile((String)"(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        Matcher matcher = pattern.matcher((CharSequence)string2);
        matcher.find();
        MAJOR_VERSION = Integer.parseInt((String)matcher.group(1));
        MINOR_VERSION = Integer.parseInt((String)matcher.group(2));
        BUGFIX_VERSION = Integer.parseInt((String)matcher.group(3));
    }

    private GoogleUtils() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static KeyStore getCertificateTrustStore() {
        Class<GoogleUtils> class_ = GoogleUtils.class;
        synchronized (GoogleUtils.class) {
            if (certTrustStore != null) return certTrustStore;
            certTrustStore = KeyStore.getInstance((String)"JKS");
            InputStream inputStream = GoogleUtils.class.getResourceAsStream("google.jks");
            KeyStore keyStore = certTrustStore;
            try {
                keyStore.load(inputStream, "notasecret".toCharArray());
                return certTrustStore;
            }
            finally {
                inputStream.close();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private static String getVersion() {
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
}

