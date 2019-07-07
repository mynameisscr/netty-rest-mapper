package ru.scratty.nettyrestmapper.annotation

@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class GetMapping(
    val path: String = ""
)