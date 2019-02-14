package k018_Generics

//covariant   upper
//contravariant lower
//typename==generika
//classname...


//--Declaration-site variance can be thought of as declaration of use-site variance once and for all the use-sites.
class Consumer<in T> { fun consume(t: T) {  } }
fun charSequencesConsumer() : Consumer<CharSequence>() {
    val cons =
    return cons
}

//{
//    //TODO("reason")
//    //return "reaosn"
//    println("new")
//    val result = Consumer<String>()
//    return result as Consumer<CharSequence>
//    //https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX8J2l55TrZk6?si=r2OT7pd8RnGPukegzdiyXg
//    //<iframe src="https://open.spotify.com/embed/user/spotify/playlist/37i9dQZF1DX8J2l55TrZk6" width="300" height="380" frameborder="0" allowtransparency="true" allow="encrypted-media"></iframe>
//    //spotify:user:spotify:playlist:37i9dQZF1DX8J2l55TrZk6
//}
val stringConsumer : Consumer<String> = charSequenceConsumer() // OK since in-projection
val anyConsumer : Consumer<Any> = charSequenceConsumer() // Error, Any cannot be passed
val outConsumer : Consumer<out CharSequence> = ... // Error, T is `in`-parameter
//Widespread examples of declaration-site variance are  List<out T> , which is immutable so that  T only appears as
//the return value type, and  Comparator<in T> , which only receives  T as argument





//Section 18.2: Use-site variance
//Use-site variance is similar to Java wildcards:
//Out-projection:
val takeList : MutableList<out SomeType> = ... // Java: List<? extends SomeType>
val takenValue : SomeType = takeList[0] // OK, since upper bound is SomeType
takeList.add(takenValue) // Error, lower bound for generic is not specified
//In-projection:
val putList : MutableList<in SomeType> = ... // Java: List<? super SomeType>
val valueToPut : SomeType = ...
putList.add(valueToPut) // OK, since lower bound is SomeType
putList[0] // This expression has type Any, since no upper bound is specified
//Star-projection
val starList : MutableList<*> = ... // Java: List<?>
starList[0] // This expression has type Any, since no upper bound is specified
starList.add(someValue) // Error, lower bound for generic is not specified