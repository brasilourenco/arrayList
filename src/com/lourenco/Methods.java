package com.lourenco;

public class Methods {
    private String[] array;

    public Methods() {
        array = new String[10];
    }

    public String[] list(){
        return array;
    }

    public void addItem(String item){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = i + " : " + item;
                break;
            }
        }
    }

    public void  removeItemById(int index){
        array[index] = null;
    }

    public boolean emptyList(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean fullList(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
