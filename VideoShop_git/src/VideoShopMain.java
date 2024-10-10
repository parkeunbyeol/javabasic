

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import view.CustomerView;
import view.RentView;
import view.Stampview;
import view.VideoView;
import view.ChoiceView;

public class VideoShopMain extends JFrame{
	
	CustomerView customer;	// 고객관리 화면
	VideoView 	 video;		// 비디오 관리 화면
	RentView	 rent;		// 대여 관리 화면
	ChoiceView	choice;		// 카페 메뉴 및 옵션 선택화면		 
	Stampview		Stamp;		// 스탬프 조회 
	
	
	VideoShopMain(){
		
		
		
		customer = new CustomerView();
		video	 = new VideoView();
		rent	=  new RentView();	
		choice	=  new ChoiceView();
		Stamp	=  new Stampview(); 
		// 붙이기
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("고객관리",	customer);	// 0번째
		pane.addTab("비디오관리",	video);		// 1번째
		pane.addTab("대여관리",	rent);		// 2번째
		pane.addTab("카페메뉴및옵션선택화면", choice);
		pane.addTab("스탬프적립및사용", Stamp);
		
		
		pane.setSelectedIndex(4);	// 대여관리를 첫 화면으로 , "대여관리" 2번째
		
		add(pane, BorderLayout.CENTER);
		
		// 화면 출력
		setTitle("우리 비디오샵");
		setBounds(100, 100, 950, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		
		new VideoShopMain();
	}
}
