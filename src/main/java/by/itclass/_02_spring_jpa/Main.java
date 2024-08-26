package by.itclass._02_spring_jpa;

import by.itclass._02_spring_jpa.config.AppConfig;
import by.itclass._02_spring_jpa.entities.Airplane;
import by.itclass._02_spring_jpa.repositories.AirplaneRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var repository = ctx.getBean(AirplaneRepository.class);
//        var airplane = ctx.getBean("boeing736", Airplane.class);
//        System.out.println("We just created airplane:" + airplane);
//
//        repository.save(airplane);
//        System.out.println("Airplane from DB:" + airplane);
//
//        airplane.setPlace(250);
//        repository.save(airplane);
//        System.out.println("Airplane after edit:" + airplane);

//        System.out.println(repository.findByModel("Airbus 360"));
//        System.out.println(repository.findByModelAndPlace("Airbus 360", 300));
//        System.out.println(repository.findByModelOrPlace("Boeing 736", 100));
//        System.out.println(repository.findByModelLike("%rb%"));
//        repository.findAllByModelLike("%r%").forEach(System.out::println);
        repository.getAllPlanes().forEach(System.out::println);
    }
}
