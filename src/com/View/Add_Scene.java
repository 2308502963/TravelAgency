/*
 * Add_Scene.java
 *
 * Created on __DATE__, __TIME__
 */

package com.View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.DataBase.Scene_db;
import com.Model.Scene;
import com.Util.Tools;

/**
 * 
 * @author __USER__
 */
public class Add_Scene extends javax.swing.JInternalFrame {

	/** Creates new form Add_Scene */
	public Add_Scene() {
		initComponents();
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

		jLabel1 = new javax.swing.JLabel();
		txtSceneName = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtScenePrice = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtSceneGrade = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtScenelocal = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSceneDetails = new javax.swing.JTextArea();
		btnAdd = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		txtid = new javax.swing.JTextField();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\great_wall_48px.png")); // NOI18N
		jLabel1.setText("\u666f\u70b9\u540d\u79f0\uff1a");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\money_48px.png")); // NOI18N
		jLabel2.setText("\u95e8\u7968\u4ef7\u683c:");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\stars48.png")); // NOI18N
		jLabel3.setText("\u63a8\u8350\u6307\u6570\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\great_wall_48px.png")); // NOI18N
		jLabel4.setText("\u7701        \u4efd:");

		txtScenelocal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtScenelocalActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel5.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\thumbsup48.png")); // NOI18N
		jLabel5.setText("\u666f\u533a\u8be6\u60c5:");

		txtSceneDetails.setColumns(20);
		txtSceneDetails.setRows(5);
		jScrollPane1.setViewportView(txtSceneDetails);

		btnAdd.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\add48px.png")); // NOI18N
		btnAdd.setText("\u786e\u8ba4\u6dfb\u52a0");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel6.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\numbered_48pa.png")); // NOI18N
		jLabel6.setText("\u666f\u533a\u7f16\u53f7\uff1a");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel6)
																												.addComponent(
																														jLabel2))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														txtScenePrice)
																												.addComponent(
																														txtid,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														143,
																														Short.MAX_VALUE)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														txtSceneGrade)
																												.addComponent(
																														jScrollPane1))))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel5)
																.addGap(345,
																		345,
																		345)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jLabel4))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						txtScenelocal)
																				.addComponent(
																						txtSceneName,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						132,
																						Short.MAX_VALUE)))
												.addComponent(
														btnAdd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														153,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(34, 34, 34)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(59, 59, 59)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(
														txtid,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1)
												.addComponent(
														txtSceneName,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(38, 38, 38)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														txtScenePrice,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4)
												.addComponent(
														txtScenelocal,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														txtSceneGrade,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(31, 31, 31)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														btnAdd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														45,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(40, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 添加新的景点信息
	 * 
	 * @param evt
	 */
	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
		String Scene_id = txtid.getText();
		String Scene_name = txtSceneName.getText();
		String Scene_price = txtScenePrice.getText();
		String Scene_local = txtScenelocal.getText();
		String Scene_grade = txtSceneGrade.getText();
		String Scene_details = txtSceneDetails.getText();
		Scene scene = new Scene(Scene_name, Scene_price, Scene_grade,
				Scene_local, Scene_details, Scene_id);
		Tools t = new Tools();
		Scene_db scene_db = new Scene_db();
		Connection con = null;
		try {
			con = t.getConn();
			int n = scene_db.Add_SceneInfo(con, scene);
			if (n > 0) {
				JOptionPane.showMessageDialog(null, "添加成功！");
				ResetValue();
			} else {
				JOptionPane.showMessageDialog(null, "添加失败！");
				ResetValue();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}

	}

	/**
	 * 重置表单
	 * @param evt
	 */
	public void ResetValue() {
		txtid.setText("");
		txtSceneName.setText("");
		txtScenePrice.setText("");
		txtScenelocal.setText("");
		txtSceneGrade.setText("");
		txtSceneDetails.setText("");
	}

	private void txtScenelocalActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnAdd;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea txtSceneDetails;
	private javax.swing.JTextField txtSceneGrade;
	private javax.swing.JTextField txtSceneName;
	private javax.swing.JTextField txtScenePrice;
	private javax.swing.JTextField txtScenelocal;
	private javax.swing.JTextField txtid;
	// End of variables declaration//GEN-END:variables

}