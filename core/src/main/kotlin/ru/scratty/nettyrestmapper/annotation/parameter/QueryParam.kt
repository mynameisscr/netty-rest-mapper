package ru.scratty.nettyrestmapper.annotation.parameter

@Target(AnnotationTarget.VALUE_PARAMETER)
@MustBeDocumented
annotation class QueryParam(
    val name: String = "",
    val required: Boolean = true,
    val default: String = ""
)