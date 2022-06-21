package com.arvato.yeejia.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CourseNoOne {

    public void startWork(String workerTypeName, Object workerTarget){

        try{
            Class<?> workerType = Class.forName(workerTypeName);
            System.out.println(workerType);
            Class<?> targetType = workerTarget.getClass();
            System.out.println(targetType);

            Constructor c = workerType.getConstructor(targetType);
            Object worker = c.newInstance(workerTarget);
            Method doWork = workerType.getMethod("doWork");
            System.out.println(doWork);

        }catch(Exception e){

        }

    }
    
    public String process(int id) {
    	/**
    	 * processes
    	 */
    	return "Test " + id;
    }
    
    
}
