package br.com.estacio.pratica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main ( String args [ ] ) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> antiga;
        Scanner entrada = new Scanner ( System.in );
        int num , tam_lista , conta = 1;
        String aux;
        System.out.println ( "Entre o numero de elementos da lista.");
        aux = entrada.next();
        if ( !validarEntrada ( aux ) )
            System.exit ( -1 );
        else {
            System.out.println ( "Entre com os elementos.");
            tam_lista = Integer.parseInt ( aux );
            do {
                aux = entrada.next();
                if ( aux.chars ( ).allMatch ( Character::isDigit ) ) {
                    conta++;
                    num = Integer.parseInt ( aux );
                    lista.add ( num );
                } else
                    System.out.println ( "Entrada ignorada." );
            } while ( conta <= tam_lista );
        }
        System.out.println ( "A lista eh: " + lista );
        antiga = ( ArrayList ) lista.clone();
        do {
            System.out.println ( "Escolha a operacao" );
            System.out.println ( "1 -> Atualizar \n2 -> Remover \n0 -> Sair" );
            if ( validarEntrada ( aux = entrada.next() ) )
                switch ( Integer.parseInt ( aux ) ) {
                    case 1:
                        atualizarElemento ( lista , entrada );
                        break;
                    case 2:
                        removerElemento ( lista , entrada );
                        break;
                    default:
                        System.out.println ( "A lista inicial era: " + antiga );
                        System.out.println ( "A lista final eh: " + lista );
                        System.exit ( 0 );
                } else
                System.exit ( 0 );
        } while ( Integer.parseInt ( aux ) != 0 );
    }
    private static void atualizarElemento ( ArrayList lista , Scanner entrada ) {
        int pos = -1 , elem = 0;
        String aux;
        System.out.println ( "Entre com a posicao do elemento a ser atualizado." );
        if ( validarEntrada ( aux = entrada.next() ) )
            pos = Integer.parseInt ( aux );
        else
            System.exit ( 0 );
        System.out.println ( "Entre com o novo valor." );
        if ( validarEntrada ( aux = entrada.next() ) ) {
            System.out.println ( "Substituindo: " + lista.get ( pos ) + " => " + aux );
            elem = Integer.parseInt ( aux );
        }
        else
            System.exit ( 0 );
        lista.set ( pos , elem );
    }
    private static void removerElemento ( ArrayList lista , Scanner entrada ) {
        int pos = -1;
        String aux;
        System.out.println ( "Entre com a posicao do elemento a ser removido." );
        if ( validarEntrada ( aux = entrada.next() ) )
            pos = Integer.parseInt ( aux );
        else
            System.exit ( 0 );
        lista.remove ( pos );
    }
    private static boolean validarEntrada ( String ent ) {
        if ( ent.chars ( ).allMatch ( Character::isDigit ) )
            return true;
        else
            return false;
    }
}