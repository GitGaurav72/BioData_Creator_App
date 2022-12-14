/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.DecodeHintType
 *  com.google.zxing.MultiFormatReader
 *  com.google.zxing.Reader
 *  com.journeyapps.barcodescanner.DecoderFactory
 *  com.journeyapps.barcodescanner.InvertedDecoder
 *  com.journeyapps.barcodescanner.MixedDecoder
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.EnumMap
 *  java.util.Map
 */
package com.journeyapps.barcodescanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.journeyapps.barcodescanner.Decoder;
import com.journeyapps.barcodescanner.DecoderFactory;
import com.journeyapps.barcodescanner.InvertedDecoder;
import com.journeyapps.barcodescanner.MixedDecoder;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

public class DefaultDecoderFactory
implements DecoderFactory {
    private String characterSet;
    private Collection<BarcodeFormat> decodeFormats;
    private Map<DecodeHintType, ?> hints;
    private int scanType;

    public DefaultDecoderFactory() {
    }

    public DefaultDecoderFactory(Collection<BarcodeFormat> collection) {
        this.decodeFormats = collection;
    }

    public DefaultDecoderFactory(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String string, int n) {
        this.decodeFormats = collection;
        this.hints = map;
        this.characterSet = string;
        this.scanType = n;
    }

    public Decoder createDecoder(Map<DecodeHintType, ?> map) {
        Collection<BarcodeFormat> collection;
        String string;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.hints;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        if ((collection = this.decodeFormats) != null) {
            enumMap.put((Object)DecodeHintType.POSSIBLE_FORMATS, collection);
        }
        if ((string = this.characterSet) != null) {
            enumMap.put((Object)DecodeHintType.CHARACTER_SET, (Object)string);
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints((Map)enumMap);
        int n = this.scanType;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return new Decoder((Reader)multiFormatReader);
                }
                return new MixedDecoder((Reader)multiFormatReader);
            }
            return new InvertedDecoder((Reader)multiFormatReader);
        }
        return new Decoder((Reader)multiFormatReader);
    }
}

