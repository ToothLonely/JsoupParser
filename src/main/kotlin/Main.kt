package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val asdfa: Elements = doc.select(".sc-14uz67c-0 .sc-2aegk7-0 .sc-2aegk7-1 .sc-2aegk7-2 ")
    for (i in asdfa) {
        println("${i.text()} \n")
    }
}
