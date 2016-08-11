package com.uestc.contest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Test
{
	String value() default "qianhaifeng";
}
