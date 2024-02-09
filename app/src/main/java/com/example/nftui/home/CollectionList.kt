package com.example.nftui.home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nftui.models.collections

@Composable
fun CollectionList(){
    LazyRow(
        modifier = Modifier.padding( bottom = 30.dp, top = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(collections){ collection ->
            CollectionCard(title = collection.title, image = collection.image, likes = collection.likes)
        }
    }
}

@Preview
@Composable
fun CollectionListPreview(){
    CollectionList()
}