package cadastroPF;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.text.MaskFormatter;

	public class Cadastro_pessoa_fisica extends JFrame {
			JTextField v1 = new JTextField();
			JTextField v2 = new JTextField();
			JTextField v3 = new JTextField();
			JTextField v4 = new JTextField();
			JTextField v5 = new JTextField();
			JTextField v10 = new JTextField();
			JLabel t1 = new JLabel("name:");
			JLabel t2 = new JLabel("Endereço:");
			JLabel t3 = new JLabel("Bairro:");
			JLabel t4 = new JLabel("CEP:");
			JLabel t5 = new JLabel("Cidade:");
			JLabel t6 = new JLabel("Estado:");
			JLabel t7 = new JLabel("Telefone:");
			JLabel t8 = new JLabel("Celular:");
			JLabel t9 = new JLabel("RG:");
			JLabel t10 = new JLabel("CPF:");
			JButton b1 = new JButton("Limpar");
			JButton b2 = new JButton("Enviar");
			JLabel te1 = new JLabel("FORMULARIO CADASTRO FISICO");
			JRadioButton rd1 = new JRadioButton ("masculino");
			JRadioButton rd2 = new JRadioButton ("feminino");
			ButtonGroup grupo = new ButtonGroup();
			JComboBox cb1 = new JComboBox();
			MaskFormatter fmt = null;
			JFormattedTextField txttel = null;
			MaskFormatter tel = null;
			JFormattedTextField tel2 = null;
			MaskFormatter rg = null;
			JFormattedTextField rg2 = null;
			MaskFormatter cpf = null;
			JFormattedTextField cpf2 = null;
			MaskFormatter cep = null;
			JFormattedTextField cep2 = null;
				public Cadastro_pessoa_fisica(){
					super("Cadastro"); 
						this.setSize(390,800); 
						this.setVisible(true); 
						this.setDefaultCloseOperation(EXIT_ON_CLOSE);
						Container paine = this.getContentPane();
						paine.setLayout(null);
						te1.setForeground(Color.red);
						paine.add(v1);
						v1.setBounds(100, 70, 200, 30);
						paine.add(v2);
						v2.setBounds(100, 120, 200, 30);
						paine.add(v3);
						v3.setBounds(100, 170, 200, 30);
						paine.add(v5);
						v5.setBounds(100, 270, 200, 30);
						paine.add(t1);
						t1.setBounds(20 ,70 ,200 , 30);
						paine.add(t2);
						t2.setBounds(20, 120, 200, 30);
						paine.add(t3);
						t3.setBounds(20 ,170 ,200 , 30);
						paine.add(t4);
						t4.setBounds(20 ,220 ,200 , 30);
						paine.add(t5);
						t5.setBounds(20 ,270 ,200 , 30);
						paine.add(t6);
						t6.setBounds(20 ,320 ,200 , 30);
						paine.add(t7);
						t7.setBounds(20 ,370 ,200 , 30);
						paine.add(t8);
						t8.setBounds(20 ,420 ,200 , 30);
						paine.add(t9);
						t9.setBounds(20 ,470 ,200 , 30);
						paine.add(t10);
						t10.setBounds(20 ,520 ,200 , 30);
						paine.add(b1);
						b1.setBounds(20, 640, 100, 30);
						paine.add(te1);
						te1.setBounds(80 ,20 ,200 , 30);
						b1.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								v1.setText("");
								v2.setText("");
								v3.setText("");
								v4.setText("");
								v5.setText("");
								txttel.setText("");
								tel2.setText("");
								rg2.setText("");
								v10.setText("");
							}
						});
						paine.add(b2);
						b2.setBounds(160, 640, 100, 30);
						paine.add(rd1);
						rd1.setBounds(20,570,100,30);
						paine.add(rd2);
						rd2.setBounds(160,570, 100, 30);
						paine.add(cb1);
						cb1.setBounds(100, 320, 200, 30);
						cb1.addItem("SP");
						cb1.addItem("RJ");
						cb1.addItem("AC");
						cb1.addItem("AL");
						cb1.addItem("AP");
						cb1.addItem("AM");
						cb1.addItem("BA");
						cb1.addItem("CE");
						cb1.addItem("DF");
						cb1.addItem("ES");
						cb1.addItem("GO");
						cb1.addItem("MA");
						cb1.addItem("MT");
						cb1.addItem("MS");
						cb1.addItem("MG");
						cb1.addItem("PA");
						cb1.addItem("PB");
						cb1.addItem("PR");
						cb1.addItem("PE");
						cb1.addItem("PI");
						cb1.addItem("RN");
						cb1.addItem("RS");
						cb1.addItem("RO");
						cb1.addItem("RR");
						cb1.addItem("SC");
						cb1.addItem("SE");
						cb1.addItem("TO");
						grupo.add(rd1);
						grupo.add(rd2);
						try {
							fmt = new MaskFormatter("(##)####-####");
							txttel = new JFormattedTextField(fmt);
						} catch (Exception ex){
							ex.printStackTrace();
						}
						paine.add(txttel);
						txttel.setBounds(100, 370, 200, 30);
						
						try {
							tel = new MaskFormatter("(##)#####-####");
							tel2 = new JFormattedTextField(tel);
						} catch (Exception ex){
							ex.printStackTrace();
						}
						paine.add(tel2);
						tel2.setBounds(100, 420, 200, 30);
						
						try {
							rg = new MaskFormatter("##.###.###-#");
							rg2 = new JFormattedTextField(rg);
						} catch (Exception ex){
							ex.printStackTrace();
						}
						paine.add(rg2);
						rg2.setBounds(100, 470, 200, 30);
						
						try {
							cpf = new MaskFormatter("###########");
							cpf2 = new JFormattedTextField(cpf);
						} catch (Exception ex){
							ex.printStackTrace();
						}
						paine.add(cpf2);
						cpf2.setBounds(100, 520, 200, 30);
						try {
							cep = new MaskFormatter("#####-###");
							cep2 = new JFormattedTextField(cep);
						} catch (Exception ex){
							ex.printStackTrace();
						}
						paine.add(cep2);
						cep2.setBounds(100, 220, 200, 30);
					}
				public static void main(String args[]){
					Cadastro_pessoa_fisica b = new Cadastro_pessoa_fisica();
				}
			
	}


