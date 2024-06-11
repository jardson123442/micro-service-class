package io.github.cursodsousa.mscartoes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableRabbit
@SpringBootApplication
public class MscartoesApplication {

    public static void main(String[] args) {
        log.info("Informação: {}", "teste info");
        log.error("Erro: {}", "teste erro");
        log.warn("Aviso: {}", "teste warn");
        SpringApplication.run(MscartoesApplication.class, args);
    }

}
