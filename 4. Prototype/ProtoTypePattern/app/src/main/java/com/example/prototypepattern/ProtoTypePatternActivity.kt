package com.example.prototypepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ProtoTypePatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val protoTypePattern1 = ProtoTypePattern()
        val protoTypePattern2 = protoTypePattern1.clone()

    }
}

class ProtoTypePattern : Cloneable {

    public override fun clone(): ProtoTypePattern {
        print("cloneProtoTypePattern")
        //todo
        return super.clone() as ProtoTypePattern
    }
}