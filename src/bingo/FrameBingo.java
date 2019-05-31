package bingo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FrameBingo extends JFrame implements WindowListener {
	
	// Fonts
	private Font fontTitolo;
	private Font fontName;
	private Font fontNumbers;
	private Font fontNumberExtract;
	
	// Bordi
	Border borderBillboard;
	Border borderNumberExtract;
	

	// Number Players and Name User
	private int numberPlayers;
	private String nameUser;
	
	// Components
	private Container c;
	private JPanel nordPanel;
	private JPanel centerPanel;
	private JPanel southPanel;
	private JLabel headerSuper;
	private JLabel headerBingo;
	private JPanel billboardPanel;
	private JLabel[][] billboard;
	private JPanel[][] panelLabelBillboard;
	private JPanel numberExtractPanel;	
	private JLabel numberExtract;
	private Player[] players;
	private JPanel[] playersPanel;
	private JPanel[][] playerPanels;
	private JLabel[] playersLabelName;
	private JLabel[][] playersLabelNumbers;
	private JLabel[][] playersLabelNumbersExtract;

	public FrameBingo() {
		
		super("SuperBingo");
		
		// Fonts
		fontTitolo = new Font("Arial",Font.BOLD,50);
		fontName = new Font("Arial",Font.BOLD,25);
		fontNumbers = new Font("Arial",Font.BOLD,30);
		fontNumberExtract = new Font("Arial",Font.BOLD,140);
		
		// Bordi
		borderBillboard = BorderFactory.createLineBorder(Color.BLACK, 1);
		borderNumberExtract = BorderFactory.createLineBorder(Color.BLACK, 5);
		
		// Predispongo i pannelli principali e secondari
		nordPanel = new JPanel();
		centerPanel = new JPanel(new GridLayout(2,1, 50, 50));
		southPanel = new JPanel(new GridLayout(1, this.numberPlayers, 100, 50));
		
		// Creo spazio tra i componenti del Frame
		setLayout(new BorderLayout(50,50));
		
		// Disegno il TITOLO
		drawHeader();
		
		// Disegno il TABELLONE
		drawBillboard();
		
		// Disegno il NUMERO ESTRATTO
		drawNumberExtract();
						
		c = getContentPane();
		nordPanel.setLayout(new FlowLayout());
		nordPanel.add(headerSuper);
		nordPanel.add(headerBingo);	
		centerPanel.add(this.billboardPanel);
		centerPanel.add(this.numberExtractPanel);
		c.add(nordPanel,BorderLayout.NORTH);
		c.add(centerPanel,BorderLayout.CENTER);
		c.add(southPanel,BorderLayout.SOUTH);
		addWindowListener(this);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	
	private void drawHeader() {
		headerSuper = new JLabel("Super", JLabel.CENTER);
		headerSuper.setFont(fontTitolo);
		headerSuper.setForeground(Color.RED);
		headerSuper.setVerticalAlignment(JLabel.CENTER);
		headerBingo = new JLabel("Bingo", JLabel.CENTER);
		headerBingo.setFont(fontTitolo);
		headerBingo.setForeground(new Color(0, 181 ,38));
		headerBingo.setVerticalAlignment(JLabel.CENTER);
	}
	
	private void drawBillboard() {
		billboard = new JLabel[9][10];
		panelLabelBillboard = new JPanel[9][10];
		billboardPanel = new JPanel(new GridLayout(9,10));
		billboardPanel.setBackground(Color.BLACK);
		billboardPanel.setSize(new Dimension(500,500));
		billboardPanel.setBorder(borderBillboard);
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == 0 && j < 9) {
					billboard[i][j] = new JLabel("0"+Integer.toString((j+1)+(10*i)));
				} else {
					billboard[i][j] = new JLabel(Integer.toString((j+1)+(10*i)));
				}
				billboard[i][j].setOpaque(true);
				billboard[i][j].setBackground(Color.WHITE);
				billboard[i][j].setHorizontalAlignment(JLabel.CENTER);
				billboard[i][j].setVerticalAlignment(JLabel.CENTER);
				billboard[i][j].setFont(fontNumbers);
				panelLabelBillboard[i][j] = new JPanel(new GridLayout(1,1,10,10));
				panelLabelBillboard[i][j].setBorder(borderBillboard);
				panelLabelBillboard[i][j].add(billboard[i][j]);
				billboardPanel.add(panelLabelBillboard[i][j]);
			}
		}
	}
	
	private void drawNumberExtract() {
		this.numberExtract = new JLabel();
		this.numberExtract.setFont(fontNumberExtract);
		this.numberExtract.setForeground(Color.RED);
		this.numberExtract.setHorizontalAlignment(JLabel.CENTER);
		this.numberExtract.setVerticalAlignment(JLabel.CENTER);
		this.numberExtract.setBorder(borderNumberExtract);
		this.numberExtract.setBackground(new Color(253, 247, 176));
		this.numberExtract.setOpaque(true);
		this.numberExtract.setVisible(false);
		numberExtractPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		numberExtractPanel.add(this.numberExtract);
	}
	
	public void drawPlayers(Player[] players) {
		
		// Inizializzo le proprietà principali
		this.players = players;
		this.nameUser = this.players[0].getName();
		this.numberPlayers = this.players.length;
		playersPanel = new JPanel[this.numberPlayers];
		playerPanels = new JPanel[this.numberPlayers][3];
		playersLabelName = new JLabel[this.numberPlayers];
		playersLabelNumbers = new JLabel[this.numberPlayers][5];
		playersLabelNumbersExtract = new JLabel[this.numberPlayers][5];
		
		for(int i = 0; i < this.numberPlayers; i++) {
			playersPanel[i] = new JPanel(new GridLayout(3,1,0,5));
			if(i == 0) {
				playersLabelName[i] = new JLabel(this.players[i].getName(), JLabel.CENTER);
				playersLabelName[i].setFont(fontName);
				playersLabelName[i].setForeground(Color.RED);
			} else {
				playersLabelName[i] = new JLabel(this.players[i].getName(), JLabel.CENTER);
				playersLabelName[i].setFont(fontName);
				playersLabelName[i].setForeground(Color.BLACK);
			}
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					playerPanels[i][j] = new JPanel(new FlowLayout(FlowLayout.CENTER));
					playerPanels[i][j].add(playersLabelName[i]);
				} else if(j == 1) {
					playerPanels[i][j] = new JPanel(new GridLayout(1,5));
					for(int z = 0; z < 5; z++) {
						playersLabelNumbers[i][z] = new JLabel(this.players[i].getNumberString(z), JLabel.CENTER);
						playersLabelNumbers[i][z].setFont(fontNumbers);
						playerPanels[i][j].add(playersLabelNumbers[i][z]);
					}
				} else {
					playerPanels[i][j] = new JPanel(new GridLayout(1,5));
					for(int z = 0; z < 5; z++) {
						playersLabelNumbersExtract[i][z] = new JLabel(this.players[i].getNumberExtractString(z), JLabel.CENTER);
						playersLabelNumbersExtract[i][z].setFont(fontNumbers);
						playerPanels[i][j].add(playersLabelNumbersExtract[i][z]);
					}
				}
				playersPanel[i].add(playerPanels[i][j]);
			}
			southPanel.add(playersPanel[i]);
		}
	}
	
	public void setNumberExtract(String numberExtract) {
		this.numberExtract.setVisible(true);
		if(numberExtract.length() > 1) {
			this.numberExtract.setText(numberExtract);
		} else {
			this.numberExtract.setText("0"+numberExtract);
		}
	}
	
	public void updatePlayer(int i) {
		for(int j = 0; j < 5; j++) {
			System.out.println(this.playersLabelNumbersExtract[i][j]);
			this.playersLabelNumbersExtract[i][j].setText(this.players[i].getNumberExtractString(j));
			if(this.playersLabelNumbersExtract[i][j].getText().equals("-") == false) {
				if(this.playersLabelNumbersExtract[i][j].getText().equals(this.playersLabelNumbers[i][j].getText())) {
					this.playersLabelNumbersExtract[i][j].setForeground(new Color(17, 182, 0));
				} else {
					this.playersLabelNumbersExtract[i][j].setForeground(Color.RED);
				}
			}
		}
	}
	
	public void updateBillboard(int numberExtract) {
		String number = Integer.toString(numberExtract);
		System.out.println(numberExtract);
		System.out.println(number);
		int row;
		int col;
		if(number.length() > 1) {
			row = (Integer.valueOf(number.charAt(0)))-48;
			col = (Integer.valueOf(number.charAt(1)))-48;
			if(col == 0) {
				col = 9;
			} else {
				col = col-1;
			}
		} else {
			row = 0;
			col = (Integer.valueOf(number.charAt(0)))-49;
		}
		System.out.println("Riga "+(row));
		System.out.println("Colonna "+(col));
		billboard[row][col].setBackground(new Color(253, 247, 176));
		//billboard[row][col].setForeground(Color.RED);
	}
	
	public void showWinner(Player winner, boolean superBingo) {
		String message;
		String title;
		if(winner.getName().equals(nameUser)) {
			title = "Hai Vinto!";
			if(superBingo) {
				message = "COMPLIMENTI "+nameUser+" HAI VINTO E HAI FATTO SUPERBINGO!";
			} else {
				message = "COMPLIMENTI "+nameUser+" HAI VINTO!\nMA NON HAI FATTO SUPERBINGO, RITENTA!";
			}
		} else {
			title = "Hai Perso!";
			message = "CI DISPIACE "+nameUser+" MA HAI PERSO!";
		}
		JOptionPane.showMessageDialog(
            this,
            message,
            title,
            JOptionPane.PLAIN_MESSAGE);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, this.nameUser+" ci dispiace che ci lasci.\nGrazie per aver giocato.\nALLA PROSSIMA PARTITA!", "GRAZIE"+this.nameUser+"!", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		e.getWindow().setSize(800, 800);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
