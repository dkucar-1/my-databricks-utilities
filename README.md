# my-databricks-utilities

This repo contains a few useful Databricks file utilities.

### Databricks file system recursive list
Given a full path string and a flag indicating whether to list leaf subdirectory.
The default is to list down to the root file level.

#### Usage: 
```
   import DatabricksUtilities.MyDatabricksUtilities.recursiveList    ...
   ...
   def recursiveList(filePath: String, subdirs: Boolean = false): Seq[String]
```
*filePath:* path string starting with s3://<br>
*subdirs:* list down to leaf subdirectory<br>
*Returns:* Sequence of leaf files or subdirectories

#### Example:


#### Notes:
This uses Scala 2.12 along with dbutils-api version 0.0.6.