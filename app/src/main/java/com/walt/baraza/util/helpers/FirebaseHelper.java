package com.walt.baraza.util.helpers;

public class FirebaseHelper {


    public ArrayList<BaseModel> getAllModels(String modelName) {
        ArrayList<BaseModel> models = new ArrayList();
        switch (modelName) {
            case "User":
                break;
            case "Dispute":
                break;
            case "Event":
                break;
            case "Category":
                break;
        }
        return models;
    }

    public BaseModel getModel() {
        return null;
    }
}
