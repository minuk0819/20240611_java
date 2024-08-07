package p12_database.ui;

import p12_database.dao.MembersDAO;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin extends FrmBasic {
  private JLabel lbLogin, lbId, lbPass;
  private JTextField tfId;
  private JPasswordField pfPass;
  private JButton btnLogin, btnJoin, btnClose;
  private JPanel pnlCenter, pnlSouth;

  public FrmLogin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbLogin = new JLabel("Login");
    lbLogin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbLogin.setHorizontalAlignment(JLabel.CENTER);
    lbLogin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
    lbId = new JLabel("ID");
    lbPass = new JLabel("Pass");
    tfId = new JTextField(20);
    pfPass = new JPasswordField(20);
    btnLogin = new JButton("Login");
    btnJoin = new JButton("Join");
    btnClose = new JButton("Close");

    tfId.addActionListener(e -> {
      if (!isEmptyId()) pfPass.requestFocus();
    });
    pfPass.addActionListener(
        e -> {
          if (!isEmptyId() && !isEmptyPass()) {
            loginAccess(tfId.getText(), new String(pfPass.getPassword()));
          }
        });
    btnLogin.addActionListener(
        e -> {
          if (!isEmptyId() && !isEmptyPass()) {
            loginAccess(tfId.getText(), new String(pfPass.getPassword()));
          }
        });
    btnJoin.addActionListener(e -> {
      new FrmJoin("회원가입", 500, 500);
      dispose();
    });
    btnClose.addActionListener(e -> {
      dispose();
    });
    pnlCenter = new JPanel(new GridLayout(2, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0, 30, 20, 30));
    pnlSouth = new JPanel();
  }

  private void loginAccess(String id, String pass) {
    Members members = new MembersDAO().loginCheck(id, pass);
    if (members == null) {
      JOptionPane.showMessageDialog(this, "없는 ID입니다.");
    } else {
      new FrmMain("회원정보관리 " + members.getName() + "님 환영합니다.", 600, 600);
      dispose();
    }
  }

  // 유효성 검사(Validation Check)
  private boolean isEmptyId() { // 비어 있지 않으면 false
    if (!tfId.getText().toString().trim().equals("")) return false;
    return true; // 비어 있으면 true
  }

  private boolean isEmptyPass() { // 비어 있지 않으면 false
    if (!new String(pfPass.getPassword()).toString().trim().equals("")) return false;
    return true; // 비어 있으면 true
  }

  @Override
  public void arrange() {
    add(lbLogin, "North");
    pnlCenter.add(lbId);
    pnlCenter.add(tfId);
    pnlCenter.add(lbPass);
    pnlCenter.add(pfPass);
    add(pnlCenter, "Center");
    pnlSouth.add(btnLogin);
    pnlSouth.add(btnJoin);
    pnlSouth.add(btnClose);
    add(pnlSouth, "South");
  }

  @Override
  public void inflate() {
    super.inflate();
  }
}