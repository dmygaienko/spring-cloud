package com.mygaienko;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by enda1n on 26.10.2017.
 */
@EnableRedisHttpSession
public class SessionConfig extends AbstractHttpSessionApplicationInitializer {

}
