package com.example.newcodercommunity.entity;

/**
 * 封装分页相关的信息
 *
 */
public class Page {
    // 当前的页码
    private int current = 1;
    // 显示上限
    private int limit = 10;
    // 数据总数(用于计算总的页数)
    private int rows;
    // 查询路径(用于复用页面链接)
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current > 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     *  获得当前页的起始行
     *
     * @return
     */
    public int getOffset() {
        // current * limit - limit
        // 当前页 * 每页的最大数量 = 当前页的最后一行
        // 再 - limit 就能得到当前页的第一行
        return (current - 1) * limit;
    }

    /**
     * 获得总页数
     *
     * @return
     */
    public int getTotal() {
        if( rows % limit != 0 ) {
            return rows / limit + 1;
        }
        return rows / limit;
    }

    /**
     * 获取起始页码
     *
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取结束页码
     *
     * @return
     */
    public int getTo() {
        int end = current + 2;
        return end <= getTotal() ? end : getTotal();
    }
}
