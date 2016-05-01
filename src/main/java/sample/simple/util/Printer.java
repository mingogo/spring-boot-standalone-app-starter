package sample.simple.util;

@FunctionalInterface
public interface Printer<String> {
     void print(String t);
}