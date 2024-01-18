package DatabricksUtilities

import com.databricks.dbutils_v1.DBUtilsHolder

object MyDatabricksUtilities {

  /** Given a full path string and a flag indicating whether to list leaf subdirectory
   *
   *  @param filePath      : path string starting with s3://
   *  @param subdirs   : list down to leaf subdirectory
   *  @return sequence of leaf files or subdirectories
   */
  def recursiveList(filePath: String, subdirs: Boolean = false): Seq[String] = {
    import scala.collection.mutable.ListBuffer
    val allFiles = ListBuffer.empty[String]
    val dbutils = DBUtilsHolder.dbutils

    def recursiveListHelper(filePath: String, subdirs: Boolean = false): Seq[Any] = {
      dbutils.fs.ls(filePath).map { fi =>
        if (fi.isFile) allFiles.append(fi.path)
        else recursiveListHelper(fi.path, subdirs)
      }
    }

    recursiveListHelper(filePath, subdirs)

    if (!subdirs) allFiles.toList
    else allFiles.toList
      .map(_.split("/")
        .dropRight(1)
        .mkString("/")).distinct
  }

}

