package com.example.movie57.model

//{
//    "Title": "Hulk",
//    "Year": "2003",
//    "Rated": "PG-13",
//    "Released": "20 Jun 2003",
//    "Runtime": "138 min",
//    "Genre": "Action, Sci-Fi",
//    "Director": "Ang Lee",
//    "Writer": "Stan Lee, Jack Kirby, James Schamus",
//    "Actors": "Eric Bana, Jennifer Connelly, Sam Elliott",
//    "Plot": "Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.",
//    "Language": "English, Spanish",
//    "Country": "United States",
//    "Awards": "3 wins & 14 nominations",
//    "Poster": "https://m.media-amazon.com/images/M/MV5BMzQwZDg1MGEtN2E5My00ZDJlLWI4MzItM2U2MjJhYzlkNmEzXkEyXkFqcGdeQXVyNDAxNjkxNjQ@._V1_SX300.jpg",
//    "Ratings": [
//        {
//            "Source": "Internet Movie Database",
//            "Value": "5.6/10"
//        },
//        {
//            "Source": "Rotten Tomatoes",
//            "Value": "63%"
//        },
//        {
//            "Source": "Metacritic",
//            "Value": "54/100"
//        }
//    ],
//    "Metascore": "54",
//    "imdbRating": "5.6",
//    "imdbVotes": "274,029",
//    "imdbID": "tt0286716",
//    "Type": "movie",
//    "DVD": "15 Jun 2012",
//    "BoxOffice": "$132,177,234",
//    "Production": "N/A",
//    "Website": "N/A",
//    "Response": "True"
//}


data class MovieModel(
    var Title: String,
    var Year: String,
    var Genre: String,
    var Awards: String,
    var Poster: String,
    var Ratings: ArrayList<RatingModel>,
)

data class RatingModel(
    var Value: String,
    var Source: String
)