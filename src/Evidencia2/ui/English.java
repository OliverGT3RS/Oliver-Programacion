package Evidencia2.ui;

/* Esta es una clase que hereda los atributos de la clase base Textos. */
public class English extends Textos{

    /* Aquí declaramos las variables de la clase base con los textos en inglés, los cuales se usarán
    cuando el usuario seleccione el idioma inglés. */
    public English (){
        ERROR_INESPERADO = "An unexpected error occurred.";

        INICIO_SECION = "Hello, please log in";
        USUARIO = "Enter your username: ";
        CONTRASENA = "Enter your password: ";
        DATOS_INCORRECTOS = "Incorrect username or password. Please try again.";
        INICIO_EXITOSO = "Login successful, access granted.";
        SALDO_PAGAR = "The total amount to be paid for your purchases is: $";
    }
}
