package com.imooc.ad.mysql.dto;

import com.github.shyiko.mysql.binlog.event.EventType;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * binlog到row data的映射
 */
@Data
public class BinlogRowData {

    private TableTemplate table;

    private EventType eventType;

    private List<Map<String, String>> after; //增加和删除都用这个, 更新之后的数据

    private List<Map<String, String>> before;
}
