package com.practice23generics.app;
import com.practice23generics.model.Multi;
import com.practice23generics.model.Subtrac;
import com.practice23generics.model.Sum;
public class GenericsApp
{
    public static void main(String[] args)
    {
        //Objects declaration
        Sum<Integer> myObj = new Sum<>(15);
        Sum<String> myObjString = new Sum<>("Test");
        Subtrac<Integer, Integer> myObjectSub = new Subtrac<>(5,5);
        Subtrac<Integer, Integer> myObjectSub2 = new Subtrac<Integer, Integer>();

        System.out.println("Objeto de miObjeto:"+myObj.getMyObject());
        System.out.println("Objeto de miObjetoString:"+myObjString.getMyObject());

        myObjectSub2.setKey(100);
        myObjectSub2.setValue(200);

        System.out.println("Object of myObject1 "+myObjectSub.ToString());
        System.out.println("Object of myObject2 "+myObjectSub2.ToString());

        System.out.println(Multi.ShowTypeData(10));
        System.out.println(Multi.ShowTypeData("hello"));
        System.out.println(Multi.ShowTypeData(10.0));

        System.out.println("10 + 10 = " + myObj.NumberSum(10,10));
    }
}
