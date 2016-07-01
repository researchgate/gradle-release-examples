/*
 * This file is part of the gradle-release-examples.
 *
 * (c) ResearchGate GmbH
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package net.researchgate.release.examples.multiprojectsingleversion.subproject2;
import net.researchgate.release.examples.multiprojectsingleversion.subproject1.Main;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello Subproject2! Depends on " + Main.projectName);
    }
}
