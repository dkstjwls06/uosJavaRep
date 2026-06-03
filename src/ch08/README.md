# 8. GUI Programming (For Coding Test)
___
> AWT vs SWING : SWING 작성 예정

### 8.1. Java GUI 소개
- 기본 컴포넌트
  - JButton
  - JLabel
  - JCheckBox
  - JChoice
  - JList
  - JMenu
  - JTextField
  - etc...
- 컨테이너 컴포넌트
  - JFrame
  - JPanel
  - etc...

### 8.2. Container & Component
생략

### 8.3. GUI 프로그램 구조
- 프로그램을 만드는 절차
  - Frame 생성 방법
    - JFrame 객체 생성
    - JFrame 상속 클래스 정의 (주요)
  - 프로그램이 종료되지 않는 이유
    - 윈도우를 담당하는 스레드 생성 -> main() 종료 후에도 윈도우는 없어지지 않음.
    - `setDefaultCloseOperation(EXIT_ON_CLOSE)`로 창 닫을 시 종료 옵션으로 바꾸기
  - 배치 관리자를 FlowLayout으로 하는 이유
    - 원래 배치 관리자 : BorderLayout -> 배치 시 전체화면 차지

### 8.4. 컨테이너 살펴보기
#### JFrame
컨테이너는 컴포넌트를 tree 형태로 저장함. 최상위 컨테이너는 이 트리의 root node가 됨.
- 중요 메소드
  - `add(Component)` : Frame에 Component를 추가.
  - `setLocation(x,y), setSize(x,y)` : 프레임의 위치와 크기 설정
  - `setIconImage(IcaonImage)` : 윈도우 시스템의 타이틀 바에 표시할 아이콘 설정
  - `setTitle()`
  - `setResizable(boolean)`
  - `getContentPane()` : Frame 안의 Content Pane을 가져옴.
  - `setLayout()` : Frame의 배치 관리자를 설정.
#### JPanel
컴포넌트들을 부착할 수 있도록 설계된 컨테이너. (최상위 컨테이너는 아님)
- 중요 메소드
  - add(Component)
  - remove(Component)
  - setBackground(Color.yellow)

### 8.5. 기초 컴포넌트
#### JLabel
- `new JLabel("TEXT")`
- `label.setText("TEXT")`

#### JTextField
- `new JTextField(123)` : 123자 크기 field
- `tf.setField("asdf")`
- `tf.getText()`

#### JButton
- JButton
- JCheckBox
- JRadioButton
- JToggleButton

### 8.6. 배치 관리자
- FlowLayout (Panel's Default)
  - 기본: 중앙정렬, 5px 
  - `new FlowLayout(FlowLayout.RIGHT, 10, 15)` : 오른쪽 정렬, 수평 간격 10px, 수직 15px
- BorderLayout (Frame's Default)
  - `add(comp, BorderLayout.NORTH)` / NORTH, SOUTH, CENTER, EAST, WEST
  - `new BorderLayout(hGap 가로, vGap 세로)`
- GridLayout
  - `new GridLayout(rows, cols, [hGap], [vGap])`
- CardLayout
  - `cont.next(cont)` : 다음 카드로 이동
  - `cont.previous(cont)`
  - `cont.first(cont)`
  - `const.last(cont)`
- 절대 위치 배치
  - `setLayout(null);`
  - `b.setSize(w,h);`
  - `b.setLocation(x,y);`

### 8.7. 복잡한 배치 만들기
> Panel을 먼저 Frame 위에 추가하고, 그 위에 다른 컴포넌트를 배치하는 것이 일반적.
> - 조직적인 배치 관리
> - 유연한 레이아웃 구성
> - 코드의 가독성 향상
> - 컴포넌트 그룹화

