package config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:${typeProperties}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("timeout")
    int timeout();
}
