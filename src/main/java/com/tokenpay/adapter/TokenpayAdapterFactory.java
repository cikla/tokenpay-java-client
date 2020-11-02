package com.tokenpay.adapter;

public class TokenpayAdapterFactory {

    private static PaymentAdapter paymentAdapter;
    private static OnboardingAdapter onboardingAdapter;

    public static PaymentAdapter retrievePaymentAdapter() {
        if (paymentAdapter == null) {
            paymentAdapter = new PaymentAdapter();
        }

        return paymentAdapter;
    }

    public static OnboardingAdapter retrieveOnboardingAdapter() {
        if (onboardingAdapter == null) {
            onboardingAdapter = new OnboardingAdapter();
        }

        return onboardingAdapter;
    }
}
