
//Declaraciones de Variables
var salida:String="";
var cantidadConvertir :Double=0.00;
var opcionDeConversion : Int =0;
var resultadoConversion : Double=0.00;
//declaraciones  de variables como constantes
val MilemetrosACemtimetros:String="mm -> cm";
val MilemetrosAMetros:String="mm -> mt";
val MilemetrosAkilometros:String="mm -> km";
val centimetrosAMilimetros:String="mm -> km";
val metrosAMilimetros:String="mm -> km";
val kilometrosAMilimetros:String="mm -> km";

//Declaraciones de Funciones

fun convertidorMMaCM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 10;
    imprimirResultados(MilemetrosACemtimetros);

}
fun convertidorMMaMT(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 1000;
    imprimirResultados(MilemetrosAMetros);

}
fun convertidorMMaKM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir / 1000000;
    imprimirResultados(MilemetrosAkilometros);

}
fun convertidorCMaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 10;
    imprimirResultados(centimetrosAMilimetros);

}
fun convertidorMTaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 1000;
    imprimirResultados(metrosAMilimetros);

}
fun convertidorKMaMM(){
    PedirDatosDeConversion();
    resultadoConversion = cantidadConvertir * 1000000;
    imprimirResultados(kilometrosAMilimetros);

}

fun PedirDatosDeConversion(){
    println("Ingrese la cantidad que desea convertir");
    cantidadConvertir = readLine()!!.toDouble();
}

fun inputcontinuar(){
    println("Desea Continuar S/N");
    salida = readLine().toString();
}

fun opcionAConvertir(){
    println("Eliga la Opcion a Convertir");
    opcionDeConversion = readLine()!!.toInt();
}

fun outputContinuar() :Boolean{
    return  salida=="S" ||salida =="s";
}

fun imprimirResultados(unidadMedida :String){
    println("El resultado de $cantidadConvertir en la conversion de $unidadMedida es de: $resultadoConversion Centimetros" );
}

fun main(){
    do {
        principal();
        inputcontinuar()
    }while (outputContinuar())
}

fun principal(){
    println("----------Convertidor de Unidades-------");
    println(" 1. $MilemetrosACemtimetros\n 2. $MilemetrosAMetros\n 3. $MilemetrosAkilometros\n 4. $centimetrosAMilimetros\n 5. $metrosAMilimetros\n 6. $kilometrosAMilimetros");
    println();
    opcionAConvertir();
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