package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.RentDao;
import model.dao.RentDaoImpl;
import view.tablemodel.RentTableModel;

public class RentView extends JPanel{

	// 멤버변수
	JTextField tfRenttel;
	JTextField tfRentCustName;	
	JTextField tfRentVideoNum;	// 비디오번호 
	JButton bRent; // 대여버튼
	
	JTextField tfReturnVideoNum;
	JButton bReturn; // 반납버튼
	
	JTable tableRecentList;	// 미납목록 Jtable
	RentTableModel tmRent;
	
	// 모델단 변수 선어
	RentDao dao;
	
	public RentView() {
		addLayout();	// 객체생성 + 화면구성
		eventProc();	// 이벤트 등록
		connectDB();	// 모델단 연결
		showNOReturnList(); // 맨처음 화면에 미납목록이 바로 떠 있다.
	}

	void connectDB() {
		try {
			dao = new RentDaoImpl();
		} catch (Exception e) {
			System.out.println("대여관리 드라이버로딩 실패");
			e.printStackTrace();
		}
	}


	void eventProc() {
		// 이벤트 처리
		// 전화번호 텍스트필드에서 엔터쳤을 때 = 고객명 출력
		tfRenttel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		// 대여버튼이 눌렸을 때
		bRent.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				// 확인용 System.out.println("대여버튼");
			// 화면에서 입력한 전화번호와 비디오번호를 얻어오기
			String tel	 = tfRenttel.getText();
			int vnum	 = Integer.parseInt( tfRentVideoNum.getText() );
			try {
				dao.rentVideo(tel, vnum);
				showNOReturnList(); 
				System.out.println("대여완료");
				// 화면 초기화
			} catch (Exception e1) {
				System.out.println("대여실패");
				e1.printStackTrace();
			 }
			}
		});
		
		// 반납 버튼이 눌렸을 때
		bReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 확인용 System.out.println("반납버튼");
				// 비디오 번호 넘거받기
				int vnum = Integer.parseInt(tfReturnVideoNum.getText());

				try {
					dao.returnVideo(vnum);
					showNOReturnList(); // 반납이 되면 미납목록에서 수정된 화면을 바로 볼 수 있음
					System.out.println("반납완료");
				} catch (Exception e1) {
					System.out.println("반납실패");
					e1.printStackTrace();
				}
			}
		});


	} // end of eventproc()
	
	void showNOReturnList() {
		try {
			ArrayList data = dao.selectNoReturnList();
			tmRent.data = data;
			tmRent.fireTableDataChanged(); // 데이타가 바뀌면 최종화면에서 한번더 바뀐 화면을 출력하여 사용자가 바뀐 걸 인식하게 해준다.
		} catch (Exception e) {
			System.out.println("미납목록출력 실패");
			e.printStackTrace();
		}
	}


	void addLayout() {
		// 멤버 변수 객체 생성
		
		tfRenttel		= new JTextField(20);
		tfRentCustName	= new JTextField(20);
		tfRentVideoNum	= new JTextField(20);
		tfReturnVideoNum= new JTextField(20);
	
		bRent			= new JButton("대여");
		bReturn			= new JButton("반납");

		tmRent			= new RentTableModel();
		tableRecentList = new JTable(tmRent);

		// 화면구성
		// 위쪽영역		
		// 위쪽의 왼쪽 영역
			JPanel p_north_left	= new JPanel();
			p_north_left.setBorder(new TitledBorder(" 대  여  "));
			p_north_left.setLayout(new GridLayout(4,2));
			p_north_left.add(new JLabel("전화번호"));
			p_north_left.add(tfRenttel);
			p_north_left.add(new JLabel("고객명"));
			p_north_left.add(tfRentCustName);
			p_north_left.add(new JLabel("비디오번호"));
			p_north_left.add(tfRentVideoNum);
			p_north_left.add(bRent);
	
	
	
			// 위쪽의 오른쪽 영역
			JPanel p_north_right = new JPanel();
			p_north_right.setBorder(new TitledBorder(" 반  납 " ));
			p_north_right.add(new JLabel("비디오번호"), BorderLayout.WEST); 	
			p_north_right.add(tfReturnVideoNum);
			p_north_right.add(bReturn);
	
	
			JPanel p_north = new JPanel();
			p_north.setLayout(new GridLayout(1, 2));
			p_north.add(p_north_left);
			p_north.add(p_north_right);

		//전체붙이기
		setLayout(new BorderLayout());
		add(p_north, BorderLayout.NORTH);
		add( new JScrollPane(tableRecentList), BorderLayout.CENTER);


		
		
		
	}


}