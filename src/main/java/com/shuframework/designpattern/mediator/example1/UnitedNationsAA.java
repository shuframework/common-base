package com.shuframework.designpattern.mediator;

/**
 * 联合国 安理会
 *
 * @author shuheng
 */
public class UnitedNationsAA extends UnitedNations {

    //这里的持有对象 可以改为Map<String, Country>对象
    private USA usaCountry;
    private Iraq iraqCountry;


    /**
     * 发申明
     *
     * @param message
     * @param country
     */
    @Override
    public void declare(String message, Country country) {
        if (country == usaCountry) {
            iraqCountry.getMessage(message);
        }
        if (country == iraqCountry) {
            usaCountry.getMessage(message);
        }
    }


    public USA getUsaCountry() {
        return usaCountry;
    }

    public void setUsaCountry(USA usaCountry) {
        this.usaCountry = usaCountry;
    }

    public Iraq getIraqCountry() {
        return iraqCountry;
    }

    public void setIraqCountry(Iraq iraqCountry) {
        this.iraqCountry = iraqCountry;
    }
}
