// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountModelInner;
import com.azure.resourcemanager.cognitiveservices.models.AccountModelListResult;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentModel;
import com.azure.resourcemanager.cognitiveservices.models.ModelDeprecationInfo;
import com.azure.resourcemanager.cognitiveservices.models.ModelLifecycleStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AccountModelListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountModelListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"vxodpu\",\"value\":[{\"baseModel\":{\"format\":\"ydagfuaxbe\",\"name\":\"iu\",\"version\":\"ktwh\"},\"maxCapacity\":334875262,\"capabilities\":{\"xim\":\"wqsmbsur\",\"stkiiuxhqyud\":\"ryocfsfksymdd\",\"rq\":\"o\",\"oczvy\":\"b\"},\"finetuneCapabilities\":{\"vdfwatkpn\":\"rvkdvjsllrm\",\"wiqzbqjvsovmyo\":\"ulexxbczwtr\"},\"deprecation\":{\"fineTune\":\"spkwlhzdobpxjm\",\"inference\":\"bvvnchrkcciw\"},\"lifecycleStatus\":\"GenerallyAvailable\",\"format\":\"khrs\",\"name\":\"iwkuofos\",\"version\":\"hsauuimjmvxied\",\"callRateLimit\":{\"count\":93.76809,\"renewalPeriod\":14.127278,\"rules\":[]}},{\"baseModel\":{\"format\":\"f\",\"name\":\"aos\",\"version\":\"xc\"},\"maxCapacity\":771742090,\"capabilities\":{\"eggzfb\":\"hocohslkev\",\"ithlvmezyvshxm\":\"hfmvfaxkffe\",\"gigr\":\"sbbzo\"},\"finetuneCapabilities\":{\"jx\":\"ur\",\"koen\":\"jnspydp\",\"nvudwtiukb\":\"ou\"},\"deprecation\":{\"fineTune\":\"gkpocipazyxoe\",\"inference\":\"kgjn\"},\"lifecycleStatus\":\"Preview\",\"format\":\"ygevqzntypmrbpiz\",\"name\":\"r\",\"version\":\"sdpydnfyhxdeoejz\",\"callRateLimit\":{\"count\":90.01345,\"renewalPeriod\":67.792435,\"rules\":[]}},{\"baseModel\":{\"format\":\"gzfbishcbk\",\"name\":\"jdeyeamdpha\",\"version\":\"lpbuxwgipwhonowk\"},\"maxCapacity\":69341003,\"capabilities\":{\"bin\":\"kix\",\"iyqzrnk\":\"eputtmrywnuzoqf\",\"qnwvlrya\":\"qvyxlwhzlsicoho\"},\"finetuneCapabilities\":{\"mqhgyxzkonocuk\":\"heun\",\"szfkbe\":\"klyaxuconu\",\"jmwvvj\":\"pewr\"},\"deprecation\":{\"fineTune\":\"cxsenhwlrsff\",\"inference\":\"pwvlqdq\"},\"lifecycleStatus\":\"Preview\",\"format\":\"lihkaetcktvfc\",\"name\":\"fsnkymuctq\",\"version\":\"fbebrjcxer\",\"callRateLimit\":{\"count\":76.095024,\"renewalPeriod\":39.56957,\"rules\":[]}},{\"baseModel\":{\"format\":\"vjrbirphxepcyvah\",\"name\":\"ljkyqxjvuuj\",\"version\":\"idokgjlj\"},\"maxCapacity\":831407974,\"capabilities\":{\"szzhbijhtxfvgxbf\":\"ltbgsncghkj\",\"ec\":\"mxnehmp\",\"gr\":\"godebfqkkrbmpu\",\"ispnqzahmgkbrp\":\"wflzlfbxzpuzy\"},\"finetuneCapabilities\":{\"rgvtqag\":\"hibnuqqkpika\",\"bfs\":\"buynhijggm\"},\"deprecation\":{\"fineTune\":\"butr\",\"inference\":\"pnazzm\"},\"lifecycleStatus\":\"GenerallyAvailable\",\"format\":\"mpxttdbhrbnlankx\",\"name\":\"skpbhenbtkcxywn\",\"version\":\"nrs\",\"callRateLimit\":{\"count\":43.24222,\"renewalPeriod\":76.7722,\"rules\":[]}}]}")
                .toObject(AccountModelListResult.class);
        Assertions.assertEquals("vxodpu", model.nextLink());
        Assertions.assertEquals("khrs", model.value().get(0).format());
        Assertions.assertEquals("iwkuofos", model.value().get(0).name());
        Assertions.assertEquals("hsauuimjmvxied", model.value().get(0).version());
        Assertions.assertEquals("ydagfuaxbe", model.value().get(0).baseModel().format());
        Assertions.assertEquals("iu", model.value().get(0).baseModel().name());
        Assertions.assertEquals("ktwh", model.value().get(0).baseModel().version());
        Assertions.assertEquals(334875262, model.value().get(0).maxCapacity());
        Assertions.assertEquals("wqsmbsur", model.value().get(0).capabilities().get("xim"));
        Assertions.assertEquals("rvkdvjsllrm", model.value().get(0).finetuneCapabilities().get("vdfwatkpn"));
        Assertions.assertEquals("spkwlhzdobpxjm", model.value().get(0).deprecation().fineTune());
        Assertions.assertEquals("bvvnchrkcciw", model.value().get(0).deprecation().inference());
        Assertions.assertEquals(ModelLifecycleStatus.GENERALLY_AVAILABLE, model.value().get(0).lifecycleStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountModelListResult model =
            new AccountModelListResult()
                .withNextLink("vxodpu")
                .withValue(
                    Arrays
                        .asList(
                            new AccountModelInner()
                                .withFormat("khrs")
                                .withName("iwkuofos")
                                .withVersion("hsauuimjmvxied")
                                .withBaseModel(
                                    new DeploymentModel().withFormat("ydagfuaxbe").withName("iu").withVersion("ktwh"))
                                .withMaxCapacity(334875262)
                                .withCapabilities(
                                    mapOf("xim", "wqsmbsur", "stkiiuxhqyud", "ryocfsfksymdd", "rq", "o", "oczvy", "b"))
                                .withFinetuneCapabilities(
                                    mapOf("vdfwatkpn", "rvkdvjsllrm", "wiqzbqjvsovmyo", "ulexxbczwtr"))
                                .withDeprecation(
                                    new ModelDeprecationInfo()
                                        .withFineTune("spkwlhzdobpxjm")
                                        .withInference("bvvnchrkcciw"))
                                .withLifecycleStatus(ModelLifecycleStatus.GENERALLY_AVAILABLE),
                            new AccountModelInner()
                                .withFormat("ygevqzntypmrbpiz")
                                .withName("r")
                                .withVersion("sdpydnfyhxdeoejz")
                                .withBaseModel(new DeploymentModel().withFormat("f").withName("aos").withVersion("xc"))
                                .withMaxCapacity(771742090)
                                .withCapabilities(
                                    mapOf("eggzfb", "hocohslkev", "ithlvmezyvshxm", "hfmvfaxkffe", "gigr", "sbbzo"))
                                .withFinetuneCapabilities(mapOf("jx", "ur", "koen", "jnspydp", "nvudwtiukb", "ou"))
                                .withDeprecation(
                                    new ModelDeprecationInfo().withFineTune("gkpocipazyxoe").withInference("kgjn"))
                                .withLifecycleStatus(ModelLifecycleStatus.PREVIEW),
                            new AccountModelInner()
                                .withFormat("lihkaetcktvfc")
                                .withName("fsnkymuctq")
                                .withVersion("fbebrjcxer")
                                .withBaseModel(
                                    new DeploymentModel()
                                        .withFormat("gzfbishcbk")
                                        .withName("jdeyeamdpha")
                                        .withVersion("lpbuxwgipwhonowk"))
                                .withMaxCapacity(69341003)
                                .withCapabilities(
                                    mapOf("bin", "kix", "iyqzrnk", "eputtmrywnuzoqf", "qnwvlrya", "qvyxlwhzlsicoho"))
                                .withFinetuneCapabilities(
                                    mapOf("mqhgyxzkonocuk", "heun", "szfkbe", "klyaxuconu", "jmwvvj", "pewr"))
                                .withDeprecation(
                                    new ModelDeprecationInfo().withFineTune("cxsenhwlrsff").withInference("pwvlqdq"))
                                .withLifecycleStatus(ModelLifecycleStatus.PREVIEW),
                            new AccountModelInner()
                                .withFormat("mpxttdbhrbnlankx")
                                .withName("skpbhenbtkcxywn")
                                .withVersion("nrs")
                                .withBaseModel(
                                    new DeploymentModel()
                                        .withFormat("vjrbirphxepcyvah")
                                        .withName("ljkyqxjvuuj")
                                        .withVersion("idokgjlj"))
                                .withMaxCapacity(831407974)
                                .withCapabilities(
                                    mapOf(
                                        "szzhbijhtxfvgxbf",
                                        "ltbgsncghkj",
                                        "ec",
                                        "mxnehmp",
                                        "gr",
                                        "godebfqkkrbmpu",
                                        "ispnqzahmgkbrp",
                                        "wflzlfbxzpuzy"))
                                .withFinetuneCapabilities(mapOf("rgvtqag", "hibnuqqkpika", "bfs", "buynhijggm"))
                                .withDeprecation(
                                    new ModelDeprecationInfo().withFineTune("butr").withInference("pnazzm"))
                                .withLifecycleStatus(ModelLifecycleStatus.GENERALLY_AVAILABLE)));
        model = BinaryData.fromObject(model).toObject(AccountModelListResult.class);
        Assertions.assertEquals("vxodpu", model.nextLink());
        Assertions.assertEquals("khrs", model.value().get(0).format());
        Assertions.assertEquals("iwkuofos", model.value().get(0).name());
        Assertions.assertEquals("hsauuimjmvxied", model.value().get(0).version());
        Assertions.assertEquals("ydagfuaxbe", model.value().get(0).baseModel().format());
        Assertions.assertEquals("iu", model.value().get(0).baseModel().name());
        Assertions.assertEquals("ktwh", model.value().get(0).baseModel().version());
        Assertions.assertEquals(334875262, model.value().get(0).maxCapacity());
        Assertions.assertEquals("wqsmbsur", model.value().get(0).capabilities().get("xim"));
        Assertions.assertEquals("rvkdvjsllrm", model.value().get(0).finetuneCapabilities().get("vdfwatkpn"));
        Assertions.assertEquals("spkwlhzdobpxjm", model.value().get(0).deprecation().fineTune());
        Assertions.assertEquals("bvvnchrkcciw", model.value().get(0).deprecation().inference());
        Assertions.assertEquals(ModelLifecycleStatus.GENERALLY_AVAILABLE, model.value().get(0).lifecycleStatus());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
