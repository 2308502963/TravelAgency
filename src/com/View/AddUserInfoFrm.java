/*
 * AddUserInfoFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.View;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DataBase.User_db;
import com.Model.User;
import com.Util.Tools;

/**
 * 
 * @author __USER__
 */
public class AddUserInfoFrm extends javax.swing.JInternalFrame {

	Tools t = new Tools();
	User user;
	User_db user_db = new User_db();

	/** Creates new form AddUserInfoFrm */
	public AddUserInfoFrm() {
		initComponents();
		this.setLocation(150, 50);
		jrbman.setSelected(true);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		txtid = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtname = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jcbhome = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		btnadduser = new javax.swing.JButton();
		jrbman = new javax.swing.JRadioButton();
		jrbfemale = new javax.swing.JRadioButton();
		txtpw = new javax.swing.JPasswordField();
		txtpwcomfirm = new javax.swing.JPasswordField();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\numbered_48pa.png")); // NOI18N
		jLabel1.setText("\u7528\u6237\u5e8f\u53f7\uff1a");


		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\user_name.net.png")); // NOI18N
		jLabel2.setText("\u7528\u6237\u59d3\u540d\uff1a");

		jLabel3.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\sex.png")); // NOI18N
		jLabel3.setText("\u6027\u522b\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\great_wall_48px.png")); // NOI18N
		jLabel4.setText("\u7c4d\u8d2f\uff1a");

		jcbhome.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"重庆市", "北京市", "天津市", "云南省", "湖南省", "江苏省", "上海市", "福建省", "贵州省",
				"山西省", "河北省", "吉林省", "四川省", "西藏自治区", "新疆自治区", "内蒙古自治区", "山东省",
				"湖北省", "海南省", "台湾", "广东省", "河南省" }));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel5.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\passwor.png")); // NOI18N
		jLabel5.setText("\u5bc6  \u7801\uff1a");

		jLabel6.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\confirm_48px.png")); // NOI18N
		jLabel6.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		btnadduser
				.setIcon(new javax.swing.ImageIcon(
						"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\add_32px.png")); // NOI18N
		btnadduser.setText("\u6dfb\u52a0");
		btnadduser.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnadduserActionPerformed(evt);
			}
		});

		buttonGroup1.add(jrbman);
		jrbman.setText("\u7537");

		buttonGroup1.add(jrbfemale);
		jrbfemale.setText("\u5973");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(440, 440, 440)
								.addComponent(btnadduser)
								.addContainerGap(480, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(93, 93, 93)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(jLabel1)
												.addComponent(jLabel5))
								.addGap(41, 41, 41)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		txtid,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		141,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(119,
																		119,
																		119))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						txtpw,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						0,
																						0,
																						Short.MAX_VALUE)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jrbman)
																								.addGap(49,
																										49,
																										49)
																								.addComponent(
																										jrbfemale)))
																.addGap(125,
																		125,
																		125)))
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2)
												.addComponent(jLabel4)
												.addComponent(jLabel6))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(txtpwcomfirm, 0,
														0, Short.MAX_VALUE)
												.addComponent(
														jcbhome,
														javax.swing.GroupLayout.Alignment.LEADING,
														0,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														txtname,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														163, Short.MAX_VALUE))
								.addContainerGap(112, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(77, 77, 77)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(42, 42,
																		42)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						txtid,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						36,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						txtname,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						37,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(148,
																		148,
																		148)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jrbman)
																				.addComponent(
																						jrbfemale)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jcbhome,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						34,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										41, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jLabel6)
												.addComponent(
														txtpw,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														37,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														txtpwcomfirm,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(90, 90, 90).addComponent(btnadduser)
								.addGap(33, 33, 33)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 添加新的用户信息到数据库
	 * 
	 * @param evt
	 */
	private void btnadduserActionPerformed(java.awt.event.ActionEvent evt) {
		String username = txtname.getText();
		String userid = txtid.getText();
		String pw = new String(this.txtpw.getPassword());
		String pwcomfirm = new String(this.txtpwcomfirm.getPassword());
		String sex = "";
		if (jrbman.isSelected()) {
			sex = "男";
		} else {
			sex = "女";
		}

		// 是个类，但是不能强制转换成user类
		// User user1 = (User) this.jcbhome.getSelectedItem();
		// String userhome = user1.getHome();
		String userhome = (String) this.jcbhome.getSelectedItem();
		 System.out.println(userhome);
		if (t.isNotEmpty(userhome) && t.isNotEmpty(username)
				&& t.isNotEmpty(userid) && t.isNotEmpty(sex)
				&& t.isNotEmpty(pw) && t.isNotEmpty(pwcomfirm)) {
			if (pw.equals(pwcomfirm)) {
				User user = new User(username, userid, sex, userhome, pw);
				Connection con = null;
				try {
					con = t.getConn();
					int n = user_db.Add_UserInfo(con, user);
					if (n > 0) {
						JOptionPane.showMessageDialog(null, "添加成功！");
						resetValue();
					} else {
						JOptionPane.showMessageDialog(null, "添加失败！");
						resetValue();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					t.closeConn(con);
				}

			} else {
				JOptionPane.showMessageDialog(null, "密码不一致");
				resetValue();
			}
		} else {
			JOptionPane.showMessageDialog(null, "请输入完整的信息");
			resetValue();
		}

	}

	/**
	 * 重置表单
	 */
	public void resetValue() {
		txtname.setText("");
		txtid.setText("");
		txtpw.setText("");
		txtpwcomfirm.setText("");
		jrbman.setSelected(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnadduser;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JComboBox jcbhome;
	private javax.swing.JRadioButton jrbfemale;
	private javax.swing.JRadioButton jrbman;
	private javax.swing.JTextField txtid;
	private javax.swing.JTextField txtname;
	private javax.swing.JPasswordField txtpw;
	private javax.swing.JPasswordField txtpwcomfirm;
	// End of variables declaration//GEN-END:variables

}