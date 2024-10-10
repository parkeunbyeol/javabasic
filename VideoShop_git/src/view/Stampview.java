package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.StampDao;
import view.VideoView.ButtonEventHandler;

public class Stampview extends JPanel{

	// 멤버변수

	JTextField tfTel, tfScnt; 		// 전화번호 입력창
	
	JButton bSearch, bJoin, bUse, bSave;		// 검색, 가입, 사용하기, 적립하기 버튼
	
	JRadioButton rbYesStamp, rbNoStamp; // 스탬프 적립 및 미적립 라디오 버튼
	

	
	// 모델단 변수 선언
	StampDao dao;
	
	public Stampview() {
		addLayout();
		eventProc();
		connectDB();
	}
	

//
//	
//
//	void connectDB() {
//	
//	}
//
//
	public void connectDB() {
		//dao = new StampDao() {
//			
//			@Override
//			public ArrayList selectNoReturnList() throws Exception {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public int returnVideo(int vnum) throws Exception {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int rentVideo(String tel, int vnum) throws Exception {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
	}



	void addLayout() {
		// 멤버 변수 객체 생성
		
//			= new JTextField(20);
//			= new JTextField(20);
//			= new JTextField(20);
//			= new JTextField(20);
		rbYesStamp	= new JRadioButton("적립하기");
		rbNoStamp	= new JRadioButton("적립안함");
		
		bSearch 	= new JButton("검색");
		bJoin		= new JButton("가입");
		bUse		= new JButton("사용하기");
		bSave		= new JButton("적립하기");

		tfTel		= new JTextField(20);		// 학생 전화번호 입력창
		tfScnt		= new JTextField(10);		// 스탬프 개수 출력되는 창
				
		ButtonGroup temper = new ButtonGroup();
		rbYesStamp.setHorizontalAlignment(JRadioButton.CENTER);
		rbNoStamp.setHorizontalAlignment(JRadioButton.CENTER);
		temper.add(rbYesStamp);
		temper.add(rbNoStamp);
		
		
		// 화면구성
		// 오른쪽 
			JPanel p_right = new JPanel();
		// 왼쪽 
			JPanel p_left =  new JPanel();
			p_left.setLayout(new GridLayout(2,1));
			
			
			// 왼쪽 위
				JPanel p_left_north = new JPanel();
				p_left_north.setLayout(new GridLayout(3,1));
				p_left_north.setBorder(new TitledBorder(" 적립 선택 " ));
				JLabel label_1 = new JLabel("<스탬프 적립 여부>");
				label_1.setHorizontalAlignment(JLabel.CENTER);
				label_1.setFont(new Font("돋움",Font.BOLD, 30));

				
				
				p_left_north.add(label_1);
				p_left_north.add(rbYesStamp);
				p_left_north.add(rbNoStamp);
//	
				
			// 왼쪽 아래
				JPanel p_left_south = new JPanel();
				p_left_south.setLayout(new GridLayout(3,1));
				p_left_south.setBorder(new TitledBorder(" 적립 및 가입 " ));
				
				// 스탬프접립 조회 및 가입 라벨과 전화번호 검색창 같이 붙인 판
				JPanel p_stamp_search = new JPanel();
				p_stamp_search.setLayout(new GridLayout(2,1));
		
					// Label
					JPanel p_label = new JPanel();
					JLabel label_2 = new JLabel("<스탬프 적립 조회/가입>");
					label_2.setHorizontalAlignment(JLabel.CENTER);	// 가운데로 오게 하는 
					label_2.setFont(new Font("돋움",Font.BOLD, 30));

					
					p_label.add(label_2);
				
					// 전화번호 입력 TextField / 검색 버튼 / 가입 버튼
					JPanel p_tfTel_bSearch_bJoin = new JPanel();
					p_tfTel_bSearch_bJoin.add(new JLabel("전화번호"));
					p_tfTel_bSearch_bJoin.add(tfTel);
					p_tfTel_bSearch_bJoin.add(bSearch);
					p_tfTel_bSearch_bJoin.add(bJoin);
				
				p_stamp_search.add(p_label);
				p_stamp_search.add(p_tfTel_bSearch_bJoin);
						
				
				// 누적 스탬프 개수 
				JPanel p_stamp_count = new JPanel();
					   p_stamp_count.setLayout(new FlowLayout());
						p_stamp_count.add(new JLabel("누적 스탬프 개수"));
						p_stamp_count.add(tfScnt);
					
				// 스탬프 사용 또는 적립만 여부 버튼
				JPanel p_stamp_button = new JPanel();
					p_stamp_button.setLayout(new GridLayout(1,2));
					p_stamp_button.add(bUse);
					p_stamp_button.add(bSave);
					
					
				p_left_south.add(p_stamp_search);
				p_left_south.add(p_stamp_count);
				p_left_south.add(p_stamp_button);
					
			// p_left 한 판에 붙이기
				p_left.add(p_left_north);
				p_left.add(p_left_south);
	    	
	 // 전체 붙이기
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

	void eventProc() {
		// 라디오 버튼 " 적립하기 " 가 눌렸을 때 적립 및 가입 파트 활성
		rbNoStamp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(rbNoStamp.isSelected());
				if(rbNoStamp.isSelected()) {
					System.out.println(" 실행1 ");
					tfTel.setEditable(false);
					//tfTel.setEnabled(false);
					
				} else {
					//tfTel.setEditable(false);
					tfTel.setEditable(false);
				}
				
			}
		});
		
		
		
		
		
		
	} // end of eventproc()
	
	
	
	
}