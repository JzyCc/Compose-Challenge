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

import androidx.compose.ui.graphics.Color

data class PetStruct(
    val name: String,
    val desc: String,
    val variety: String = "",
    val hasAdopted: Boolean = false,
    val image: Int
)

val backgroundColor = Color(0xFFFF6699)

fun initData(): MutableList<PetStruct> {
    return mutableListOf(
        PetStruct(
            name = "Totoro",
            desc = "My Neighbor Totoro (Japanese: となりのトトロ, Hepburn: Tonari no Totoro) is a 1988 Japanese animated fantasy film written and directed by Hayao Miyazaki and animated by Studio Ghibli for Tokuma Shoten. The film—which stars the voice actors Noriko Hidaka, Chika Sakamoto, and Hitoshi Takagi—tells the story of a professor's two young daughters (Satsuki and Mei) and their interactions with friendly wood spirits in post-war rural Japan. The film won the Animage Anime Grand Prix prize and the Mainichi Film Award and Kinema Junpo Award for Best Film in 1988. It also received the Special Award at the Blue Ribbon Awards in the same year.",
            variety = "Cat",
            image = R.drawable.ic_longmao,
            hasAdopted = false
        ),
        PetStruct(
            name = "Tangerine",
            desc = "",
            variety = "Cat",
            image = R.drawable.ic_cat1,
            hasAdopted = false
        ),
        PetStruct(
            name = "Bigear",
            desc = "",
            variety = "Dog",
            image = R.drawable.ic_dog1,
            hasAdopted = false
        ),
        PetStruct(
            name = "Small gray",
            desc = "",
            variety = "Cat",
            image = R.drawable.ic_cat2,
            hasAdopted = false
        ),
        PetStruct(
            name = "Autumn",
            desc = "",
            variety = "Dog",
            image = R.drawable.ic_dog2,
            hasAdopted = false
        ),
        PetStruct(
            name = "OW",
            desc = "",
            variety = "Cat",
            image = R.drawable.ic_cat3,
            hasAdopted = false
        ),
        PetStruct(
            name = "Happy",
            desc = "",
            variety = "Dog",
            image = R.drawable.ic_dog3,
            hasAdopted = false
        ),
        PetStruct(
            name = "Meow",
            desc = "",
            variety = "Cat",
            image = R.drawable.ic_cat4,
            hasAdopted = false
        ),
        PetStruct(
            name = "Husky",
            desc = "",
            variety = "Dog",
            image = R.drawable.ic_dog4,
            hasAdopted = false
        )
    )
}

const val desc = "This article is about animals kept for companionship. For the use of \"pet\" as a verb, \"petting\", see Social grooming. For other uses of the abbreviations \"PET\" and \"PETS\", see PET and PETS.\n" +
    "\n" +
    "A tabby cat and a mixed Molosser dog\n" +
    "A pet, or companion animal, is an animal kept primarily for a person's company or entertainment rather than as a working animal, livestock or a laboratory animal. Popular pets are often considered to have attractive appearances, intelligence and relatable personalities, but some pets may be taken in on an altruistic basis (such as a stray animal) and accepted by the owner regardless of these characteristics.\n" +
    "\n" +
    "Two of the most popular pets are dogs and cats; the technical term for a cat lover is an ailurophile and a dog lover a cynophile. Other animals commonly kept include: rabbits; ferrets; pigs; rodents, such as gerbils, hamsters, chinchillas, rats, mice, and guinea pigs; avian pets, such as parrots, passerines and fowls; reptile pets, such as turtles, alligators, crocodiles, lizards, and snakes; aquatic pets, such as fish, freshwater and saltwater snails, amphibians like frogs and salamanders; and arthropod pets, such as tarantulas and hermit crabs. Small pets may be grouped together as pocket pets, while the equine and bovine group include the largest companion animals.\n" +
    "\n" +
    "Pets provide their owners (or \"guardians\")[1] both physical and emotional benefits. Walking a dog can provide both the human and the dog with exercise, fresh air and social interaction. Pets can give companionship to people who are living alone or elderly adults who do not have adequate social interaction with other people. There is a medically approved class of therapy animals, mostly dogs or cats, that are brought to visit confined humans, such as children in hospitals or elders in nursing homes. Pet therapy utilizes trained animals and handlers to achieve specific physical, social, cognitive or emotional goals with patients.\n" +
    "\n" +
    "\n" +
    "A Netherland Dwarf rabbit on swing\n" +
    "People most commonly get pets for companionship, to protect a home or property or because of the perceived beauty or attractiveness of the animals.[2] A 1994 Canadian study found that the most common reasons for not owning a pet were lack of ability to care for the pet when traveling (34.6%), lack of time (28.6%) and lack of suitable housing (28.3%), with dislike of pets being less common (19.6%).[2] Some scholars, ethicists and animal rights organizations have raised concerns over keeping pets because of the lack of autonomy and the objectification of non-human animals.[3]"
