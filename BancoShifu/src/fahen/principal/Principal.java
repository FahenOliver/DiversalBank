package fahen.principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private Contas conta1 = new Contas();
	private Contas conta2 = new Contas();
	private Contas conta3 = new Contas();
	private Contas conta4 = new Contas();
	private Contas conta5 = new Contas();
	private Contas conta6 = new Contas();
	private JPanel pnPl1;
	private JLabel id1;
	private JLabel lbCli1;
	private JLabel lbSal1;
	private Contas[] conta = new Contas[6];
	private JButton btnSaldoPadrao;
	private JButton btEd1;
	private JButton btPaga1;
	private JButton btRecebe1;
	private JButton btTransfere1;
	private JPanel pnPl2;
	private JLabel id2;
	private JLabel lbCli2;
	private JLabel lbSal2;
	private JButton btEd2;
	private JButton btPaga2;
	private JButton btRecebe2;
	private JButton btTransfere2;
	private JPanel panel;
	private JLabel id3;
	private JLabel lbCli3;
	private JLabel lbSal3;
	private JButton btEd3;
	private JButton btPaga3;
	private JButton btRecebe3;
	private JButton btTransfere3;
	private JPanel panel_1;
	private JLabel id4;
	private JLabel lbCli4;
	private JLabel lbSal4;
	private JButton btEd4;
	private JButton btPaga4;
	private JButton btRecebe4;
	private JButton btTransfere4;
	private JPanel panel_2;
	private JLabel id5;
	private JLabel lbCli5;
	private JLabel lbSal5;
	private JButton btEd5;
	private JButton btPaga5;
	private JButton btRecebe5;
	private JButton btTransfere5;
	private JPanel panel_3;
	private JLabel id6;
	private JLabel lbCli6;
	private JLabel lbSal6;
	private JButton btEd6;
	private JButton btPaga6;
	private JButton btRecebe6;
	private JButton btTransfere6;
	private JLabel lblIconefaheninfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//fim de main

	/**
	 * Create the frame.
	 */
	public Principal() {
		initialize();
		setaContas();
	}
	private void initialize() {
		
		geraContas();
		
		//setando as contas
		this.conta1.setIdConta(1);
		this.conta2.setIdConta(2);
		this.conta3.setIdConta(3);
		this.conta4.setIdConta(4);
		this.conta5.setIdConta(5);
		this.conta6.setIdConta(6);
		
		
		setTitle("Banco Diversal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/fahen/img/2951_64x64.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 505);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.btnSaldoPadrao = new JButton("Saldo Padrão");
		this.btnSaldoPadrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					float vlrStd = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor padrão para todas as contas"));
					valorStd(vlrStd);
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "O valor deve ser separado por ponto", "Valor Inválido", JOptionPane.ERROR_MESSAGE);
				}//fim de try/catch
			}//fim de actionPerformed
		});//fim das ações
		this.btnSaldoPadrao.setToolTipText("Ajusta um valor padrão para todas as contas");
		this.btnSaldoPadrao.setBounds(18, 10, 207, 27);
		this.contentPane.add(this.btnSaldoPadrao);
		
		this.pnPl1 = new JPanel();
		this.pnPl1.setBounds(18, 45, 260, 150);
		this.contentPane.add(this.pnPl1);
		this.pnPl1.setBackground(new Color(154, 205, 50));
		this.pnPl1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.pnPl1.setLayout(null);
		
		this.id1 = new JLabel("1");
		this.id1.setForeground(Color.BLACK);
		this.id1.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id1.setBounds(17, 6, 30, 24);
		this.pnPl1.add(this.id1);
		
		this.lbCli1 = new JLabel("cliente");
		this.lbCli1.setForeground(Color.BLACK);
		this.lbCli1.setBounds(53, 13, 201, 15);
		this.pnPl1.add(this.lbCli1);
		
		this.lbSal1 = new JLabel("Saldo");
		this.lbSal1.setForeground(Color.BLACK);
		this.lbSal1.setBounds(17, 42, 147, 15);
		this.pnPl1.add(this.lbSal1);
		
		this.btEd1 = new JButton("");
		this.btEd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(0, nome);
			}
		});//fim das ações
		this.btEd1.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd1.setBounds(196, 108, 52, 36);
		this.pnPl1.add(this.btEd1);
		
		this.btPaga1 = new JButton("");
		this.btPaga1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(0, valor);
			}
		});
		this.btPaga1.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga1.setBounds(10, 108, 52, 36);
		this.pnPl1.add(this.btPaga1);
		
		this.btRecebe1 = new JButton("");
		this.btRecebe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(0, valor);
			}
		});
		this.btRecebe1.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe1.setBounds(72, 108, 52, 36);
		this.pnPl1.add(this.btRecebe1);
		
		this.btTransfere1 = new JButton("");
		this.btTransfere1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(0, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere1.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere1.setBounds(134, 108, 52, 36);
		this.pnPl1.add(this.btTransfere1);
		
		this.pnPl2 = new JPanel();
		this.pnPl2.setLayout(null);
		this.pnPl2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.pnPl2.setBackground(new Color(238, 130, 238));
		this.pnPl2.setBounds(290, 45, 260, 150);
		this.contentPane.add(this.pnPl2);
		
		this.id2 = new JLabel("2");
		this.id2.setForeground(Color.BLACK);
		this.id2.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id2.setBounds(17, 6, 30, 24);
		this.pnPl2.add(this.id2);
		
		this.lbCli2 = new JLabel("cliente");
		this.lbCli2.setForeground(Color.BLACK);
		this.lbCli2.setBounds(53, 13, 201, 15);
		this.pnPl2.add(this.lbCli2);
		
		this.lbSal2 = new JLabel("Saldo");
		this.lbSal2.setForeground(Color.BLACK);
		this.lbSal2.setBounds(17, 42, 147, 15);
		this.pnPl2.add(this.lbSal2);
		
		this.btEd2 = new JButton("");
		this.btEd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(1, nome);
			}
		});
		this.btEd2.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd2.setBounds(196, 108, 52, 36);
		this.pnPl2.add(this.btEd2);
		
		this.btPaga2 = new JButton("");
		this.btPaga2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(1, valor);
			}
		});
		this.btPaga2.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga2.setBounds(10, 108, 52, 36);
		this.pnPl2.add(this.btPaga2);
		
		this.btRecebe2 = new JButton("");
		this.btRecebe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(1, valor);
			}
		});
		this.btRecebe2.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe2.setBounds(72, 108, 52, 36);
		this.pnPl2.add(this.btRecebe2);
		
		this.btTransfere2 = new JButton("");
		this.btTransfere2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(1, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere2.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere2.setBounds(134, 108, 52, 36);
		this.pnPl2.add(this.btTransfere2);
		
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.panel.setBackground(new Color(255, 99, 71));
		this.panel.setBounds(562, 45, 260, 150);
		this.contentPane.add(this.panel);
		
		this.id3 = new JLabel("3");
		this.id3.setForeground(Color.BLACK);
		this.id3.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id3.setBounds(17, 6, 30, 24);
		this.panel.add(this.id3);
		
		this.lbCli3 = new JLabel("cliente");
		this.lbCli3.setForeground(Color.BLACK);
		this.lbCli3.setBounds(53, 13, 201, 15);
		this.panel.add(this.lbCli3);
		
		this.lbSal3 = new JLabel("Saldo");
		this.lbSal3.setForeground(Color.BLACK);
		this.lbSal3.setBounds(17, 42, 147, 15);
		this.panel.add(this.lbSal3);
		
		this.btEd3 = new JButton("");
		this.btEd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(2, nome);
			}
		});
		this.btEd3.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd3.setBounds(196, 108, 52, 36);
		this.panel.add(this.btEd3);
		
		this.btPaga3 = new JButton("");
		this.btPaga3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(2, valor);
			}
		});
		this.btPaga3.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga3.setBounds(10, 108, 52, 36);
		this.panel.add(this.btPaga3);
		
		this.btRecebe3 = new JButton("");
		this.btRecebe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(2, valor);
			}
		});
		this.btRecebe3.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe3.setBounds(72, 108, 52, 36);
		this.panel.add(this.btRecebe3);
		
		this.btTransfere3 = new JButton("");
		this.btTransfere3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(2, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere3.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere3.setBounds(134, 108, 52, 36);
		this.panel.add(this.btTransfere3);
		
		this.panel_1 = new JPanel();
		this.panel_1.setLayout(null);
		this.panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.panel_1.setBackground(new Color(135, 206, 235));
		this.panel_1.setBounds(18, 207, 260, 150);
		this.contentPane.add(this.panel_1);
		
		this.id4 = new JLabel("4");
		this.id4.setForeground(Color.BLACK);
		this.id4.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id4.setBounds(17, 6, 30, 24);
		this.panel_1.add(this.id4);
		
		this.lbCli4 = new JLabel("cliente");
		this.lbCli4.setForeground(Color.BLACK);
		this.lbCli4.setBounds(53, 13, 201, 15);
		this.panel_1.add(this.lbCli4);
		
		this.lbSal4 = new JLabel("Saldo");
		this.lbSal4.setForeground(Color.BLACK);
		this.lbSal4.setBounds(17, 42, 147, 15);
		this.panel_1.add(this.lbSal4);
		
		this.btEd4 = new JButton("");
		this.btEd4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(3, nome);
			}
		});
		this.btEd4.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd4.setBounds(196, 108, 52, 36);
		this.panel_1.add(this.btEd4);
		
		this.btPaga4 = new JButton("");
		this.btPaga4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(3, valor);
			}
		});
		this.btPaga4.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga4.setBounds(10, 108, 52, 36);
		this.panel_1.add(this.btPaga4);
		
		this.btRecebe4 = new JButton("");
		this.btRecebe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(3, valor);
			}
		});
		this.btRecebe4.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe4.setBounds(72, 108, 52, 36);
		this.panel_1.add(this.btRecebe4);
		
		this.btTransfere4 = new JButton("");
		this.btTransfere4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(3, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere4.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere4.setBounds(134, 108, 52, 36);
		this.panel_1.add(this.btTransfere4);
		
		this.panel_2 = new JPanel();
		this.panel_2.setLayout(null);
		this.panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.panel_2.setBackground(new Color(240, 230, 140));
		this.panel_2.setBounds(290, 207, 260, 150);
		this.contentPane.add(this.panel_2);
		
		this.id5 = new JLabel("5");
		this.id5.setForeground(Color.BLACK);
		this.id5.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id5.setBounds(17, 6, 30, 24);
		this.panel_2.add(this.id5);
		
		this.lbCli5 = new JLabel("cliente");
		this.lbCli5.setForeground(Color.BLACK);
		this.lbCli5.setBounds(53, 13, 201, 15);
		this.panel_2.add(this.lbCli5);
		
		this.lbSal5 = new JLabel("Saldo");
		this.lbSal5.setForeground(Color.BLACK);
		this.lbSal5.setBounds(17, 42, 147, 15);
		this.panel_2.add(this.lbSal5);
		
		this.btEd5 = new JButton("");
		this.btEd5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(4, nome);
			}
		});
		this.btEd5.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd5.setBounds(196, 108, 52, 36);
		this.panel_2.add(this.btEd5);
		
		this.btPaga5 = new JButton("");
		this.btPaga5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(4, valor);
			}
		});
		this.btPaga5.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga5.setBounds(10, 108, 52, 36);
		this.panel_2.add(this.btPaga5);
		
		this.btRecebe5 = new JButton("");
		this.btRecebe5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(4, valor);
			}
		});
		this.btRecebe5.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe5.setBounds(72, 108, 52, 36);
		this.panel_2.add(this.btRecebe5);
		
		this.btTransfere5 = new JButton("");
		this.btTransfere5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(4, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere5.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere5.setBounds(134, 108, 52, 36);
		this.panel_2.add(this.btTransfere5);
		
		this.panel_3 = new JPanel();
		this.panel_3.setLayout(null);
		this.panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.panel_3.setBackground(new Color(169, 169, 169));
		this.panel_3.setBounds(562, 207, 260, 150);
		this.contentPane.add(this.panel_3);
		
		this.id6 = new JLabel("6");
		this.id6.setForeground(Color.BLACK);
		this.id6.setFont(new Font("Dialog", Font.BOLD, 20));
		this.id6.setBounds(17, 6, 30, 24);
		this.panel_3.add(this.id6);
		
		this.lbCli6 = new JLabel("cliente");
		this.lbCli6.setForeground(Color.BLACK);
		this.lbCli6.setBounds(53, 13, 201, 15);
		this.panel_3.add(this.lbCli6);
		
		this.lbSal6 = new JLabel("Saldo");
		this.lbSal6.setForeground(Color.BLACK);
		this.lbSal6.setBounds(17, 42, 147, 15);
		this.panel_3.add(this.lbSal6);
		
		this.btEd6 = new JButton("");
		this.btEd6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				nomeiaConta(5, nome);
			}
		});
		this.btEd6.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/client-account-template-icon.png")));
		this.btEd6.setBounds(196, 108, 52, 36);
		this.panel_3.add(this.btEd6);
		
		this.btPaga6 = new JButton("");
		this.btPaga6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser retirado");
				paga(5, valor);
			}
		});
		this.btPaga6.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Math-minus-icon.png")));
		this.btPaga6.setBounds(10, 108, 52, 36);
		this.panel_3.add(this.btPaga6);
		
		this.btRecebe6 = new JButton("");
		this.btRecebe6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a receber");
				recebe(5, valor);
			}
		});
		this.btRecebe6.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/text-plus-icon.png")));
		this.btRecebe6.setBounds(72, 108, 52, 36);
		this.panel_3.add(this.btRecebe6);
		
		this.btTransfere6 = new JButton("");
		this.btTransfere6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Valor a ser pago");
				String beneficiario = JOptionPane.showInputDialog("Digite o id do beneficiário\nDigitos válidos:\n1-2-3-4-5-6");
				transfere(5, valor, Integer.parseInt(beneficiario));
			}
		});
		this.btTransfere6.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/Arrows-icon.png")));
		this.btTransfere6.setBounds(134, 108, 52, 36);
		this.panel_3.add(this.btTransfere6);
		
		this.lblIconefaheninfo = new JLabel("");
		this.lblIconefaheninfo.setToolTipText("(81) 99821-7425 - fahen.oliver@gmail.com - Fabio Henrique");
		this.lblIconefaheninfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
		});
		
		this.lblIconefaheninfo.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblIconefaheninfo.setIcon(new ImageIcon(Principal.class.getResource("/fahen/img/icoFahenOliver.png")));
		this.lblIconefaheninfo.setBounds(18, 369, 804, 92);
		this.contentPane.add(this.lblIconefaheninfo);
		
	}//fim de initialize
	
	public void geraContas(){
		for(int i = 0; i < 6; i++){
			this.conta[i] = new Contas();
		}//fim de for
		for(int i = 0; i < 6; i++){
			this.conta[i].setIdConta(i+1);
			this.conta[i].setJogador("Jogador Aberto");
		}//fim de for
	}//fim de gera contas
	
	public void setaContas(){
		this.lbCli1.setText(this.conta[0].getJogador());
		this.lbCli2.setText(this.conta[1].getJogador());
		this.lbCli3.setText(this.conta[2].getJogador());
		this.lbCli4.setText(this.conta[3].getJogador());
		this.lbCli5.setText(this.conta[4].getJogador());
		this.lbCli6.setText(this.conta[5].getJogador());
		
		this.lbSal1.setText("" + this.conta[0].getSaldo());
		this.lbSal2.setText("" + this.conta[1].getSaldo());
		this.lbSal3.setText("" + this.conta[2].getSaldo());
		this.lbSal4.setText("" + this.conta[3].getSaldo());
		this.lbSal5.setText("" + this.conta[4].getSaldo());
		this.lbSal6.setText("" + this.conta[5].getSaldo());
		
	}//fim de seta contas
	
	public void valorStd(float valor){
		for(int i = 0; i < 6; i++){
			this.conta[i].setSaldo(valor);
		}//fim de for
		setaContas();
	}//fim de valorStd
	
	public void nomeiaConta(int ident, String jogador){
		this.conta[ident].setJogador(jogador);
		setaContas();
	}//fim de nomeiaConta()
	
	
	//operações de conta
	public void paga(int id, String valor){
		this.conta[id].saca(Float.parseFloat(valor));
		setaContas();
	}
	public void recebe(int id, String valor){
		this.conta[id].deposita(Float.parseFloat(valor));
		setaContas();
	}
	public void transfere(int idPg, String valor ,int idRc){
		this.conta[idPg].transfere(this.conta[idRc-1], Float.parseFloat(valor));
		setaContas();
	}
	//fim das operações de conta
}//fim da classe