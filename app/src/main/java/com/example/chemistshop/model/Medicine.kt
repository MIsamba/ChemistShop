package com.example.chemistshop.model

class Medicine {

    var id =""
    var name =""
    var decription = ""
    var imagepath = ""

    constructor(id: String, name: String, decription: String, imagepath: String) {
        this.id = id
        this.name = name
        this.decription = decription
        this.imagepath = imagepath
    }
}