/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.main;

import Practice.Patterns.Behavioral.ChainOfResponsibility.*;
import Practice.Patterns.Behavioral.Command.*;
import Practice.Patterns.Behavioral.Iterator.Class;
import Practice.Patterns.Behavioral.Iterator.SimpleIterator;
import Practice.Patterns.Behavioral.Mediator.Admin;
import Practice.Patterns.Behavioral.Mediator.SimpleUser;
import Practice.Patterns.Behavioral.Mediator.TextChat;
import Practice.Patterns.Behavioral.Memento.File;
import Practice.Patterns.Behavioral.Memento.Game;
import Practice.Patterns.Behavioral.Observer.Messenger;
import Practice.Patterns.Behavioral.Observer.MeteoStation;
import Practice.Patterns.Behavioral.Observer.Reciever;
import Practice.Patterns.Behavioral.ObserverExam.Alien;
import Practice.Patterns.Behavioral.ObserverExam.Moon;
import Practice.Patterns.Behavioral.State.Green;
import Practice.Patterns.Behavioral.State.TrafficLights;
import Practice.Patterns.Behavioral.Strategy.Addition;
import Practice.Patterns.Behavioral.Strategy.Application;
import Practice.Patterns.Behavioral.Strategy.Multiply;
import Practice.Patterns.Behavioral.Strategy.Subtraction;
import Practice.Patterns.Behavioral.TemplateMethod.A;
import Practice.Patterns.Behavioral.TemplateMethod.B;
import Practice.Patterns.Behavioral.TemplateMethod.C;
import Practice.Patterns.Behavioral.Visitor.*;
import Practice.Patterns.Creational.AbstractFactory.GUIFactory;
import Practice.Patterns.Creational.AbstractFactory.MacFactory;
import Practice.Patterns.Creational.AbstractFactory.WinFactory;
import Practice.Patterns.Creational.Builder.CarBuilder;
import Practice.Patterns.Creational.Builder.Director;
import Practice.Patterns.Creational.FactoryMethod.Dialog;
import Practice.Patterns.Creational.FactoryMethod.WebDialog;
import Practice.Patterns.Creational.FactoryMethod.WindowsButton;
import Practice.Patterns.Creational.FactoryMethod.WindowsDialog;
import Practice.Patterns.Creational.Prototype.Point;
import Practice.Patterns.Creational.Singleton.Singleton;
import Practice.Patterns.Behavioral.Command.Computer;
import Practice.Patterns.Structural.Bridge.Coupe;
import Practice.Patterns.Structural.Bridge.Hatchbak;
import Practice.Patterns.Structural.Bridge.Kia;
import Practice.Patterns.Structural.Bridge.Car;
import Practice.Patterns.Structural.Flyweight.ShapeFactory;
import Practice.Tasks.Task1.*;
import Practice.Tasks.Task2.Command;
import Practice.Tasks.Task2.Date;
import Practice.Tasks.Task2.HelloWorld;
import Practice.Tasks.Task2.User;
import Practice.Tasks.Task3.BaseUnitFactory;
import Practice.Tasks.Task3.Soldier;
import Practice.Tasks.Task3.UnitBase;
import Practice.Tasks.Task3.UnitFactory;
import Practice.Tasks.Task4.*;
import Practice.Tasks.Task5.Elf;
import Practice.Tasks.Task5.Orc;
import ru.svetashov.animals.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Start {
    public static void main(String[] args) {

//        PolygonalChain [] lines = new PolygonalChain[3];
//        lines[0] = new Square(new Point(1, 1), 5);
//        lines[1] = new Triangle(new Point(0, 0), new Point(7, 2), new Point(10, 10));
//        lines[2] = new Line(3, 2, -8, 99);
//
//        System.out.println(getPolygonalChain(lines));

//        List<Point> points = new ArrayList<>();
//        points.add(new Point(2, 3));
//        points.add(new Point(0, 0));
//        points.add(new Point(9, 1));
//
//        BrokenLine brokenLine = new BrokenLine(points);
//        ClosedLine closedLine = new ClosedLine(points);
//
//        System.out.println(brokenLine.equals(closedLine));

//        Checkable<String> stringCheckable = new Checkable<String>() {
//            @Override
//            public boolean check(String s) {
//                return "зачтено".equals(s) || "не зачтено".equals(s);
//            }
//        };
//
//        Student<String> st1 = new Student<>(stringCheckable,"Vasya", "зачтено", "зачтено", "не зачтено");
//
//        Action<String, Integer> action = new Action<String, Integer>() {
//            @Override
//            public Integer act(String obj) {
//                return obj.length();
//            }
//        };
//
//        List<String> list = new ArrayList<>();
//        list.add("smth");
//        list.add("sdsd");
//
//        System.out.println(convert(list, action));
//
//        System.out.println(reduce(list, (t1, t2) -> t1 + t2));

//        System.out.println(sum(2, new Adapter("37")));

//        CounterMeow counter = new CounterMeow(new Cat("Boris"));
//        mew(counter);
//        System.out.println(counter.count);

//        CatDog catDog = new CatDog("CatDog");
//        catDog.voice(2);

//        Karate karate = new Karate("Man");




//        OOP PATTERNS!!!

//        1.Structural

//        #Adapter
//        RoundHole roundHole = new RoundHole(10);
//        RoundPeg roundPeg = new RoundPeg(8);
//        SquarePeg squarePeg = new SquarePeg(100);
//        SquareToRoundAdapter squareToRoundAdapter = new SquareToRoundAdapter(squarePeg);
//
//        if(roundHole.fits(squareToRoundAdapter)){
//            System.out.println("Вошел!!! УРА!!! " + squareToRoundAdapter.getRadius());
//        } else {
//            System.out.println("Не вошел :( " + squareToRoundAdapter.getRadius());
//        }


//        #Proxy
//        Image image = new Image("Test", 10, 20);
//        ImageProxy imageProxy = new ImageProxy(image);
//
//        imageProxy.draw();
//        imageProxy.store();

//        #Decorator
//        DataSourceDecorator dataSourceDecorator = new EncryptingDecorator(new CompressionDecorator(
//                new FileDataSource("Test file")));
//
//        dataSourceDecorator.writeData("test data");
//
//        DataSource dataSource = new FileDataSource("Test file");
//
//        System.out.println(dataSource.readData());
//        System.out.println(dataSourceDecorator.readData());

//        #Composite
//        Graphic circle = new Circle(2, 3, 6);
//        Graphic square = new Square(5, 6);
//
//        CompoundGraphic compoundGraphic = new CompoundGraphic();
//        compoundGraphic.add(square);
//        compoundGraphic.add(circle);
//        compoundGraphic.draw();
//        compoundGraphic.move(2, 5);
//        compoundGraphic.draw();

//        #Facade
//        Computer computer = new Computer();
//        computer.copyUsbDrive();

//        2.Creational

//        #FactoryMethod
//        Dialog dialog = new WebDialog();
//        dialog.renderWindow();

//        #AbstractFactory
//        Application application = new Application(new MacFactory());
//        application.onClickButton();

//        #Builder
//        CarBuilder carBuilder = new CarBuilder();
//        Director director = new Director();
//        director.makeSportCar(carBuilder);
//        Car car = carBuilder.getResult();
//        System.out.println(car);

//        #Prototype
//        Point point = new Point(2, 5);
//        Point point1 = point.clone();
//        System.out.println(point1);

//        #Singleton
//        Singleton singleton = Singleton.getInstance("Test data...");
//        Singleton.getInstance("New data...");
//        System.out.println(singleton.getData());

//        #Command
//        Computer computer = new Computer();
//        User user = new User(new StartCompCommand(computer), new StopCompCommand(computer), new ResetCompCommand(computer));
//        user.startComputer();
//        user.stopComputer();
//        user.resetComputer();

//        #Iterator
//        Orc orc = new Orc("Orc1");
//        Orc orc1 = new Orc("Orc2");
//        Orc orc2 = new Orc("Orc3");
//        Orc orc3 = new Orc("Orc4");
//        ArrayList<Orc> orcs = new ArrayList<>();
//        orcs.add(orc);
//        orcs.add(orc1);
//        orcs.add(orc2);
//        orcs.add(orc3);
//        Class orcClass = new Class(orcs);
//        SimpleIterator orcsArr = new SimpleIterator(orcs);
//        while (orcsArr.hasNext()){
//            orcsArr.next();
//            System.out.println(orcsArr);
//        }

//        #Memento
//        Game game = new Game();
//        game.setGame("23", 40);
//        File file = new File(game.save());
//        game.setGame("22", 20);
//        game.load(file.getSave());
//        System.out.println(game);

//        #Observer
//        MeteoStation meteoStation = new MeteoStation(12, 750);
//
//        meteoStation.addObserver(new Reciever());
//        meteoStation.addObserver(new Messenger());
//        meteoStation.addObserver(new Reciever());
//
//        meteoStation.setMeteoStation(10, 745);
//        meteoStation.setMeteoStation(-20, 760);

//        Moon moon = new Moon();
//        moon.addObserver(new Alien());
//        moon.addObserver(new Human());
//        moon.addObserver(new Human());
//        moon.addObserver(new Alien());

//        #Mediator
//        TextChat chat = new TextChat();
//        User admin = new Admin(chat);
//        User u1 = new SimpleUser(chat);
//        User u2 = new SimpleUser(chat);
//
//        chat.setAdmin(admin);
//        chat.addUser(u1);
//        chat.addUser(u2);
//
//        u1.sendMessage("qq");
//        admin.sendMessage("Hi, man");

//        #TemplateMethod
//        C a = new A();
//        C b = new B();
//
//        a.templateMethod();
//        System.out.println("\n");
//        b.templateMethod();

//        #State
//        TrafficLights trafficLights = new TrafficLights();
//        for (int i = 0; i < 10; i++){
//            trafficLights.getColor();
//            trafficLights.nextColor();
//        }

//        #Strategy
//        Application application = new Application(new Multiply());
//        application.calculation(2, 5);
//        application.setMathOperation(new Subtraction());
//        application.calculation(2, 5);
//        application.setMathOperation(new Addition());
//        application.calculation(2, 5);

//        #Visitor
//        Visitor human = new Human();
//        Visitor bully = new Bully();
//
//        CarDetails engine = new Engine();
//        engine.accept(bully);
//        CarDetails wheel = new Wheel();
//        engine.accept(human);
//        wheel.accept(bully);

//        #ChainOfResponsibility
//        Logger logger = new SmsLogger(Level.error);
//        Logger logger1 = new EmailLogger(Level.debug);
//        Logger logger2 = new FileLogger(Level.info);
//        logger.setNextLogger(logger1);
//        logger1.setNextLogger(logger2);
//
//        logger.writeMessage("System error", Level.error);
//        logger.writeMessage("Debug...", Level.debug);
//        logger.writeMessage("Information...", Level.info);

//        #Bridge
//        Car car = new Hatchbak(new Kia());
//        car.showDetails();

//        #Flyweight
//        ShapeFactory shapeFactory = new ShapeFactory();
//        shapeFactory.getShape("circle").draw(2, 2);

//        #Task1
//        Season season = new Season(new Sheep(), new Wolf());
//        season.summer();

//        #Task2
//        User user = new User(new Date(), new HelloWorld());
//        user.getDate();
//        user.getHelloWorld();

//        #Task3
//        UnitFactory unitFactory = new UnitFactory();
//        BaseUnitFactory baseUnitFactory = new BaseUnitFactory(new UnitFactory(), new UnitFactory(), unitFactory);
//        unitFactory.upgradeUnit();
//        UnitBase unitBase = new UnitBase();
//        unitBase.addUnitsToBase(baseUnitFactory.getUnitFromFactories());
//        unitBase.moveUnits();
//        unitBase.damageUnits(20);
//        unitFactory.upgradeUnit();
//        unitBase.addUnitsToBase(baseUnitFactory.getUnitFromFactories());
//        unitBase.getUnitsHealth();

//        #Task4
//        Department dekanat = new Dekanat();
//        Department pfu = new PFU();
//        Department safety = new SafetyDepartment();
//        Department resourceDep = new ResourcesDepartment();
//        Department rectorat = new Rectorat();
//
//        dekanat.setNext(pfu);
//        pfu.setNext(safety);
//        safety.setNext(resourceDep);
//        resourceDep.setNext(rectorat);
//
//        Statement statement = new Statement("abcdef");
//        dekanat.acceptStatement(statement);

//        #Task5
//        Elf elf = new Elf();
//        Orc orc = new Orc();
//        elf.createCloseUnit().hit();
//        orc.createDistantUnit().shoot();

    }

    public static <T> T reduce(List<T> list, Returning<T> type){
        if (list == null || list.size() == 0) return null;
        T res = list.get(0);
        for (int i = 1; i < list.size(); i++){
            res = type.ret(res, list.get(i));
        }
        return res;
    }

    public static <T, Q> List<Q> convert(List<T> list, Action<T, Q> act){
        List<Q> res = new ArrayList<>();
        for (T obj:list) res.add(act.act(obj));
        return res;
    }

//    public static PolygonalChain getPolygonalChain(PolygonalChain...polygonalChains){
//        List<Point> points = new ArrayList<>();
//        for (PolygonalChain polygonalChain : polygonalChains){
//            points.addAll(polygonalChain.getBrokenLine().getPoints());
//        }
//        return new BrokenLine(points);
//    }

    public static double powStr(String [] args){
        if (args.length != 2) throw new IllegalArgumentException("You must input 2 args");
        return pow(parseInt(args[0]), parseInt(args[1]));
    }

    public static void mew(Meowable...meowables){
        for (Meowable meowable : meowables){
            meowable.meow();
        }
    }

    public static double sum(Number...number){
        double res = 0;
        for (Number num : number){
            res += num.doubleValue();
        }
        return res;
    }

//    public static double sumArea(Figure...figures){
//        double res = 0;
//        for (Figure figure : figures){
//            res += figure.getArea();
//        }
//        return res;
//    }
//
//    public static int sumLength(Lengthable...lengthables){
//        int res = 0;
//        for(Lengthable lengthable : lengthables){
//            res += lengthable.length();
//        }
//        return res;
//    }
//
//    public static void singBirds(Bird...birds){
//        for (Bird bird : birds){
//            bird.sing();
//        }
//    }
}
