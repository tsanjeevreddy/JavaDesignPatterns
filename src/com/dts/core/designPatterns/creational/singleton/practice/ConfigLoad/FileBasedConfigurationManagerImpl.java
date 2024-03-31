package com.dts.core.designPatterns.creational.singleton.practice.ConfigLoad;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManager fbcm = null;

    private FileBasedConfigurationManagerImpl(){
        // default conctructor
    }

    @Override
    public String getConfiguration(String key) {
        return fbcm.getProperties().getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = fbcm.getProperties().getProperty(key);
        if(value != null) {
            return fbcm.convert(value, type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        fbcm.getProperties().setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        fbcm.getProperties().setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        fbcm.getProperties().remove(key);
    }

    @Override
    public void clear() {
        fbcm.getProperties().clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if(fbcm == null) {
            synchronized(FileBasedConfigurationManagerImpl.class) {
                if(fbcm == null) {
                    fbcm = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return fbcm;
    }

    public static void resetInstance() {
        if(fbcm != null) {
            fbcm = null;
        }
    }

}
