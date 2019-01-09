package com.talkingdata.sdmk.kafka;


import com.google.gson.Gson;
import com.talkingdata.sdmk.pojo.GatewayLog;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User：    ysl
 * Date:   2017/5/30
 * Time:   13:56
 */
public class ProducerKafka {

    public static void main(String[] args)throws Exception
    {

        Gson gson = new Gson();


        Properties props = new Properties();
        props.put("bootstrap.servers", "172.20.33.8:19092,172.20.33.8:29092,172.20.33.8:39092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");


        Executor executor = Executors.newFixedThreadPool(400);

        Producer<String, String> producer = new KafkaProducer<>(props);

        Random random = new Random();
        for(int j =0;j<1;j++)
        {
            for (int i = 0; i < 23 + random.nextInt(3); i++) {
                GatewayLog gl = new GatewayLog("52955a37edf64h0e99b5a1841cee0782", 1522220700000l, 1522220700000l, 1, 1, "61a575184f28440e9c8f48231e83104",
                        521, 500, UUID.randomUUID().toString(), "sdmk@outlook.com", 0, "/tom006", "http://172.20.33.2/mock/service/magic");
         /*       executor.execute(new Runnable() {
                    @Override
                    public void run() {*/
                producer.send(new ProducerRecord<String, String>("devSvrQuota", new Integer(random.nextInt(1000)).toString(), gson.toJson(gl)));
                /*    }
                });*/

            }

        }
        producer.close();

    }



}
