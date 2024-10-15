package Delimitadores;

public class AppDelimitadores{
    public static void main(String[] arg){
        System.out.println("*********************************");
        System.out.println("  APLICACIONES CON USO DE PILAS");
        System.out.println("*********************************");
        System.out.println("Correspondencia de Delimitadores");
        System.out.println("*********************************");
        String expre = "(a+b/2)";
        Delimitadores objDel = new Delimitadores();
        if(objDel.evaluacionDelimitadores(expre)){
            System.out.println("Expresión correcta");
        }
        else{
            System.out.println("Expresón incorrecta");
        }
        expre= "while (m<(n[8]+o))v{"+
        "int p=7; "+
        "/*comentarios*/";

        if(objDel.evaluacionDelimitadores(expre)){
            System.out.println("Expresión correcta");
        }
        else{
            System.out.println("Expresón incorrecta");
        }
    }
}