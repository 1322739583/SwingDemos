package utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;

public class JsonFormater {
    /**
     * json 美化
     * @param json
     * @return
     */
    public static String prettyJson(String json){

        if(Strings.isNullOrEmpty(json)){
            return json;
        }
        JSONObject jsonObject = null;
        try {
            jsonObject = JSONObject.parseObject(json);
        }catch (Exception e){
            return json;
        }
        return JSONObject.toJSONString(jsonObject,true);
    }
}
