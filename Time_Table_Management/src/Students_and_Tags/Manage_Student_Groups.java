package Students_and_Tags;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DBC.DBConnection;
import Home.Dashboard;
import Home.StartUp;
import Leactures_and_Subjects.Add_Lecturer;
import Leactures_and_Subjects.Add_Subjects;
import Leactures_and_Subjects.Manage_Lecturer;
import Leactures_and_Subjects.Manage_Subjects;
import Location_and_Statistics.Add_Locations;

import Location_and_Statistics.Manage_Locations;
import Location_and_Statistics.Visualizing_static;
import Session_and_TimeAllocation.Add_Session;
import Session_and_TimeAllocation.ConsecutiveSessionRooms;
import Session_and_TimeAllocation.Manage_Not_Available_Times;

import Session_and_TimeAllocation.Manage_Sessions;
import Session_and_TimeAllocation.Not_Available_Time;
import Session_and_TimeAllocation.SessionsANDnotAvailableTimeAllocationConsecutive;
import Session_and_TimeAllocation.SessionsANDnotAvailableTimeAllocationNoneOverlaping;
import Session_and_TimeAllocation.SessionsANDnotAvailableTimeAllocationParallel;
import Session_and_TimeAllocation.SessionsRooms;
import Timetable.Lecturer;
import Timetable.Location;
import Timetable.Student;
import Working_Days_and_Hours.Add_Workingdays_Hours;

import Working_Days_and_Hours.Manage_Workingdays_Hours;
import net.proteanit.sql.DbUtils;

import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Manage_Student_Groups {

	private JFrame frame;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField txtManageStudentGroups;
	private JTextField textField_4;
	private JTextField studentgroupID;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Student_Groups window = new Manage_Student_Groups();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_Student_Groups() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 960, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBorderPainted(false);
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(0, 0, 0));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Category");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.setBackground(Color.BLACK);
		mnNewMenu.setForeground(Color.YELLOW);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Lectures & Subjects");
		mnNewMenu_1.setBackground(new Color(128, 128, 128));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Lecture");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Lecturer add_Lecturer=new Add_Lecturer();
				Add_Lecturer.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add Subjects");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Subjects add_Subjects=new Add_Subjects();
				Add_Subjects.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Manage Lecturers");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Lecturer manage_Lecturer=new Manage_Lecturer();
				Manage_Lecturer.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Manage Subjects");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Subjects manage_Subjects=new Manage_Subjects();
				Manage_Subjects.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu_1.add(menuBar_1);
		
		JMenu mnNewMenu_2 = new JMenu("Session & Time Allocation");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Add Session");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Session add_Session=new Add_Session();
				Add_Session.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Manage Not Available Times");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Not_Available_Times manage_Not_Available_Times=new Manage_Not_Available_Times();
				Manage_Not_Available_Times.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Consecutive Session rooms");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ConsecutiveSessionRooms manage_Session_Rooms=new ConsecutiveSessionRooms();
				ConsecutiveSessionRooms.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Manage Sessions");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Sessions manage_Sessions=new Manage_Sessions();
				Manage_Sessions.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		///
		
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Session Rooms");
		mntmNewMenuItem_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SessionsRooms manage_Session_Rooms=new SessionsRooms();
				SessionsRooms.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_2.add(mntmNewMenuItem_21);
		///
		
		
		
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Not Available Time");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Not_Available_Time not_Available_Time=new Not_Available_Time();
				Not_Available_Time.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sessions & Not Available Time Allocation Consecutive");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SessionsANDnotAvailableTimeAllocationConsecutive sessionsANDnotAvailableTimeAllocationConsecutive=new SessionsANDnotAvailableTimeAllocationConsecutive();
				SessionsANDnotAvailableTimeAllocationConsecutive.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Sessions & Not Available Time Allocation Non Overlaping");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SessionsANDnotAvailableTimeAllocationNoneOverlaping sessionsANDnotAvailableTimeAllocationNoneOverlaping=new SessionsANDnotAvailableTimeAllocationNoneOverlaping();
				SessionsANDnotAvailableTimeAllocationNoneOverlaping.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("Sessions & Not Available Time Allocation Parallel");
		mntmNewMenuItem_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SessionsANDnotAvailableTimeAllocationParallel sessionsANDnotAvailableTimeAllocationParallel=new SessionsANDnotAvailableTimeAllocationParallel();
				SessionsANDnotAvailableTimeAllocationParallel.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_31);


		
		JMenu mnNewMenu_3 = new JMenu("Working Days & Hours ");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Add Workingdays Hours");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Workingdays_Hours add_Workingdays_Hours=new Add_Workingdays_Hours();
				Add_Workingdays_Hours.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		
		
		JMenuItem mntmNewMenuItem_65 = new JMenuItem("Manage Workingdays Hours");
		mntmNewMenuItem_65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Workingdays_Hours add_Workingdays_Hours=new Manage_Workingdays_Hours();
				Manage_Workingdays_Hours.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_3.add(mntmNewMenuItem_65);
		
		
		JMenu mnNewMenu_4 = new JMenu("Student & Tags");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Add Student Groups");
		
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Student_Groups addstudentgroups=new Add_Student_Groups();
				Add_Student_Groups.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Add Tag");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Tag addtags=new Add_Tag();
				Add_Tag.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_4.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Manage Student Groups");
		
		
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Student_Groups managestudentgroups=new Manage_Student_Groups();
				Manage_Student_Groups.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_4.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Manage Tags");
		
		
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Tags managetags=new Manage_Tags();
				Manage_Tags.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_4.add(mntmNewMenuItem_17);
		
		JMenu mnNewMenu_5 = new JMenu("Location & Statistics");
		mnNewMenu.add(mnNewMenu_5);
		

		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Add Locations");
		
		
		
		mntmNewMenuItem_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Locations addlocations=new Add_Locations();
				Add_Locations.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_5.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("Manage Locations");
		
		
		
		mntmNewMenuItem_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Manage_Locations managelocations=new Manage_Locations();
				Manage_Locations.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_5.add(mntmNewMenuItem_30);
		
		
	JMenuItem mntmNewMenuItem_34 = new JMenuItem("Visualizing Static");
		
		
		
		mntmNewMenuItem_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Visualizing_static visualizing_static=new Visualizing_static();
				Visualizing_static.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_5.add(mntmNewMenuItem_34);
		
		
		
		JMenu mnNewMenu_33 = new JMenu("Generate Time Tables");
		mnNewMenu.add(mnNewMenu_33);
		
		JMenuItem mntmNewMenuItem_111 = new JMenuItem("Lecturer");
		mntmNewMenuItem_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Lecturer lec=new Lecturer();
				Lecturer.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_33.add(mntmNewMenuItem_111);
		
		
		
		JMenuItem mntmNewMenuItem_655 = new JMenuItem("Student");
		mntmNewMenuItem_655.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Student student=new Student();
				Student.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_33.add(mntmNewMenuItem_655);

		
		JMenuItem mntmNewMenuItem_432 = new JMenuItem("Location");
		mntmNewMenuItem_432.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Location location=new Location();
				Location.main(null);
				frame.setVisible(false);
				
			}
			
		});
		mnNewMenu_33.add(mntmNewMenuItem_432);
		
		
		
		
		
		////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		JMenu mnNewMenu_7 = new JMenu("About");
		
		


		mnNewMenu_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_7.setBackground(Color.BLACK);
		mnNewMenu_7.setForeground(Color.WHITE);
		menuBar.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("About");
		
		
		
		
		mntmNewMenuItem_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				StartUp startup=new StartUp();
				StartUp.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		mnNewMenu_7.add(mntmNewMenuItem_22);
		
		
		
		
		
		
		
		
		
		
		//////////////////////////


JLabel lblNewLabel_1_1 = new JLabel("ID");
lblNewLabel_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNewLabel_1_1.setBounds(242, 314, 152, 16);
frame.getContentPane().add(lblNewLabel_1_1);
JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.S2"}));

comboBox_1.setBackground(Color.WHITE);
comboBox_1.setBounds(404, 340, 177, 20);
frame.getContentPane().add(comboBox_1);
JLabel lblNewLabel_1 = new JLabel("Academic Yeat Semester");
lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(242, 340, 158, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Programme");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(242, 394, 122, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Group Number");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(246, 452, 122, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Group ID");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(606, 392, 126, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_7 = new JLabel("Sub Group Number");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(606, 340, 126, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnClearsubject = new JButton("Clear");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"IT", "CSSE", "CSE", "IM"}));

		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(404, 392, 177, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sub Group ID");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(605, 454, 122, 20);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(404, 452, 177, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(742, 342, 170, 20);
		frame.getContentPane().add(spinner_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(743, 394, 169, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(742, 452, 170, 20);
		frame.getContentPane().add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(264, 130, 543, 170);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
				
				 int selectedRow=table.getSelectedRow();
					
					
					//textField.setText(table.getValueAt(selectedRow, 1).toString());
				 textField.setText(table.getValueAt(selectedRow, 0).toString());
			      
				 String semester=table.getValueAt(selectedRow, 1).toString();
             	String Getsemester=(String)comboBox_1.getSelectedItem();
             	comboBox_1.setSelectedItem(semester);
	              
	                String programme=table.getValueAt(selectedRow, 2).toString();
                	String Getbuilding=(String)comboBox.getSelectedItem();
                	comboBox.setSelectedItem(programme);
                	spinner.setValue((Integer)table.getValueAt(selectedRow,3));	
                  	spinner_1.setValue((Integer)table.getValueAt(selectedRow, 4));	
                  	textField_2.setText(table.getValueAt(selectedRow, 5).toString());
                  	textField_3.setText(table.getValueAt(selectedRow, 5).toString());

			}
			
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Academic Year and Sem", "Programme", "Group No", "Group  ID", "SubGroupNum"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(102);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.GRAY);
		panel_1_1.setBounds(0, 114, 225, 186);
		frame.getContentPane().add(panel_1_1);
		
		txtManageStudentGroups = new JTextField();
		txtManageStudentGroups.setEditable(false);
		txtManageStudentGroups.setText("                                                     MANAGE STUDENT GROUPS");
		txtManageStudentGroups.setForeground(Color.RED);
		txtManageStudentGroups.setFont(new Font("Arial Black", Font.BOLD, 19));
		txtManageStudentGroups.setColumns(10);
		txtManageStudentGroups.setBackground(Color.BLACK);
		txtManageStudentGroups.setBounds(0, 84, 946, 29);
		frame.getContentPane().add(txtManageStudentGroups);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText("                                           Time Table Management System");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.GRAY);
		textField_4.setBounds(0, 0, 946, 87);
		frame.getContentPane().add(textField_4);
		
		JButton btnManageStudentGroups = new JButton("MANAGE STUDENT GROUPS");
		btnManageStudentGroups.setForeground(new Color(255, 0, 0));
		btnManageStudentGroups.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnManageStudentGroups.setBackground(Color.BLACK);
		btnManageStudentGroups.setBounds(0, 333, 225, 29);
		frame.getContentPane().add(btnManageStudentGroups);
		
		JButton btnAddStudentGroups = new JButton("ADD STUDENT GROUPS");
		
		btnAddStudentGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Student_Groups addstudentgroups=new Add_Student_Groups();
				Add_Student_Groups.main(null);
				frame.setVisible(false);
				
			}
			
		});
		btnAddStudentGroups.setForeground(new Color(255, 255, 255));
		btnAddStudentGroups.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnAddStudentGroups.setBackground(Color.BLACK);
		btnAddStudentGroups.setBounds(0, 299, 225, 35);
		frame.getContentPane().add(btnAddStudentGroups);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 361, 225, 166);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 525, 225, 53);
		frame.getContentPane().add(panel_2);
		
		JButton btnDelete = new JButton("<<Back");
		
		
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Dashboard dashboard=new Dashboard();
				Dashboard.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		
		btnDelete.setForeground(new Color(240, 248, 255));
		btnDelete.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnDelete.setBackground(Color.BLACK);
		panel_2.add(btnDelete);
		
		JButton btnClear_1_1 = new JButton("Clear");
		
		
		
		btnClear_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				
				textField_2.setText(null);
				textField_3.setText(null);
			}
		});
		
		btnClear_1_1.setForeground(new Color(240, 248, 255));
		btnClear_1_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnClear_1_1.setBackground(Color.BLACK);
		btnClear_1_1.setBounds(726, 508, 132, 35);
		frame.getContentPane().add(btnClear_1_1);
		
		JButton btnClear_1_1_1 = new JButton("Delete");
		
		btnClear_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				

				

				
				
				try {
					if(textField.getText().equals("")){
						JOptionPane.showMessageDialog(null, "PLEASE CLICK THE ROW");
					}else {
					Connection con = DBConnection.connect();
					String query="Delete from Student_Groups where studentgroupID='"+textField.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Deleted");
					pst.close();
					}
					
				}
				catch(Exception q) {
					q.printStackTrace();
				}
		
				
				
		
			}
		});
		
		
		btnClear_1_1_1.setForeground(new Color(240, 248, 255));
		btnClear_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnClear_1_1_1.setBackground(Color.BLACK);
		btnClear_1_1_1.setBounds(552, 508, 132, 35);
		frame.getContentPane().add(btnClear_1_1_1);
		
		JButton btnClear_1_1_1_1 = new JButton("Update");
		
		
		btnClear_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SubjectCode"	INTEGER NOT NULL,textField_1
				//"SubjectName"	TEXT NOT NULL,textField
				//"OfferedYear"	TEXT NOT NULL,comboBox
				//"OfferedSemester,comboBox_2
				/*
				 	 String semester=table.getValueAt(selectedRow, 1).toString();
             	String Getsemester=(String)comboBox_1.getSelectedItem();
             	comboBox_1.setSelectedItem(semester);
	              
	                String programme=table.getValueAt(selectedRow, 2).toString();
                	String Getbuilding=(String)comboBox.getSelectedItem();
                	comboBox.setSelectedItem(programme);
                	spinner.setValue((Integer)table.getValueAt(selectedRow,3));	
                  	spinner_1.setValue((Integer)table.getValueAt(selectedRow, 4));	
                  	textField_2.setText(table.getValueAt(selectedRow, 5).toString());
                  	textField_3.setText(table.getValueAt(selectedRow, 5).toString());

				 */
				
				
				
				
				
				

				try {
					if( textField.getText().equals("")||comboBox_1.getSelectedItem().equals("")||comboBox.getSelectedItem().equals("")||spinner.getValue().equals("")||spinner_1.getValue().equals("")||      textField_2.getText().equals("")||textField_3.getText().equals("")){
						JOptionPane.showMessageDialog(null, "Please fill the form and press generate button to generate the rank");
					}else {
					Connection con = DBConnection.connect();
					
					String query="Update Student_Groups   set semester='"+comboBox_1.getSelectedItem()+"',programme='"+comboBox.getSelectedItem()+"', G_num='"+spinner.getValue()+"',Sub_G_Num='"+spinner_1.getValue()+"',      G_ID='"+textField_2.getText()+"',Sub_G_ID='"+textField_3.getText()+"'  where studentgroupID='"+textField.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					}
					
				}
				catch(Exception q) {
					q.printStackTrace();
					
				}
				
			}
		});
		
		btnClear_1_1_1_1.setForeground(new Color(240, 248, 255));
		btnClear_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnClear_1_1_1_1.setBackground(Color.BLACK);
		btnClear_1_1_1_1.setBounds(371, 508, 132, 35);
		frame.getContentPane().add(btnClear_1_1_1_1);
		
		JButton btnRefresh = new JButton("Refresh");
		
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnection.connect();
					
					String query="select studentgroupID,semester, programme, G_num, Sub_G_Num, G_ID, Sub_G_ID from Student_Groups ";

					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefresh.setBackground(Color.GRAY);
		btnRefresh.setBounds(814, 265, 122, 35);
		frame.getContentPane().add(btnRefresh);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.DARK_GRAY);
		textField.setEnabled(false);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(404, 310, 177, 20);
		frame.getContentPane().add(textField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(235, 306, 701, 186);
		frame.getContentPane().add(panel_3);
	}
}
