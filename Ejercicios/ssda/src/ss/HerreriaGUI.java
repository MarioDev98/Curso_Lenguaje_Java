package ss;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HerreriaGUI extends JFrame {
    private JTextField nombreNegocioField;
    private JTextField telefonoField;
    private JTextField nombreArticuloField;
    private JTextField descripcionField;
    private JTextField costoField;
    private JTextField nombreClienteField;
    private JTextField apellidoClienteField;
    private DefaultTableModel clienteTableModel;
    private DefaultTableModel productoTableModel;

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public HerreriaGUI() {
        clientes = new ArrayList<>();
        productos = new ArrayList<>();

        setTitle("Gestor de Herrería");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de ingreso de datos de negocio
        JPanel negocioPanel = new JPanel(new GridLayout(2, 2));
        negocioPanel.add(new JLabel("Nombre del negocio:"));
        nombreNegocioField = new JTextField();
        negocioPanel.add(nombreNegocioField);
        negocioPanel.add(new JLabel("Teléfono del dueño:"));
        telefonoField = new JTextField();
        negocioPanel.add(telefonoField);
        add(negocioPanel, BorderLayout.NORTH);

        // Panel de ingreso de datos de artículo
        JPanel articuloPanel = new JPanel(new GridLayout(4, 2));
        articuloPanel.add(new JLabel("Nombre del artículo:"));
        nombreArticuloField = new JTextField();
        articuloPanel.add(nombreArticuloField);
        articuloPanel.add(new JLabel("Descripción del artículo:"));
        descripcionField = new JTextField();
        articuloPanel.add(descripcionField);
        articuloPanel.add(new JLabel("Costo sin IVA:"));
        costoField = new JTextField();
        articuloPanel.add(costoField);
        JButton addProductoButton = new JButton("Add producto");
        articuloPanel.add(addProductoButton);
        add(articuloPanel, BorderLayout.CENTER);

        // Panel de ingreso de datos de cliente
        JPanel clientePanel = new JPanel(new GridLayout(3, 2));
        clientePanel.add(new JLabel("Nombre del cliente:"));
        nombreClienteField = new JTextField();
        clientePanel.add(nombreClienteField);
        clientePanel.add(new JLabel("Primer apellido del cliente:"));
        apellidoClienteField = new JTextField();
        clientePanel.add(apellidoClienteField);
        JButton addClienteButton = new JButton("Guardar cliente");
        clientePanel.add(addClienteButton);
        add(clientePanel, BorderLayout.SOUTH);

        // Tablas de historial de clientes y productos
        clienteTableModel = new DefaultTableModel(new String[]{"Nombre", "Apellido"}, 0);
        JTable clienteTable = new JTable(clienteTableModel);
        productoTableModel = new DefaultTableModel(new String[]{"Nombre del artículo", "Descripción", "Costo con IVA"}, 0);
        JTable productoTable = new JTable(productoTableModel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(clienteTable), new JScrollPane(productoTable));
        add(splitPane, BorderLayout.EAST);

        // Acciones de los botones
        addClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreClienteField.getText();
                String apellido = apellidoClienteField.getText();
                if (!nombre.isEmpty() && !apellido.isEmpty()) {
                    Cliente cliente = new Cliente(nombre, apellido);
                    clientes.add(cliente);
                    clienteTableModel.addRow(new Object[]{cliente.getNombre(), cliente.getPrimerApellido()});
                    nombreClienteField.setText("");
                    apellidoClienteField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos de cliente.");
                }
            }
        });

        addProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreArticuloField.getText();
                String descripcion = descripcionField.getText();
                try {
                    double costo = Double.parseDouble(costoField.getText());
                    ProductoConIVA producto = new ProductoConIVA(nombre, descripcion, costo);
                    productos.add(producto);
                    productoTableModel.addRow(new Object[]{producto.getNombre(), producto.getDescripcion(), producto.getCostoConIVA()});
                    nombreArticuloField.setText("");
                    descripcionField.setText("");
                    costoField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un costo válido.");
                }
            }
        });
    }
}
