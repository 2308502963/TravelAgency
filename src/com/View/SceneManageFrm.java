/*
 * SceneManageFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.View;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DataBase.Journey_db;
import com.DataBase.Scene_db;
import com.Model.Journey;
import com.Model.Scene;
import com.Util.Tools;

/**
 * 
 * @author __USER__
 */
public class SceneManageFrm extends javax.swing.JInternalFrame {

	/** Creates new form SceneManageFrm */
	public SceneManageFrm() {
		initComponents();
		filltablescenemanage(new Scene());
		this.setLocation(150, 50);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tableSceneManage = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		txtname = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtprice = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtgrade = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtlocal = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtdetails = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		txtid = new javax.swing.JTextField();
		txtnamesearch = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		labelpic = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);

		tableSceneManage.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "编号", "名称", "门票", "推荐等级", "省份", "详情" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tableSceneManage.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tableSceneManageMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(tableSceneManage);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216,
				Short.MAX_VALUE));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\sear.png")); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u540d\u79f0:");

		jLabel2.setText("\u95e8\u7968\uff1a");

		txtprice.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				txtpriceActionPerformed(evt);
			}
		});

		jLabel3.setText("\u63a8\u8350\u7b49\u7ea7:");

		txtgrade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				txtgradeActionPerformed(evt);
			}
		});

		jLabel4.setText("\u7701\u4efd\uff1b");

		jLabel5.setText("\u8be6\u60c5:");

		txtdetails.setColumns(20);
		txtdetails.setRows(5);
		jScrollPane2.setViewportView(txtdetails);

		jButton2.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\26154.png")); // NOI18N
		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\error_2.png")); // NOI18N
		jButton3.setText("\u5220\u9664");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel6.setText("\u666f\u533a\u7f16\u53f7\uff1a");

		txtid.setEditable(false);

		jButton4.setText("\u67e5\u770b\u8be6\u60c5");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(158,
																		158,
																		158)
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(201,
																		201,
																		201)
																.addComponent(
																		txtnamesearch,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		342,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(48, 48,
																		48)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		192,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(96, 96,
																		96)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jLabel1))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jScrollPane2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										364,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														jLabel2))
																								.addGap(37,
																										37,
																										37)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jButton4,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														165,
																														Short.MAX_VALUE)
																												.addComponent(
																														jButton3,
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														165,
																														Short.MAX_VALUE)
																												.addComponent(
																														txtlocal,
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														165,
																														Short.MAX_VALUE)
																												.addComponent(
																														jButton2,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														165,
																														Short.MAX_VALUE)
																												.addComponent(
																														txtprice,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														165,
																														Short.MAX_VALUE)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(43,
																										43,
																										43)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																																.addComponent(
																																		txtname,
																																		javax.swing.GroupLayout.Alignment.LEADING)
																																.addComponent(
																																		txtgrade,
																																		javax.swing.GroupLayout.Alignment.LEADING,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		129,
																																		Short.MAX_VALUE))
																												.addComponent(
																														jLabel6))
																								.addGap(34,
																										34,
																										34)
																								.addComponent(
																										txtid,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										206,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(labelpic,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										484,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(42, 42, 42)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														45, Short.MAX_VALUE)
												.addComponent(
														txtnamesearch,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		labelpic,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		280,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		32,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						txtid,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						23,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(22, 22,
																		22)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(9,
																										9,
																										9)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel1)
																												.addComponent(
																														txtname,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(21,
																										21,
																										21)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel3)
																												.addComponent(
																														txtgrade,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(6,
																										6,
																										6)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel2)
																												.addComponent(
																														txtprice,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														txtlocal,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE))))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(61,
																										61,
																										61)
																								.addComponent(
																										jLabel5))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(12,
																										12,
																										12)
																								.addComponent(
																										jButton2)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(8,
																																		8,
																																		8)
																																.addComponent(
																																		jScrollPane2,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(18,
																																		18,
																																		18)
																																.addComponent(
																																		jButton3)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		Short.MAX_VALUE)
																																.addComponent(
																																		jButton4,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		29,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
																.addContainerGap(
																		88,
																		Short.MAX_VALUE)))));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 查看详情按钮事件处理
	 * 
	 * @param evt
	 */
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		int n = JOptionPane.showConfirmDialog(null, "即将跳转,是否？");
		if (n == 0) {
			int row = tableSceneManage.getSelectedRow();
			try {
				Runtime.getRuntime().exec(
						"cmd /c start https://www.baidu.com/s?wd="
								+ (String) tableSceneManage.getValueAt(row, 1)
								+ "");
			} catch (IOException ee) {
				ee.printStackTrace();
			}
		} else if (n == 1) {
			JOptionPane.showMessageDialog(null, "真遗憾呢");
		} else {

		}
	}

	/**
	 * 删除功能实现
	 * 
	 * @param evt
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

		String Scene_id = txtid.getText();
		Tools t = new Tools();
		Scene_db scene_db = new Scene_db();
		if (t.isEmpty(Scene_id)) {
			JOptionPane.showMessageDialog(null, "请选择你要删除的景点");
		} else {
			int n1 = JOptionPane.showConfirmDialog(null, "确定要删除吗");
			if (n1 == 0) {
				if (txtid.getText().equals("1") || txtid.getText().equals("6")) {
					JOptionPane.showMessageDialog(null, "这个地方我还有用的");
					resetValue();
				} else {
					Connection con = t.getConn();
					int n = scene_db.Del_Scene(con, Scene_id);
					if (n > 0) {
						JOptionPane.showMessageDialog(null, "删除成功!");
						resetValue();
						filltablescenemanage(new Scene());
					} else {
						JOptionPane.showMessageDialog(null, "删除失败！");
					}

				}
			} else {
				filltablescenemanage(new Scene());
				resetValue();
			}
		}

	}

	/**
	 * 修改景点信息功能的实现
	 * 
	 * @param evt
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String Scene_id = txtid.getText();
		String Scene_name = txtname.getText();
		String Scene_price = txtprice.getText();
		String Scene_grade = txtgrade.getText();
		String Scene_local = txtlocal.getText();
		String Scene_details = txtdetails.getText();
		Scene scene = new Scene();
		scene.setScene_id(Scene_id);
		scene.setScene_details(Scene_details);
		scene.setScene_grade(Scene_grade);
		scene.setScene_local(Scene_local);
		scene.setScene_name(Scene_name);
		scene.setScene_price(Scene_price);
		Connection con = null;
		Scene_db scene_db = new Scene_db();
		Tools t = new Tools();

		if (t.isEmpty(Scene_name)) {
			JOptionPane.showMessageDialog(null, "请选择你要修改的景点");
		} else {
			try {
				con = t.getConn();
				int n = scene_db.Update_Scene(con, scene);
				if (n > 0) {
					JOptionPane.showMessageDialog(null, "修改成功！");
					resetValue();
					filltablescenemanage(new Scene());

				} else {
					JOptionPane.showMessageDialog(null, "修改失败！");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				t.closeConn(con);
			}
		}

	}

	/**
	 * 清空文本框
	 */
	private void resetValue() {
		// TODO Auto-generated method stub
		txtid.setText("");
		txtname.setText("");
		txtdetails.setText("");
		txtgrade.setText("");
		txtlocal.setText("");
		txtprice.setText("");
	}

	/**
	 * 查询事件处理
	 * 
	 * @param evt
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String Scene_name = this.txtnamesearch.getText();
		Tools t = new Tools();
		// if (t.isEmpty(Scene_name)) {
		// JOptionPane.showMessageDialog(null, "请输入你要查找的景点");
		// } else {
		Scene scene = new Scene();
		scene.setScene_name(Scene_name);
		this.filltablescenemanage(scene);
		// }
	}

	/**
	 * 鼠标选中行事件
	 */
	private void tableSceneManageMousePressed(java.awt.event.MouseEvent evt) {
		int row = tableSceneManage.getSelectedRow();
		txtid.setText((String) tableSceneManage.getValueAt(row, 0));
		txtname.setText((String) tableSceneManage.getValueAt(row, 1));
		txtdetails.setText((String) tableSceneManage.getValueAt(row, 5));
		txtgrade.setText((String) tableSceneManage.getValueAt(row, 3));
		txtlocal.setText((String) tableSceneManage.getValueAt(row, 4));
		txtprice.setText((String) tableSceneManage.getValueAt(row, 2));
		System.out.println(tableSceneManage.getValueAt(row, 0));
		this.labelpic.setIcon(new ImageIcon("pic/"
				+ tableSceneManage.getValueAt(row, 0) + ".jpg"));//实现图片实时刷新
	}

	// private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
	// // TODO add your handling code here:
	// }

	/**
	 * 初始化表格
	 * 
	 * @param scene
	 */
	private void filltablescenemanage(Scene scene) {
		DefaultTableModel dtm = (DefaultTableModel) tableSceneManage.getModel();
		dtm.setRowCount(0);// 清空表格
		Connection con = null;
		Tools t = new Tools();
		try {
			con = t.getConn();
			Scene_db scene_db = new Scene_db();
			// System.out.println("？？？");
			ResultSet rs = scene_db.list(con, scene);
			while (rs.next()) {
				// System.out.println("filltable裏面的這裏呢");
				Vector v = new Vector();
				v.add(rs.getString("Scene_id"));
				v.add(rs.getString("Scene_name"));
				v.add(rs.getString("Scene_price"));
				v.add(rs.getString("Scene_grade"));
				v.add(rs.getString("Scene_local"));
				v.add(rs.getString("Scene_details"));
				dtm.addRow(v);
				// System.out.println("fill table裏面的這裏呢");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel labelpic;
	private javax.swing.JTable tableSceneManage;
	private javax.swing.JTextArea txtdetails;
	private javax.swing.JTextField txtgrade;
	private javax.swing.JTextField txtid;
	private javax.swing.JTextField txtlocal;
	private javax.swing.JTextField txtname;
	private javax.swing.JTextField txtnamesearch;
	private javax.swing.JTextField txtprice;
	// End of variables declaration//GEN-END:variables

}