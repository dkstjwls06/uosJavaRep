# 9. Event Handler

### 9.1. 개요
(생략)

### 9.2. 방식
Event Handler 처리 방식
- 외부 클래스 사용
```java
class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Button has been clicked!");
    }
}
```
- 내부 클래스 사용

```java
public class eventTest1 extends JFrame {
    private JLabel label;

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ...
            label.setText("asdfasdfasdf");
        }
    }
}
```
- Frame Class 처리

```java
import javax.swing.*;
import java.awt.event.ActionEvent;

public class EventTest3 extends JFrame implements ActionListener {
    private JLabel label = new JLabel();

    public void actionPerformed(ActionEvent e){
        ...
        label.setText("assdfasdf");
    }
}
```
- 익명클래스 사용

```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

button.addActionListner(new ActionListener() {
    public void actionPerformed (ActionEvent e){
        counter++;
    }
})
```
- 람다식 사용
```java
button.addActionListner(e -> {
    counter++;
});
```

### 9.3. 이벤트 객체
- ActionEvent : 버튼 클릭, 선택 등 - getActionCommand(), getModifiers()
- MouseEvent - getX(), getY(), getClickCOunt(), isPopupTrigger()
- KeyEvent : getKeyCode(), getKeyChar(), isActionKey()
- WindowEvent : getWindow(), getOppositeWindow()
- TextEvent : getSource()
- etc...

> Event의 종류
> - Low-level : Mouse, MouseMotion, Key, ...
> - Semantic : **Action**, Change, Item, ...

### 9.4. 키 이벤트
> Press : `keyPressed` -> `keyTyped` -> `keyReleased`

focus가 필요함
- `comp.setFocusable(true)`, `comp.requestFocus()`
<br>

Swing에서는 `setVisible(true)` 후에 특정 컴포넌트에 키보드 focus 요청을 하는 것이 좋음<br>
#### KeyListner Interface

```java
public class MyListener implements KeyListener {
    public class keyPressed(KeyEvent e){}
    public class keyReleased(KeyEvent e){}
    public class keyTyped(KeyEvent e){}
}
```
#### KeyEvent 객체의 메서드
- `getKeyChar()`
- `getKeyCode()` -> VK_...
- `isActionKey()`
- `getKeyText(int keyCode)`

### 9.5. Mouse Event
- MouseListener
```java
public class MyListener implements MouseListener {
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
}
```
- MouseMotionListener

```java
public class MyClass implements MouseMotionListener {
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e) {}
}
```
- MouseWheelListener

```java
public class MyClass implements MouseWheelListener {
    public void mouseWheelMoved(MouseWheelEvent e){}
}
```

#### MouseEvent Object
- getClickCount()
- getX(), getY(), getPoint() : 컴포넌트 상대적 이벤트 발생 위치
- getXOnScreen(), getYOnScreen(), getLocationOnScreen() : 절대좌표값
- getButton() : 마우스 버튼 변경 여부
