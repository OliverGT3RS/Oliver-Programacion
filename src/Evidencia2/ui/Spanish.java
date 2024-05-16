package Evidencia2.ui;

/* Esta es una clase que hereda los atributos de la clase base Textos. */
public class Spanish extends Textos{

    /* Aquí declaramos las variables de la clase base con los textos en español, los cuales se usarán
    predeterminadamente o si el usuario lo indica. */
    public Spanish() {

        ERROR_INESPERADO = "Error inesperado";

        INICIO_SECION = "Hola, por favor inicie sesión";
        USUARIO = "Ingrese su usuario: ";
        CONTRASENA = "Ingrese su contraseña: ";
        DATOS_INCORRECTOS = "Usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.";
        INICIO_EXITOSO = "Inicio de sesión exitoso, acceso permitido.";
        SALDO_PAGAR = "El saldo total a pagar por su consumo realizado es de: $";
    }
}
