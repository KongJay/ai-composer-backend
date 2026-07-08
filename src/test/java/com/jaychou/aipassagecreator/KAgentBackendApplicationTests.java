package com.jaychou.aipassagecreator;

import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@SpringBootTest
class KAgentBackendApplicationTests {
    @Resource
    private DashScopeChatModel chatModel;
    @Test
    void contextLoads() {
//        // 同步调用
//        String response = chatModel.call("你好，请介绍一下你自己");
//        System.out.println(response);
//
//        // 流式调用
//        Flux<ChatResponse> stream = chatModel.stream(
//                new Prompt("用一句话介绍 Spring AI")
//        );
//        stream.subscribe(chunk ->
//                System.out.print(chunk.getResult().getOutput().getText())
//        );
    }

}
