package com.iris.guia04_dm;


public class ServiceLocator {
    private static ServiceLocator instance = null;
    private static RepositorioTrabajador mainRepositoryinstance = null;

    private ServiceLocator() {}

    public static ServiceLocator getInstance() {
        if (instance == null) {
            synchronized(ServiceLocator.class) {
                instance = new ServiceLocator();
            }
        }
        return instance;
    }

    public RepositorioTrabajador getDBSource() {
        if (mainRepositoryinstance == null) {
            synchronized(ServiceLocator.class) {
                mainRepositoryinstance = new RepositorioTrabajador();
            }
        }
        return mainRepositoryinstance;
    }
}

