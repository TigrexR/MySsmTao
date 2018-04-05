package com.taotao.common.pojo;

import java.util.List;

/**
 * Created by Linus on 2018/4/4.
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public List<?> getRows() {
        return rows;
    }
}
