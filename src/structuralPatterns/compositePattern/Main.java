package structuralPatterns.compositePattern;

public class Main {
    public static void main(String[] args) {

        Folder src = new Folder("src");
        Folder main = new Folder("main");
        Folder java = new Folder("java");
        Folder config = new Folder("config");
        Folder controller = new Folder("controller");
        Folder resources = new Folder("resources");
        Folder staticc = new Folder("static");
        Folder templates = new Folder("templates");


        Container pom = new File("pom.xml", 4);
        Container security = new File("SecurityConfiguration.java", 2);
        Container application = new File("Application.java", 1);
        Container appConfig = new File("AppConfig.java", 1);
        Container homeController = new File("HomeController.java", 1);
        Container loginController = new File("LoginController.java", 1);
        Container appProps = new File("application.properties", 1);
        Container index = new File("index.html", 1);
        Container home = new File("home.html", 1);

        templates.addContainer(home);
        staticc.addContainer(index);
        resources.addContainer(appProps);
        resources.addContainer(staticc);
        resources.addContainer(templates);
        config.addContainer(appConfig);
        controller.addContainer(homeController);
        java.addContainer(security);
        java.addContainer(application);
        java.addContainer(config);
        java.addContainer(controller);
        main.addContainer(java);
        main.addContainer(resources);
        src.addContainer(main);
        src.addContainer(pom);

        src.getSize();

    }
}