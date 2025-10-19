package demo;

import com.google.common.base.Joiner;

public class App {
    public static void main(String[] args) {
        String result = Joiner.on(", ").join("Gradle", "Guava", "JUnit");
        System.out.println("Libraries joined with Guava: " + result);
    }
}
