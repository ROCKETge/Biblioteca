/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaativ;

import java.util.*;

public class Livro {
    public enum Categoria {DIDATICO, INFANTIL, FICÇAO, AUTO_AJUDA};
    private int id;
    private String titulo;
    private String Autor;
    private Date dataPublic;
    private Categoria categoria;
    
}
