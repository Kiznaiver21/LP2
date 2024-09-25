// Local-Variable Type Inference

import java.util.ArrayList;
import java.util.List;

public class ExemploVar {
    public static void main(String[] args) {
        // Exemplo 1: Inferência de tipo com var para uma lista de inteiros
        var listaDeInteiros = new ArrayList<Integer>(); 
        listaDeInteiros.add(10);
        listaDeInteiros.add(20);
        System.out.println("Lista de Inteiros: " + listaDeInteiros);

        // Exemplo 2: Inferência de tipo com var para uma String
        var saudacao = "Olá, Mundo!";
        System.out.println(saudacao);

        // Exemplo 3: Inferência de tipo com var para um loop
        var listaDeNomes = List.of("João", "Maria", "Ana");
        for (var nome : listaDeNomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
