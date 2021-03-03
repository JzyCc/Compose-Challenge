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

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }

    @Composable
    fun MyApp() {
        Surface(color = backgroundColor) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(58.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Pet adoption",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier.alpha(1f)
                    )
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                ) {
                    Image(
                        painterResource(id = R.drawable.ic_logo),
                        contentDescription = null,
                        modifier = Modifier
                            .width(160.dp)
                            .height(160.dp)
                    )
                }

                adoptList()
            }
        }
    }

    @Composable
    fun adoptList() {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
                )
        ) {
            LazyColumn(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp)
                    .background(
                        Color.White
                    ),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                val data = initData()

                data.forEachIndexed { index, petStruct ->
                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .padding(
                                    start = 12.dp,
                                    end = 12.dp
                                )
                        ) {

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(12.dp)
                            ) {
                                Image(
                                    painterResource(id = petStruct.image),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(88.dp)
                                        .height(88.dp)
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = petStruct.name,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp
                                )

                                Box(
                                    contentAlignment = Alignment.CenterEnd,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Button(
                                        onClick = {
                                            DetailActivity.start(this@MainActivity, petStruct)
                                        }
                                    ) {
                                        Text(
                                            text = "more"
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
