package gui;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {

ContentPaneEx() {
setTitle("ContentPane과JFrame예제"); // 프레임의타이틀달기
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container contentPane= getContentPane(); // 컨텐트팬알아내기
contentPane.setBackground(Color.ORANGE); // 오렌지색배경설정
contentPane.setLayout(new FlowLayout()); // 컨텐트팬에FlowLayout
// 배치관리자달기
contentPane.add(new JButton("OK")); // OK 버튼달기
contentPane.add(new JButton("Cancel")); // Cancel 버튼달기
contentPane.add(new JButton("Ignore")); // Ignore 버튼달기
setSize(300, 150); // 프레임크기300x150 설정
setVisible(true); // 화면에프레임출력
}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}