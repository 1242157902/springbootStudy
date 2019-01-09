package com.talkingdata.sdmk.kafka;

import java.util.HashMap;
import java.util.Map;

/**
 * User：    ysl
 * Date:   2017/7/11
 * Time:   16:14
 */
public class StreamsKafka {

    public static void main(String[] args)throws Exception
    {
 /*       Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "my-stream-processing-application");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        StreamsConfig config = new StreamsConfig(props);

        KStreamBuilder builder = new KStreamBuilder();
        builder.stream("my-input-topic").mapValues(value -> value.length().toString()).to("my-output-topic");

        KafkaStreams streams = new KafkaStreams(builder, config);
        streams.start();*/
    }
}
