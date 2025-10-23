//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val name: String = "Kotlin"
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    println("Hello, " + name + "!")
    println("Hello, $name World!")

    for (i in 1..5) {
        //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
        // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
        println("i = $i")
    }

    // val: 불변 (Immutable)
    // var: 가변 (Mutable)

    /*************************************/
    // 값을 더한 후 문자열 보간
    val a: Int = 3
    val b = 5
    println("a + b = ${a + b}")

    /*************************************/
    // 여러 줄 문자열
    val name2 = "jwoo.kim"
    val message = """
        안녕하세요.
        오늘의 사용자: $name2
        시스템에 정상 로그인되었습니다.
    """.trimIndent()

    println("여러 줄 문자열 출력 샘플:\n$message") // "\n" 줄넘김

    /*************************************/
    // Kotlin 문자열 보간과 Java 문자열 포맷 비교
    val x = 10
    val y = 20
    println("Kotlin 문자열 보간과 Java 문자열 포맷 비교 결과")
    println("Kotlin 식 문자열 보간: ${x + y}")
    println("Java식 문자열 포맷: %d".format(x + y))

    /*************************************/
    var name3: String = "정우"
//    name3 = null // ❌ 컴파일 오류

    var nickname: String? = null // ✅ nullable
    println(nickname?.length) // safe call
}