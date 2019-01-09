package com.talkingdata.sdmk.testJson;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class TestJson {


    public static void main(String[] args)throws Exception{

        String json = "{\n" +
                "    \"msg\": \"OK\",\n" +
                "    \"data\": {\n" +
                "        \"currentPage\": 1,\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -3736413712244503500,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"美国视频游戏销售和评价数据\",\n" +
                "                \"fieldCount\": 29,\n" +
                "                \"heatSort\": 99,\n" +
                "                \"id\": \"af3a9601-0d32-4e91-bd26-c8df02ebe09b\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Grupo Bimbo 面包店库存和销量预测\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 1244106694095155009,\n" +
                "                \"sourceCreated\": 1521704337000,\n" +
                "                \"sourceModified\": 1521704337000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 403,\n" +
                "                        \"name\": \"广告业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 404,\n" +
                "                        \"name\": \"广告业\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 405,\n" +
                "                        \"name\": \"金属冶炼\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 406,\n" +
                "                        \"name\": \"公益组织\",\n" +
                "                        \"sort\": 3\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 8938849937971840689,\n" +
                "                \"countName\": \"80000000000亿+\",\n" +
                "                \"description\": \"Kaggle 各项情况数据\",\n" +
                "                \"fieldCount\": 11,\n" +
                "                \"heatSort\": 95,\n" +
                "                \"id\": \"85f4db5f-bedb-4080-b77d-523044757308\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"美国视频游戏销售和评价数据\",\n" +
                "                \"providerId\": \"28ab018d7f63c4d76b7c5be5ac388d156\",\n" +
                "                \"providerName\": \"report-test\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688626000,\n" +
                "                \"sourceModified\": 1521688626000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 481,\n" +
                "                        \"name\": \"餐饮\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 482,\n" +
                "                        \"name\": \"电讯业\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 483,\n" +
                "                        \"name\": \"公益组织\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 484,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 485,\n" +
                "                        \"name\": \"金属冶炼\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 3766322451655009628,\n" +
                "                \"countName\": \"30000000000亿+\",\n" +
                "                \"description\": \"美国视频游戏销售和评价数据\",\n" +
                "                \"fieldCount\": 41,\n" +
                "                \"heatSort\": 94,\n" +
                "                \"id\": \"3a0080d0-3d2e-435f-b6cd-aec51575306e\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"预测公寓租金\",\n" +
                "                \"providerId\": \"10a684a59ee7148e286468e4887f264e2\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/5,01b6a027ca9d\",\n" +
                "                \"providerName\": \"test-logo\",\n" +
                "                \"size\": 5896455198235564123,\n" +
                "                \"sourceCreated\": 1521704341000,\n" +
                "                \"sourceModified\": 1521704341000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 349,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 350,\n" +
                "                        \"name\": \"保健\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -9043971247820504599,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"广告点击预测\",\n" +
                "                \"fieldCount\": 29,\n" +
                "                \"heatSort\": 94,\n" +
                "                \"id\": \"ca1adc1a-12cc-4596-a548-61e1ff74153a\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"在线广告实时竞价数据\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688627000,\n" +
                "                \"sourceModified\": 1521688627000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 437,\n" +
                "                        \"name\": \"化学\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 438,\n" +
                "                        \"name\": \"培训\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -2550431953260057418,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"购物车商品关联\",\n" +
                "                \"fieldCount\": 21,\n" +
                "                \"heatSort\": 93,\n" +
                "                \"id\": \"1176ba82-1eca-4c8b-9e73-5f3174c57887\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Airbnb 新用户的民宿预定预测\",\n" +
                "                \"providerId\": \"161411a4a3584475e85c0c45999a7a560\",\n" +
                "                \"providerName\": \"test-add\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688623000,\n" +
                "                \"sourceModified\": 1521688623000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 579,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 580,\n" +
                "                        \"name\": \"计算机\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 581,\n" +
                "                        \"name\": \"服装业\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 582,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 583,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -1924755091142519494,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"Amazon 无锁手机评论数据\",\n" +
                "                \"fieldCount\": 10,\n" +
                "                \"heatSort\": 93,\n" +
                "                \"id\": \"131cb881-9735-41a1-b8ee-d5181c787009\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Bosch 生产流水线降低次品率\",\n" +
                "                \"providerId\": \"10a684a59ee7148e286468e4887f264e2\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/5,01b6a027ca9d\",\n" +
                "                \"providerName\": \"test-logo\",\n" +
                "                \"size\": 2229675605727012660,\n" +
                "                \"sourceCreated\": 1521704344000,\n" +
                "                \"sourceModified\": 1521704344000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 232,\n" +
                "                        \"name\": \"服装业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 233,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 6023218013176777866,\n" +
                "                \"countName\": \"60000000000亿+\",\n" +
                "                \"description\": \"Amazon 食品评论数据\",\n" +
                "                \"fieldCount\": 9,\n" +
                "                \"heatSort\": 93,\n" +
                "                \"id\": \"76a26004-c0c7-434b-9238-de60f853db75\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"预测公寓租金\",\n" +
                "                \"providerId\": \"18fdc7c42ea23459ca80ebdbeb81f4eea\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"环球影业\",\n" +
                "                \"size\": 8345204653181222302,\n" +
                "                \"sourceCreated\": 1521704341000,\n" +
                "                \"sourceModified\": 1521704341000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 342,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 343,\n" +
                "                        \"name\": \"航空航天\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -6638162503804154035,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"Kaggle 各项情况数据\",\n" +
                "                \"fieldCount\": 15,\n" +
                "                \"heatSort\": 91,\n" +
                "                \"id\": \"4e101ac6-0d6f-4b3a-8536-0e170cdd12e3\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"购物车商品关联\",\n" +
                "                \"providerId\": \"28ab018d7f63c4d76b7c5be5ac388d156\",\n" +
                "                \"providerName\": \"report-test\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688627000,\n" +
                "                \"sourceModified\": 1521688627000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 418,\n" +
                "                        \"name\": \"化学\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 419,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 420,\n" +
                "                        \"name\": \"培训\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 421,\n" +
                "                        \"name\": \"保健\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 422,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 3311206407179910178,\n" +
                "                \"countName\": \"30000000000亿+\",\n" +
                "                \"description\": \"Amazon 无锁手机评论数据\",\n" +
                "                \"fieldCount\": 4,\n" +
                "                \"heatSort\": 91,\n" +
                "                \"id\": \"5bc71e56-f2ff-474a-b877-24c215742067\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"KKBOX 音乐用户续订预测\",\n" +
                "                \"providerId\": \"14deb4db22a124bb5ae4ec40c72c1b544\",\n" +
                "                \"providerName\": \"邮件模板测试\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688622000,\n" +
                "                \"sourceModified\": 1521688622000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 593,\n" +
                "                        \"name\": \"化学\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 594,\n" +
                "                        \"name\": \"培训\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -3587560800107423264,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"预测公寓租金\",\n" +
                "                \"fieldCount\": 24,\n" +
                "                \"heatSort\": 90,\n" +
                "                \"id\": \"376c2799-b9a0-4bab-8ecb-383f23840dbb\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"银行产品推荐\",\n" +
                "                \"providerId\": \"14deb4db22a124bb5ae4ec40c72c1b544\",\n" +
                "                \"providerName\": \"邮件模板测试\",\n" +
                "                \"size\": -7960853908045609352,\n" +
                "                \"sourceCreated\": 1521704341000,\n" +
                "                \"sourceModified\": 1521704341000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 359,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 360,\n" +
                "                        \"name\": \"宾馆\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 361,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 362,\n" +
                "                        \"name\": \"计算机\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 363,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -7318198215718127015,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"美国视频游戏销售和评价数据\",\n" +
                "                \"fieldCount\": 17,\n" +
                "                \"heatSort\": 90,\n" +
                "                \"id\": \"70ffcad8-4d7b-4fcd-a911-255dff5bf6f8\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Grupo Bimbo 面包店库存和销量预测\",\n" +
                "                \"providerId\": \"18fdc7c42ea23459ca80ebdbeb81f4eea\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"环球影业\",\n" +
                "                \"size\": -7007223656410681607,\n" +
                "                \"sourceCreated\": 1521704343000,\n" +
                "                \"sourceModified\": 1521704343000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 249,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 250,\n" +
                "                        \"name\": \"计算机\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 251,\n" +
                "                        \"name\": \"健康\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 252,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 3\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 5434889942992803317,\n" +
                "                \"countName\": \"50000000000亿+\",\n" +
                "                \"description\": \"预测公寓租金\",\n" +
                "                \"fieldCount\": 46,\n" +
                "                \"heatSort\": 90,\n" +
                "                \"id\": \"c7bae6fd-028f-4479-97bc-21001278d3c4\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Yelp 点评网站公开数据\",\n" +
                "                \"providerId\": \"1415fee751b9c4767a3e4db2142b0908d\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"20th Century Fox\",\n" +
                "                \"size\": -8606963145836251018,\n" +
                "                \"sourceCreated\": 1521704343000,\n" +
                "                \"sourceModified\": 1521704343000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 243,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 244,\n" +
                "                        \"name\": \"健康\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 245,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 2\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 8883461284542761969,\n" +
                "                \"countName\": \"80000000000亿+\",\n" +
                "                \"description\": \"Bosch 生产流水线降低次品率\",\n" +
                "                \"fieldCount\": 43,\n" +
                "                \"heatSort\": 88,\n" +
                "                \"id\": \"5d86979a-01bf-4856-9b96-720d330e5231\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"银行产品推荐\",\n" +
                "                \"providerId\": \"10a684a59ee7148e286468e4887f264e2\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/5,01b6a027ca9d\",\n" +
                "                \"providerName\": \"test-logo\",\n" +
                "                \"size\": 3110454083418309829,\n" +
                "                \"sourceCreated\": 1521704344000,\n" +
                "                \"sourceModified\": 1521704344000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 226,\n" +
                "                        \"name\": \"保健\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 227,\n" +
                "                        \"name\": \"培训\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 228,\n" +
                "                        \"name\": \"广告业\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 229,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 3\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -5763872407280298714,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"餐厅营业收入预测建模\",\n" +
                "                \"fieldCount\": 7,\n" +
                "                \"heatSort\": 87,\n" +
                "                \"id\": \"6f302dd7-f6e8-4dd0-8153-f91cb65f0426\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"购物车商品关联\",\n" +
                "                \"providerId\": \"18fdc7c42ea23459ca80ebdbeb81f4eea\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"环球影业\",\n" +
                "                \"size\": -3653838564177186776,\n" +
                "                \"sourceCreated\": 1521704340000,\n" +
                "                \"sourceModified\": 1521704340000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 381,\n" +
                "                        \"name\": \"服装业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 382,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 4513196288164683788,\n" +
                "                \"countName\": \"40000000000亿+\",\n" +
                "                \"description\": \"Airbnb 新用户的民宿预定预测\",\n" +
                "                \"fieldCount\": 23,\n" +
                "                \"heatSort\": 86,\n" +
                "                \"id\": \"b53e66cc-9a87-4915-bdc7-15396e3ff7aa\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"在线广告实时竞价数据\",\n" +
                "                \"providerId\": \"18fdc7c42ea23459ca80ebdbeb81f4eea\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"环球影业\",\n" +
                "                \"size\": 5673693812239091573,\n" +
                "                \"sourceCreated\": 1521704341000,\n" +
                "                \"sourceModified\": 1521704341000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 332,\n" +
                "                        \"name\": \"计算机\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 333,\n" +
                "                        \"name\": \"能源\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 334,\n" +
                "                        \"name\": \"金属冶炼\",\n" +
                "                        \"sort\": 2\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -2193762933920953615,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"Amazon 食品评论数据\",\n" +
                "                \"fieldCount\": 36,\n" +
                "                \"heatSort\": 85,\n" +
                "                \"id\": \"13d6cb51-c92c-4b9f-b78a-f5cf811d0e5a\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Kaggle 各项情况数据\",\n" +
                "                \"providerId\": \"161411a4a3584475e85c0c45999a7a560\",\n" +
                "                \"providerName\": \"test-add\",\n" +
                "                \"size\": 2360799363323012365,\n" +
                "                \"sourceCreated\": 1521704340000,\n" +
                "                \"sourceModified\": 1521704340000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 394,\n" +
                "                        \"name\": \"计算机\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 395,\n" +
                "                        \"name\": \"金属冶炼\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 396,\n" +
                "                        \"name\": \"宾馆\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 397,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 398,\n" +
                "                        \"name\": \"公益组织\",\n" +
                "                        \"sort\": 4\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 399,\n" +
                "                        \"name\": \"金属冶炼\",\n" +
                "                        \"sort\": 5\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 6617443259805485758,\n" +
                "                \"countName\": \"60000000000亿+\",\n" +
                "                \"description\": \"餐厅营业收入预测建模\",\n" +
                "                \"fieldCount\": 9,\n" +
                "                \"heatSort\": 83,\n" +
                "                \"id\": \"684289a4-28d9-413f-adea-f098b3975ab8\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Airbnb 开放的民宿信息和住客评论数据\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 4058989535374194173,\n" +
                "                \"sourceCreated\": 1521704343000,\n" +
                "                \"sourceModified\": 1521704343000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 262,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 263,\n" +
                "                        \"name\": \"建筑业\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -6741201182810607263,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"Kaggle 各项情况数据\",\n" +
                "                \"fieldCount\": 35,\n" +
                "                \"heatSort\": 83,\n" +
                "                \"id\": \"6f46dcfb-e0f0-4b2f-9fa7-ce0675c914d5\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"银行产品推荐\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688627000,\n" +
                "                \"sourceModified\": 1521688627000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 434,\n" +
                "                        \"name\": \"服装业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 435,\n" +
                "                        \"name\": \"公益组织\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 436,\n" +
                "                        \"name\": \"航空航天\",\n" +
                "                        \"sort\": 2\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 2815681233549455756,\n" +
                "                \"countName\": \"20000000000亿+\",\n" +
                "                \"description\": \"Airbnb 开放的民宿信息和住客评论数据\",\n" +
                "                \"fieldCount\": 14,\n" +
                "                \"heatSort\": 83,\n" +
                "                \"id\": \"87a52f4f-f453-4ea5-b15f-3019cca72772\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"广告点击预测\",\n" +
                "                \"providerId\": \"14deb4db22a124bb5ae4ec40c72c1b544\",\n" +
                "                \"providerName\": \"邮件模板测试\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688623000,\n" +
                "                \"sourceModified\": 1521688623000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 591,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 592,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -2580223269110383377,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"广告点击预测\",\n" +
                "                \"fieldCount\": 12,\n" +
                "                \"heatSort\": 83,\n" +
                "                \"id\": \"ef59b8af-28f1-4b2a-ae4a-6f1fc2edd9ac\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"预测公寓租金\",\n" +
                "                \"providerId\": \"18fdc7c42ea23459ca80ebdbeb81f4eea\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"环球影业\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688627000,\n" +
                "                \"sourceModified\": 1521688627000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 411,\n" +
                "                        \"name\": \"健康\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 412,\n" +
                "                        \"name\": \"广告业\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 413,\n" +
                "                        \"name\": \"化学\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 414,\n" +
                "                        \"name\": \"采矿\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 415,\n" +
                "                        \"name\": \"化学\",\n" +
                "                        \"sort\": 4\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 416,\n" +
                "                        \"name\": \"宾馆\",\n" +
                "                        \"sort\": 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 417,\n" +
                "                        \"name\": \"健康\",\n" +
                "                        \"sort\": 6\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 6710938009559480380,\n" +
                "                \"countName\": \"60000000000亿+\",\n" +
                "                \"description\": \"网站用户推荐点击预测\",\n" +
                "                \"fieldCount\": 1,\n" +
                "                \"heatSort\": 82,\n" +
                "                \"id\": \"bac70d43-a649-4d28-aabe-58c7066f287e\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"网站用户推荐点击预测\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 7078811456877742103,\n" +
                "                \"sourceCreated\": 1521704343000,\n" +
                "                \"sourceModified\": 1521704343000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 241,\n" +
                "                        \"name\": \"电讯业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 242,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 1\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -8973380651575693905,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"广告点击预测\",\n" +
                "                \"fieldCount\": 22,\n" +
                "                \"heatSort\": 81,\n" +
                "                \"id\": \"38172f58-f469-41b0-b9ff-9c7d91fd9b64\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"KKBOX 音乐用户续订预测\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 7205232989345407307,\n" +
                "                \"sourceCreated\": 1521704342000,\n" +
                "                \"sourceModified\": 1521704342000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 297,\n" +
                "                        \"name\": \"保健\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 298,\n" +
                "                        \"name\": \"建筑业\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 299,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 2\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 3,\n" +
                "                        \"categoryName\": \"位置区域\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": 2201266099506847055,\n" +
                "                \"countName\": \"20000000000亿+\",\n" +
                "                \"description\": \"Grupo Bimbo 面包店库存和销量预测\",\n" +
                "                \"fieldCount\": 19,\n" +
                "                \"heatSort\": 81,\n" +
                "                \"id\": \"4fb23887-1a9b-4dd0-9991-935e83346a4d\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"银行产品推荐\",\n" +
                "                \"providerId\": \"182fba8c145c8416eb45f67f1baec60bc\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01b8eed03833\",\n" +
                "                \"providerName\": \"test-logo2\",\n" +
                "                \"size\": 8776965953243555801,\n" +
                "                \"sourceCreated\": 1521704341000,\n" +
                "                \"sourceModified\": 1521704341000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 351,\n" +
                "                        \"name\": \"公益组织\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 352,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 353,\n" +
                "                        \"name\": \"广告业\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 354,\n" +
                "                        \"name\": \"保健\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 355,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 2,\n" +
                "                        \"categoryName\": \"移动App\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -9047412337426859982,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"Yelp 点评网站公开数据\",\n" +
                "                \"fieldCount\": 46,\n" +
                "                \"heatSort\": 80,\n" +
                "                \"id\": \"1c26c0a0-6648-404d-9a11-c141c052c640\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 1,\n" +
                "                        \"industryName\": \"广告营销\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Yelp 点评网站公开数据\",\n" +
                "                \"providerId\": \"14deb4db22a124bb5ae4ec40c72c1b544\",\n" +
                "                \"providerName\": \"邮件模板测试\",\n" +
                "                \"size\": -894889506675886634,\n" +
                "                \"sourceCreated\": 1521704344000,\n" +
                "                \"sourceModified\": 1521704344000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 234,\n" +
                "                        \"name\": \"建筑业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 235,\n" +
                "                        \"name\": \"电讯业\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 236,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 237,\n" +
                "                        \"name\": \"电讯业\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 238,\n" +
                "                        \"name\": \"电讯业\",\n" +
                "                        \"sort\": 4\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 239,\n" +
                "                        \"name\": \"房地产\",\n" +
                "                        \"sort\": 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 240,\n" +
                "                        \"name\": \"航空航天\",\n" +
                "                        \"sort\": 6\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"categoryRelations\": [\n" +
                "                    {\n" +
                "                        \"categoryId\": 1,\n" +
                "                        \"categoryName\": \"移动设备\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"count\": -5263863298274346448,\n" +
                "                \"countName\": \"< 1000\",\n" +
                "                \"description\": \"广告点击预测\",\n" +
                "                \"fieldCount\": 17,\n" +
                "                \"heatSort\": 80,\n" +
                "                \"id\": \"c5d529b6-8864-4f18-af54-a4c62e9eab41\",\n" +
                "                \"industryRelations\": [\n" +
                "                    {\n" +
                "                        \"industryId\": 2,\n" +
                "                        \"industryName\": \"金融风控\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"name\": \"Grupo Bimbo 面包店库存和销量预测\",\n" +
                "                \"providerId\": \"1fcef8586832c43edb4555bc0b9cf4b21\",\n" +
                "                \"providerLogo\": \"http://172.20.33.8:9334/1,01bcea9c9834\",\n" +
                "                \"providerName\": \"黑山老妖\",\n" +
                "                \"size\": 100,\n" +
                "                \"sourceCreated\": 1521688626000,\n" +
                "                \"sourceModified\": 1521688626000,\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"id\": 476,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 477,\n" +
                "                        \"name\": \"服务\",\n" +
                "                        \"sort\": 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 478,\n" +
                "                        \"name\": \"采矿\",\n" +
                "                        \"sort\": 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 479,\n" +
                "                        \"name\": \"教育\",\n" +
                "                        \"sort\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"id\": 480,\n" +
                "                        \"name\": \"保险业\",\n" +
                "                        \"sort\": 4\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"rows\": 25,\n" +
                "        \"totalCount\": 100,\n" +
                "        \"totalPage\": 4\n" +
                "    },\n" +
                "    \"status\": 200\n" +
                "}";

             HttpResponse<DataSetInformation> dataSetInformationHttpResponse = JSON.parseObject(json, new TypeReference<HttpResponse<DataSetInformation>>() {});

            DataSetInformation dataSetInformation = dataSetInformationHttpResponse.getData();
            System.out.println(" ####   "+dataSetInformation.toString());


    }


}
