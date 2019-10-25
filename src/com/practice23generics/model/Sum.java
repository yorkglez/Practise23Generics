package com.practice23generics.model;

public class Sum<T>
{
    T myObject;

    Sum(T myObject)
    {
        this.myObject = myObject;
    }

    public T getMyObject()
    {
        return this.myObject;
    }

    public  <N1 extends Number,N2 extends Number> T NumberSum(N1 obj1, N2 obj2)
    {
        Double result = 0.0;
        result = obj1.doubleValue() + obj2.doubleValue();
        return (T) result;
    }

}
