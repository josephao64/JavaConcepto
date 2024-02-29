import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazGrafica {

    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Interfaz Gráfica en Java");
        frame.setSize(300, 200); // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para cerrar la aplicación al cerrar la ventana
        frame.setLayout(null); // Desactivar el diseño predeterminado para usar coordenadas absolutas

        // Crear un botón
        JButton button = new JButton("Haz clic");
        button.setBounds(100, 50, 100, 30); // Establecer posición y tamaño del botón

        // Agregar un ActionListener al botón
        button.addActionListener(e -> {
            // Mostrar un mensaje al hacer clic en el botón
            JOptionPane.showMessageDialog(frame, "¡Has hecho clic en el botón!");
        });

        // Agregar el botón al marco
        frame.add(button);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
