package com.example.prueba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Leccion1
        //variablesyconstantes()

        //Leccion2
        //tiposDeDatos()

        //Leccion3
        //sentenciaIf()

        //Leccion4
        //sentenciaWhen()

        //Leccion5
        arrays()


    }

    private fun variablesyconstantes() {
        // variables
        var myFirstVariable = "hello chenao!"
        var myFirstNumber = 1
        println(myFirstVariable)
        myFirstVariable = "hola de nuevo chenaaaa"
        println(myFirstVariable)
        //myFirstVariable = 1
        var mySecondVariable = "suscribete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "ya te suscribiste"

        println(myFirstVariable)

        val myFirstConstant = "te ha gustado el tutorial"

        println(myFirstConstant)

        //val myFirstConstant = "probando"

    }

    private fun tiposDeDatos() {
        //String

        val myString: String = "Hola Hackerman"
        val myStrin2 = "Bienvenido a Mouredev"
        val myString3 = myString + " " + myStrin2
        println(myString3)
        // Enteros (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myFloat = 1.5f
        val myDouble = 1.8
        val myDouble2 = 3.0
        val myDouble3 = 1.0
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (Bool)

        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    // Aqui vamos a hablar de la sentencia IF
    private fun sentenciaIf() {
        val myNumber = 71
        //Operadores Condicionales
        //>
        //<
        //>=
        //<=
        //==
        //!= (Desigualdad)

        //Operadores Logicos
        //&& ( Y )
        //|| ( o )
        //! ( no )
        if ((myNumber <= 10 && myNumber >= 6) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")

        }else if (myNumber != 60) {
            println("$myNumber no es igual a 60")

        }else if (myNumber == 90) {
            println("$myNumber es igual a 90")

        }else if (myNumber == 88) {
            println("$myNumber es igual a 88")

        } else {
            // Sentencia else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }
    }

    private fun sentenciaWhen() {
        //When con String
        val country = "Peru"
        when (country) {
            "Colombia", "Mexico", "Peru", "Argentina" -> {
                println("El idioma es español")
            }"EEUU" -> {
                println("El idioma es ingles")
            } else -> {
            println("no conocemos el idioma")
        }
        }

    }

    //Aqui vamos a hablar de arrays o arreglos

    fun arrays() {

        val name = "Brais"
        val surname = "Moure"
        val company = "MoureDev"
        val age = "32"

        //Creacion de un Array

        val myArray : ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        //println(myArray)

        //Añadir Conjunto de Datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        //println(myArray)

        //Acceso a Datos

        val myCompany : String = myArray[2]

        //println(myCompany)

        //Modificacion de datos

        myArray[5] = "Suscribete y activa la campana"

        //println(myArray)

        //Eliminar Datos

        myArray.removeAt(3)

        println(myArray)

        //Recorrer Datos Imprimir o mostrar cada uno de los datos del listado

        myArray.forEach {
            println(it)
        }

        //Otras Operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        myArray.first()

        myArray.last()

        myArray.sort()






    }

}


