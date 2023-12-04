/**
 * Precompiled [junitbuild.jacoco-java-conventions.gradle.kts][Junitbuild_jacoco_java_conventions_gradle] script plugin.
 *
 * @see Junitbuild_jacoco_java_conventions_gradle
 */
public
class Junitbuild_jacocoJavaConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Junitbuild_jacoco_java_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
