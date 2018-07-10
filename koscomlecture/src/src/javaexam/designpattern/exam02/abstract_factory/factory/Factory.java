package javaexam.designpattern.exam02.abstract_factory.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
            // Class c = Class.forName(classname);
            // factory = (Factory)c.newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("클래스 " + classname + " 발견되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
