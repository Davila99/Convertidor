
//Declaraciones de Variables

var cantidadConvertir :Double=0.00;
var opcionDeConversion : Int =0;
var resultadoConversion : Double=0.00;

 //Declaraciones de Funciones

fun convertidorMMaCM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 10;
    println("Tu resultado de la conversion de mm -> cm es de: $resultadoConversion Centimetros" );
}
fun convertidorMMaMT(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 1000;
    println("Tu resultado de la conversion de mm -> mt es de: $resultadoConversion Metros" );
}
fun convertidorMMaKM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 1000000;
    println("Tu resultado de la conversion de mm -> km es de: $resultadoConversion Kilometros" );
}
fun convertidorCMaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 10;
    println("Tu resultado de la conversion de cm -> mm es de: $resultadoConversion Milimetros" );
}
fun convertidorMTaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 1000;
    println("Tu resultado de la conversion de mt -> mm es de: $resultadoConversion Milimetros" );
}
fun convertidorKMaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 1000000;
    println("Tu resultado de la conversion de km -> mm es de: $resultadoConversion Milimetros" );
}

fun main(){
    var salida:String="";

    do {
    principal();

        println("Desea Continuar S/N");
        salida = readLine().toString();
    }while (salida=="S" ||salida =="s")

}

fun PedirDatosDeConversion(){
    println("Ingrese la cantidad que desea convertir");
    cantidadConvertir = readLine()!!.toDouble();
}

fun principal(){
    println("----------Convertidor de Unidades-------");
    println(" 1. mm -> cm\n 2. mm -> mt\n 3. mm -> km\n 4. cm -> mm\n 5. mt -> mm\n 6. km -> mm");
    println();
    println("Eliga la Opcion a Convertir");
    opcionDeConversion = readLine()!!.toInt();

    when(opcionDeConversion){
        1->convertidorMMaCM();
        2->convertidorMMaMT();
        3->convertidorMMaKM();
        4->convertidorCMaMM();
        5->convertidorMTaMM();
        6->convertidorKMaMM();

        else->{
            println("Opcion Incorrecta");
        }
    }

}