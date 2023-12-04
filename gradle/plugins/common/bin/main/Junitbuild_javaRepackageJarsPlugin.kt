/**
 * Precompiled [junitbuild.java-repackage-jars.gradle.kts][Junitbuild_java_repackage_jars_gradle] script plugin.
 *
 * @see Junitbuild_java_repackage_jars_gradle
 */
public
class Junitbuild_javaRepackageJarsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Junitbuild_java_repackage_jars_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
