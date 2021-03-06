/*
 * ManageInfo.java
 *
 * Created on __DATE__, __TIME__
 */

package com.View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.DataBase.Credit_db;
import com.DataBase.Friend_db;
import com.DataBase.JourneyPlan_db;
import com.DataBase.Journey_db;
import com.DataBase.ScenePlan_db;
import com.DataBase.Scene_db;
import com.Model.Credit;
import com.Model.JourneyPlan;
import com.Model.ScenePlan;
import com.Model.friend;
import com.Util.Tools;

/**
 * 
 * @author __USER__
 */
public class ManageInfo extends javax.swing.JFrame {

	/** Creates new form ManageInfo */
	public ManageInfo() {
		initComponents();
		this.setLocation(350, 150);
		// 加载图片
		ImageIcon icon = new ImageIcon("images/4.jpg");
		// 将图片放入label中
		JLabel label = new JLabel(icon);
		// 设置label的大小
		label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		// 获取窗口的第二层，将label放入
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		// 获取frame的顶层容器,并设置为透明
		Container cp;
		cp = this.getContentPane();
		((JPanel) cp).setOpaque(false);
		cp.setLayout(new BorderLayout());
		fillfriend();
		filljourney();
		fillscene();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jcbjourney = new javax.swing.JComboBox();
		jcbfriend = new javax.swing.JComboBox();
		btndelscen = new javax.swing.JButton();
		btndeljourney = new javax.swing.JButton();
		btndelfriend = new javax.swing.JButton();
		txtchaxun = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\great_wall_48px.png")); // NOI18N
		jLabel1.setText("\u666f\u70b9\uff1a");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\scenery.png")); // NOI18N
		jLabel2.setText("\u65c5\u884c\u793e\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setIcon(new javax.swing.ImageIcon(
				"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\user_.png")); // NOI18N
		jLabel3.setText("\u597d\u53cb\uff1a");

		// jComboBox1.setModel(javax.swing.DefaultComboBoxModel@4e73006d);

		// jcbjourney.setModel(javax.swing.DefaultComboBoxModel@60211c57);
		jcbjourney.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jcbjourneyActionPerformed(evt);
			}
		});

		// jcbfriend.setModel(javax.swing.DefaultComboBoxModel@1dcbc50f);

		btndelscen.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btndelscen
				.setIcon(new javax.swing.ImageIcon(
						"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\delete32px.png")); // NOI18N
		btndelscen.setText("\u5220\u9664\u666f\u70b9\u884c\u7a0b");
		btndelscen.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btndelscenActionPerformed(evt);
			}
		});

		btndeljourney.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btndeljourney
				.setIcon(new javax.swing.ImageIcon(
						"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\delete32px.png")); // NOI18N
		btndeljourney.setText("\u5220\u9664**\u884c\u7a0b");
		btndeljourney.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btndeljourneyActionPerformed(evt);
			}
		});

		btndelfriend.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btndelfriend
				.setIcon(new javax.swing.ImageIcon(
						"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\delete32px.png")); // NOI18N
		btndelfriend.setText("\u5220\u9664\u597d\u53cb");
		btndelfriend.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btndelfriendActionPerformed(evt);
			}
		});

		txtchaxun
				.setIcon(new javax.swing.ImageIcon(
						"E:\\我爱学习\\jps\\workspace\\Java_System_Moran\\images\\money_48px.png")); // NOI18N
		txtchaxun.setText("\u67e5\u8be2\u4f59\u989d");
		txtchaxun.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtchaxunActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(102, 102, 102)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2)
												.addComponent(jLabel3)
												.addComponent(jLabel1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.Alignment.TRAILING,
														0, 219, Short.MAX_VALUE)
												.addComponent(
														txtchaxun,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														142,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jcbfriend, 0,
														219, Short.MAX_VALUE)
												.addComponent(jcbjourney, 0,
														219, Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														btndelfriend,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														btndeljourney,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														btndelscen,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														211, Short.MAX_VALUE))
								.addContainerGap(68, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(160, 160, 160)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(btndelscen))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jcbjourney,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						btndeljourney))
																.addGap(13, 13,
																		13)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jcbfriend,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3)
												.addComponent(btndelfriend))
								.addGap(46, 46, 46)
								.addComponent(txtchaxun,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(47, 47, 47)));

		pack();
	}// </editor-fold>

	// GEN-END:initComponents

	/**
	 * 查询余额事件处理
	 * 
	 * @param evt
	 */
	private void txtchaxunActionPerformed(java.awt.event.ActionEvent evt) {
		Credit credit = new Credit();
		Credit_db credit_db = new Credit_db();
		Tools t = new Tools();
		Connection con = null;
		try {
			con = t.getConn();
			ResultSet rs = credit_db.FindMoney(con);
			while (rs.next()) {
				credit.setID(rs.getString("ID"));
				credit.setMoney(Float.parseFloat(rs.getString("money")));
				credit.setName_holder(rs.getString("name_holder"));
			}
			if (credit.getMoney() < 0) {
				JOptionPane.showMessageDialog(null, "没有钱,请尽快充值");
			} else {
				JOptionPane.showMessageDialog(
						null,
						"尊敬的" + credit.getName_holder() + "先生,您的账户余额为"
								+ credit.getMoney() + "元,为保障您的消费体验,请及时充值！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}

	}

	/**
	 * 取消旅行社行程
	 * 
	 * @param evt
	 */
	private void btndeljourneyActionPerformed(java.awt.event.ActionEvent evt) {
		JourneyPlan journeyPlan = (JourneyPlan) this.jcbjourney
				.getSelectedItem();
		// System.out.println("名称是："+journeyPlan.getJourney_name());
		int n1 = JOptionPane.showConfirmDialog(null, "是否取消该行程");
		if (n1 == 0) {
			try {
				con = t.getConn();
				JourneyPlan_db journeyPlan_db = new JourneyPlan_db();
				int n = journeyPlan_db.DelJourneyPlan(con, journeyPlan);
				// System.out.println(n);
				if (n > 0) {
					JOptionPane
							.showMessageDialog(null, "取消成功！退款将于2小时内到账,请注意查收");
					// 退款
					con = t.getConn();
					ResultSet rs = journeyPlan_db.SearchJourneyPlan(con);
					JourneyPlan journeyPlan1 = new JourneyPlan();
					while (rs.next()) {
						journeyPlan1.setJourney_name(rs
								.getString("journey_name"));
						journeyPlan1.setJourney_plan(rs
								.getString("journey_plan"));
						journeyPlan1.setJourney_money(rs
								.getString("journey_money"));
						System.out.println(rs.getString("journey_money")
								+ " 248");
					}
					Credit_db credit_db = new Credit_db();
					int n11 = credit_db.TuiQian(con, journeyPlan1);
					if (n11 > 0) {
						JOptionPane
								.showMessageDialog(
										null,
										"退款到账"
												+ journeyPlan1
														.getJourney_money()
												+ "元,祝您生活愉快！");
					} else {
						JOptionPane.showMessageDialog(null, "退款失败,请联系我");
					}
					jcbjourney.removeAllItems();
					filljourney();
				} else {
					JOptionPane
							.showMessageDialog(null, "未知的错误导致您不能取消该行程,请稍后在试");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				t.closeConn(con);
			}
		} else {

		}
	}

	/**
	 * 删除景点行程事件处理
	 * 
	 * @param evt
	 */
	private void btndelscenActionPerformed(java.awt.event.ActionEvent evt) {
		ScenePlan scene = (ScenePlan) this.jComboBox1.getSelectedItem();
		// System.out.println(scene.getScene_name());
		int n1 = JOptionPane.showConfirmDialog(null, "是否取消该行程");
		if (n1 == 0) {
			try {
				con = t.getConn();
				ScenePlan_db scenePlan_db = new ScenePlan_db();
				int n = scenePlan_db.DelSCenePlan(con, scene);
				if (n > 0) {
					JOptionPane.showMessageDialog(null,
							"取消成功！门票退款将于2小时内到账,请注意查收");
					jComboBox1.removeAllItems();
					fillscene();
					// 退款
					con = t.getConn();
					ResultSet rs = scenePlan_db.SearchScenePlan(con);
					ScenePlan scenePlan = new ScenePlan();
					while (rs.next()) {
						scenePlan.setId(rs.getString("Scene_id"));
						scenePlan.setScene_money(rs.getString("Scene_money"));
						
					}
					Credit_db credit_db = new Credit_db();
					int n11 = credit_db.TuiQian(con, scenePlan);
					if(n11>0){
						JOptionPane.showMessageDialog(null,"退钱成功");
					}else{
						JOptionPane.showMessageDialog(null, "退钱失败");
					}
				} else {
					JOptionPane
							.showMessageDialog(null, "未知的错误导致您不能取消该行程,请稍后在试");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				t.closeConn(con);
			}
		} else {

		}
	}

	// GEN-END:initComponents

	/**
	 * 删除好友事件处理
	 * 
	 * @param evt
	 */
	private void btndelfriendActionPerformed(java.awt.event.ActionEvent evt) {
		friend f = (friend) this.jcbfriend.getSelectedItem();
		// System.out.println(scene.getScene_name());
		int n1 = JOptionPane.showConfirmDialog(null, "删除好友后将不可找回,请三思");
		if (n1 == 0) {
			try {
				con = t.getConn();
				Friend_db friend_db = new Friend_db();
				int n = friend_db.Delfriend(con, f);
				if (n > 0) {
					JOptionPane.showMessageDialog(null, "删除成功！祝你好运");
					jcbfriend.removeAllItems();
					fillfriend();
				} else {
					JOptionPane.showMessageDialog(null, "未知的错误导致您不能删除该好友,别试了");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				t.closeConn(con);
			}
		} else {

		}
	}

	private void jcbjourneyActionPerformed(java.awt.event.ActionEvent evt) {

	}

	Tools t = new Tools();
	Scene_db scene_db = new Scene_db();
	Journey_db journey_db = new Journey_db();
	Friend_db friend_db = new Friend_db();
	ScenePlan_db sceneplan_db = new ScenePlan_db();
	JourneyPlan_db journeyPlan_db = new JourneyPlan_db();
	Connection con = null;

	/**
	 * 初始化景点下拉框
	 */
	public void fillscene() {
		try {
			con = t.getConn();
			ResultSet rs = sceneplan_db.Search_ScenePlan(con);
			while (rs.next()) {
				ScenePlan scenePlan = new ScenePlan();
				scenePlan.setId(rs.getString("Scene_id"));
				scenePlan.setScene_name(rs.getString("Scene_name"));
				System.out.println(rs.getString("Scene_name"));
				jComboBox1.addItem(scenePlan);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}
	}

	/**
	 * 初始化旅行社下拉框
	 */
	public void filljourney() {
		try {
			con = t.getConn();
			ResultSet rs = journeyPlan_db.SearchJourneyPlan(con);
			while (rs.next()) {
				JourneyPlan journeyPlan = new JourneyPlan();
				journeyPlan.setJourney_name(rs.getString("journey_name"));
				journeyPlan.setJourney_plan(rs.getString("journey_plan"));
				journeyPlan.setJourney_money(rs.getString("journey_money"));
				jcbjourney.addItem(journeyPlan);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}
	}

	/**
	 * 初始化我的好友下拉框
	 */
	public void fillfriend() {
		try {
			con = t.getConn();
			ResultSet rs = Friend_db.SearchMyFriend(con);
			while (rs.next()) {
				friend f = new friend();
				f.setId(rs.getString("id"));
				f.setHome(rs.getString("home"));
				f.setName(rs.getString("name") + " ta是我的好友");
				f.setSex(rs.getString("sex"));
				this.jcbfriend.addItem(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ManageInfo().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btndelfriend;
	private javax.swing.JButton btndeljourney;
	private javax.swing.JButton btndelscen;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JComboBox jcbfriend;
	private javax.swing.JComboBox jcbjourney;
	private javax.swing.JButton txtchaxun;
	// End of variables declaration//GEN-END:variables

}