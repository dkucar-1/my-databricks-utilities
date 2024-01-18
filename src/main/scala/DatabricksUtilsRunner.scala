import org.apache.logging.log4j.LogManager
import DatabricksUtilities.MyDatabricksUtilities.recursiveList

object DatabricksUtilsRunner {

    val USER_HOME_DIR = System.getProperty("user.home")

    def main(args: Array[String]): Unit = {
        val logger = LogManager.getLogger()
        try {
            val path = s"$USER_HOME_DIR/resources/log4j2.properties"
            recursiveList(path)
        } catch {
            case e: NullPointerException => println("Should run this file from inside Databricks. Couldn't find that file.")
        }
    }
}
