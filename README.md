# OPENRNDR library template
<hr>

A barebones template to write and reuse functionality within 
[OpenRNDR](https://openrndr.org)
programs. 

## How to use
### Setting up
1. If you're using IntelliJ, create a new project with version control, using this
git repo as a template. 

2. Rename the project accordingly in `settings.gradle.kts` and
also change `groupId` and `artifactId` in `build.gradle.kts`.
   
### Writing your library
Write your functions as you normally would inside `src/main/kotlin`.

### Reusing the library as a local Maven artifact
1. Run the Gradle task `publishToMavenLocal` or inside terminal: 
   
```
./gradlew publishToMavenLocal
```
2. In your OpenRNDR project, add `mavenLocal()` to your repositories and add 
the following line to your dependencies:
```kt
dependencies("com.example:openrndr-library-template:1.0.0-SNAPSHOT")

// alternatively, based on dependency notation
// dependencies(groupId, artifactId, version)
dependencies("com.example","openrndr-library-template","1.0.0-SNAPSHOT")
```
For more information on declaring dependencies, see 
[here](https://docs.gradle.org/current/userguide/declaring_dependencies.html)

   


