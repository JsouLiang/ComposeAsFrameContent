package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp

class MyComposeView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AbstractComposeView(context, attrs) {

    @Composable
    override fun Content() {
        var list = genItems(100)

        LazyColumn(modifier = Modifier.fillMaxHeight()) {
            itemsIndexed(items = list, key = {index, item ->  item.id}) { index, item ->
                Box(modifier = Modifier.fillMaxWidth().height(50.dp).background(Color.Red)) {

                }
                Box(modifier = Modifier.fillMaxWidth().height(10.dp).background(Color.White)) {

                }

            }
        }

    }
}


data class Item(
    var id: Int
)

fun genItems(count: Int): List<Item> {
    var list = ArrayList<Item>()
    for (index in 0..count) {
        var item = Item(index)
        list.add(item)
    }
    return list
}
