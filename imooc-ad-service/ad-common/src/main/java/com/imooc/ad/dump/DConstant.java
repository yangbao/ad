package com.imooc.ad.dump;

import com.alibaba.fastjson.JSON;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by Qinyi.
 */
public class DConstant {

    public static final String DATA_ROOT_DIR = "e:/Users/bgkp/imooc/mysql_data/";

    // 各个表数据的存储文件名
    public static final String AD_PLAN = "ad_plan.data";
    public static final String AD_UNIT = "ad_unit.data";
    public static final String AD_CREATIVE = "ad_creative.data";
    public static final String AD_CREATIVE_UNIT = "ad_creative_unit.data";
    public static final String AD_UNIT_IT = "ad_unit_it.data";
    public static final String AD_UNIT_DISTRICT = "ad_unit_district.data";
    public static final String AD_UNIT_KEYWORD = "ad_unit_keyword.data";

    public static void main(String[] args) throws IOException {


        Path path = Paths.get("e:/Users/bgkp/imooc/mysql_data/ad_plan.data");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(path, CREATE, APPEND))) {
            out.write("aaa".getBytes(), 0, "aaa".length());
            out.close();
        } catch (IOException x) {
            System.err.println(x);
        }
//        BufferedWriter writer = Files.newBufferedWriter(path,CREATE);
//        writer.write("aaaaaaaa");
//
//        writer.close();

    }
}
