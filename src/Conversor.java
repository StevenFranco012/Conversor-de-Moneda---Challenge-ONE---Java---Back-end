import javax.swing.*;
import java.util.ArrayList;

import com.stevenfranco.conversor.modelos.Moneda;
import com.stevenfranco.conversor.modelos.Temperatura;
import com.stevenfranco.conversor.modelos.Kilometraje;
import com.stevenfranco.conversor.modelos.AnosLuz;

public class Conversor {
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Si Nimbus no está disponible, puedes establecer el L&F a otro que te guste
        }

        while (true) {
            String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Kilometraje", "Conversor de Años luz"};

            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == null) {
                System.exit(0);
            }

            if (seleccion.equals(opciones[0])) {
                ArrayList<Moneda> opcionesMoneda = new ArrayList<>();
                Moneda opcion1 = new Moneda();
                opcion1.setDescripcion("Convertir de Pesos Colombianos a Dólar");
                opcion1.setTasaDeCambio(1 / 3939.25);
                opcion1.setNombreMoneda("Dólares");
                opcionesMoneda.add(opcion1);

                Moneda opcion2 = new Moneda();
                opcion2.setDescripcion("Convertir de Pesos Colombianos a Euros");
                opcion2.setTasaDeCambio(1 / 4219.74);
                opcion2.setNombreMoneda("Euros");
                opcionesMoneda.add(opcion2);

                Moneda opcion3 = new Moneda();
                opcion3.setDescripcion("Convertir de Pesos Colombianos a Libras");
                opcion3.setTasaDeCambio(0.00021);
                opcion3.setNombreMoneda("Libras");
                opcionesMoneda.add(opcion3);

                Moneda opcion4 = new Moneda();
                opcion4.setDescripcion("Convertir de Pesos Colombianos a Yen");
                opcion4.setTasaDeCambio(0.040);
                opcion4.setNombreMoneda("Yen");
                opcionesMoneda.add(opcion4);

                Moneda opcion5 = new Moneda();
                opcion5.setDescripcion("Convertir de Pesos Colombianos a Won");
                opcion5.setTasaDeCambio(0.34998);
                opcion5.setNombreMoneda("Won");
                opcionesMoneda.add(opcion5);

                Moneda opcion6 = new Moneda();
                opcion6.setDescripcion("Convertir de Dólar a Pesos Colombianos");
                opcion6.setTasaDeCambio(3939.25);
                opcion6.setNombreMoneda("Pesos Colombianos");
                opcionesMoneda.add(opcion6);

                Moneda opcion7 = new Moneda();
                opcion7.setDescripcion("Convertir de Euros a Pesos Colombianos");
                opcion7.setTasaDeCambio(4219.74);
                opcion7.setNombreMoneda("Pesos Colombianos");
                opcionesMoneda.add(opcion7);

                Moneda opcion8 = new Moneda();
                opcion8.setDescripcion("Convertir de Libras a Pesos Colombianos");
                opcion8.setTasaDeCambio(1 / 0.00021);
                opcion8.setNombreMoneda("Pesos Colombianos");
                opcionesMoneda.add(opcion8);

                Moneda opcion9 = new Moneda();
                opcion9.setDescripcion("Convertir de Yen a Pesos Colombianos");
                opcion9.setTasaDeCambio(1 / 0.040);
                opcion9.setNombreMoneda("Pesos Colombianos");
                opcionesMoneda.add(opcion9);

                Moneda opcion10 = new Moneda();
                opcion10.setDescripcion("Convertir de Won a Pesos Colombianos");
                opcion10.setTasaDeCambio(1 / 0.34998);
                opcion10.setNombreMoneda("Pesos Colombianos");
                opcionesMoneda.add(opcion10);

                Moneda seleccionMoneda = (Moneda) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda.toArray(), opcionesMoneda.get(0));

                if (seleccionMoneda == null) {
                    System.exit(0);
                }

                double valor = 0;
                boolean esNumeroValido = false;

                do {
                    try {
                        String valorIngresado = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
                        valor = Double.parseDouble(valorIngresado);
                        esNumeroValido = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!esNumeroValido);

                double tasaDeCambio = seleccionMoneda.getTasaDeCambio();
                double valorConvertido = valor * tasaDeCambio;

                JOptionPane.showMessageDialog(null, "El valor convertido es: " + valorConvertido + " " + seleccionMoneda.getNombreMoneda());

                // Aquí va el código para el conversor de moneda, utilizando el valor ingresado y la selección de moneda
            } else if (seleccion.equals(opciones[1])) {
                ArrayList<Temperatura> opcionesTemperatura = new ArrayList<>();

                Temperatura opcion1 = new Temperatura();
                opcion1.setDescripcion("Convertir de Celsius a Fahrenheit");
                opcion1.setTasaDeCambio(9.0 / 5.0);
                opcion1.setUnidadTemperatura("Fahrenheit");
                opcionesTemperatura.add(opcion1);

                Temperatura opcion2 = new Temperatura();
                opcion2.setDescripcion("Convertir de Fahrenheit a Celsius");
                opcion2.setTasaDeCambio(5.0 / 9.0);
                opcion2.setUnidadTemperatura("Celsius");
                opcionesTemperatura.add(opcion2);

                Temperatura opcion3 = new Temperatura();
                opcion3.setDescripcion("Convertir de Celsius a Kelvin");
                opcion3.setTasaDeCambio(1);
                opcion3.setUnidadTemperatura("Kelvin");
                opcionesTemperatura.add(opcion3);

                Temperatura opcion4 = new Temperatura();
                opcion4.setDescripcion("Convertir de Kelvin a Celsius");
                opcion4.setTasaDeCambio(1);
                opcion4.setUnidadTemperatura("Celsius");
                opcionesTemperatura.add(opcion4);

                Temperatura seleccionTemperatura = (Temperatura) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Temperatura",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura.toArray(), opcionesTemperatura.get(0));

                if (seleccionTemperatura == null) {
                    System.exit(0);
                }

                double valor = 0;
                boolean esNumeroValido = false;

                do {
                    try {
                        String valorIngresado = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
                        valor = Double.parseDouble(valorIngresado);
                        esNumeroValido = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!esNumeroValido);

                double valorConvertido = seleccionTemperatura.convertir(valor);

                JOptionPane.showMessageDialog(null, "El valor convertido es: " + valorConvertido + " " + seleccionTemperatura.getUnidadTemperatura());
            } else if (seleccion.equals(opciones[2])) {
                ArrayList<Kilometraje> opcionesKilometraje = new ArrayList<>();

                Kilometraje opcion1 = new Kilometraje();
                opcion1.setDescripcion("Convertir de Kilometros a Millas");
                opcion1.setTasaDeCambio(0.621371);
                opcion1.setUnidadMedida("Millas");
                opcionesKilometraje.add(opcion1);

                Kilometraje opcion2 = new Kilometraje();
                opcion2.setDescripcion("Convertir de Millas a Kilometros");
                opcion2.setTasaDeCambio(1.60934);
                opcion2.setUnidadMedida("Kilometros");
                opcionesKilometraje.add(opcion2);

                Kilometraje seleccionKilometraje = (Kilometraje) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Kilometraje",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesKilometraje.toArray(), opcionesKilometraje.get(0));

                if (seleccionKilometraje == null) {
                    System.exit(0);
                }

                double valor = 0;
                boolean esNumeroValido = false;

                do {
                    try {
                        String valorIngresado = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
                        valor = Double.parseDouble(valorIngresado);
                        esNumeroValido = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!esNumeroValido);

                double valorConvertido = seleccionKilometraje.convertir(valor);

                JOptionPane.showMessageDialog(null, "El valor convertido es: " + valorConvertido + " " + seleccionKilometraje.getUnidadMedida());
            } else if (seleccion.equals(opciones[3])) {
                ArrayList<AnosLuz> opcionesAnosLuz = new ArrayList<>();

                AnosLuz opcion1 = new AnosLuz();
                opcion1.setDescripcion("Convertir de Años luz a Kilometros");
                opcion1.setTasaDeCambio(9.461e+12);
                opcion1.setUnidadMedida("Kilometros");
                opcionesAnosLuz.add(opcion1);

                AnosLuz opcion2 = new AnosLuz();
                opcion2.setDescripcion("Convertir de Kilometros a Años luz");
                opcion2.setTasaDeCambio(1.057e-13);
                opcion2.setUnidadMedida("Años luz");
                opcionesAnosLuz.add(opcion2);

                AnosLuz seleccionAnosLuz = (AnosLuz) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Años luz",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesAnosLuz.toArray(), opcionesAnosLuz.get(0));

                if (seleccionAnosLuz == null) {
                    System.exit(0);
                }

                double valor = 0;
                boolean esNumeroValido = false;

                do {
                    try {
                        String valorIngresado = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
                        valor = Double.parseDouble(valorIngresado);
                        esNumeroValido = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!esNumeroValido);

                double valorConvertido = seleccionAnosLuz.convertir(valor);

                JOptionPane.showMessageDialog(null, "El valor convertido es: " + valorConvertido + " " + seleccionAnosLuz.getUnidadMedida());
            }

            Object[] options = {"Sí", "No", "Cancelar"};
            int respuesta = JOptionPane.showOptionDialog(null,
                    "¿Quieres continuar?",
                    "Conversor",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (respuesta == JOptionPane.YES_OPTION) {
                // Si el usuario selecciona "Sí", vuelve al inicio del ciclo
                continue;
            } else if (respuesta == JOptionPane.NO_OPTION) {
                // Si el usuario selecciona "No", muestra un mensaje y luego termina el programa
                JOptionPane.showMessageDialog(null, "Programa terminado");
                System.exit(0);
            } else {
                // Si el usuario selecciona "Cancelar" o cierra la ventana de diálogo, termina el programa
                System.exit(0);
            }
        }
    }
}