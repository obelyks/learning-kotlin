###### Various
* !! operator
* varName?  nullable
* fun double(x: Int) = x * 2
* val s = "i = $num"
* equals je ==
* identity je === (3)!
* neco ?: dalsi 
* TODO primo v jazyku, inline fce
     ```
     fun elements() {TODO("not implemented") 
    ```
* kotlin deklarace i v java kontruktech
    ```
    catch(npe: KotlinNullPointerException ){ //kotlin naopak
    ```
*
 
###### Arrays  
* arrayOf/  xxxArrayOf(el1,el2,...)
* CLOSURE... x=Array(3) { i -> i * 2 }
* for(s in asc)

###### Funkce
* :: reference funkce
* receiver... neco kam jd epridat fci treba class..TODO poradneji
    * extension vs. member function
* alist.map{it>0} ...

###### nevim
* when == ..null check+equals
    * ```when expr { 
            val->expr
            in vals->exp
            !in 0..10->e3//range 
            is String->e4//
            else->e5
          }
      ```
* if else jako v jave
* enum class name { EnumValue1,V2}

###### loops
* for (x in iterable.withIndex())
* list.forEach{print(it)} //jenom 1 param automaticky jmeno "it"
* repeat(10){it...}

###### loops
* je to spis podminka (n == 0) musi byt (n == 0L) jestlije n long!!!
* KOTLIN nerozsiruj etypy jako java!!