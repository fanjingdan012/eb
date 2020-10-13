package com.fjd.order.model;

import java.math.BigDecimal;

public class SalesOrder {
    private Integer id;

    private BigDecimal totalamount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }
}