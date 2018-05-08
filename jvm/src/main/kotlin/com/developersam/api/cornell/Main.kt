package com.developersam.api.cornell

import khttp.get

fun main(args: Array<String>) {
    get(url = "https://classes.cornell.edu/api/2.0/config/rosters.json").raw
}