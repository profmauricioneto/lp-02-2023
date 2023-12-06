/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcdao.firstexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

 
/**
 *
 * @author maumneto
 */
public class TestMain {
    private Scanner in;
    private UsuarioDAO dao;
    private BufferedReader reader;
    
    public TestMain() {
        in = new Scanner(System.in);
        reader = new BufferedReader(new InputStreamReader(System.in));
        dao = new UsuarioDAO();
    }

    public void entrada() {
        boolean sair = true;
        do {
            System.out.println("Qual a operação:");
            System.out.print("1-Adicionar\n2-Remover\n3-Atualizar\n4-Mostrar Registros\n5-Mostrar Todos os Registros\n6-Mostrar por ID\n7-Sair\nOpção: ");
            int op = in.nextInt();
            switch(op) {
                case 1: {
                    try {
                        addUsuario();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    try {
                        deletarUsuario();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    try {
                        updateUsuario();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    mostrarDados();
                    break;
                }
                case 5: {
                    mostrarTodosDados();
                    break;
                }
                case 6: {
                    mostrarPorId();
                    break;
                }
                case 7: {
                    System.out.println("Sair!");
                    dao.close();
                    sair = false;
                    break;
                }
                default: {
                    System.out.println("Nenhuma Opção foi selecionado!");
                    break;
                }
            }
        }while(sair != false);
    }
    
    public void addUsuario() throws IOException {
        Usuario usuario = new Usuario();
        
        System.out.print("Nome: ");
        String nome = reader.readLine();
        usuario.setNome(nome);
        
        System.out.print("Altura: ");
        double altura = Double.parseDouble(reader.readLine());
        usuario.setAltura(altura);
        
        System.out.print("Endereco: ");
        String endereco = reader.readLine();
        usuario.setEndereco(endereco);

        Calendar calendar = Calendar.getInstance();
        usuario.setData(calendar);
        dao.addUsuario(usuario);
    }
    
    public void deletarUsuario() throws IOException {
        System.out.print("Id: ");
        long id = in.nextLong();
        dao.delete(id);
    }
    
    public void updateUsuario() throws IOException {
        Usuario usuario = new Usuario();
                
        System.out.print("ID: ");
        long id = in.nextLong();
        
        System.out.print("Novo nome: ");
        String nome = reader.readLine();
        usuario.setNome(nome);
        
        System.out.print("Altura: ");
        double altura = Double.parseDouble(reader.readLine());
        usuario.setAltura(altura);
        
        System.out.print("Novo Endereco: ");
        String endereco = reader.readLine();
        usuario.setEndereco(endereco);

        Calendar calendar = Calendar.getInstance();
        usuario.setData(calendar);
        dao.update(usuario, id);
    }

    public void mostrarDados() {
        dao.mostrarUsuario();
    }
    
    public void mostrarTodosDados() {
        dao.mostrarTodosDadosDAO();
    }
    
    public void mostrarPorId() {
        long id;
        System.out.println("Entre com o ID: ");
        id = in.nextLong();
        dao.mostrarPorId(id);
    }
    
    public void encerrar() {
        in.close();
        try {
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        TestMain programJDBCDAO = new TestMain();
        programJDBCDAO.entrada();
    }
}
