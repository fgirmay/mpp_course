package prob14;

import java.util.Optional;

public class MySingletonLazzy {

    private static MySingletonLazzy instance = null;
    private MySingletonLazzy(){}

    public static MySingletonLazzy initializeInstance(){
        instance = new MySingletonLazzy();
        return instance;
    }

    public static  MySingletonLazzy getInstanceNew(){
        return Optional.ofNullable(instance).orElseGet(() -> initializeInstance());
    }
}
