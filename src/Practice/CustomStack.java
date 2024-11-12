package Practice;

public class CustomStack {
    private int maxSize;      // 스택의 최대 크기
    private int[] stackArray; // 스택 데이터를 저장할 배열
    private int top;          // 스택의 맨 위 인덱스

    // 생성자
    public CustomStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // 초기화: 스택이 비어 있음을 나타냄
    }

    // 스택에 데이터를 추가하는 push 메서드
    public void push(int value) {
        if (isFull()) {
            System.out.println("스택이 가득 찼습니다.");
        } else {
            stackArray[++top] = value; // top을 증가시키고 값을 추가
        }
    }

    // 스택의 맨 위 데이터를 제거하고 반환하는 pop 메서드
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
            return -1;
        } else {
            return stackArray[top--]; // 값을 반환하고 top을 감소
        }
    }

    // 스택의 맨 위 데이터를 반환하는 peek 메서드
    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
            return -1;
        } else {
            return stackArray[top]; // 값을 반환하지만 top을 변경하지 않음
        }
    }

    // 스택이 비어 있는지 확인하는 isEmpty 메서드
    public boolean isEmpty() {
        return (top == -1);
    }

    // 스택이 가득 찼는지 확인하는 isFull 메서드
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // 스택의 모든 요소를 출력하는 메서드
    public void display() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            System.out.print("스택의 요소: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5); // 크기가 5인 스택 생성

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 스택의 요소: 10 20 30

        System.out.println("peek: " + stack.peek()); // 맨 위 값: 30
        System.out.println("pop: " + stack.pop());   // pop 30
        stack.display(); // 스택의 요소: 10 20
    }
}
