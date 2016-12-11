package com.lakshay.reflection;

import com.lakshay.reflection.facilities.Administration;
import com.lakshay.reflection.facilities.Playground;
import com.lakshay.reflection.facilities.Theatre;
import com.lakshay.reflection.school.JuanSchool;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lakshay on 11/12/16.
 */
public class SpanishFactory {

    /**
     * Builds a spanish school.
     *
     * @param clazz reference type for any of the spanish school to be built
     * @return a new school of type clazz
     * @throws SchoolFactoryException wrapping any checked exception thrown during the schools formation.
     */
    public Object build(Class<?> clazz) {
        /**
         * Identify the type of school
         * get the corresponding constructor
         * get the methods based on administration, playground etc
         * invoke the corresponding methods
         * return the object
         */
        Object obj = null;
        try {
            if(clazz.equals(JuanSchool.class)) {

                Constructor constructor = clazz.getConstructor();
                obj = constructor.newInstance();
                Class juanSchoolClass = JuanSchool.class;

                Method method = juanSchoolClass.getMethod("setAdmin1", new Class[]{Administration.class});
                method.invoke(obj, new Administration());

                method = juanSchoolClass.getMethod("setPlayground1", new Class[]{Playground.class});
                method.invoke(obj, new Playground());

                method = juanSchoolClass.getMethod("setTheatre1", new Class[]{Theatre.class});
                method.invoke(obj, new Theatre());

                method = juanSchoolClass.getMethod("setTheatre2", new Class[]{Theatre.class});
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
