package mapa;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class MapaTest {

    public MapaTest() {
    }

    @Test
    public void teste1() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(51);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.parse("2000-01-01"));
        mapa.inserir(obj1.getMatricula(), obj1);
        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
    }

    @Test
    public void teste2() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(51);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.parse("2000-01-01"));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.parse("1999-01-20"));
        Aluno obj3 = new Aluno(14244, "Marta", LocalDate.parse("2001-02-18"));
        Aluno obj4 = new Aluno(17213, "Lucas", LocalDate.parse("1998-11-25"));

        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);

        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapa.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapa.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapa.buscar(obj4.getMatricula()));
    }

    @Test
    public void teste3() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(51);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.parse("2000-01-01"));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.parse("1999-01-20"));
        Aluno obj3 = new Aluno(14244, "Marta", LocalDate.parse("2001-02-18"));
        Aluno obj4 = new Aluno(17213, "Lucas", LocalDate.parse("1998-11-25"));

        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);

        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapa.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapa.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapa.buscar(obj4.getMatricula()));
    }

}
