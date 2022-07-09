package com.hadiyarajesh.mylibrary

import android.content.Context
import android.widget.Toast

fun createToast(context: Context, msg: String) {
    Toast.makeText(context, "$msg from MyLibrary", Toast.LENGTH_SHORT).show()
}
