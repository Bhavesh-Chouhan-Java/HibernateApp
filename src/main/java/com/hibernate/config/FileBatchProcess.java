package com.hibernate.config;

import com.hibernate.entity.Customer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileBatchProcess {


    String a = "";


    public ItemReader<Customer> getItem(){

        return null;
    }

    public ItemWriter<Customer> getWriteItem(){

        return null;
    }

    public ItemProcessor getProcessorItem(){

        return null;
    }

}
