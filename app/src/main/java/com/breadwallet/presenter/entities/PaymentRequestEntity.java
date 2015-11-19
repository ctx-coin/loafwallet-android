package com.breadwallet.presenter.entities;

/**
 * BreadWallet
 * <p/>
 * Created by Mihail on 11/12/15.
 * Copyright (c) 2015 Mihail Gutan <mihail@breadwallet.com>
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

public class PaymentRequestEntity {
    public final String TAG = PaymentRequestEntity.class.getName();

    //Protocol
    boolean isPaymentRequest;
    public byte[] signature;
    public byte[] pkiData;
    public String pkiType;

    //Protocol Details
    public String network;
    public long time;
    public long expires;
    public String memo;
    public String paymentURL;
    public byte[] merchantData;

    public PaymentRequestEntity() {
    }

    public void byteSignature(byte[] fromJNI) {
        this.signature = fromJNI;
    }

    public void pkiData(byte[] pkiData) {
        this.pkiData = pkiData;
    }

    public void merchantData(byte[] merchantData) {
        this.merchantData = merchantData;
    }

}