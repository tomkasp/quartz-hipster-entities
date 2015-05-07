package com.tomkasp.annotations;

import com.tomkasp.config.QuartzConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({QuartzConfig.class})
public @interface EnableQuartz {
}
