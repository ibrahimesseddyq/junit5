/**
 * Precompiled [junitbuild.base-conventions.gradle.kts][Junitbuild_base_conventions_gradle] script plugin.
 *
 * @see Junitbuild_base_conventions_gradle
 */
public
class Junitbuild_baseConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Junitbuild_base_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}