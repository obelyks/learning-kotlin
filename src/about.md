Jetbrains Kotlin: ostrov u st.petersburg/petrohrad/leningrad

modernejsi java.
moznosti scaly, ale ta se kompilovala pomalu:cheli to mit rychle jako kompilaci javy
lepsi nez java, ale uplne interoperabilni
--jde zkompilovat i do javascriptu

syntaxe
 * jako pascal,scala: datovy typ az po nazvu oddeleny dvojteckou
 * stredniky volitelne
 * tridy +metody(member functions)
 * navic procedurani programovani

 * vsechny nulovatelne objeky deklarovane s ? na konci
    * ?. safe navigation operator
    * ?: (null coalescing operator), také nazývaný „Elvis operator“ 
        * Jako "Elvis operátor" je označována dvou-argumentová forma operátoru ?:, pro ověřování hodnot null: Vrátí první operand (dokonce i bez vyhodnocování druhého), leda by první byl null, to pak tedy vrátí druhý operand. 
        * Oproti ternárnímu operátoru v Elvis-operátoru není druhý operand, jen první a třetí: První dva splývají do jednoho
 
 * val vs var  // val pouzivat porad jenom kdyz je potreba tak var!
 * Int, Double, String
 
 ---
 
 
kotlin nema:
 * checked exception
 * primitivni typy
 * statika??
 * neprivatni atributy
 * wildcards u generik
 * ternarni operator?
 
kotlin ma navic:
 * lambda vyrazy/ inline fce
 * extension fce???
 * null safety  konec NPE???
 * smart casts TODO
 * retezcove sablony
 * vlastnosti (get/set)
 * primary kontruktory
 * 1st class delegation
 * auto odvozovani dat.typu ????TODO
 * Singletons
 * Declaration site variances/ type projections (generika)
 * raange expressions
 * operator overload
 * companion object
 * Data classes
 * readonly+mutable kolekce oddelene api
 * couroutines
 * ....
 
 
 
 