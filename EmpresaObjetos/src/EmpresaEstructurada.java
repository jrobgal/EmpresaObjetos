import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EmpresaEstructurada {
    public static void main(String[] args) throws Exception {
        String nombre, cargo;
        double salario, total = 0, mayorSalario, menorSalario;
        int posicion = 0;

        //Definicion de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));

        for(int emp = 0; emp < cantidad; emp++) {
            //Lectura de los datos de cada empleado
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));

            //Almacenamiento de los datos
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

            //Numero de empleados
            System.out.println("El numero total de empleados es: " + cantidad);

            //Nombre y salario de cada empleado
            System.out.println("Los nombres y salarios de los empleados son:");
            for(int emp = 0; emp < cantidad; emp++) {
                System.out.println("Nombre: " + nombres.get(emp) + " Salario: " + salarios.get(emp));
            }

            //Total del dinero pagado por el salario de todos los empleados
            for(int emp = 0; emp < cantidad; emp++) {
                total = total + salarios.get(emp);
            }
            System.out.println("Total de dinero pagado a todos los empleados: " + total);

            //Nombre, cargo y salario del empleado que mas salario gana
            System.out.println("El empleado que mas dinero gana es:");
            mayorSalario = salarios.get(0);
            for(int emp = 1; emp < cantidad; emp++) {
                if(salarios.get(emp) > mayorSalario) {
                    mayorSalario = salarios.get(emp);
                    posicion = emp;
                }
            }
            System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) 
            + " Salario: " + salarios.get(posicion));

            //Nombre, cargo y salario del empleado que menos salario gana
            System.out.println("El empleado que menos dinero gana es:");
            posicion = 0;
            menorSalario = salarios.get(0);
            for(int emp = 1; emp < cantidad; emp++) {
                if(salarios.get(emp) < menorSalario) {
                    menorSalario = salarios.get(emp);
                    posicion = emp;
                }
            }
            System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) 
            + " Salario: " + salarios.get(posicion));
    }
}
