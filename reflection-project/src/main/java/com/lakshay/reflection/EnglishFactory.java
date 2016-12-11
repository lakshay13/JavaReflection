package com.lakshay.reflection;

import com.lakshay.reflection.facilities.Administration;
import com.lakshay.reflection.facilities.Playground;
import com.lakshay.reflection.facilities.Theatre;
import com.lakshay.reflection.school.BritishSchool;
import com.lakshay.reflection.school.RyanSchool;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lakshay on 11/12/16.
 */
public class EnglishFactory {

    /**
     * Builds a english school class.
     *
     * @param clazz reference type for any of the english school to be built
     * @return a new school of type clazz
     * @throws SchoolFactoryException wrapping any checked exception thrown during the schools formation.
     */
    public Object build(Class<?> clazz) {
        /**
         * Identify the type of Toyota Car
         * get the corresponding constructor
         * get the methods based on engine, wheel etc
         * invoke the corresponding methods
         * return the object
         */
        Object obj = null;
        try {
            if(clazz.equals(RyanSchool.class)) {

                Constructor constructor = clazz.getConstructor();
                obj = constructor.newInstance();
                Class ryanSchool = RyanSchool.class;

                Method method = ryanSchool.getMethod("setAdmin1", new Class[]{Administration.class});
                method.invoke(obj, new Administration());

                method = ryanSchool.getMethod("setAdmin2", new Class[]{Administration.class});
                method.invoke(obj, new Administration());

                method = ryanSchool.getMethod("setPlayground1", new Class[]{Playground.class});
                method.invoke(obj, new Playground());

                method = ryanSchool.getMethod("setPlayground2", new Class[]{Playground.class});
                method.invoke(obj, new Playground());

                method = ryanSchool.getMethod("setTheatre", new Class[]{Theatre.class});
                method.invoke(obj, new Theatre());


            } else if (clazz.equals(BritishSchool.class)){
                Constructor constructor = clazz.getConstructor();
                obj = constructor.newInstance();
                Class britishSchoolClass = BritishSchool.class;

                Method method = britishSchoolClass.getMethod("setAdmin1", new Class[]{Administration.class});
                method.invoke(obj, new Administration());

                method = britishSchoolClass.getMethod("setPlayground1", new Class[]{Playground.class});
                method.invoke(obj, new Playground());

                method = britishSchoolClass.getMethod("setTheatre", new Class[]{Theatre.class});
                method.invoke(obj, new Theatre());

            }  else {
                // when none of the cases match then throw SchoolFactoryException
                Throwable cause = null;
                throw new SchoolFactoryException("Not supported", cause);
            }
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
