package io.github.sadbirby.functions_example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App {
    public static List<Data> dataList = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    ApplicationRunner init() {
        return args -> {
            dataList.clear();
            dataList.add(new Data(1L, "AA"));
            dataList.add(new Data(2L, "BB"));
            dataList.add(new Data(3L, "CC"));
            dataList.add(new Data(4L, "DD"));
            dataList.add(new Data(5L, "EE"));
            dataList.add(new Data(6L, "FF"));
            dataList.add(new Data(7L, "GG"));
            dataList.add(new Data(8L, "HH"));
            dataList.add(new Data(9L, "II"));
            dataList.add(new Data(10L, "JJ"));
        };
    }
}
