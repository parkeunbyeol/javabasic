package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.ChoiceDao;
import view.tablemodel.ChoiceTableModel;;

public class ChoiceView extends JPanel{

	// 멤버변수
	JButton bAmeri;			// 아메리카노 버튼
	JButton bLatte;			// 라떼 버튼
	JButton bVainilla;		// 바닐라 버튼
	JButton bCaramel;		// 카라멜 버튼
	
//	JTextField tfCaffeine;		// [카페인]
//	JTextField tfMenuAmeri; 	// 아메리카노 메뉴명
//	JTextField tfCostAmeri;	 	// 아메리카노 가격
//	JTextField tfMenuLatte;	 	// 라떼 메뉴명
//	JTextField tfCostLatte;	 	// 라떼 가격
//	JTextField tfMenuVainilla;  // 바닐라 메뉴명
//	JTextField tfCostVainilla;	// 바닐라 가격
//	JTextField tfMenuCaramel;	// 카라멜 메뉴명
//	JTextField tfCostCaramel;	// 카라멜 가격
	
	
	JButton bIcetea;
	JButton	bChoco;
	JButton bGreentea;
	JButton bLemonade;
	
//	JTextField tfNonCaffeine;	// [논카페인]
//	JTextField tfMenuIcetea;	// 아이스티 메뉴명
//	JTextField tfCostIcetea;	// 아이스티 가격
//	JTextField tfMenuChoco;		// 초코프라푸치노 메뉴명	
//	JTextField tfCostChoco;		// 초코프라푸치노 가격
//	JTextField tfMenuGreentea;	// 그린티 메뉴명
//	JTextField tfCostGreentea;	// 그린티 가격
//	JTextField tfMenuLemonade;	// 레몬에이드 메뉴명	
//	JTextField tfCostLemonade;	// 레몬에이드 가격
	
	
	JButton	bHoney;				// 허니브레드 버튼
	JButton	bStrawberry;		
	JButton bCheese;
	JButton bHotdog;
	
//	JTextField tfDissert;		// [디저트]
//	JTextField tfMenuHoney;
//	JTextField tfCostHone;
//	JTextField tfMenuStrawberry;
//	JTextField tfCostStrwaberry;
//	JTextField tfMenuCheese;
//	JTextField tfCostCheese;
//	JTextField tfMenuHotdog;
//	JTextField tfCostHotdog;
	
	
	JTextField tfOption; 		//[옵션]
	
	
	JRadioButton rbHot, rbIce, rbLessIce, rbManyIce, rbNoTakeout, rbTakeOut
				, rbHighSweet, rbLowSweet, rbManyCream, rbLessCream;
	
	JButton bAdd, bPay;		// 담기 버튼
	
	JComboBox	comChoiceSearch; // 선택한 리스트를 오른쪽 아래 주문내역에서 컬럼명을 보여주기 위해 
	
	JTable		tableChoice; // 테이블 초이스라는 이름의 제이테이블을 만든다
	ChoiceTableModel tbModelChoice; // 주문한 내역 메뉴판 오른쪽에 뜨게 함

	
	// 모델단 변수 선언
	ChoiceDao dao;
	
	public ChoiceView() {
		addLayout();
	}
	

//
//	
//
//	void connectDB() {
//	
//	}
//
//
//	void eventProc() {
//		
//	} // end of eventproc()
	


	void addLayout() {
		// 멤버 변수 객체 생성
		
//			= new JTextField(20);
//			= new JTextField(20);
//			= new JTextField(20);
//			= new JTextField(20);
	
		bAmeri			= new JButton("아메리카노 \n 2000원");
		bLatte			= new JButton("카페라떼  \n 3000원");
		bVainilla		= new JButton("바닐라라떼 3500원");	
		bCaramel		= new JButton("카라멜라떼 3500원");
		bIcetea			= new JButton("아이스티  3500원");
		bChoco			= new JButton("초코프라푸치노 5000원");
		bHoney			= new JButton("허니브레드 7000원");
		bLemonade		= new JButton("레몬에이드 3500원");
		bStrawberry		= new JButton("딸기케이크 7000원");
		bCheese			= new JButton("치즈케이크 6500원");
		bHotdog			= new JButton("핫도그   5800원");
		bGreentea		= new JButton("그린티   3800원");
		
		rbIce			= new JRadioButton("ICE");
		rbHot			= new JRadioButton("HOT");
		rbManyIce		= new JRadioButton("얼음 많이");
		rbLessIce		= new JRadioButton("얼음 적게");
		rbNoTakeout		= new JRadioButton("매장용컵");
		rbTakeOut		= new JRadioButton("일회용컵");
		rbHighSweet		= new JRadioButton("달게");
		rbLowSweet		= new JRadioButton("덜달게");
		rbManyCream		= new JRadioButton("휘핑많이");
		rbLessCream 	= new JRadioButton("휘핑적게");
		
		bAdd			= new JButton("담기");
		bPay			= new JButton("결제하기");
		
		String []cbChoiceSearch = {"메뉴명","수량","옵션", "가격"};
		comChoiceSearch	= new JComboBox(cbChoiceSearch);
		
		tbModelChoice	= new ChoiceTableModel();
		tableChoice		= new JTable(tbModelChoice);
		
		ButtonGroup group_temper = new ButtonGroup(); //  라디옿 버튼 그룹화를 위한 버튼그룹 설정, 같은 그룹끼리는 하나만 선택가능
		group_temper.add(rbIce);
		group_temper.add(rbHot);
		
		ButtonGroup group_cup = new ButtonGroup();
		group_cup.add(rbTakeOut);
		group_cup.add(rbNoTakeout);
		
		ButtonGroup group_ice = new ButtonGroup();
		group_ice.add(rbManyIce);
		group_ice.add(rbLessIce);
		
		ButtonGroup group_sweet = new ButtonGroup();
		group_sweet.add(rbHighSweet);
		group_sweet.add(rbLowSweet);
		
		ButtonGroup group_cream = new ButtonGroup();
		group_cream.add(rbManyCream);
		group_cream.add(rbLessCream);
		
		
		
		
		// 화면구성
		// 왼쪽 
			JPanel p_left =  new JPanel();
//			p_left.setLayout(new BorderLayout());
			p_left.setBorder(new TitledBorder(" 음 료  "));
			p_left.setLayout(new GridLayout(4,3));
			p_left.add(bAmeri);
			p_left.add(bIcetea);
			p_left.add(bHoney);
			p_left.add(bLatte);
			p_left.add(bChoco);
			p_left.add(bStrawberry);
			p_left.add(bVainilla);
			p_left.add(bGreentea);
			p_left.add(bCheese);
			p_left.add(bCaramel);
			p_left.add(bLemonade);
			p_left.add(bHotdog);
			
//	 // 왼쪽 화면에 붙이기
//			add
			
			
		// 오른쪽
			JPanel p_right = new JPanel();
			p_right.setLayout(new GridLayout(2, 1));
				JPanel p_right_north = new JPanel();
				p_right_north.setLayout(new GridLayout(1, 2));
				
					// 오른쪽 위 서쪽
					JPanel p_option = new JPanel();
					p_option.setLayout(new GridLayout(5,2));
					p_option.add(rbIce);
					p_option.add(rbHot);
					p_option.add(rbNoTakeout);
					p_option.add(rbTakeOut);
					p_option.add(rbManyIce);
					p_option.add(rbLessIce);
					p_option.add(rbHighSweet);
					p_option.add(rbLowSweet);
					p_option.add(rbManyCream);
					p_option.add(rbLessCream);
					p_option.setBorder(new TitledBorder(" 옵션  "));	
					// 오른쪽 위 동쪽	
					JPanel p_btn= new JPanel();
					p_btn.setLayout(new GridLayout(2,1));
					p_btn.add(bAdd);
					p_btn.add(bPay);
				p_right_north.add(p_option);
				p_right_north.add(p_btn);
					
				// 오른쪽 아래
				JPanel p_right_south = new JPanel();
				p_right_south.add(new JScrollPane(tableChoice));
//				p_right_south.setBorder(new TitledBorder(" 주문내역 "));
					
			p_right.add(p_right_north);
			p_right.add(p_right_south);
			
		//전체붙이기
	    setLayout(new GridLayout(1,2));
	  

	    	
	    
		add(p_left);
		add(p_right);
		
//		add(bAdd);

//		add(p_right_north, BorderLayout.NORTH);
//		add(p_right_south, BorderLayout.SOUTH);
//		add(p_north, BorderLayout.NORTH);
//		add( new JScrollPane(, BorderLayout.CENTER);

	//오른쪽 화면에 붙이기
		
		
		
	}

	
//	public void searchChoice() {
//		//사용자가 선택한 버튼 값 없어오기
//		bAmeri.setText("아메리카노 2000원");
//		System.out.println("getText" + bAmeri.setText());
//	}
//	

}