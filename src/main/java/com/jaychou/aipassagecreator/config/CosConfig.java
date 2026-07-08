package com.jaychou.aipassagecreator.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: CosConfig
 * Package: com.jaychou.aipassagecreator.config
 * Description:
 *
 * @Author: 红模仿
 * @Create: 2026/07/06 - 21:39
 * @Version: v1.0
 */
@Configuration
@ConfigurationProperties(prefix = "tencent.cos")
@Data
public class CosConfig {

    /**
     * Secret ID
     */
    private String secretId;

    /**
     * Secret Key
     */
    private String secretKey;

    /**
     * 地域
     */
    private String region;

    /**
     * 存储桶
     */
    private String bucket;
}
