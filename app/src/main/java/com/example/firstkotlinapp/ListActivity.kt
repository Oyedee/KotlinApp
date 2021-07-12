package com.example.firstkotlinapp

class ListActivity {

    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        println("List: $numbers")
        println("Size: ${numbers.size}")

        // Access elements of the list
        println("First element: ${numbers[0]}")
        println("Second element: ${numbers[1]}")
        println("Last index: ${numbers.size - 1}")
        println("Last element: ${numbers[numbers.size - 1]}")
        println("First: ${numbers.first()}")
        println("Last: ${numbers.last()}")

        // Use the contains() method
        println("Contains 4? ${numbers.contains(4)}")
        println("Contains 7? ${numbers.contains(7)}")

        //lists are read-only
        val colors = listOf<String>("orange", "red", "blue", "green")

        println("Reversed List: ${colors.reversed()}")
        println("Sorted list: ${colors.sorted()}")

        /**
         * Mutable Lists
         * Add elements to a list
         * Remove elements from a list
         * check if a list is empty
         * */
        val entrees = mutableListOf<String>()
        println("Entrees: $entrees")

        // Add individual items using add()
        println("Add noodles: ${entrees.add("noodles")}")
        println("Entrees: $entrees")
        println("Add spaghetti: ${entrees.add("spaghetti")}")
        println("Entrees: $entrees")

        // Add a list of items using addAll()
        val moreItems = listOf("ravioli", "lasagna", "fettuccine")
        println("Add list: ${entrees.addAll(moreItems)}")
        println("Entrees: $entrees")

        // Remove an item using remove()
        println("Remove spaghetti: ${entrees.remove("spaghetti")}")
        println("Entrees: $entrees")
        println("Remove item that doesn't exist: ${entrees.remove("rice")}")
        println("Entrees: $entrees")

        // Remove an item using removeAt() with an index
        println("Remove first element: ${entrees.removeAt(0)}")
        println("Entrees: $entrees")

        // Clear out the list
        entrees.clear()
        println("Entrees: $entrees")

        // Check if the list is empty
        println("Empty? ${entrees.isEmpty()}")
    }
}