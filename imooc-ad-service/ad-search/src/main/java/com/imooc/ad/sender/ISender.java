package com.imooc.ad.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * 可以接收增量数据
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
