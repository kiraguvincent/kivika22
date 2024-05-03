package com.example.Firebasestorage

import com.google.firebase.firestore.Exclude


data class Courses(
    @Exclude var courseID: String? = "",
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = ""
)
