/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas.ssatr.oncea.andreea;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import mas.ssatr.oncea.andreea.model.TPNSchema;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class ModelFactory {

    private static final Type TPNMODEL_TYPE = new TypeToken<List<TPNSchema>>() {}.getType();

    public static Model loadTpnModelFromJsonFile(String modelFile) throws Exception {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(modelFile));
        TPNSchema tpnModel = gson.fromJson(reader, TPNSchema.class);
        return tpnModel;
    }

}
