package _Java8._Глава_17_java_lang_00000000000_42._553;
// Demonstrate Package
class PkgTest {
    public static void main (String[] args) {
        Package[] pkgs;
        pkgs = Package.getPackages();
        for (Package pkg : pkgs) {
            System.out.println(pkg.getName() +
                    " " + pkg.getImplementationTitle() +
                    " " + pkg.getImplementationVendor() +
                    " " + pkg.getImplementationVersion());
        }
    }
}
