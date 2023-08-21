package me.enginestein.wikifinder.datamodel

data class Page(
    val extract: String?,
    val index: Int?,
    val ns: Int?,
    val pageid: Int?,
    val terms: Terms?,
    val thumbnail: Thumbnail?,
    val title: String?
)