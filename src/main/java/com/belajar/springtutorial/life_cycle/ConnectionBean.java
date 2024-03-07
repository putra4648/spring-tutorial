package com.belajar.springtutorial.life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConnectionBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("Bean sudah dihancurkan");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Bean sudah siap digunakan");
    }

}
