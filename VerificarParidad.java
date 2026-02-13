public class VerificarParidad {

    public static void validarNumero(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El numero es impar: " + numero);
        }
        System.out.println("El numero es par: " + numero);
    }

    public static void main(String[] args) {
        try {
            validarNumero(4);
            validarNumero(7);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }
    }
}