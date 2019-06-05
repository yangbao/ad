package com.imooc.ad.conf;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

public class WebConfiguration implements WebMvcConfigurer {
    /**
     * 默认有多个converts
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        //就只使用一个Jackson的转换器
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
