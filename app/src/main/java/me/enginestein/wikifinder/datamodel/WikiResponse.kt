package me.enginestein.wikifinder.datamodel

data class WikiResponse(
    val batchcomplete: Boolean?,
    val `continue`: Continue?,
    val query: Query?
)