/*
8. Escriba una aplicación que determine los triángulos rectos cuyos lados sean todos valores enteros, tal que el
mayor valor posible sea 500. A los lados de tales triángulos se les llama triples de Pitágoras. El programa
debe mostrar al usuario todos los triples de Pitágoras hallados. Use un ciclo triplemente anidado para
generar y probar todas las combinaciones posibles a fin de mostrar las que cumplan con lo exigido. Este tipo
de soluciones se conocen como de “fuerza bruta”, y aunque los algoritmos, y por ende los programas
correspondientes, deben ser siempre eficientes, en algunas ocasiones no es posible usar más que algoritmos
de fuerza bruta.
*/

class Ejercicio8{
    public static void main(String[] args){

        int max = 500;
        for (int i=1; i<=500;i++){
            for (int j=1;j<=500;j++){
                for (int k=0; k<=500; k++){
                    if(Math.pow(i,2)+Math.pow(j,2)== Math.pow(k,2)){
                        System.out.println(i+" "+ j+" "+k);
                    }
                }
            }
        }

    }
}