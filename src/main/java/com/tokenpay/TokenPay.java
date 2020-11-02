package com.tokenpay;

import com.tokenpay.adapter.OnboardingAdapter;
import com.tokenpay.adapter.PaymentAdapter;

public class TokenPay {
    public static String baseUrl = "https://api.tokenpay.com.tr";
    public static String apiKey;
    public static String secretKey;

    private final PaymentAdapter payment;
    private final OnboardingAdapter onboarding;

    public TokenPay() {
        this.payment = new PaymentAdapter();
        this.onboarding = new OnboardingAdapter();
    }

    public PaymentAdapter payment() {
        return payment;
    }

    public OnboardingAdapter onboarding() {
        return onboarding;
    }
}
