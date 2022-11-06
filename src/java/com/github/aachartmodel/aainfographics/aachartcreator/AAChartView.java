/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.webkit.JavascriptInterface
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartModelKt
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$loadLocalFilesAndDrawChart
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$safeEvaluateJavaScriptString
 *  com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$showJavaScriptAlertView
 *  e.e.a.a.a
 *  e.p.e.f0.s
 *  e.p.e.j
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  k.d0.g
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aachartcreator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModelKt;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel;
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions;
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import e.e.a.a.a;
import e.p.e.f0.s;
import e.p.e.j;
import java.util.HashMap;
import java.util.Map;
import k.d0.g;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001`B\u0011\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u00a2\u0006\u0004\bY\u0010ZB\u001b\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010\\\u001a\u0004\u0018\u00010[\u00a2\u0006\u0004\bY\u0010]B#\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010\\\u001a\u0004\u0018\u00010[\u0012\u0006\u0010^\u001a\u00020,\u00a2\u0006\u0004\bY\u0010_J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\u0004J#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001e\u0010\bJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001f\u0010\bJ\u001b\u0010#\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u00a2\u0006\u0004\b#\u0010$J#\u0010#\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\b#\u0010'J\u001d\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020%\u00a2\u0006\u0004\b*\u0010+J)\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020%H\u0007\u00a2\u0006\u0004\b/\u00100J5\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020%2\u0006\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\b/\u00101J\u0015\u00102\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b4\u00103J\u0015\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020!\u00a2\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b8\u00103J\u0015\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u00020\r\u00a2\u0006\u0004\b:\u0010\u0015R.\u0010=\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR.\u0010C\u001a\u0004\u0018\u00010%2\b\u0010<\u001a\u0004\u0018\u00010%8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010P\u001a\u0004\u0018\u00010%2\b\u0010<\u001a\u0004\u0018\u00010%8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bP\u0010D\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010HR\u0018\u0010R\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010SR.\u0010T\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010B\u00a8\u0006a"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;", "Landroid/webkit/WebView;", "Lk/q;", "setupBasicContent", "()V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "aaOptions", "loadLocalFilesAndDrawChart", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;)V", "chartOptions", "configureChartOptionsAndDrawChart", "showJavaScriptAlertView", "", "", "", "messageBody", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", "getEventMessageModel", "(Ljava/util/Map;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", "javaScriptString", "safeEvaluateJavaScriptString", "(Ljava/lang/String;)V", "message", "androidMethod", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "chartModel", "aa_drawChartWithChartModel", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;)V", "aa_refreshChartWithChartModel", "aa_drawChartWithChartOptions", "aa_refreshChartWithChartOptions", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "seriesElementsArr", "aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)V", "", "animation", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;Z)V", "options", "redraw", "aa_updateChartWithOptions", "(Ljava/lang/Object;Z)V", "", "elementIndex", "shift", "aa_addPointToChartSeriesElement", "(ILjava/lang/Object;Z)V", "(ILjava/lang/Object;ZZZ)V", "aa_showTheSeriesElementContent", "(I)V", "aa_hideTheSeriesElementContent", "aaSeriesElement", "aa_addElementToChartSeries", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)V", "aa_removeElementFromChartSeries", "jsFunctionStr", "aa_evaluateTheJavaScriptStringFunction", "", "value", "contentHeight", "Ljava/lang/Float;", "getContentHeight", "()Ljava/lang/Float;", "setContentHeight", "(Ljava/lang/Float;)V", "chartSeriesHidden", "Ljava/lang/Boolean;", "getChartSeriesHidden", "()Ljava/lang/Boolean;", "setChartSeriesHidden", "(Ljava/lang/Boolean;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "callBack", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "getCallBack", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "setCallBack", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;)V", "isClearBackgroundColor", "setClearBackgroundColor", "optionsJson", "Ljava/lang/String;", "contentWidth", "getContentWidth", "setContentWidth", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AAChartViewCallBack", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAChartView
extends WebView {
    private HashMap _$_findViewCache;
    private AAChartViewCallBack callBack;
    private Boolean chartSeriesHidden;
    private Float contentHeight;
    private Float contentWidth;
    private Boolean isClearBackgroundColor;
    private String optionsJson;

    public AAChartView(Context context) {
        i.e((Object)context, (String)"context");
        super(context);
        this.setupBasicContent();
    }

    public AAChartView(Context context, AttributeSet attributeSet) {
        i.e((Object)context, (String)"context");
        super(context, attributeSet);
        this.setupBasicContent();
    }

    public AAChartView(Context context, AttributeSet attributeSet, int n) {
        i.e((Object)context, (String)"context");
        super(context, attributeSet, n);
        this.setupBasicContent();
    }

    public static /* synthetic */ void aa_addPointToChartSeriesElement$default(AAChartView aAChartView, int n, Object object, boolean bl, int n2, Object object2) {
        if ((n2 & 4) != 0) {
            bl = true;
        }
        aAChartView.aa_addPointToChartSeriesElement(n, object, bl);
    }

    public static final /* synthetic */ void access$configureChartOptionsAndDrawChart(AAChartView aAChartView, AAOptions aAOptions) {
        aAChartView.configureChartOptionsAndDrawChart(aAOptions);
    }

    private final void configureChartOptionsAndDrawChart(AAOptions aAOptions) {
        String string2;
        Boolean bl = this.isClearBackgroundColor;
        i.c((Object)bl);
        if (bl.booleanValue()) {
            AAChart aAChart = aAOptions.getChart();
            i.c((Object)aAChart);
            aAChart.backgroundColor("rgba(0,0,0,0)");
        }
        this.optionsJson = string2 = new j().i((Object)aAOptions);
        StringBuilder stringBuilder = a.y((String)"loadTheHighChartView('", (String)string2, (String)"','");
        stringBuilder.append((Object)this.contentWidth);
        stringBuilder.append("','");
        stringBuilder.append((Object)this.contentHeight);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    private final AAMoveOverEventMessageModel getEventMessageModel(Map<String, ? extends Object> map) {
        AAMoveOverEventMessageModel aAMoveOverEventMessageModel = new AAMoveOverEventMessageModel();
        aAMoveOverEventMessageModel.setName(String.valueOf((Object)map.get((Object)"name")));
        aAMoveOverEventMessageModel.setX((Double)map.get((Object)"x"));
        aAMoveOverEventMessageModel.setY((Double)map.get((Object)"y"));
        aAMoveOverEventMessageModel.setCategory(String.valueOf((Object)map.get((Object)"category")));
        aAMoveOverEventMessageModel.setOffset((s<String, Object>)((s)map.get((Object)"offset")));
        Double d2 = (Double)map.get((Object)"index");
        Integer n = d2 != null ? Integer.valueOf((int)((int)d2.doubleValue())) : null;
        aAMoveOverEventMessageModel.setIndex(n);
        return aAMoveOverEventMessageModel;
    }

    private final void loadLocalFilesAndDrawChart(AAOptions aAOptions) {
        this.loadUrl("file:///android_asset/AAChartView.html");
        this.setWebViewClient(new WebViewClient(this, aAOptions){
            public final /* synthetic */ AAOptions $aaOptions;
            public final /* synthetic */ AAChartView this$0;
            {
                this.this$0 = aAChartView;
                this.$aaOptions = aAOptions;
            }

            public void onPageFinished(WebView webView, String string2) {
                i.e((Object)webView, (String)"view");
                i.e((Object)string2, (String)"url");
                AAChartView.access$configureChartOptionsAndDrawChart(this.this$0, this.$aaOptions);
                AAChartViewCallBack aAChartViewCallBack = this.this$0.getCallBack();
                if (aAChartViewCallBack != null) {
                    aAChartViewCallBack.chartViewDidFinishLoad(this.this$0);
                }
            }
        });
    }

    private final void safeEvaluateJavaScriptString(String string2) {
        this.evaluateJavascript(a.l((String)"javascript:", (String)string2), (ValueCallback)safeEvaluateJavaScriptString.1.INSTANCE);
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private final void setupBasicContent() {
        this.setContentWidth(Float.valueOf((float)420.0f));
        this.setContentHeight(Float.valueOf((float)580.0f));
        this.setClearBackgroundColor(Boolean.FALSE);
        WebSettings webSettings = this.getSettings();
        i.d((Object)webSettings, (String)"settings");
        webSettings.setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled((boolean)true);
        this.addJavascriptInterface((Object)this, "androidObject");
    }

    private final void showJavaScriptAlertView() {
        this.setWebChromeClient(new WebChromeClient(this){
            public final /* synthetic */ AAChartView this$0;
            {
                this.this$0 = aAChartView;
            }

            public boolean onJsAlert(WebView webView, String string2, String string3, android.webkit.JsResult jsResult) {
                i.e((Object)webView, (String)"view");
                i.e((Object)string2, (String)"url");
                i.e((Object)string3, (String)"message");
                i.e((Object)jsResult, (String)"result");
                super.onJsAlert(webView, string2, string3, jsResult);
                String string4 = a.m((String)"url --->", (String)string2, (String)"\n\n\n");
                String string5 = a.m((String)"message --->", (String)string3, (String)"\n\n\n");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("result --->");
                stringBuilder.append((Object)jsResult);
                String string6 = a.m((String)string4, (String)string5, (String)stringBuilder.toString());
                new android.app.AlertDialog$Builder(this.this$0.getContext()).setTitle((java.lang.CharSequence)"JavaScript alert Information").setMessage((java.lang.CharSequence)string6).setNeutralButton((java.lang.CharSequence)"sure", null).show();
                return true;
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int n) {
        View view;
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        if ((view = (View)this._$_findViewCache.get((Object)n)) == null) {
            view = this.findViewById(n);
            this._$_findViewCache.put((Object)n, (Object)view);
        }
        return view;
    }

    public final void aa_addElementToChartSeries(AASeriesElement aASeriesElement) {
        i.e((Object)aASeriesElement, (String)"aaSeriesElement");
        this.safeEvaluateJavaScriptString(a.m((String)"addElementToChartSeriesWithElement('", (String)new j().i((Object)aASeriesElement), (String)"')"));
    }

    public final void aa_addPointToChartSeriesElement(int n, Object object) {
        AAChartView.aa_addPointToChartSeriesElement$default(this, n, object, false, 4, null);
    }

    public final void aa_addPointToChartSeriesElement(int n, Object object, boolean bl) {
        i.e((Object)object, (String)"options");
        this.aa_addPointToChartSeriesElement(n, object, true, bl, true);
    }

    public final void aa_addPointToChartSeriesElement(int n, Object object, boolean bl, boolean bl2, boolean bl3) {
        String string2;
        i.e((Object)object, (String)"options");
        if (!(object instanceof Integer || object instanceof Float || object instanceof Double)) {
            string2 = new j().i(object);
            i.d((Object)string2, (String)"Gson().toJson(options)");
        } else {
            string2 = object.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("addPointToChartSeries('");
        stringBuilder.append(n);
        stringBuilder.append("','");
        stringBuilder.append(string2);
        stringBuilder.append("','");
        stringBuilder.append(bl);
        stringBuilder.append("','");
        stringBuilder.append(bl2);
        stringBuilder.append("','");
        stringBuilder.append(bl3);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    public final void aa_drawChartWithChartModel(AAChartModel aAChartModel) {
        i.e((Object)aAChartModel, (String)"chartModel");
        this.aa_drawChartWithChartOptions(AAChartModelKt.aa_toAAOptions((AAChartModel)aAChartModel));
    }

    public final void aa_drawChartWithChartOptions(AAOptions aAOptions) {
        i.e((Object)aAOptions, (String)"chartOptions");
        if (this.optionsJson != null) {
            this.aa_refreshChartWithChartOptions(aAOptions);
            return;
        }
        this.loadLocalFilesAndDrawChart(aAOptions);
        this.showJavaScriptAlertView();
    }

    public final void aa_evaluateTheJavaScriptStringFunction(String string2) {
        i.e((Object)string2, (String)"jsFunctionStr");
        this.safeEvaluateJavaScriptString(a.m((String)"evaluateTheJavaScriptStringFunction('", (String)AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString(string2), (String)"')"));
    }

    public final void aa_hideTheSeriesElementContent(int n) {
        this.safeEvaluateJavaScriptString(a.g((String)"hideTheSeriesElementContentWithIndex('", (int)n, (String)"')"));
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] arraASeriesElement) {
        i.e((Object)arraASeriesElement, (String)"seriesElementsArr");
        this.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(arraASeriesElement, true);
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] arraASeriesElement, boolean bl) {
        i.e((Object)arraASeriesElement, (String)"seriesElementsArr");
        String string2 = new j().i((Object)arraASeriesElement);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onlyRefreshTheChartDataWithSeries('");
        stringBuilder.append(string2);
        stringBuilder.append("','");
        stringBuilder.append(bl);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    public final void aa_refreshChartWithChartModel(AAChartModel aAChartModel) {
        i.e((Object)aAChartModel, (String)"chartModel");
        this.aa_refreshChartWithChartOptions(AAChartModelKt.aa_toAAOptions((AAChartModel)aAChartModel));
    }

    public final void aa_refreshChartWithChartOptions(AAOptions aAOptions) {
        i.e((Object)aAOptions, (String)"chartOptions");
        this.configureChartOptionsAndDrawChart(aAOptions);
    }

    public final void aa_removeElementFromChartSeries(int n) {
        this.safeEvaluateJavaScriptString(a.g((String)"removeElementFromChartSeriesWithElementIndex('", (int)n, (String)"')"));
    }

    public final void aa_showTheSeriesElementContent(int n) {
        this.safeEvaluateJavaScriptString(a.g((String)"showTheSeriesElementContentWithIndex('", (int)n, (String)"')"));
    }

    public final void aa_updateChartWithOptions(Object object, boolean bl) {
        i.e((Object)object, (String)"options");
        String string2 = object.getClass().getSimpleName();
        i.d((Object)string2, (String)"classNameStr");
        String string3 = g.w((String)string2, (String)"AA", (String)"", (boolean)false, (int)4);
        String string4 = string3.substring(0, 1);
        i.d((Object)string4, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        String string5 = string4.toLowerCase();
        i.d((Object)string5, (String)"(this as java.lang.String).toLowerCase()");
        String string6 = string3.substring(1);
        i.d((Object)string6, (String)"(this as java.lang.String).substring(startIndex)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        String string7 = stringBuilder.toString();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)string7, object);
        String string8 = new j().i((Object)hashMap);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("updateChart('");
        stringBuilder2.append(string8);
        stringBuilder2.append("','");
        stringBuilder2.append(bl);
        stringBuilder2.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder2.toString());
    }

    @JavascriptInterface
    public final String androidMethod(String string2) {
        HashMap hashMap = new HashMap();
        Object object = new j().c(string2, hashMap.getClass());
        i.d((Object)object, (String)"Gson().fromJson(message, messageBody.javaClass)");
        AAMoveOverEventMessageModel aAMoveOverEventMessageModel = this.getEventMessageModel((Map<String, ? extends Object>)((HashMap)object));
        AAChartViewCallBack aAChartViewCallBack = this.callBack;
        if (aAChartViewCallBack != null) {
            aAChartViewCallBack.chartViewMoveOverEventMessage(this, aAMoveOverEventMessageModel);
        }
        return "";
    }

    public final AAChartViewCallBack getCallBack() {
        return this.callBack;
    }

    public final Boolean getChartSeriesHidden() {
        return this.chartSeriesHidden;
    }

    public final Float getContentHeight() {
        return this.contentHeight;
    }

    public final Float getContentWidth() {
        return this.contentWidth;
    }

    public final Boolean isClearBackgroundColor() {
        return this.isClearBackgroundColor;
    }

    public final void setCallBack(AAChartViewCallBack aAChartViewCallBack) {
        this.callBack = aAChartViewCallBack;
    }

    public final void setChartSeriesHidden(Boolean bl) {
        this.chartSeriesHidden = bl;
        StringBuilder stringBuilder = a.t((String)"setChartSeriesHidden('");
        stringBuilder.append((Object)this.chartSeriesHidden);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    public final void setClearBackgroundColor(Boolean bl) {
        this.isClearBackgroundColor = bl;
        if (i.a((Object)bl, (Object)Boolean.TRUE)) {
            this.setBackgroundColor(0);
            Drawable drawable2 = this.getBackground();
            if (drawable2 != null) {
                drawable2.setAlpha(0);
                return;
            }
        } else {
            this.setBackgroundColor(1);
            Drawable drawable3 = this.getBackground();
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
        }
    }

    public final void setContentHeight(Float f) {
        this.contentHeight = f;
        StringBuilder stringBuilder = a.t((String)"setTheChartViewContentHeight('");
        stringBuilder.append((Object)this.contentHeight);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    public final void setContentWidth(Float f) {
        this.contentWidth = f;
        StringBuilder stringBuilder = a.t((String)"setTheChartViewContentWidth('");
        stringBuilder.append((Object)this.contentWidth);
        stringBuilder.append("')");
        this.safeEvaluateJavaScriptString(stringBuilder.toString());
    }

    @Metadata(bv={1, 0, 3}, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;", "aaChartView", "Lk/q;", "chartViewDidFinishLoad", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", "messageModel", "chartViewMoveOverEventMessage", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;)V", "charts_release"}, k=1, mv={1, 4, 0})
    public static interface AAChartViewCallBack {
        public void chartViewDidFinishLoad(AAChartView var1);

        public void chartViewMoveOverEventMessage(AAChartView var1, AAMoveOverEventMessageModel var2);
    }

}

