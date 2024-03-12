//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class lamp {

        private var isOn: Boolean = false

        fun turnON() {
            isOn = true

        }

        fun turnOff() {
            isOn = false
        }
    }
fun main(args:Array<String>)  {
    val L1=lamp()
    val L2=lamp()

    L1.turnON()
    L2.turnOff()
}
