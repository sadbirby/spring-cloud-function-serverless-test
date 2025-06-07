package io.github.sadbirby.functions_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class CloudFunctions {
    @Bean
    public Function<Data, Boolean> createData() {
        return (d) -> App.dataList.add(d);
    }

    @Bean
    public Supplier<List<Data>> getDataList() {
        return () -> App.dataList;
    }

    @Bean
    public Consumer<Data> addData() {
        return App.dataList::add;
    }
}
