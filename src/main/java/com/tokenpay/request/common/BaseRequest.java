package com.tokenpay.request.common;

import com.tokenpay.net.HttpMethod;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class BaseRequest {

    public abstract String getPath();

    public abstract HttpMethod getMethod();
}
