package com.talkingdata.sdmk.esclient;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.esclient
 * @Description: ${todo}
 * @date 2018/3/7 13:42
 * @email 1242157902@qq.com
 */
public class ESClient {


    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("RequestLog");

/*    private static  TransportClient client;
    private static TransportClient transportClient;

    private static final Gson gson = new Gson();



    static{
        Settings settings = Settings.builder()
                .put("cluster.name", "DMK-LOG") //设置ES实例的名称
                .put("client.transport.sniff", true) //自动嗅探整个集群的状态，把集群中其他ES节点的ip添加到本地的客户端列表中
                .build();
        client = TransportClient.builder().settings(settings).build();
        transportClient = client
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("172.20.33.1", 9300)))
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("172.20.33.2", 9300)))
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("172.20.33.5", 9300)))
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("172.20.33.6", 9300)))
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("172.20.33.7", 9300)));

    }

    public static void main(String[] args)throws Exception{
       *//* GetResponse response = transportClient.prepareGet("logstash-gatewaylog", "gatewaylog", "AV_IfbQC4EqwG7t2yaZL").get();
        System.out.println(response.getSourceAsString());*//*
        ExecutorService threadPool= Executors.newFixedThreadPool(400);

        for (int i=0;i<400;i++){
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    int k = 0;
                    for (int i = 0; i < 5000; i++) {
                        try {
                            addDocument("test", "goods", new Goods(k, k + "", k+ UUID.randomUUID().toString().replace("-", "")));
                            k++;
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("执行完毕！" );
                }
            });
        }


   *//*   int k =0;

        for(int j=0;j<5;j++){
           // List<Goods> goodsList = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                addDocument("test","goods",new Goods(k, k + "", UUID.randomUUID().toString().replace("-", "")));
                k++;
            }
            System.out.println("######################################");
        }*//*
        //transportClient.close();


    }

    public static void createIndex(List<Goods> goodsList)throws Exception{
        // 如果存在就先删除索引
 *//*       if (transportClient.admin().indices().prepareExists("goods").get().isExists()) {
            transportClient.admin().indices().prepareDelete("goods").get();
        }*//*
        // 创建索引,并设置mapping.
        String mappingStr = "{\"test\":{\"properties\":{\"id\":{\"type\":\"long\"},\"name\":{\"type\":\"string\"},\"goodsId\":{\"type\":\"string\",\"index\":\"not_analyzed\"}}}}";
        //transportClient.admin().indices().get();

        // 批量处理request
        BulkRequestBuilder bulkRequest = transportClient.prepareBulk();
       // byte[] json;
        String json = null;
        for (Goods goods : goodsList) {
            json = gson.toJson(goods);
            bulkRequest.add(new IndexRequest("test", "goods", goods.getGoodsId()).source(json));
            log.info(json);
        }
        // 执行批量处理request
        BulkResponse bulkResponse = bulkRequest.get();
        // 处理错误信息
        if (bulkResponse.hasFailures()) {
            System.out.println("====================批量创建索引过程中出现错误 下面是错误信息==========================");
            long count = 0L;
            for (BulkItemResponse bulkItemResponse : bulkResponse) {
                System.out.println("发生错误的 索引id为 : "+bulkItemResponse.getId()+" ，错误信息为："+ bulkItemResponse.getFailureMessage());
                count++;
            }
            System.out.println("====================批量创建索引过程中出现错误 上面是错误信息 共有: "+count+" 条记录==========================");
        }
        transportClient.close();
    }

    public static void addDocument(String index, String type, Goods goods)
            throws UnknownHostException, JsonProcessingException {
        String json = gson.toJson(goods);
        log.info(json);
        transportClient.prepareIndex(index, type, goods.getGoodsId()).setSource(json).get();
    }*/

}
