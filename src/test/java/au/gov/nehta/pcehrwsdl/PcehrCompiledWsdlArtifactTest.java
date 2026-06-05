package au.gov.nehta.pcehrwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import jakarta.xml.ws.WebServiceClient;
import org.junit.Test;

/**
 * Offline checks for packaged WSDL and JAX-WS {@link WebServiceClient} stubs only.
 */
public class PcehrCompiledWsdlArtifactTest {

    private static final List<String> PRIMARY_SERVICE_WSDL = Arrays.asList(
        "wsdl/B2B_DocumentRegistry.wsdl",
        "wsdl/B2B_DocumentRepository.wsdl",
        "wsdl/B2B_GetAuditView.wsdl",
        "wsdl/B2B_GetChangeHistoryView.wsdl",
        "wsdl/B2B_GetIndividualDetailsView.wsdl",
        "wsdl/B2B_GetRepresentativeList.wsdl",
        "wsdl/B2B_GetTemplate.wsdl",
        "wsdl/B2B_GetView.wsdl",
        "wsdl/B2B_PCEHRProfile.wsdl",
        "wsdl/B2B_RegisterPCEHR.wsdl",
        "wsdl/B2B_RemoveDocument.wsdl",
        "wsdl/B2B_SearchTemplate.wsdl"
    );

    @Test
    public void primaryServiceWsdlOnClasspath() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (String wsdl : PRIMARY_SERVICE_WSDL) {
            assertNotNull(wsdl, loader.getResource(wsdl));
        }
    }

    @Test
    public void serviceStubCount() throws Exception {
        int serviceStubs = 0;
        for (Class<?> type : serviceClassesOnClasspath()) {
            if (type.getAnnotation(WebServiceClient.class) != null) {
                serviceStubs++;
            }
        }
        assertEquals(12, serviceStubs);
    }

    @Test
    public void serviceStubsReferencePackagedWsdl() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (Class<?> type : serviceClassesOnClasspath()) {
            WebServiceClient client = type.getAnnotation(WebServiceClient.class);
            if (client == null) {
                continue;
            }
            URL wsdl = type.getResource(client.wsdlLocation());
            if (wsdl == null) {
                wsdl = loader.getResource(client.wsdlLocation());
            }
            assertNotNull(type.getName() + " wsdlLocation=" + client.wsdlLocation(), wsdl);
        }
    }

    private static List<Class<?>> serviceClassesOnClasspath() throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        classes.addAll(classesInPackage("au.net.electronichealth"));
        classes.addAll(classesInPackage("ihe.iti"));
        return classes;
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
        List<Class<?>> classes = new ArrayList<>();

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            if ("file".equals(resource.getProtocol())) {
                File directory = new File(URLDecoder.decode(resource.getFile(), "UTF-8"));
                addClasses(directory, packageName, classes);
            }
        }

        return classes;
    }

    private static void addClasses(File directory, String packageName, List<Class<?>> classes) throws Exception {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                addClasses(file, packageName + "." + file.getName(), classes);
            } else if (file.getName().endsWith(".class")
                && !file.getName().contains("$")
                && !"package-info.class".equals(file.getName())) {
                String className = packageName + "." + file.getName().substring(0, file.getName().length() - ".class".length());
                classes.add(Class.forName(className));
            }
        }
    }
}
