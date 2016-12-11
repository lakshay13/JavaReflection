# ReflectionProject

Reflection allows Java to inspect and dynamically call classes, methods, attributes etc at runtime. Java Reflection lets a developer write programs that do not need to know everything at compile time that is code can be written against known interfaces but actual classes can be instantiated using reflection.

In this project, there is an example which explains the following:
a) We have 3 different schools (British, Juan, Ryan)
b) We have different facilities in different schools (administration, playground, theatre)
c) EnglishFactory class uses REFLECTION to return an instance of English school.
d) SpanishFactory class uses REFLECTION to return an instance of Spanish school.
e) If the school doesnt match, then school factory exception is returned.
