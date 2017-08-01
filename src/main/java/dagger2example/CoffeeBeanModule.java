package dagger2example;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class CoffeeBeanModule {

    @Binds
    abstract CoffeeBean provideCoffeeBean(EthiopiaBean ethiopiaBean);

    @Binds
    @IntoMap
    @StringKey("ethiopia")
    abstract CoffeeBean provideEthiopiaBean(EthiopiaBean ethiopiaBean);


    @Binds
    @IntoMap
    @StringKey("guatemala")
    abstract CoffeeBean provideGuatemalaBean(GuatemalaBean guatemalaBean);
    // 타입에 맞춰 생성될 객체가 명확할 때는 GuatemalaBean 처럼 @Provide method 를 제공하지 않아도 @Inject annotation으로도 bind 가능.

}
