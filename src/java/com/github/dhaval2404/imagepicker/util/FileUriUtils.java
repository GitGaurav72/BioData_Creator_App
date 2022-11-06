/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentUris
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Audio
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video
 *  android.provider.MediaStore$Video$Media
 *  e.e.a.a.a
 *  e.s.a.a
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  k.d0.g
 *  k.n
 *  k.s.i
 *  k.s.r
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import e.s.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.d0.g;
import k.n;
import k.s.r;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ=\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\bJ\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u0018\u0010\u001c\u00a8\u0006\u001f"}, d2={"Lcom/github/dhaval2404/imagepicker/util/FileUriUtils;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "getPathFromLocalUri", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "selection", "", "selectionArgs", "getDataColumn", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getFilePath", "getPathFromRemoteUri", "", "isExternalStorageDocument", "(Landroid/net/Uri;)Z", "isDownloadsDocument", "isMediaDocument", "isGooglePhotosUri", "getRealPath", "uriImage", "getImageExtension", "(Landroid/net/Uri;)Ljava/lang/String;", "Ljava/io/File;", "file", "(Ljava/io/File;)Ljava/lang/String;", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class FileUriUtils {
    public static final FileUriUtils INSTANCE = new FileUriUtils();

    private FileUriUtils() {
    }

    /*
     * Exception decompiling
     */
    private final String getDataColumn(Context var1, Uri var2, String var3, String[] var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl68 : ALOAD : trying to set 1 previously set to 0
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

    /*
     * Exception decompiling
     */
    private final String getFilePath(Context var1_1, Uri var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    /*
     * Enabled aggressive block sorting
     */
    private final String getPathFromLocalUri(Context context, Uri uri) {
        Uri uri2;
        List list;
        r r2;
        block32 : {
            Matcher matcher;
            String string2;
            block31 : {
                List list2;
                String string3;
                String string4;
                StringBuilder stringBuilder;
                r r3;
                block29 : {
                    Matcher matcher2;
                    block28 : {
                        block30 : {
                            block26 : {
                                block27 : {
                                    if (!DocumentsContract.isDocumentUri((Context)context, (Uri)uri)) break block26;
                                    if (!this.isExternalStorageDocument(uri)) break block27;
                                    string4 = DocumentsContract.getDocumentId((Uri)uri);
                                    i.b((Object)string4, (String)"docId");
                                    i.e((Object)":", (String)"pattern");
                                    Pattern pattern = Pattern.compile((String)":");
                                    i.d((Object)pattern, (String)"compile(pattern)");
                                    i.e((Object)pattern, (String)"nativePattern");
                                    i.e((Object)string4, (String)"input");
                                    g.x((int)0);
                                    matcher2 = pattern.matcher((CharSequence)string4);
                                    if (matcher2.find()) break block28;
                                    list2 = a.N2((Object)string4.toString());
                                    break block29;
                                }
                                if (this.isDownloadsDocument(uri)) {
                                    String string5 = this.getFilePath(context, uri);
                                    if (string5 != null) {
                                        StringBuilder stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(Environment.getExternalStorageDirectory().toString());
                                        stringBuilder2.append("/Download/");
                                        stringBuilder2.append(string5);
                                        return stringBuilder2.toString();
                                    }
                                    String string6 = DocumentsContract.getDocumentId((Uri)uri);
                                    Uri uri3 = Uri.parse((String)"content://downloads/public_downloads");
                                    Long l2 = Long.valueOf((String)string6);
                                    i.b((Object)l2, (String)"java.lang.Long.valueOf(id)");
                                    return this.getDataColumn(context, ContentUris.withAppendedId((Uri)uri3, (long)l2), null, null);
                                }
                                if (!this.isMediaDocument(uri)) break block30;
                                string2 = DocumentsContract.getDocumentId((Uri)uri);
                                i.b((Object)string2, (String)"docId");
                                i.e((Object)":", (String)"pattern");
                                Pattern pattern = Pattern.compile((String)":");
                                i.d((Object)pattern, (String)"compile(pattern)");
                                i.e((Object)pattern, (String)"nativePattern");
                                i.e((Object)string2, (String)"input");
                                g.x((int)0);
                                matcher = pattern.matcher((CharSequence)string2);
                                if (matcher.find()) break block31;
                                list = a.N2((Object)string2.toString());
                                break block32;
                            }
                            String string7 = uri.getScheme();
                            if (string7 == null) {
                                i.l();
                                throw null;
                            }
                            if (g.f((String)"content", (String)string7, (boolean)true)) {
                                if (this.isGooglePhotosUri(uri)) {
                                    return uri.getLastPathSegment();
                                }
                                return this.getDataColumn(context, uri, null, null);
                            }
                            String string8 = uri.getScheme();
                            if (string8 == null) {
                                i.l();
                                throw null;
                            }
                            if (g.f((String)"file", (String)string8, (boolean)true)) {
                                return uri.getPath();
                            }
                        }
                        return null;
                    }
                    list2 = new ArrayList(10);
                    int n2 = 0 - 1;
                    int n3 = 0;
                    do {
                        list2.add((Object)string4.subSequence(n3, matcher2.start()).toString());
                        n3 = matcher2.end();
                    } while ((n2 < 0 || list2.size() != n2) && matcher2.find());
                    list2.add((Object)string4.subSequence(n3, string4.length()).toString());
                }
                if (!list2.isEmpty()) {
                    ListIterator listIterator = list2.listIterator(list2.size());
                    while (listIterator.hasPrevious()) {
                        boolean bl = ((String)listIterator.previous()).length() == 0;
                        if (bl) continue;
                        r3 = k.s.i.W((Iterable)list2, (int)(1 + listIterator.nextIndex()));
                        break;
                    }
                } else {
                    r3 = r.k;
                }
                Object[] arrobject = r3.toArray((Object[])new String[0]);
                if (arrobject == null) {
                    throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] arrstring = (String[])arrobject;
                if (g.f((String)"primary", (String)arrstring[0], (boolean)true)) {
                    if (arrstring.length <= 1) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(Environment.getExternalStorageDirectory().toString());
                        stringBuilder3.append("/");
                        return stringBuilder3.toString();
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(Environment.getExternalStorageDirectory().toString());
                    stringBuilder.append("/");
                    string3 = arrstring[1];
                } else {
                    StringBuilder stringBuilder4 = e.e.a.a.a.t((String)"storage/");
                    stringBuilder4.append(g.w((String)string4, (String)":", (String)"/", (boolean)false, (int)4));
                    String string9 = stringBuilder4.toString();
                    if (new File(string9).exists()) {
                        return string9;
                    }
                    stringBuilder = e.e.a.a.a.t((String)"/storage/sdcard/");
                    string3 = arrstring[1];
                }
                stringBuilder.append(string3);
                return stringBuilder.toString();
            }
            ArrayList arrayList = new ArrayList(10);
            int n4 = 0 - 1;
            int n5 = 0;
            do {
                arrayList.add((Object)string2.subSequence(n5, matcher.start()).toString());
                n5 = matcher.end();
            } while ((n4 < 0 || arrayList.size() != n4) && matcher.find());
            arrayList.add((Object)string2.subSequence(n5, string2.length()).toString());
            list = arrayList;
        }
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                boolean bl = ((String)listIterator.previous()).length() == 0;
                if (bl) continue;
                r2 = k.s.i.W((Iterable)list, (int)(1 + listIterator.nextIndex()));
                break;
            }
        } else {
            r2 = r.k;
        }
        Object[] arrobject = r2.toArray((Object[])new String[0]);
        if (arrobject == null) {
            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] arrstring = (String[])arrobject;
        String string10 = arrstring[0];
        if (i.a((Object)"image", (Object)string10)) {
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i.a((Object)"video", (Object)string10)) {
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            boolean bl = i.a((Object)"audio", (Object)string10);
            uri2 = null;
            if (bl) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
        }
        String[] arrstring2 = new String[]{arrstring[1]};
        return this.getDataColumn(context, uri2, "_id=?", arrstring2);
    }

    /*
     * Exception decompiling
     */
    private final String getPathFromRemoteUri(Context var1, Uri var2) {
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

    private final boolean isDownloadsDocument(Uri uri) {
        return i.a((Object)"com.android.providers.downloads.documents", (Object)uri.getAuthority());
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return i.a((Object)"com.android.externalstorage.documents", (Object)uri.getAuthority());
    }

    private final boolean isGooglePhotosUri(Uri uri) {
        return i.a((Object)"com.google.android.apps.photos.content", (Object)uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return i.a((Object)"com.android.providers.media.documents", (Object)uri.getAuthority());
    }

    /*
     * Exception decompiling
     */
    public final String getImageExtension(Uri var1) {
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

    public final String getImageExtension(File file) {
        i.f((Object)file, (String)"file");
        Uri uri = Uri.fromFile((File)file);
        i.b((Object)uri, (String)"Uri.fromFile(file)");
        return this.getImageExtension(uri);
    }

    public final String getRealPath(Context context, Uri uri) {
        i.f((Object)context, (String)"context");
        i.f((Object)uri, (String)"uri");
        String string2 = this.getPathFromLocalUri(context, uri);
        if (string2 == null) {
            string2 = this.getPathFromRemoteUri(context, uri);
        }
        return string2;
    }
}

