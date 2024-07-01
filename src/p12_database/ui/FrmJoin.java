package p12_database.ui;

import javax.swing.*;
import java.awt.*;

public class FrmJoin extends FrmBasic {
  private JLabel lbJoin, lbName, lbId, lbPass, mobile;
  private JTextField tfId;
  private JPasswordField pfPass;
  private JButton btnLogin, btnJoin;
  private JPanel pnlCenter, pnlSouth;

  public FrmJoin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbJoin = new JLabel("Join");
    lbJoin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbJoin.setHorizontalAlignment(JLabel.CENTER);
    lbJoin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
    lbName = new JLabel("이름");
    lbId = new JLabel("ID");
    lbPass = new JLabel("Pass");
    mobile = new JLabel("Mobile");
    tfId = new JTextField(20);
    pfPass = new JPasswordField(20);
    btnJoin = new JButton("가입");
    btnLogin = new JButton("로그인");
  }
//



  @Override
  public void arrange() {
  }

}