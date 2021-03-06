package com.example.myapplication123


import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.Socket
import java.util.logging.Handler
import java.io.PrintWriter


class ClientSo(host: String, port: Int) : Socket(host, port) {
    var reader = BufferedReader(InputStreamReader(inputStream))
    private lateinit var handler: Handler
    var writer : PrintWriter? = null
    var text = ""




    fun setHandler(handler: Handler) {
        this.handler = handler
    }

    fun sendMessage(string: String) {
        writer?.println(string)
    }

    fun run(): String? {
        val line = reader.readLine()
        val conn= super.isConnected()
        if(line!= null)
            return line
        else
            return "fail"
    }
}