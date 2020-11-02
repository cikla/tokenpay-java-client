package com.tokenpay.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataResponse<T> {

    @Builder.Default
    private List<T> items = new ArrayList<>();
    private Integer page;
    private Integer size;
    private Long totalSize;
}
