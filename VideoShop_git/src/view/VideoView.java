package	 view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.VideoDao;
import model.dao.VideoDaoImpl;
import model.vo.VideoVO;
import view.tablemodel.VideoTableModel;


public class VideoView extends JPanel 
{	
	//	member field
	JTextField	tfVideoNum, 		// 영화번호
				tfVideoTitle, 		// 영화제목
				tfVideoDirector, 	// 영화감독
				tfVideoActor;		// 영화배우
	
	JComboBox	comVideoGenre;		// 영화장르
	JTextArea	taVideoContent;		// 영화내용
	JTextArea	ta;
	
	JCheckBox	cbMultiInsert;		// 입고수 여부 체크박스버튼
	JTextField	tfInsertCount;		// 입고수

	JButton		bVideoInsert, 		// 정보입력버튼
				bVideoModify, 		// 정보수정버튼
				bVideoDelete;		// 정보삭제버튼

	JComboBox	comVideoSearch;		// 검색시 카테고리
	JTextField	tfVideoSearch;		// 검색시 검색어
	
	JTable		tableVideo;			// JTable 변수	
	VideoTableModel tbModelVideo;
	
	
	//모델단변수
	VideoDao dao;

	
	//##############################################
	//	constructor method
	public VideoView(){
		addLayout(); 	// 화면설계
		initStyle();	// 화면처음 출력시 지정할 부분
		eventProc();	// 화면에서 이벤트 처리
		connectDB();	// DB연결
	}
	
	public void connectDB(){	// DB연결
		try {
			dao = new VideoDaoImpl();
		} catch (Exception e) {
			System.out.println("비디오관리 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void eventProc(){
		// 체크박스가 눌렸을 때 tfInseftCount 가 쓸수있게됨
		cbMultiInsert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
			/*	if(cbMultiInsert.isSelected()){
					tfInsertCount.setEditable(true); // true가 됐다는 건 다중입고에 체크 표시를 했다는 것. 그러면 개수 입력하는 창도 true가 돼서 입력이 가능해진다.
				}
				else
					tfInsertCount.setEditable(false);*/ // 반대로 false가 됐다는 건 다중입고에 체크를 안했다는 것. 그러면 개수 입력하는 창도 false가 돼서 입력 안됨.
				
				tfInsertCount.setEditable( cbMultiInsert.isSelected() ); //setEnabel 사용시 다중입고 안된다. 값을 못 갖다쓰므로 setEditable을 사용해야한다.
			}						
		});
		
		ButtonEventHandler btnHandler = new ButtonEventHandler();

		// 이벤트 등록
		bVideoInsert.addActionListener(btnHandler);
		bVideoModify.addActionListener(btnHandler);
		bVideoDelete.addActionListener(btnHandler);
		tfVideoSearch.addActionListener(btnHandler);
		
		// 검색한 열을 클릭했을 때
		tableVideo.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ev){
				
				try{
					int row = tableVideo.getSelectedRow();
					int col = 0;	// 검색한 열을 클릭했을 때 클릭한 열의 비디오번호
					// Object -> Integer -> int 형변환
					int vNum = ((Integer)tableVideo.getValueAt(row, col)).intValue(); // Integer로 형변환 한 것을 다시 int로 해주기 위해 intValue한건데 우리가쓰는 건 자동으로 호환해줌, 옛날 버전은 호환안돼서 해줘야함
					// JOptionPane.showMessageDialog(null, vNum);
					
					VideoVO vo = dao.selectByPk(vNum); 
					// vo의 각각의 값들을 각각의 화면 출력
					comVideoGenre.setSelectedItem(vo.getMv_genre());
					tfVideoTitle.setText(vo.getMv_title());
					tfVideoDirector.setText(vo.getMv_direc());
					tfVideoActor.setText(vo.getMv_actor());
					taVideoContent.setText(vo.getMv_exp());					
					tfVideoNum.setText(String.valueOf(vo.getMvno()));	
					
					System.out.println("여기");					
					
//					vo.setMvno(Integer.parseInt(tfVideoNum.getText()));
					
				}catch(Exception ex){
					System.out.println("실패 : "+ ex.getMessage());
				}
				
			}
		});
	}		
	
	// 버튼 이벤트 핸들러 만들기
	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			
			if(o==bVideoInsert){  
				registVideo();					// 비디오 등록
			}
			else if(o==bVideoModify){  
				modifyVideo();					// 비디오 정보 수정
			}
			else if(o==bVideoDelete){  
				deleteVideo();					// 비디오 정보 삭제
			}
			else if(o==tfVideoSearch){
				searchVideo();					// 비디오 검색
			}
		}
	}
	
	// 입고 클릭시  - 비디오 정보 등록
	public void registVideo(){
		// JOptionPane.showMessageDialog(null, "입고");
	
		// 각각의 화면에서 입력 값 얻어온 뒤 VideoVO에 지정하기
		VideoVO vo = new VideoVO();
		vo.setMv_genre((String)comVideoGenre.getSelectedItem()); // String의 부모는 Object임 
		// 나머지도
		//vo.setMvno(Integer.parseInt((tfVideoNum.getText()))); getText는 값을 입력해줘야 오류가 안나는데 setMvno는 자동으로 입력처리하였고 내가 따로 입력하는 게 아니라서 주석처리해준다
		vo.setMv_title(tfVideoTitle.getText());
		vo.setMv_direc(tfVideoDirector.getText());
		vo.setMv_actor(tfVideoActor.getText());
		vo.setMv_exp(taVideoContent.getText());
		
		// 비디오갯수값 얻어오기
		int count = (Integer.parseInt(tfInsertCount.getText()));
		
	
		try {
		dao.insertVideo(vo, count);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "입고실패");
			e.printStackTrace();
		}
	}
	

	
	// 수정 클릭시 - 비디오 정보 수정
	public void modifyVideo(){
		JOptionPane.showMessageDialog(null, "수정");
		// 사용자 입력 값 받아오기
		VideoVO vo = new VideoVO();
		vo.setMv_genre((String)comVideoGenre.getSelectedItem());
		vo.setMv_title(tfVideoTitle.getText());
		vo.setMv_direc(tfVideoDirector.getText());
		vo.setMv_actor(tfVideoActor.getText());
		vo.setMv_exp(taVideoContent.getText());	
		vo.setMvno(Integer.parseInt(tfVideoNum.getText()));
//		// 비디오갯수값 얻어오기
//		int count = (Integer.parseInt(tfInsertCount.getText()));
//		
		try {
			dao.modifyVideo(vo);
			ta.setText("수정되었습니다");
			
		} catch (Exception ex) {
			ta.setText("수정 실패" + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	// 삭제 클릭시 - 비디오 정보 삭제
	public void deleteVideo(){
		
		JOptionPane.showMessageDialog(null, "삭제");
	}
	
	// 비디오현황검색
	public void searchVideo(){
		//JOptionPane.showMessageDialog(null, "검색");
		// 사용자가 선택한 인덱스와 입력 값 얻어오기
		int		idx = comVideoSearch.getSelectedIndex(); // 사용자가 선택한 인덱스
		String word = tfVideoSearch.getText();
		
		try {
		ArrayList data = dao.selectVideos (idx, word); // 출력할 내용이 몇개인지 모르므로 arraylist사ㅏ용
		tbModelVideo.data = data;
		tbModelVideo.fireTableDataChanged(); // 데이터와 테이블을 따로 관리하기 때문에 화면이 출력 된 상태에서 데이터를 바꿔도 화면은 똑같다.
		} catch(Exception ex) {				// 때문에 데이타 모델쪽에서 변경된 사실 화면(JTable)에 신호를 보내주는 작업을 처리해준다
			ex.printStackTrace();
		}
	}
		
	public void initStyle(){   
		tfVideoNum.setEditable(false); // 입력하지 못하게 만듬.
		tfInsertCount.setEditable(false);		
		tfInsertCount.setHorizontalAlignment(JTextField.RIGHT);
	}
	
	//  화면설계 메소드
	public void addLayout(){
		//멤버변수의 객체 생성
		tfVideoNum = new JTextField();
		tfVideoTitle = new JTextField();
		tfVideoDirector = new JTextField();
		tfVideoActor = new JTextField();
		
		String []cbJanreStr = {"멜로","엑션","스릴","코미디"};
		comVideoGenre = new JComboBox(cbJanreStr);
		taVideoContent = new JTextArea();
		
		cbMultiInsert = new JCheckBox("다중입고");
		tfInsertCount = new JTextField("1",5);
	
		bVideoInsert = new JButton("입고");
		bVideoModify = new JButton("수정");
		bVideoDelete = new JButton("삭제");
		ta			 = new JTextArea();
		
		String []cbVideoSearch = {"제목","감독","배우"}; // 인덱스 0 = 제목,1=감독,2=배우
		comVideoSearch = new JComboBox(cbVideoSearch);
		tfVideoSearch = new JTextField(15);
		
		tbModelVideo = new VideoTableModel();
		tableVideo = new JTable(tbModelVideo); // 내용을 갖고 있는 것을 화면에 지정함, 생성자로 지정함
		// tableVideo.setModel(tbModelVideo);
		
		
		
		//************화면구성************
		//왼쪽영역
		JPanel p_west = new JPanel();
		p_west.setLayout(new BorderLayout());
			// 왼쪽 가운데
			JPanel p_west_center = new JPanel();	
			p_west_center.setLayout(new BorderLayout());
				// 왼쪽 가운데의 윗쪽
				JPanel p_west_center_north = new JPanel();
				p_west_center_north.setLayout(new GridLayout(5,2));
				p_west_center_north.add(new JLabel("영화번호"));
				p_west_center_north.add(tfVideoNum);
				p_west_center_north.add(new JLabel("장르"));
				p_west_center_north.add(comVideoGenre);
				p_west_center_north.add(new JLabel("제목"));
				p_west_center_north.add(tfVideoTitle);
				p_west_center_north.add(new JLabel("감독"));
				p_west_center_north.add(tfVideoDirector);
				p_west_center_north.add(new JLabel("배우"));
				p_west_center_north.add(tfVideoActor);
				
				// 왼쪽 가운데의 가운데
				JPanel p_west_center_center = new JPanel();
				p_west_center_center.setLayout(new BorderLayout());
				// BorderLayout은 영역 설정도 해야함
				p_west_center_center.add(new JLabel("설명"),BorderLayout.WEST);
				p_west_center_center.add(taVideoContent,BorderLayout.CENTER);
			
			// 왼쪽 화면에 붙이기
			p_west_center.add(p_west_center_north,BorderLayout.NORTH);
			p_west_center.add(p_west_center_center,BorderLayout.CENTER);
			p_west_center.setBorder(new TitledBorder("영화 정보입력"));
			
			// 왼쪽 아래
			JPanel p_west_south = new JPanel();		
			p_west_south.setLayout(new GridLayout(2,1));
			
			JPanel p_west_south_1 = new JPanel();
			p_west_south_1.setLayout(new FlowLayout());
			p_west_south_1.add(cbMultiInsert);
			p_west_south_1.add(tfInsertCount);
			p_west_south_1.add(new JLabel("개"));
			p_west_south_1.setBorder(new TitledBorder("다중입력시 선택하시오"));
			// 입력 수정 삭제 버튼 붙이기
			JPanel p_west_south_2 = new JPanel();
			p_west_south_2.setLayout(new GridLayout(1,3));
			p_west_south_2.add(bVideoInsert);
			p_west_south_2.add(bVideoModify);
			p_west_south_2.add(bVideoDelete);
			
			p_west_south.add(p_west_south_1);
			p_west_south.add(p_west_south_2);
		
		p_west.add(p_west_center,BorderLayout.CENTER);
		p_west.add(p_west_south, BorderLayout.SOUTH);   // 왼쪽부분완성
		
		//---------------------------------------------------------------------
		// 화면구성 - 오른쪽영역
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		
		JPanel p_east_north = new JPanel();
		p_east_north.add(comVideoSearch);
		p_east_north.add(tfVideoSearch);
		p_east_north.setBorder(new TitledBorder("영화 정보 검색"));
		
		p_east.add(p_east_north,BorderLayout.NORTH);
		p_east.add(new JScrollPane(tableVideo),BorderLayout.CENTER); // Jtable모델은 그냥 붙이면 화면에 뜨지 않는다. 때문에 JScrollPane에 붙인 뒤, Jtable에 붙여야 한다.
		// 테이블을 붙일때에는 반드시 JScrollPane() 이렇게 해야함 
		
		
		// 전체 화면에 왼쪽 오른쪽 붙이기
		setLayout(new GridLayout(1,2));
		
		add(p_west);
		add(p_east);
		
	}
 

}


