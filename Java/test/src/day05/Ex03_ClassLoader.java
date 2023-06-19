package day05;

public class Ex03_ClassLoader {
    public static void main(String[] args) {
        System.out.println(" test ");
    }
}

/**
 * user class loader는 클래스검색기준폴더/day05/Ex03_ClassLoader.class 파일을 찾아 메모리에 로드하고 실행해 줌.
 * -. 즉, 팩키지가 있는 클래스는 팩키지명과 동일한 폴더 하위에 존재해야만 한다.
 * -.IDE에서 컴파일 시, 팩키지명에 따른 동일한 폴더가 자동 생성된다.
 * -.터미널 창 에서 컴파일 시는 –d 옵션을 추가하면 팩키지명에 따른 동일한 폴더가 자동 생성된다.
 *   예) javac  -d  c:\\classes  day7.com.myComp.ui.B6.java
 *
 * [classpath – 클래스 검색 기준 폴더]  클래스검색 기준폴더 란,
 * 1. -classpath  옵션이 없는 경우.
 * a)classpath 환경변수가 없는 경우: 현재 폴더에서 클래스 검색
 * b)classpath 환경변수가 있는 경우:classpath환경변수에 등록된 경로에서 클래스 검색
 *
 * 2. -classpath  옵션이  있는 경우.
 * 예) java  -classpath bin day7.com.myComp.ui.B6
 * -classpath  옵션 뒤에서 지정해준 폴더에서만 클래스 검색
 *
 */

/*  클래스 로더 종류
1. 부트스트랩 (Bootstrap) Class Loader
    ($JAVA_HOME/jre/lib/rt.jar   .... )
2. 확장 (Extensions) Class Loader
    ($JAVA_HOME/lib/ext/*.jar)
3. 시스템 (System) Class Loader.
    Classpath에 있는 클래스 파일 혹은 jar에 속한 클래스들을 로드한다.
*/