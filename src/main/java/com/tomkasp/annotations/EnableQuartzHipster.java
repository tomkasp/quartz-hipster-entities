package com.tomkasp.annotations;

import com.tomkasp.config.QuartzHipsterEntities;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({QuartzHipsterEntities.class})
public @interface EnableQuartzHipster {
}
