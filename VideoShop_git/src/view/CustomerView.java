package view;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.CustomerDao;
import model.dao.CustomerDaoImpl;
import model.vo.CustomerVO;


public class CustomerView extends JPanel 
{

	JTextField	tfCustName, 		// 고객명
				tfCustTel,  		// 고객전화전호
				tfCustTelAid, 		// 추가전화번호
				tfCustAddr, 		// 고객주소
				tfCustEmail;		// 고객이메일
	JButton		bCustRegist, 		// 고객정보등록버튼
				bCustModify;		// 고객정보수정버튼
	
	JTextField  tfCustNameSearch,  	// 고객명검색시 고객명 입력
				tfCustTelSearch;	// 고객전화전호 검색시 전화번호 입력
	JButton		bCustNameSearch,  	// 고객명검색시 버튼
				bCustTelSearch;		// 고객전화전호 검색시 버튼

	
	// 모델단 변수 선언
	CustomerDao dao;
	
	public CustomerView(){
		addLayout();		// 화면붙이기 구성
		connectDB();		// 디비연결
		eventProc();		// 화면에서 이벤트처리
	}
	
	public void eventProc(){
				
		// 이벤트 등록
		bCustRegist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registCustomer();  		// 회원등록
			}
		});
		
		bCustModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCustomer();  		// 회원정보수정
			}
		});
		bCustNameSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchByTel();  		// 전화번호 검색
			}
		});
		bCustTelSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchByTel();		 // 이름검색
			}
		});
	}
	
	
	
	// 회원가입하는 메소드
	public void registCustomer(){
			
		// 1. 화면 텍스트필드의 입력값 얻어오기			
		// 2. 1값들을 Customer 클래스의 멤버로지정			
		// 3. Model 클래스 안에 insertCustomer () 메소드 호출하여 2번 VO 객체를 넘김
		// 4. 화면 초기화
		
		
		CustomerVO vo = new CustomerVO();
		vo.setCustName(tfCustName.getText());
		vo.setCustTel1(tfCustTel.getText());
		vo.setCustTel2(tfCustTelAid.getText());
		vo.setCustAddr(tfCustAddr.getText());
		vo.setCustEmail(tfCustEmail.getText());
		
		try {
			dao.insertCustomer(vo);
		} catch (Exception e) {
			System.out.println("고객정보 입력 실패:" + e.getMessage());
			e.printStackTrace();
		}
		
		tfCustName.setText("");
		tfCustTel.setText("");
		tfCustEmail.setText("");
		tfCustAddr.setText("");
		tfCustTelAid.setText("");
		
		// 나머지도
	}
	
	
	// 전화번호에 의한 검색
	public void searchByTel(){
		// 1. 입력한 전화번호 얻어오기
		// 2. Model의 전화번호 검색메소드 selectByTel()  호출
		// 3. 2번의 넘겨받은 Customer의 각각의 값을 화면 텍스트 필드 지정
	
		//JOptionPane.showMessageDialog(null, "검색");
		String tel = tfCustTelSearch.getText();
		
		try {
			CustomerVO result = dao.selectByTel(tel);
			tfCustName.setText( result.getCustName());
			tfCustTel.setText( result.getCustTel1());
			tfCustTelAid.setText( result.getCustTel2());
			tfCustAddr.setText( result.getCustAddr());
			tfCustEmail.setText( result.getCustEmail());
			
			
		} catch (Exception e) {
			System.out.println("전화번호 검색 실패");
			e.printStackTrace();
		}
		
	}
	
	// 회원정보수정
	public void updateCustomer(){
		
		// 사용자 입력값을 받아오기
		String name	 = tfCustName.getText();
		String tel	 = tfCustTel.getText();
		String tel2  = tfCustTelAid.getText();
		String add	 = tfCustAddr.getText();
		String email = tfCustEmail.getText();
		
		CustomerVO vo = new CustomerVO();
		vo.setCustAddr(add);
		vo.setCustEmail(email);
		vo.setCustName(name);
		vo.setCustTel1(tel);
		vo.setCustTel2(tel2);
		
		try {											// DTO : data transfer object
			dao.updateCustomer(vo);
			//clearText(); 							// 입력에 성공해서 입력된 텍스트를 다 지워냄
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "수정");
	}
	
	
	public void connectDB(){
		try {
			
		dao = new CustomerDaoImpl();
		} catch (Exception e) {
			System.out.println("고객관리 모델단 생성 실패");
			e.printStackTrace();			
		}
		
	}
	
	public void addLayout(){
		
		tfCustName			= new JTextField(20);
		tfCustTel			= new JTextField(20);
		tfCustTelAid		= new JTextField(20);
		tfCustAddr			= new JTextField(20);
		tfCustEmail			= new JTextField(20);


		tfCustNameSearch	= new JTextField(20);
		tfCustTelSearch		= new JTextField(20);

		bCustRegist			= new JButton("회원가입");
		bCustModify			= new JButton("회원수정");
		bCustNameSearch		= new JButton("이름검색");
		bCustTelSearch		= new JButton("번호검색");

		// 회원가입 부분 붙이기 
		JPanel pRegist = new JPanel();
		JPanel pRegistInfo = new JPanel();
		pRegistInfo.setLayout(new GridLayout(5, 2));
		pRegistInfo.add(new JLabel("고객명"));
		pRegistInfo.add(tfCustName);
		pRegistInfo.add(new JLabel("전화번호"));
		pRegistInfo.add(tfCustTel);
		pRegistInfo.add(new JLabel("추가전화번호"));
		pRegistInfo.add(tfCustTelAid);
		pRegistInfo.add(new JLabel("주소"));
		pRegistInfo.add(tfCustAddr);
		pRegistInfo.add(new JLabel("이메일"));
		pRegistInfo.add(tfCustEmail);
		JPanel pRegistButton = new JPanel();
		pRegistButton.setLayout(new GridLayout(2, 1));
		pRegistButton.add(bCustRegist);
		pRegistButton.add(bCustModify);

		pRegist.setLayout(new FlowLayout());
		pRegist.add(pRegistInfo);
		pRegist.add(pRegistButton);
			
		// 회원검색 부분 붙이기
		JPanel pSearch = new JPanel();
		pSearch.setLayout(new GridLayout(2, 1));
		JPanel pSearchName = new JPanel();
		pSearchName.add(new JLabel("		이 	름	"));
		pSearchName.add(tfCustNameSearch);
		pSearchName.add(bCustNameSearch);
		JPanel pSearchTel = new JPanel();
		pSearchTel.add(new JLabel("	전화번호	"));
		pSearchTel.add(tfCustTelSearch);
		pSearchTel.add(bCustTelSearch);
		pSearch.add(pSearchName);
		pSearch.add(pSearchTel);

		// 전체 패널에 붙이기
		setLayout( new BorderLayout() );
		add(pRegist, BorderLayout.CENTER );
		add(pSearch, BorderLayout.SOUTH );
		
	}
	

}			 	
				 	
