package com.practice23generics.model;

public class Multi
{
    public static  <T> String ShowTypeData(T object)
    {
        return "Data type is: "+object.getClass()+"\n Parameter name"+object.getClass()+"\n Element valor: "+object;

    }
}
