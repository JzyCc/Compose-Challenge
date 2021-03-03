/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    companion object {
        fun start(context: Context, petStruct: PetStruct) {
            context.startActivity(
                Intent(context, DetailActivity::class.java).apply {
                    putExtra("name", petStruct.name)
                    putExtra("image", petStruct.image)
                    putExtra("desc", petStruct.desc)
                }
            )
        }
    }

    private lateinit var petStruct: PetStruct
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        petStruct = PetStruct(
            name = intent.getStringExtra("name") ?: "",
            image = intent.getIntExtra("image", 0),
            desc = intent.getStringExtra("desc") ?: ""
        )
        setContent {
            MyTheme {
                detailPage()
            }
        }
    }

    @Composable
    fun detailPage() {
        Surface(color = backgroundColor) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {

                Image(
                    painter = painterResource(petStruct.image),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(modifier = Modifier.padding(horizontal = 12.dp)) {
                    Text(
                        text = petStruct.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White
                    )

                    val status = remember { mutableStateOf(false) }

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                        Button(
                            onClick = {
                                Toast.makeText(
                                    this@DetailActivity,
                                    "Adopt Successed",
                                    Toast.LENGTH_SHORT
                                ).show()

                                status.value = !status.value
                            },
                            enabled = !status.value
                        ) {
                            Text(
                                text = if (status.value) {
                                    "adopted"
                                } else {
                                    "adopt"
                                }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                LazyColumn() {
                    item {
                        Text(
                            text = desc,
                            color = Color.White,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(horizontal = 12.dp)
                        )
                    }
                }
            }
        }
    }
}
